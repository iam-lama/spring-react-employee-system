package com.training.employees.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.training.employees.dao.EmployeeDAO;
import com.training.employees.entity.Employee;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeDAO employeeDAO;

	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}

	@GetMapping("/employee-list")
	public String allEmployees(Model model) {
		List<Employee> list = employeeDAO.getAllEmployees();
		model.addAttribute("employee", new Employee()); // sending empty employee object to spring form
		model.addAttribute("employees", list);
		return "employees";
	}

	@PostMapping("/add/employee")
	public String addEmployee(@ModelAttribute("employee") Employee employee) {
		employeeDAO.saveEmployee(employee);
		return "redirect:/employee-list";
	}

	@GetMapping("/remove/employee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		Employee employee = employeeDAO.getEmployeeById(id);
		employeeDAO.deleteEmployee(employee);
		return "redirect:/employee-list";
	}
}
