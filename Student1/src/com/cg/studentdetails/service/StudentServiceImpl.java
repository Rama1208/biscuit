package com.cg.studentdetails.service;

import java.time.LocalDate;
import com.cg.studentdetails.dao.IStudentDao;
import com.cg.studentdetails.dao.StudentDaoImpl;
import com.cg.studentdetails.dto.StudentDto;
import com.cg.studentstatus.exception.IStudentExceptionMessages;
import com.cg.studentstatus.exception.StudentException;

public class StudentServiceImpl implements  IStudentService {
private StudentDaoImpl dao=null;

public StudentServiceImpl() {
	dao=new StudentDaoImpl();
}
/*------------------------    <Student> Application --------------------------
/*******************************************************************************************************
 - Method Name		:	<validationDetails>
 - Input Parameters	:	<studentDto> <StudentDto>
 - Return Type		:	<result> <boolean>
 - Throws			:  	<StudentException>Exception
 - Author			:	<Your_name>
 - Creation Date	:	dd/MM/yyyy
 - Description		:	write description of the method in few lines
 *********************************************************************************************************/
@Override
public Integer addStudent(StudentDto studentDto) {
	int generatedId=(int)(Math.abs(Math.random()*10000));
	String collegeName=dao.showCollegeName(studentDto.getScity());
	if(null!=collegeName) {
		studentDto.setSid(generatedId);
		studentDto.setCollegeName(collegeName);
		studentDto.setSstatus("Approved");
		dao.addStudent(studentDto);		
	}
	
	return generatedId;
}

@Override
public boolean validationDetails(StudentDto studentDto) throws StudentException {
	boolean result=true;
	if(!(studentDto.getSname().matches("[A-Za-z]+"))) {
		throw new StudentException(IStudentExceptionMessages.MESSAGE1);
		
	}if(!((studentDto.getSphone().matches("\\d{10}"))&& (studentDto.getSphone().length()==10)) ) {
		throw new StudentException(IStudentExceptionMessages.MESSAGE2);
		
	}if(studentDto.getSage()<1 || studentDto.getSage()>100){
		throw new StudentException(IStudentExceptionMessages.MESSAGE3);
		
	}if(!(studentDto.getSemail().matches("[a-zA-Z0-9_.]*@[a-z0-9]*.com"))) {
		throw new StudentException(IStudentExceptionMessages.MESSAGE4);
	}
		
	return result;
}




@Override
public StudentDto showStudent(int id) {
	
	return dao.showStudent(id);
}


}
