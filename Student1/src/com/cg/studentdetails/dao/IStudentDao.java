package com.cg.studentdetails.dao;

import java.util.HashMap;

import com.cg.studentdetails.dto.StudentDto;
import com.cg.studentstatus.exception.StudentException;

public interface IStudentDao {

	
	public String showCollegeName(String city);
	public StudentDto showStudent(int id);
	void addStudent(StudentDto studentDto);
	
	
}
