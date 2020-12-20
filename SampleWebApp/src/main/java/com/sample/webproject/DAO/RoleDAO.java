package com.sample.webproject.DAO;

import org.hibernate.Session;
// import org.hibernate.SessionFactory;
// import org.hibernate.cfg.Configuration;
import java.io.*;

import java.util.List;
import com.sample.webproject.util.HibernateUtil;
import com.sample.webproject.models.Role;

public class RoleDAO {

	public static Role getRoleById(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Role role = session.load(Role.class, id);
		return role;
	}


}