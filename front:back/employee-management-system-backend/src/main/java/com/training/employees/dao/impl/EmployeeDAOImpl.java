package com.training.employees.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.training.employees.dao.EmployeeDAO;
import com.training.employees.entity.Employee;

@Repository(value = "employeeDAO")
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean saveEmployee(Employee employee) {
		sessionFactory.getCurrentSession().save(employee);
		return true;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		sessionFactory.getCurrentSession().update(employee);
		return true;
	}

	@Override
	public boolean deleteEmployee(Employee employee) {
		sessionFactory.getCurrentSession().delete(employee);
		return true;
	}

	@Override
	public Employee getEmployeeById(int id) {
		Employee employee = sessionFactory.getCurrentSession().get(Employee.class, id);
		return employee;
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Employee> getAllEmployees() {
		Query query = sessionFactory.getCurrentSession().createQuery("FROM Employee");
		List list = query.list();
		return list;
	}

}
