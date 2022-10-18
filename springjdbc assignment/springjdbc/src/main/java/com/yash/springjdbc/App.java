package com.yash.springjdbc;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import com.yash.springjdbc.dao.StudentDao;
import com.yash.springjdbc.entities.Student;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/yash/springjdbc/applicationcontext.xml");
        		StudentDao stdao=context.getBean("StudentDao",StudentDao.class);
        		Student s=new Student(); 
        		s.setId(1);
        		s.setName("sonu");
        		s.setAddress("rajendra nagar");
         		s.setMobile_no(992687);
//        		int r=stdao.insert(s);//insert the details
//        		int u=stdao.updatedetails(s);//update the details
        		//System.out.println(r + "Student added Successfully ");
//        		System.out.println(u+ "Student details updated ");
        		int r=stdao.deletedetails(107);//delete the details
        		//Student s=stdao.selectDetails(108);
        		//System.out.println(s);
        		List<Student> stu=stdao.getAllDetails();
        		for(Student s1:stu)
        		{
        			System.out.println(s1);
        		}
    }
}
