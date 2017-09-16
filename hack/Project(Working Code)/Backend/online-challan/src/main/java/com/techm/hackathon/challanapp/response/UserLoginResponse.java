package com.techm.hackathon.challanapp.response;

import com.techm.hackathon.challanapp.domain.AppUser;

public class UserLoginResponse {
	
	private AppUser user;	
	private int department_total_year;
	private String highest_scorer;
	private String current_Location;
	/**
	 * @return the user
	 */
	public AppUser getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(AppUser user) {
		this.user = user;
	}
	/**
	 * @return the department_total_year
	 */
	public int getDepartment_total_year() {
		return department_total_year;
	}
	/**
	 * @param department_total_year the department_total_year to set
	 */
	public void setDepartment_total_year(int department_total_year) {
		this.department_total_year = department_total_year;
	}
	/**
	 * @return the highest_scorer
	 */
	public String getHighest_scorer() {
		return highest_scorer;
	}
	/**
	 * @param highest_scorer the highest_scorer to set
	 */
	public void setHighest_scorer(String highest_scorer) {
		this.highest_scorer = highest_scorer;
	}
	/**
	 * @return the current_Location
	 */
	public String getCurrent_Location() {
		return current_Location;
	}
	/**
	 * @param current_Location the current_Location to set
	 */
	public void setCurrent_Location(String current_Location) {
		this.current_Location = current_Location;
	}

}
