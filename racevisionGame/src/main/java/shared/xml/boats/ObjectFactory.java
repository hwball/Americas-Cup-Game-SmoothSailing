//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.01 at 11:12:43 PM NZST 
//


package shared.xml.boats;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the aaa package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: aaa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BoatConfig }
     * @return BoatConfig.
     */
    public BoatConfig createBoatConfig() {
        return new BoatConfig();
    }

    /**
     * Create an instance of {@link BoatConfig.Boats }
     * @return Boats.
     */
    public BoatConfig.Boats createBoatConfigBoats() {
        return new BoatConfig.Boats();
    }

    /**
     * Create an instance of {@link BoatConfig.Boats.Boat }
     * @return Boat.
     */
    public BoatConfig.Boats.Boat createBoatConfigBoatsBoat() {
        return new BoatConfig.Boats.Boat();
    }

    /**
     * Create an instance of {@link BoatConfig.Boats.Boat.GPSposition }
     * @return GPSposition.
     */
    public BoatConfig.Boats.Boat.GPSposition createBoatConfigBoatsBoatGPSposition() {
        return new BoatConfig.Boats.Boat.GPSposition();
    }

}
