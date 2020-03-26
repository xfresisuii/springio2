package com.example.demo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Data
@Table(name = "CUSTOMER_ORDER")
class Order {

  private @Id @GeneratedValue 
  Long id;

  public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}

@Override
public boolean equals(Object arg0) {
	// TODO Auto-generated method stub
	return super.equals(arg0);
}

@Override
protected void finalize() throws Throwable {
	// TODO Auto-generated method stub
	super.finalize();
}

@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return super.hashCode();
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public Status getStatus() {
	return status;
}

public void setStatus(Status status) {
	this.status = status;
}

private String description;
  private Status status;

  Order() {}

  Order(String description, Status status) {

    this.description = description;
    this.status = status;
  }

}