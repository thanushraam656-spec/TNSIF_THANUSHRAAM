package com.tnsif.entityclass;

public class Customer {
	private int id;
	private String cname;
	private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	return "Customer [id=" + id + ", cname=" + cname + ", city=" + city + "]";
}
