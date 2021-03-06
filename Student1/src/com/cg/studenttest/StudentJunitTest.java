package com.cg.studenttest;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import com.cg.studentdetails.dao.IStudentDao;
import com.cg.studentdetails.dao.StudentDaoImpl;
import com.cg.studentdetails.dto.StudentDto;

class StudentJunitTest {

IStudentDao dao=new StudentDaoImpl();
	
	@BeforeClass
	public static void setUp()throws Exception{
		System.out.println("Testing starts");
	}
	
	@AfterClass
	public static void endUp()throws Exception{
		System.out.println("Testing Ends");
	}
	
	@Test
	public void getCollegeValidTest() {
		assertEquals("IIT-M",dao.showCollegeName("Chennai"));
	}
	
	@Test
	public void getCollegeNullTest() {
		assertNull(dao.showCollegeName(" "));
	}
	
	@Test
	public void addStudentTest() {
		StudentDto studentDto=new StudentDto();
		studentDto.setSage(21);
		studentDto.setScity("Hyd");
		studentDto.setSemail("rama@gmail.com");
		studentDto.setSgender("female");
		studentDto.setSname("rama");
		studentDto.setSphone("1233456789");
		dao.addStudent(studentDto);
		assertEquals("IIT-M", dao.showCollegeName("Chennai"));	
	}
	
	@Test
	public void getCollegeInvalidInputsTest() {
		assertNotSame("kolkata",dao.showCollegeName("kolkata"));
					
	}

	@Test
	public void showStudent() {
		assertNull(null,dao.showStudent(12345));
	}


}
