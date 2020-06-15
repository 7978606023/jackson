package com.ip.jackson;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ip.model.Employee;
import java.io.File;
import java.io.IOException;

public final class JsonToJava {

  /**
 * @param json json
 * @return employee
 * @throws JsonParseException json parse
 * @throws JsonMappingException json map
 * @throws IOException ioexception
 */
  public Employee convertJava(final String json) throws
      JsonParseException, JsonMappingException, IOException {
    if (json == null) {
      return null;
    }
    ObjectMapper mapper = new ObjectMapper();
    Employee employee = mapper.readValue(new File(json), Employee.class);
    return employee;
  }
}
