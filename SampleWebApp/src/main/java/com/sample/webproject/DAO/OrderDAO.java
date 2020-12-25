package com.sample.webproject.DAO;

import org.hibernate.Session;
// import org.hibernate.SessionFactory;
// import org.hibernate.cfg.Configuration;

import java.util.List;
import com.sample.webproject.util.HibernateUtil;
import com.sample.webproject.models.Orders;

public class OrderDAO {

	public static List<Orders> GetAll() {
    Session session = HibernateUtil.getSessionFactory().openSession();
		List<Orders> list = session.createQuery("FROM Orders").list();
		return list;
	}

	public static Orders getOrderById(String id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Orders order = session.load(Orders.class, id);
		return order;
	}
}