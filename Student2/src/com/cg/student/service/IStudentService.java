package com.cg.student.service;

import java.util.HashSet;

import com.g.student.dto.StudentDto;

public interface IStudentService {
	
	public int addStudent(StudentDto sdto);
	public HashSet<StudentDto> showDetails();
	public StudentDto searchStudent(int sid);
	public Object deleteStudent(int sid1);

}
