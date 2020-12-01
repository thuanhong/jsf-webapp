package com.sample.webproject.DAO;

import org.hibernate.Session;
// import org.hibernate.SessionFactory;
// import org.hibernate.cfg.Configuration;
import java.io.*;

import java.util.List;
import com.sample.webproject.util.HibernateUtil;
import com.sample.webproject.models.Staff;

public class StaffDAO {

	public static Staff getStaffById(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Staff staff = session.load(Staff.class, id);

		HibernateUtil.shutdown();
		return staff;
	}

	
}