package com.sample.webproject.DAO;

import org.hibernate.Session;
// import org.hibernate.SessionFactory;
// import org.hibernate.cfg.Configuration;
import java.io.*;

import java.util.List;
import com.sample.webproject.util.HibernateUtil;
import com.sample.webproject.models.Payment;

public class PaymentDAO {

	public static Payment getPaymentById(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Payment payment = session.load(Payment.class, id);
		return payment;
	}
	public static List<Payment> GetAll(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
		List<Payment> list = session.createQuery("select * from Payment")
			.setParameter("id", id).list();
		return list;
	}


}
