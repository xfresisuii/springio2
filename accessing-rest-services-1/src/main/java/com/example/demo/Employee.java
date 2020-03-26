package com.example.demo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
class Employee {

  private @Id @GeneratedValue 
  Long id;
  public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

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
	this.lastName = lastName;
}

private String firstName;
  private String lastName;
  private String role;

  Employee() {}

  Employee(String firstName, String lastName, String role) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.setRole(role);
  }

  public String getName() {
    return this.firstName + " " + this.lastName;
  }

  public void setName(String name) {
    String[] parts =name.split(" ");
    this.firstName = parts[0];
    this.lastName = parts[1];
  }

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}
}