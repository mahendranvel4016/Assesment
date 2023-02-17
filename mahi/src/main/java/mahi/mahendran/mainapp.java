package mahi.mahendran;


import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

public class mainapp {
	
	public static void main(String[] args) {
		org.hibernate.Transaction txn;
		try(Session session = hibernateutil.getSessionFactory().openSession()){
			txn = session.beginTransaction();
			department dept = new department(2456,"candidates");
			employee e1 = new employee(2024,"simbu",dept);
			employee e2 = new employee(2025,"tonyja",dept);
			employee e3 = new employee(2026,"billie ellish",dept);
			Set<employee> s1 = new HashSet<employee>();
			s1.add(e1);
			s1.add(e2);
			s1.add(e3);
			dept.setEmp(s1);
			session.save(dept);
			session.save(e1);
			session.save(e2);
			session.save(e3);
			txn.commit();
			session.close();
		}

	}

}

