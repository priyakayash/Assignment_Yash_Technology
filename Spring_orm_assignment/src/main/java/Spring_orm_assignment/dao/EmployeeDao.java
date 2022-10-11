package Spring_orm_assignment.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.Spring_orm_assignment.entities.Employee;
public class EmployeeDao {
	
	private HibernateTemplate hibernatetemp;
	
	@Transactional
	public int insert(Employee emp)
	{
		Integer i=(Integer)this.hibernatetemp.save(emp);
		return i;
		
	}
	
	@Transactional
	public void updateDetails(Employee emp)
	{
		this.hibernatetemp.update(emp);
	}
	
	@Transactional
	public void deleteDetails(int emp_id)
	{
		Employee emp=this.hibernatetemp.get(Employee.class,emp_id);
		this.hibernatetemp.delete(emp);
	}

	public HibernateTemplate getHibernatetemp() {
		return hibernatetemp;
	}

	public void setHibernatetemp(HibernateTemplate hibernatetemp) {
		this.hibernatetemp = hibernatetemp;
	}
	
	public List<Employee> getAllEmployees()
	{
		List<Employee> emp=this.hibernatetemp.loadAll(Employee.class);
		return emp;
	}

}
