package com.yash.springjdbc.entities;

public class Student {
	private int id;
	private String name;
	private String address;
	private int mobile_no;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(int mobile_no) {
		this.mobile_no = mobile_no;
	}
	public Student(int id, String name, String address, int mobile_no) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.mobile_no = mobile_no;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", mobile_no=" + mobile_no + "]";
	}
	
	
	
	
}
