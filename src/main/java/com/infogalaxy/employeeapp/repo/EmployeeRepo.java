package com.infogalaxy.employeeapp.repo;

import org.springframework.cglib.core.TinyBitSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infogalaxy.employeeapp.entity.EmployeeEntity;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer>{

	public EmployeeEntity getEmployeeEntityByEid(int eid);
	
}
