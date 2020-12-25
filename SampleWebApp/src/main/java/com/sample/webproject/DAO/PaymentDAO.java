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
	public static List<Integer> getPaymentStatic() {
        Session session = HibernateUtil.getSessionFactory().openSession();
		List<Integer> list = session.createQuery("SELECT sum(total) FROM Payment GROUP BY MONTH(createAt)").list();
		return list;
	}
	public static List<Payment> getAll(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Payment> paymentList = session.createQuery("FROM Payment").list();
		return paymentList;
	}



}
