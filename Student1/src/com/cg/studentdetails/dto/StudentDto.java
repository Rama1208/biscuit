package com.cg.studentdetails.dto;

import java.time.LocalDate;

public class StudentDto { 
	
private int sid;
private String sname;
private String sphone;
private String semail;
private int sage;
private String sgender;
private String scity;
private LocalDate Date;
private String sstatus="Not approved";
private String CollegeName;
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
public String getSphone() {
	return sphone;
}
public void setSphone(String sphone) {
	this.sphone = sphone;
}
public String getSemail() {
	return semail;
}
public void setSemail(String semail) {
	this.semail = semail;
}
public int getSage() {
	return sage;
}
public void setSage(int sage) {
	this.sage = sage;
}
public String getSgender() {
	return sgender;
}
public void setSgender(String sgender) {
	this.sgender = sgender;
}
public String getScity() {
	return scity;
}
public void setScity(String scity) {
	this.scity = scity;
}
public LocalDate getDate() {
	return Date;
}
public void setDate(LocalDate date) {
	Date = date;
}
public String getSstatus() {
	return sstatus;
}
public void setSstatus(String sstatus) {
	this.sstatus = sstatus;
}
public String getCollegeName() {
	return CollegeName;
}
public void setCollegeName(String collegeName) {
	CollegeName = collegeName;
}


}




