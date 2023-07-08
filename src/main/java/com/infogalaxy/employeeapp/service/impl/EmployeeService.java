package com.infogalaxy.employeeapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infogalaxy.employeeapp.entity.EmployeeEntity;
import com.infogalaxy.employeeapp.model.EmployeeModel;
import com.infogalaxy.employeeapp.repo.EmployeeRepo;
import com.infogalaxy.employeeapp.service.IEmployeeService;

@Service
public class EmployeeService implements IEmployeeService{

	@Autowired
	EmployeeRepo employeeRepo;
	
	@Override
	public String addemp(EmployeeModel employeeModel) {
		
		EmployeeEntity employeeEntity = new EmployeeEntity();
		employeeEntity.setEid(employeeModel.getEid());
		employeeEntity.setName(employeeModel.getName());
		employeeEntity.setDepartment(employeeModel.getDepartment());
		employeeEntity.setSalary(employeeModel.getSalary());
		employeeEntity.setDoj(employeeModel.getDoj());
		employeeEntity.setAge(employeeModel.getAge());
		
		employeeRepo.save(employeeEntity);
		return "Employee Added...";
	}

	@Override
	public List<EmployeeEntity> getallemp() {
		return employeeRepo.findAll();
	}

	@Override
	public EmployeeEntity getempbyid(int eid) {
		return employeeRepo.getEmployeeEntityByEid(eid);
	}

	
	
}
