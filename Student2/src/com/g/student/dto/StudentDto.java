package com.g.student.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StudentDto {
	
	private int sid;
	private String sname;
	private LocalDate dob;
	DateTimeFormatter formate=DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private int pyear;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public DateTimeFormatter getFormate() {
		return formate;
	}
	public void setFormate(DateTimeFormatter formate) {
		this.formate = formate;
	}
	public int getPyear() {
		return pyear;
	}
	public void setPyear(int pyear) {
		this.pyear = pyear;
	}
	

}
