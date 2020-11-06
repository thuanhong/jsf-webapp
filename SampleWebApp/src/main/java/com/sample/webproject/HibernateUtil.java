package com.sample.webproject;

import java.lang.*;
 
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.Properties;
import org.hibernate.service.ServiceRegistry;
 
public class HibernateUtil {
    private static SessionFactory sessionFactory;
 
    static {
        // try {
            // Create the SessionFactory from hibernate.cfg.xml
        // Configuration configuration = new Configuration();
        sessionFactory = new Configuration().configure().buildSessionFactory();
        // } catch (Throwable ex) {
        //     // Make sure you log the exception, as it might be swallowed
        //     System.err.println("SessionFactory creation failed." + ex);
        //     throw new ExceptionInInitializerError(ex);
        // }
    }
 
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
 
    public static void shutdown() {
        // Close caches and connection pools
        getSessionFactory().close();
    }
 
}