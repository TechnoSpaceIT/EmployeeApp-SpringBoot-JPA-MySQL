package com.infogalaxy.employeeapp.service;

import java.util.List;

import com.infogalaxy.employeeapp.entity.EmployeeEntity;
import com.infogalaxy.employeeapp.model.EmployeeModel;

public interface IEmployeeService {

	public String addemp(EmployeeModel employeeModel);
	
	public List<EmployeeEntity> getallemp();
	
	public EmployeeEntity getempbyid(int eid);
}
