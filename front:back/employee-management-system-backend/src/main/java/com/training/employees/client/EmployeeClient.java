package com.training.employees.client;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.employees.dao.EmployeeDAO;
import com.training.employees.entity.Employee;

public class EmployeeClient {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.training.employees");
		context.refresh();

		EmployeeDAO employeeDAO = (EmployeeDAO) context.getBean("employeeDAO");
		Employee employee = new Employee("Henary", "welcome123", "Henary Bolt", 25, "7 Years", 95000, 9088889098L);
		employeeDAO.saveEmployee(employee);

		// get the employee by id
//
//		Employee employee = employeeDAO.getEmployeeById(2);
//		employee.setExperience("8 Years");
//		employee.setSalary(98000);

		// Update the employee object

//		employeeDAO.updateEmployee(employee);
		
		// Get All Employees
		
//		List<Employee> employees = employeeDAO.getAllEmployees();
//		employees.forEach(System.out::println);

		
		// Delete the employee with id 2
//		  employeeDAO.deleteEmployee(employee);
		
		context.close();

	}

}
