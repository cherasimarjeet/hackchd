package com.techm.hackathon.challanapp.response;

public class ChallanPaymentResponse {
	private Culprit_Details culpritDetails;
	private Challan challanDetails;
	private String challan_amount;
	// ": "http://papu.mp4"
	private String video_url;
	
	public class Culprit_Details {
		private String name;
		private String father_name;
		private String email_id;
		private String address;
		private String local_address;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
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
		public String getLocal_address() {
			return local_address;
		}
		public void setLocal_address(String local_address) {
			this.local_address = local_address;
		}
	}

	public class Challan {
		private String date;
		private String place;
		private String[] rules;
		private String challan_number;
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getPlace() {
			return place;
		}
		public void setPlace(String place) {
			this.place = place;
		}
		public String[] getRules() {
			return rules;
		}
		public void setRules(String[] rules) {
			this.rules = rules;
		}
		public String getChallan_number() {
			return challan_number;
		}
		public void setChallan_number(String challan_number) {
			this.challan_number = challan_number;
		}
	}

	
	public Culprit_Details getCulpritDetails() {
		return culpritDetails;
	}
	public void setCulpritDetails(Culprit_Details culpritDetails) {
		this.culpritDetails = culpritDetails;
	}
	public Challan getChallanDetails() {
		return challanDetails;
	}
	public void setChallanDetails(Challan challanDetails) {
		this.challanDetails = challanDetails;
	}
	public String getChallan_amount() {
		return challan_amount;
	}
	public void setChallan_amount(String challan_amount) {
		this.challan_amount = challan_amount;
	}
	public String getVideo_url() {
		return video_url;
	}
	public void setVideo_url(String video_url) {
		this.video_url = video_url;
	}
}
