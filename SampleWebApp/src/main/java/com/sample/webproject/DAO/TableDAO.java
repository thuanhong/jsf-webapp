package com.sample.webproject.DAO;

import org.hibernate.Session;
// import org.hibernate.SessionFactory;
// import org.hibernate.cfg.Configuration;
import java.io.*;

import java.util.List;
import com.sample.webproject.util.HibernateUtil;
import com.sample.webproject.models.Tables;

public class TableDAO {

	public static List<Tables> GetAll() {
    Session session = HibernateUtil.getSessionFactory().openSession();
		List<Tables> list = session.createQuery("FROM Tables").list();

		return list;
	}

	public static Tables getTableById(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Tables table = session.load(Tables.class, id);

		return table;
	}

	
}