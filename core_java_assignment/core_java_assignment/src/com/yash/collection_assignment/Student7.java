package com.yash.collection_assignment;

public class Student7 {

	public int roll_no;
    public String sname;
    public String classname;
    public double totalmarks;
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public double getTotalmarks() {
		return totalmarks;
	}
	public void setTotalmarks(double totalmarks) {
		this.totalmarks = totalmarks;
	}
	@Override
	public String toString() {
		return "Student7 [roll_no=" + roll_no + ", sname=" + sname + ", classname=" + classname + ", totalmarks="
				+ totalmarks + "]";
	}
	public Student7(int roll_no, String sname, String classname, double totalmarks) {
		super();
		this.roll_no = roll_no;
		this.sname = sname;
		this.classname = classname;
		this.totalmarks = totalmarks;
	}
}
