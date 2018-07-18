package com.cg.collegedetails.ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import com.cg.studentdetails.dto.StudentDto;
import com.cg.studentdetails.service.IStudentService;
import com.cg.studentdetails.service.StudentServiceImpl;
import com.cg.studentstatus.exception.IStudentExceptionMessages;

import com.cg.studentstatus.exception.StudentException;

public class StudentMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		IStudentService service=new StudentServiceImpl();
		
		int choice=0;
		do {
			printDetails();
			System.out.println("enter the choice");
			choice=scanner.nextInt();
			switch(choice) {
			case 1:
				System.out.println("id is auto generated");
				System.out.println("enter employee name");
				String name=scanner.next();
				System.out.println("enter employee phone");
				String phone=scanner.next();
				System.out.println("enter employee email");
				String email=scanner.next();
				System.out.println("enter employee age");
				int age=scanner.nextInt();
				System.out.println("enter employee gender");
				String gender=scanner.next();
				System.out.println("enter employee city");
				String city=scanner.next();
				System.out.println("enter student date of joining in dd-MMM-yyyy");
				String sc=scanner.next();
				try {
				DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
				LocalDate sdob=LocalDate.parse(sc,dateTimeFormatter);
				
				StudentDto studentDto=new StudentDto();
				studentDto.setSname(name);
				studentDto.setSphone(phone);
				studentDto.setSemail(email);
				studentDto.setSage(age);
				studentDto.setSgender(gender);
				studentDto.setScity(city);
				studentDto.setDate(sdob);
				
				boolean result=false;
				try {
					result=service.validationDetails(studentDto);
				}catch(StudentException stException) {
					System.out.println(stException.getMessage());
				}
		
				if(result) {
					int id=service.addStudent(studentDto);
					System.out.println(id);
				}
				}catch(DateTimeParseException exception) {
					try {
						throw new StudentException(IStudentExceptionMessages.MESSAGE5);
					}catch(StudentException studentException) {
						System.out.println(studentException.getMessage());
					}
				}
				break;
			case 2:
				System.out.println("Enter id");
				int idd=scanner.nextInt();
				StudentDto dto=service.showStudent(idd);
				if(dto!=null) {
					System.out.println("student name"+dto.getSname());
					System.out.println("ststus"+dto.getSstatus());
					System.out.println("college"+dto.getCollegeName());
				}else {
					System.out.println("student not found ");
				}
				break;
				
			case 3:
				System.exit(0);
				break;
			default:
				break;
			}	
			}while(choice!=4);
		scanner.close();
	}
	private static void printDetails() {
		System.out.println("\n MENU");
		System.out.println("-------------");
		System.out.println("\n  1. add student details  2.view student details    3.exit");
	}
}
