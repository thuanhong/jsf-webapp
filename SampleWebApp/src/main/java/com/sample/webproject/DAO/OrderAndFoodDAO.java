package com.sample.webproject.DAO;

import org.hibernate.Session;
// import org.hibernate.SessionFactory;
// import org.hibernate.cfg.Configuration;

import java.util.List;
import com.sample.webproject.util.HibernateUtil;
import com.sample.webproject.models.OrderAndFood;

public class OrderAndFoodDAO {

	public static List<OrderAndFood> GetAll(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
		List<OrderAndFood> list = session.createQuery("select E from OrderAndFood as E INNER JOIN Orders as O on E.orderId.id = O.id where O.table_id.id = :id")
			.setParameter("id", id).list();
		return list;
	}

	public static void createNewOrderAndFood(OrderAndFood newOrder) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			session.save(newOrder);
			session.getTransaction().commit();
			System.out.println("insert success!");
		} catch (RuntimeException e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.flush();
			HibernateUtil.shutdown();
		}
	}
}