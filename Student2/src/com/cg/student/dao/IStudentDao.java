package com.cg.student.dao;

import java.util.HashSet;

import com.g.student.dto.StudentDto;

public interface IStudentDao {
	
	public int addStudent(StudentDto sdto);
	public HashSet<StudentDto> showDetails();
	public StudentDto searchStudent(int sid);
	public Object deleteStudent(int sid1);

}
