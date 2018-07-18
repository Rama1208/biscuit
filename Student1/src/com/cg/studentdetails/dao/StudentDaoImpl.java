package com.cg.studentdetails.dao;

import java.util.HashMap;
import java.util.regex.Pattern;
import com.cg.studentdetails.dto.StudentDto;
import com.cg.studentstatus.exception.StudentException;

public  class StudentDaoImpl implements IStudentDao { 
	
	private static HashMap<String,String>collegedetails=null;
	private static HashMap<Integer,StudentDto>studentdetails=null;
	
	static {
		collegedetails=new HashMap<>();
		studentdetails=new HashMap<>();
		collegedetails.put("Delhi", "IIT-D");
		collegedetails.put("Hyd","IIT-H");
		collegedetails.put("Chennai","IIT-M");
		collegedetails.put("Bangalore","IISc-B");
		collegedetails.put("Mumbai","IIT-M");
	}

	@Override
	public void addStudent(StudentDto studentDto) {
	studentdetails.put(studentDto.getSid(), studentDto);	
	}

	@Override
	public String showCollegeName(String city) {
		
		return collegedetails.get(city);
	}

	@Override
	public StudentDto showStudent(int id) {
		
		return studentdetails.get(id);
	}

	
	

}
