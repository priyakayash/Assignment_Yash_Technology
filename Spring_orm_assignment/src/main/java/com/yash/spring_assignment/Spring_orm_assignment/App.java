package com.yash.spring_assignment.Spring_orm_assignment;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Spring_orm_assignment.entities.Employee;

import Spring_orm_assignment.dao.EmployeeDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        EmployeeDao empdao=context.getBean("EmployeeDao",EmployeeDao.class);
        Employee stu=new Employee(2,"priya",80000.00);
//        int msg=empdao.insert(stu);
//        System.out.println(msg + "insertion done");
//        

//      empdao.updateDetails(stu);
//      System.out.println("updation done");
        
//        empdao.deleteDetails(2);
//     System.out.println("delete done");
        
        List<Employee> emp=empdao.getAllEmployees();
		for(Employee s1:emp)
		{
			System.out.println(s1);
		}
    }
}
