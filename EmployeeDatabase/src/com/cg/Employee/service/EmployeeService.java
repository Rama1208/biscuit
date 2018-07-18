package com.cg.Employee.service;

import java.util.ArrayList;

import com.cg.employedatabase.staticdb.EmployeeDatabase;
import com.cg.employedatabase.staticdb.Employeedto;
import com.cg.employeedao.EmployeeDao;

public class EmployeeService extends EmployeeDatabase{
	Employeedto edb=new Employeedto();
	 EmployeeDao dao=new  EmployeeDao();

public ArrayList<Employeedto> getAllDetails()
{
return dao. getAllDetails();		
}
public Employeedto getOneDetails(int id)
{
	return dao.getOneDetails(id);

}

	

public void addEmployee(Employeedto emp5) {
	
		 dao.addEmployee(emp5);
}
public boolean addSalary(int id1, double sal1) {
	// TODO Auto-generated method stub
	for(Employeedto employeedto : database)
		if(id1==employeedto.getEmpid())
		{
			employeedto.empsal+=sal1;
			return true;
		}
	return false;
}
	
	
	
}
