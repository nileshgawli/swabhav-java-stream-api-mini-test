package com.aurionpro.model;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {
	private int id;
	private String name;
	private String dept;
	private double salary;
	
	public Employee(int id, String name, String dept, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}

	public double getSalary() {
		return salary;
	}

	public static Map<String, Double> averageSalaryByDept(List<Employee> staff) {
	    return staff.stream()
	        .collect(Collectors.groupingBy(
	            emp -> emp.dept,
	            Collectors.collectingAndThen(
	                Collectors.averagingDouble(emp -> emp.salary),
	                avg -> Math.round(avg * 100.0) / 100.0
	            )
	        ));
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}

	
	
	
}
