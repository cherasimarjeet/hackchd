package com.techm.hackathon.challanapp.request;

public class ChallanRequest {
	private String aadhar_no;
	private String driving_license_no;
	private String reg_no;
	private Gps_Location location;
	private Violater_Details violator_details;

	public Gps_Location getLocation() {
		return location;
	}

	public void setLocation(Gps_Location location) {
		this.location = location;
	}

	public Violater_Details getViolator_details() {
		return violator_details;
	}

	public void setViolator_details(Violater_Details violator_details) {
		this.violator_details = violator_details;
	}

	private class Gps_Location {
		private String longitude;
		private String lattitude;
	}

	private class Violater_Details {
		private String name;
		private String father_name;
		private String email_id;
	}

	private String phone_no;
	private String address;
	private String local_address;
	private String rules_violated;

	public String getAadhar_no() {
		return aadhar_no;
	}

	public void setAadhar_no(String aadhar_no) {
		this.aadhar_no = aadhar_no;
	}

	public String getDriving_license_no() {
		return driving_license_no;
	}

	public void setDriving_license_no(String driving_license_no) {
		this.driving_license_no = driving_license_no;
	}

	public String getReg_no() {
		return reg_no;
	}

	public void setReg_no(String reg_no) {
		this.reg_no = reg_no;
	}

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLocal_address() {
		return local_address;
	}

	public void setLocal_address(String local_address) {
		this.local_address = local_address;
	}

	public String getRules_violated() {
		return rules_violated;
	}

	public void setRules_violated(String rules_violated) {
		this.rules_violated = rules_violated;
	}

}
