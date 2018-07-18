package com.cg.employedatabase.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.Employee.service.EmployeeService;

import com.cg.employedatabase.staticdb.EmployeeDatabase;
import com.cg.employedatabase.staticdb.Employeedto;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EmployeeDatabase edb=new EmployeeDatabase();

edb.getLoginDetails();
EmployeeService es=new EmployeeService();
int choice;
do {
	printDetails();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter choice");
	 choice=sc.nextInt();
	switch(choice)
	{
	case 1:
		System.out.println("selected all details");
		ArrayList <Employeedto> details=es.getAllDetails();
		for (Employeedto employeedto : details) {
			System.out.println(employeedto.getEmpid());
			System.out.println(employeedto.getEmpname());
			System.out.println(employeedto.getEmpsal());
			System.out.println(employeedto.getEmpdesignation());
			}
		break;
	case 2:
		System.out.println("selected one details");
		System.out.println("enter id:");
		int id=sc.nextInt();
		Employeedto data=es.getOneDetails(id);
		if(data!=null)
		{
			System.out.println(data.getEmpid());
			System.out.println(data.getEmpname());
			System.out.println(data.getEmpdesignation());
			System.out.println(data.getEmpsal());
			
		}
		else
			
		{
			System.out.println("employee details not found");
		}
		break;
	case 3:
		System.out.println("add the employee");
		 
		System.out.println("the new employee details are");
		System.out.println("enetr id");
		int pid=sc.nextInt();
		System.out.println("enetr name");
		String pname=sc.next();
		System.out.println("designation");
		String pdes=sc.next();
		System.out.println("salary");
		double psal=sc.nextDouble();
		
		 Employeedto emp5=new Employeedto();
		 emp5.setEmpid(pid);
	   	   emp5.setEmpname(pname);
	   	   emp5.setEmpdesignation(pdes);
	   	   emp5.setEmpsal(psal);
	   	   es.addEmployee(emp5);
	   	   break;
	case 4:
		System.out.println("enter the employee id to add salart");
		int id1=sc.nextInt();
		System.out.println("enter the amount of slaary increase");
		double sal1=sc.nextDouble();
		boolean result=es.addSalary(id1,sal1);
		if(result) {
			System.out.println("update succes");
		}
		else
		{
			System.out.println("invalid id");
		}
		break;
	}
}while(choice!=5);
	}
          public static void printDetails()
          {
        	  System.out.println(" press one to get all details");
        	  System.out.println(" press two to get only one detail");
        	  System.out.println(" press three to add details of employee");
        	  System.out.println(" press four to edit the salary of an employee");
        	  System.out.println(" press five to exit");
        	  
        	  
          }
}
