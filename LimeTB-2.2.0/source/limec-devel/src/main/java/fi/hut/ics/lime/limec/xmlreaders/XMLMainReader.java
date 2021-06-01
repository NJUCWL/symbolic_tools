/**
 * Reads the main Doxygen XML file (index.xml). This file contains information
 * regarding the other XML files Doxygen generated based on the C source code
 * we fed to it. What we're interested about is the file names; once we know 
 * them, we can construct new XMLSourceFileReader objects.
 *  
 * @author lharpf
 */
package fi.hut.ics.lime.limec.xmlreaders;

import java.io.File;
import java.util.ArrayList;

//Imports for reading XML

import org.w3c.dom.*;

public class XMLMainReader extends AbstractXMLReader {

	private ArrayList<File> xmlFilesToRead = new ArrayList<File>();
	
	/**
	 * Constructs a new XMLReader to read the Doxygen index.xml file.
	 * 
	 * @param mainXMLFile the index.xml file Doxygen creates when it is run
	 */
	public XMLMainReader(File mainXMLFile) {
		
		super(mainXMLFile);
		
		assert mainXMLFile.getName().equals("index.xml") :
			"XMLMainReader only supposed to be used to read index.xml.";
		
		this.parse();
		
	}
	
	/**
	 * Parses the index.xml "main XML" produced by Doxygen.  
	 * 
	 * @throws XMLException
	 */
	private void parse() {
		
		Document doc = this.getDocument(this.getXMLFile());    
	    // Scan index.xml to find out the names of the XML files Doxygen
	    // generated from the source code files.
	    findXMLFilesToRead(doc);
		
	}
	
	/**
	 * Once parse() has been called, this.xmlFilesToRead contains a list of 
	 * XML files that represent the original C source code files in XML 
	 * format. This method returns that list so that the XML files can be 
	 * parsed.
	 * 
	 * @return a list of XML files generated by Doxygen that represent the
	 * 		   structure of the original C source code files 
	 */
	public ArrayList<File> getXMLFilesToRead() {
		return this.xmlFilesToRead;
	}
	
	/**
	 * Scans the index.xml file (which was passed to the constructor) to get 
	 * the names of the XML files Doxygen has created from the C source files 
	 * we passed to it.
	 * 
	 * @param doc The XML document index.xml in Document format
	 */
	private void findXMLFilesToRead(Document doc) {
		
		// Go through all "compound" tags, which contain the file names       
		NodeList compoundTags = doc.getDocumentElement().getElementsByTagName("compound");
		
		for(int i = 0; i < compoundTags.getLength(); i++) {		
			
			Node compoundTag = compoundTags.item(i);
			NamedNodeMap compoundAttributes = compoundTag.getAttributes();
			Node kindAttribute = compoundAttributes.getNamedItem("kind");

			// Read the "kind" attribute of the "compound" tag to ensure
			// that we have an XML file representing a C source file.
			if (kindAttribute.getNodeValue().equals("file")) {
				
				// Then, get the filename from "refid".
				Node fileNameStart = compoundAttributes.getNamedItem("refid");
				
				// Let's add this new file into the list of XML files
				// representing C source files.
				File newXMLFile = new File(this.getXMLFile().getParent() + 
										   File.separator +
										   fileNameStart.getNodeValue() + 
										   ".xml");
				// we only have to parse the c files, since Doxygen's preprocessor
				// has already taken care of including everything we need to know
				// from the headers
				if (compoundAttributes.getNamedItem("refid").getNodeValue().endsWith("c")) {
					this.xmlFilesToRead.add(newXMLFile);
				}
			}
			
		}
		
	}
	
}
