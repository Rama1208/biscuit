package com.cg.employeedao;

import java.util.ArrayList;


import com.cg.employedatabase.staticdb.EmployeeDatabase;
import com.cg.employedatabase.staticdb.Employeedto;

public class EmployeeDao {

	
	
	public ArrayList<Employeedto> getAllDetails()
	{
		return EmployeeDatabase.database;
	}
	
	public Employeedto getOneDetails(int id1)
	{   Employeedto emp=null;
	  for (Employeedto employeedto : EmployeeDatabase.database) {
	    	if(id1==employeedto.getEmpid())
	    	{
	    		emp=employeedto;
	    		break;
	    	}
	    }
		return emp;
	}
	public  void addEmployee(Employeedto emp5) {
		
		 EmployeeDatabase.database.add(emp5);
}
}
		


