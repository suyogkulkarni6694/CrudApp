package com.Sacksoft_CrudDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.Sacksoft_CrudDemo.Entity.Employee;
import com.Sacksoft_CrudDemo.service.EmployeeService;

@RestController
@RequestMapping("/empCrud")
@ComponentScan("com.Sacksoft_CrudDemo.service")
public class EmployeeController {

	@Autowired
	@Qualifier("EmployeeService")
	private EmployeeService employeeService;

	// Get Employee List
	@GetMapping("/allEmployees")
	public void getAllEmployees() {

		employeeService.getAllEmployees();
	}

	// Get Employee by ID
	@GetMapping("/employee/{ID}")
	public void getByID(@PathVariable int employeeID) {

		employeeService.getByID(employeeID);
	}

	// To add Employee
	@PostMapping("/newEmployee")
	public void addNewEmployee(@RequestBody Employee employee) {

		employeeService.addNewEmployee(employee);
	}

	// To update Employee
	@PutMapping("/update/{ID}")
	public void updateEmployee(@PathVariable int employeeID, @RequestBody Employee employee) {

		employeeService.updateEmployee(employeeID, employee);
	}

	// To delete Employee
	@DeleteMapping("/delete/{ID}")
	public void deleteEmployee(@PathVariable int employeeID) {
		employeeService.deleteEmployee(employeeID);

	}

}
