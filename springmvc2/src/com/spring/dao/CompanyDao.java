package com.spring.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.spring.entities.Employee;

@Repository
public class CompanyDao {
	private static Map<Integer, Object> employees = null;
	
	static {
		employees = new HashMap<>();
		employees.put(1,new Employee(1,"周峰","male","事务部"));
		employees.put(2,new Employee(2,"张涵","male","企划部"));
		employees.put(3,new Employee(3,"王凤","female","财务部"));
		employees.put(4,new Employee(4,"赵青","male","事业部"));
		employees.put(5,new Employee(5,"李丽","male","技术部"));
	}
	
	public Collection<Object> getEmployees() {
		return employees.values();
	}
	
	public Employee getEmployee(Integer id) {
		return (Employee) employees.get(id);
	}
}
