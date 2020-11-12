package com.sample.webproject.DAO;

import org.hibernate.Session;
// import org.hibernate.SessionFactory;
// import org.hibernate.cfg.Configuration;

import java.util.List;
import com.sample.webproject.util.HibernateUtil;
import com.sample.webproject.models.Staff;

public class LoginDAO {

	public static List<Staff> login(String user, String password) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        // session.beginTransaction();
        // session.save(new Customer("Kai", "Viet Nam"));
        // session.getTransaction().commit();
        // session.flush();
		// session.close();
		
		List<Staff> list = session.createQuery("FROM Staff WHERE staff_name = :user and password LIKE :password")
				.setParameter("user", user)
				.setParameter("password", password).list();
		return list;
	}
}