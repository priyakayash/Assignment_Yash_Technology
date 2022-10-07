package com.yash.spring_assignment.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
    	Emp e=(Emp) context.getBean("trainee");
		System.out.println(e);
		
		PrintMessage p=(PrintMessage) context.getBean("print");
		System.out.println(p);
		
		ConstructorMessage cm=(ConstructorMessage)context.getBean("message");
		System.out.println(cm);
		
		SetterMessage a=(SetterMessage) context.getBean("settermessage");
		
		System.out.println(a);
    }
}
