package com.techm.hackathon.challanapp.request;

public class ChallanPaymentRequest {
	private String challan_number;
	private String aadhar_number;
	
	public String getChallan_number() {
		return challan_number;
	}
	public void setChallan_number(String challan_number) {
		this.challan_number = challan_number;
	}
	public String getAadhar_number() {
		return aadhar_number;
	}
	public void setAadhar_number(String aadhar_number) {
		this.aadhar_number = aadhar_number;
	}
}
