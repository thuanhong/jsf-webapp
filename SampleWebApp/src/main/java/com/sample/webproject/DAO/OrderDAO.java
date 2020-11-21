package com.sample.webproject.DAO;

import org.hibernate.Session;
// import org.hibernate.SessionFactory;
// import org.hibernate.cfg.Configuration;

import java.util.List;
import com.sample.webproject.util.HibernateUtil;
import com.sample.webproject.models.Tables;

public class OrderDAO {

	public static List<Tables> GetAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
		List<Tables> list = session.createQuery("FROM Orders").list();
		return list;
	}
}