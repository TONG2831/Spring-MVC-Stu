package com.spring.entities;

public class Employee {
	//id
	private Integer id;	
	//姓名
	private String name;
	//性别
	private String sex;
	//部门
	private String department;
	
	public Employee(Integer id, String name, String sex, String department) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.department = department;
	}
	
	
	public Employee() {
		super();
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sex=" + sex + ", department=" + department + "]";
	}
}
