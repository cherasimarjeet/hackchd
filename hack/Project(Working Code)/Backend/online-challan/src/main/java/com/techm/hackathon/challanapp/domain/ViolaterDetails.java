package com.techm.hackathon.challanapp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ViolaterDetails {
@Id
@Column(name = "VIOLATOR_ID", nullable = false)
@GeneratedValue(strategy = GenerationType.AUTO)
private Long violatorId;

@Column(name = "aadhar_no", nullable = false)
private String aadhar_no;

public String getAadhar_no() {
	return aadhar_no;
}

public void setAadhar_no(String aadhar_no) {
	this.aadhar_no = aadhar_no;
}

@Column(name = "name", nullable = false)
private String username;

@Column(name = "father_name", nullable = false)
private String father_name;

public Long getViolatorId() {
	return violatorId;
}

public void setViolatorId(Long violatorId) {
	this.violatorId = violatorId;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getFather_name() {
	return father_name;
}

public void setFather_name(String father_name) {
	this.father_name = father_name;
}

public String getEmail_id() {
	return email_id;
}

public void setEmail_id(String email_id) {
	this.email_id = email_id;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getPhone_no() {
	return phone_no;
}

public void setPhone_no(String phone_no) {
	this.phone_no = phone_no;
}

public String getLocal_address() {
	return local_address;
}

public void setLocal_address(String local_address) {
	this.local_address = local_address;
}

@Column(name = "email_id", nullable = false)
private String email_id;

@Column(name = "address")
private String address;

@Column(name = "phone_no", nullable = false)
private String phone_no;

@Column(name = "local_address", nullable = false)
private String local_address;

}
