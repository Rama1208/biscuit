package com.cg.employedatabase.staticdb;

import java.util.ArrayList;

public class EmployeeDatabase {
       public static ArrayList<Employeedto> database=null;
       static
       {
    	   database=new ArrayList<>();
    	   
       }
       public void getLoginDetails()
       {
    	   Employeedto emp1=new Employeedto();
    	   emp1.setEmpid(1001);
    	   emp1.setEmpname("mani");
    	   emp1.setEmpdesignation("Analyst");
    	   emp1.setEmpsal(30000);
    	   
    	   Employeedto emp2=new Employeedto();
    	   emp2.setEmpid(1003);
    	   emp2.setEmpname("reddy");
    	   emp2.setEmpdesignation("AA8");
    	   emp2.setEmpsal(13200);
    	   
    	   Employeedto emp3=new Employeedto();
    	   emp3.setEmpid(1004);
    	   emp3.setEmpname("syamala");
    	   emp3.setEmpdesignation("manager");
    	   emp3.setEmpsal(113200);
    	   
    	   database.add(emp1);
    	   database.add(emp2);
    	   database.add(emp3);
    	   
    	   
    	   
       }
}
