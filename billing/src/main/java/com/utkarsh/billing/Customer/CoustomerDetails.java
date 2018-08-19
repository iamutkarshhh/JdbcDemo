package com.utkarsh.billing.Customer;

public class CoustomerDetails 
{

	String name;
	String lname;
	String address;
	int phone_no;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}
	@Override
	public String toString() {
		return "CoustomerDetails [name=" + name + ", lname=" + lname + ", address=" + address + ", phone_no=" + phone_no
				+ "]";
	}
	
}
