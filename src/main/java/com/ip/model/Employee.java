package com.ip.model;

public class Employee {

  private String firstName;
  private String lastName;
  private String dateOfBirth;
  private String address;
  private String city;
  private String state;

  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    lastName = lastName;
  }
  public String getDateOfBirth() {
    return dateOfBirth;
  }
  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }
  @Override
  public String toString() {
    return "Employee [firstName=" + firstName + ", LastName=" + lastName + ", dateOfBirth=" + dateOfBirth
				+ ", address=" + address + ", city=" + city + ", state=" + state + "]";
  }
}
