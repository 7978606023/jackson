package com.ip.jackson;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ip.model.Patient;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateFormat {

/**
* @param args args
* @throws JsonParseException json.
* @throws JsonMappingException JsonMappingException.
* @throws IOException IOExceptio.
* @throws ParseException parseException.
*/
  public static void main(String[] args) throws JsonParseException,
      JsonMappingException, IOException, ParseException {
    ObjectMapper mapper = new ObjectMapper();

    Patient patient = mapper.readValue(new File("writePatient.json"), Patient.class);
    SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
    Date date = df.parse(patient.getDateOfBirth());

    mapper.setDateFormat(df);
    System.out.println("patient birthday");
    System.out.println(mapper.writeValueAsString(date));

  }
}
