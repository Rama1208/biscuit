package com.cg.student.ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Scanner;

import com.cg.student.service.StudentService;
import com.g.student.dto.StudentDto;

public class StudentMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentService sservice=new StudentService();
		
		int choice=0;
		do {
		System.out.println("MENU");
		System.out.println("1.Add Student");
		System.out.println("2.View Student");
		System.out.println("3.Delete Student");
		
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter the student id");
			int sid=sc.nextInt();
			System.out.println("Enter the student name");
			String sname=sc.next();
			System.out.println("enter dob");
			String sdob=sc.next();
			DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
			LocalDate dob=LocalDate.parse(sdob,dateTimeFormatter);
			System.out.println("Enter passing year");
			int pyear=sc.nextInt();
			
			StudentDto sdto=new StudentDto();
			sdto.setSid(sid);
			sdto.setSname(sname);
			sdto.setDob(dob);
			sdto.setPyear(pyear);
			
			sservice.addStudent(sdto);
			System.out.println("student id "+sdto.getSid() + " is successful");
			break;
		case 2:
			System.out.println("Enter your choice 1.all  2.By student ID");
			int choice1=sc.nextInt();
			if(choice1==1)
			{
				HashSet<StudentDto> allData=sservice.showDetails();
				for(StudentDto e : allData)
				{
					System.out.println("student id is "+e.getSid());
					System.out.println("Student name is "+e.getSname());
					System.out.println("Student dob is "+e.getDob());
					System.out.println("student passing year is "+e.getPyear());
				}
			}
			else if(choice1==2)
			{
				System.out.println("Enter the student Id");
				sid=sc.nextInt();
				StudentDto Data=sservice.searchStudent(sid);
				
					System.out.println("student id is "+Data.getSid());
					System.out.println("Student name is "+Data.getSname());
					System.out.println("Student dob is "+Data.getDob());
					System.out.println("student passing year is "+Data.getPyear());
				
			}
			else
				System.out.println("Enter a valid number");
			break;
		case 3:
			System.out.println("Enter the student id");
			int sid1=sc.nextInt();
			Boolean obj=sservice.deleteStudent(sid1);
			System.out.println("deletion for "+sid1 +"is successful");
			break;
			
		case 4:
			System.exit(0);
			break;
			
		default:
			break;
		}
		
	}while(choice!=5);
}
}

