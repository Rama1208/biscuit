package com.cg.student.dao;

import java.util.HashSet;

import com.g.student.dto.StudentDto;

public class StudentDao {
	

	StudentDto dto=new StudentDto();
	private HashSet<StudentDto> hashset= new HashSet<>();
	public int addStudent(StudentDto sdto) {
		
		hashset.add(sdto);
		return sdto.getSid();
		
	}

	public HashSet<StudentDto> showDetails() {
	
		return hashset;
	}

	public StudentDto searchStudent(int sid) {
		
		for(StudentDto dto : hashset) {
		if(dto.getSid()==sid)
			return dto;
		}
		return null;
	}

	public boolean deleteStudent(int sid1) {
	
		for(StudentDto dto : hashset) {
		if(dto.getSid()==sid1) {
		hashset.remove(dto);
		return true;
		}
		
	}
		return false;
	
	
}
}
