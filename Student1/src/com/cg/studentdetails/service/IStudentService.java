package com.cg.studentdetails.service;

import java.time.LocalDate;

import com.cg.studentdetails.dto.StudentDto;
import com.cg.studentstatus.exception.StudentException;

public interface IStudentService {

	
	public Integer addStudent(StudentDto studentDto);
	public boolean validationDetails(StudentDto studentDto)throws StudentException;
	public StudentDto showStudent(int id);
	
	
	
	

}
