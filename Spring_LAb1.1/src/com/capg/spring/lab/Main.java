package com.capg.spring.lab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		Employee e1 =(Employee)		context.getBean("emp");
		System.out.println("Employee Details");
		System.out.println("Employee ID : "+e1.getEmployeeId());
		System.out.println("Employee Name : "+e1.getEmployeeName());
		System.out.println("Employee Salary : "+e1.getSalary());
		System.out.println("Employee BU : "+e1.getBusinessUnit());
		System.out.println("Employee Age : "+e1.getAge());
		

	}

}
