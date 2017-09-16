package com.techm.hackathon.challanapp.response;

import java.util.List;

import com.techm.hackathon.challanapp.domain.Challan;
import com.techm.hackathon.challanapp.domain.ViolaterDetails;

public class ChallanResponse {
	private List<Challan> challanList;
	private ViolaterDetails violaterDetails;
	private String challan_number;
	private String area;
	

	public List<Challan> getChallanList() {
		return challanList;
	}

	public void setChallanList(List<Challan> challanList) {
		this.challanList = challanList;
	}

	public ViolaterDetails getCulpritHistory() {
		return violaterDetails;
	}

	public void setCulpritHistory(ViolaterDetails culpritHistory) {
		this.violaterDetails = culpritHistory;
	}

	public String getChallan_number() {
		return challan_number;
	}

	public void setChallan_number(String challan_number) {
		this.challan_number = challan_number;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	

//	public class Culprit_History {
//		public String culprit_name;
//		public String aadhar_number;
//		public String getCulprit_name() {
//			return culprit_name;
//		}
//		public void setCulprit_name(String culprit_name) {
//			this.culprit_name = culprit_name;
//		}
//		public String getAadhar_number() {
//			return aadhar_number;
//		}
//		public void setAadhar_number(String aadhar_number) {
//			this.aadhar_number = aadhar_number;
//		}
//	}

//	public class Challans {
//		private String date;
//		private String place;
//		private String[] rules;
//		private String challan_number;
//		public String getDate() {
//			return date;
//		}
//		public void setDate(String date) {
//			this.date = date;
//		}
//		public String getPlace() {
//			return place;
//		}
//		public void setPlace(String place) {
//			this.place = place;
//		}
//		public String[] getRules() {
//			return rules;
//		}
//		public void setRules(String[] rules) {
//			this.rules = rules;
//		}
//		public String getChallan_number() {
//			return challan_number;
//		}
//		public void setChallan_number(String challan_number) {
//			this.challan_number = challan_number;
//		}
//	}
}
