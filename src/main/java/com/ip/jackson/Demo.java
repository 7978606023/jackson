package com.ip.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.ip.model.Patient;
import java.io.File;
/**
 * @author PRATAP
 *
 */

public class Demo {

 /**
 * @param args args.
 */
  public static void main(String[] args) {
    ObjectMapper mapper = new ObjectMapper();
    mapper.enable(SerializationFeature.INDENT_OUTPUT);

    try {
      Patient patient = new Patient();

      patient.setFirstName("Pratap");
      patient.setLastName("Sahoo");
      patient.setDateOfBirth("30/12/1993");
      patient.setAddress("DGP Colony");
      patient.setCity("Bhubenswar");
      patient.setState("Odisha");
      patient.setZip("756100");
      patient.setPhone("7978606023");

      mapper.writeValue(new File("writePatient.json"),patient);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}


