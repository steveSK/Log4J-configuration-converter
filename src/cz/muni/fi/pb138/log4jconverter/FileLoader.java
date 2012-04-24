/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.muni.fi.pb138.log4jconverter;

import java.util.Properties;
import org.w3c.dom.Document;
import org.apache.commons.io.FilenameUtils;

/**
 * This class represents basic operations for loading
 * files. 
 * 
 * @author fivekeyem
 */
public class FileLoader {
    
    
    public enum Type {
        XML, PROPERTIES, OTHER
    }
    
    private Document xmlDoc;
    private Properties propertiesDoc;
    private String nameOfFile;

    public FileLoader(String nameOfFile) {
        if (nameOfFile == null) {
            throw new NullPointerException("No name of file");
        }
        if ("".equals(nameOfFile)) {
            throw new IllegalArgumentException("name is empty");
        }  
        this.nameOfFile = nameOfFile;
    }
    
    
    public Type getType() {
        // TODO
        String extension = FilenameUtils.getExtension(nameOfFile);
        if (extension.equals("xml")) {
            return Type.XML;
        } else if (extension.equals("properties")) {
            return Type.PROPERTIES;
        }
        return Type.OTHER;
    }
    
    /*
     * 
     * 
     * @return 
     */
    public Document getDOM() {
        // TODO
        return xmlDoc;
    }
    
    
    public Properties getProperties() {
        // TODO
        return propertiesDoc;
    }
    
}