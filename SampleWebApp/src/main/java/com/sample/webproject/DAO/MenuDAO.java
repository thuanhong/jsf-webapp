package com.sample.webproject.DAO;

import org.hibernate.Session;
// import org.hibernate.SessionFactory;
// import org.hibernate.cfg.Configuration;

import java.util.List;
import com.sample.webproject.util.HibernateUtil;
import com.sample.webproject.models.Menu;

public class MenuDAO {

	public static List<Menu> GetAll() {
    Session session = HibernateUtil.getSessionFactory().openSession();
		List<Menu> list = session.createQuery("FROM Menu").list();

		HibernateUtil.shutdown();
		return list;
	}

	public static Menu getMenuById(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Menu menu = session.load(Menu.class, id);
	
		HibernateUtil.shutdown();
		return menu;
	}
}