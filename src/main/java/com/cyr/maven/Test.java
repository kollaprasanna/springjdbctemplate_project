package com.cyr.maven;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
	      
	    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");  
	    int status=dao.saveEmployee(new Employee(102,"Amit",35000));  
	    System.out.println(status);  
	}

}
