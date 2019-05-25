package com.testyantra.myspringbootapp.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testyantra.myspringbootapp.model.AllEmployess;
import com.testyantra.myspringbootapp.model.Employee;

@RestController
public class EmployeeService {

	@GetMapping("/getEmployees") //Default response is JSON
	public List<Employee> getEmployees() {
		final List<Employee> employeesList = new ArrayList<>();
		employeesList.add(new Employee(1, "lokesh", "gupta", "howtodoinjava@gmail.com"));
		return employeesList;
	}
	
	@GetMapping(path="/getEmployeesAsXmlOrJSON", produces= {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public AllEmployess getEmployeesAsXML() {
		final List<Employee> employeesList = new ArrayList<>();
		employeesList.add(new Employee(1, "lokesh", "gupta", "howtodoinjava@gmail.com"));
		employeesList.add(new Employee(2, "Praveen", "Dyamappa", "praveen.d@gmail.com"));
		
		Employee emp = new Employee(1, "lokesh", "gupta", "howtodoinjava@gmail.com");
		
		AllEmployess emps = new AllEmployess();
		emps.setAllEmployees(employeesList);
		return emps;
	}
}//End of Class
