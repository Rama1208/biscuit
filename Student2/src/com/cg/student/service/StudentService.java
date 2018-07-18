package com.cg.student.service;

import java.util.HashSet;
import com.cg.student.dao.StudentDao;
import com.g.student.dto.StudentDto;

public class StudentService {
	
	StudentDao sdao=new StudentDao();
	public int addStudent(StudentDto sdto) {
	
		return sdao.addStudent(sdto);
		
	}
	public HashSet<StudentDto> showDetails() {
	
		return sdao.showDetails();
		
	}
	public StudentDto searchStudent(int sid) {
	
		return sdao.searchStudent(sid);
	}
	public boolean deleteStudent(int sid1) {
	
		return sdao.deleteStudent(sid1);
	}

}
