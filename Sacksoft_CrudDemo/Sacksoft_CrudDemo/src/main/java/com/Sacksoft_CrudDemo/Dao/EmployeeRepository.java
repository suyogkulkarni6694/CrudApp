package com.Sacksoft_CrudDemo.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Sacksoft_CrudDemo.Entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	public Employee getByID(int employeeID);

}
