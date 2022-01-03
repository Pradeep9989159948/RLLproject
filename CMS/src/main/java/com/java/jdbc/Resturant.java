package com.java.jdbc;

public class Resturant {
	private int resturantid;
	private String resturantname;
	private String city ;
	private String branch;
	private String email;
	private String contactno;
	
	public int getResturantid() {
		return resturantid;
	}
	public void setResturantid(int resturantid) {
		this.resturantid = resturantid;
	}
	public String getResturantname() {
		return resturantname;
	}
	public void setResturantname(String resturantname) {
		this.resturantname = resturantname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	
	
	@Override
	public String toString() {
		return "Resturant [resturantid=" + resturantid + ", resturantname=" + resturantname + ", city=" + city
				+ ", branch=" + branch + ", email=" + email + ", contactno=" + contactno + "]";
	}
	
	

}
