package it.html.hibernate.annotation;

import org.hibernate.Session;
import org.hibernate.Transaction;

import it.html.hibernate.annotation.bean.Employee;



/**
 * Hello world!
 *
 */
public class EmployeeTest 
{
    public static void main( String[] args )
    {
    	
    	Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        
		Employee emp = new Employee();
		emp.setEmpName("Deepak Kumar");
		emp.setEmpMobileNos("000000");
		emp.setEmpAddress("Delhi - India");

		//Chiedo al middleware di salvare questo oggetto nel database
		session.save(emp);
		


        
        tx.commit();

        session.close();
        HibernateUtil.shutdown();
    }
}
