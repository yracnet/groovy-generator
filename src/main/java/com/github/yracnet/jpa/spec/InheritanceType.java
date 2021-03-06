//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.19 at 03:14:26 AM BOT 
//


package com.github.yracnet.jpa.spec;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inheritance-type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="inheritance-type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="SINGLE_TABLE"/>
 *     &lt;enumeration value="JOINED"/>
 *     &lt;enumeration value="TABLE_PER_CLASS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "inheritance-type")
@XmlEnum
public enum InheritanceType {

    SINGLE_TABLE,
    JOINED,
    TABLE_PER_CLASS;

    public String value() {
        return name();
    }

    public static InheritanceType fromValue(String v) {
        return valueOf(v);
    }

}
