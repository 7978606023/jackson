package com.ip.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ip.model.Patient;
import java.io.File;

public class ReadValue {

  /**
 * @param args args
 */
  public static void main(String[] args) {
    ObjectMapper mapper = new ObjectMapper();

    try {
      Patient patient = mapper.readValue(new File("writePatient.json"), Patient.class);
      System.out.println(patient.toString());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
