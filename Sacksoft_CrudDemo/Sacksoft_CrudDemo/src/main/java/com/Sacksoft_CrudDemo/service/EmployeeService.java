package com.Sacksoft_CrudDemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Sacksoft_CrudDemo.Dao.EmployeeRepository;
import com.Sacksoft_CrudDemo.Entity.Employee;

@Component
@Service
@ComponentScan("com.Sacksoft_CrudDemo.Dao")
public class EmployeeService {

	@Autowired
	@Qualifier("EmployeeRepository")
	private EmployeeRepository employeeRepository;

	// Getting List of present Employees
	public List<Employee> getAllEmployees() {

		ArrayList<Employee> employee = new ArrayList<>();
		employee = (ArrayList<Employee>) this.employeeRepository.findAll();
		return employee;
	}

	// Get Employee by ID
	public Employee getByID(int employeeID) {

		return this.employeeRepository.findById(employeeID).orElse(null);
	}

	// Adding New Employee
	public String addNewEmployee(Employee employee_New) {

		employeeRepository.save(employee_New);
		return "Employee Added" + employee_New;
	}

	// Update Existing Employee
	public String updateEmployee(int employeeID, Employee employee) {

		employee.setEmployeeID(employeeID);
		employeeRepository.save(employee);

		return "Employee record updated" + employee;
	}

	// Delete Employee
	public String deleteEmployee(int employeeID) {

		employeeRepository.deleteById(employeeID);
		return "Employee Record Deleted " + employeeID;
	}

}
