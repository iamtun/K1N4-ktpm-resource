/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.utils;

import app.entity.Patient;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Le Tuan
 */
public class Converter {

    public static String object2XML(Patient patient) {
        StringWriter sw = new StringWriter();
        JAXB.marshal(patient, sw);
        return sw.toString();
    }

    public static Patient xml2Object(String xml) {
        Patient patient = JAXB.unmarshal(new StringReader(xml), Patient.class);
        return patient;
    }
}
