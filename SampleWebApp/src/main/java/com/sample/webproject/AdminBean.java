package com.sample.webproject;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import javax.faces.application.FacesMessage;
import java.util.Date;
import java.io.Serializable;
import org.hibernate.Session;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import javax.faces.bean.RequestScoped;

import com.sample.webproject.util.HibernateUtil;
import com.sample.webproject.models.Payment;
import com.sample.webproject.DAO.PaymentDAO;

import com.sample.webproject.models.Orders;
import com.sample.webproject.DAO.OrderDAO;

import com.sample.webproject.util.PersistenceUtil;

import java.io.*;
import java.util.*;
import javax.persistence.EntityManager;



@ManagedBean
@RequestScoped
public class AdminBean implements Serializable {
    private List<Integer> PaymentList;
    public String PaymentText;

    private List<Orders> Orders;

    public AdminBean() {
        this.PaymentList = PaymentDAO.getPaymentStatic();
        this.PaymentText= "";
        this.Orders = OrderDAO.GetAll();
        // System.out.println(this.PaymentList);
    }
    public String content() {
        return this.PaymentText;
    }

    public String getPaymentText() {
        return PaymentText;
    }

    public void deleteOrder(String id) {
        EntityManager entityManager = PersistenceUtil.getEntityManager();
        entityManager.getTransaction().begin();
        
        entityManager.createQuery("DELETE FROM OrderAndFood WHERE order_id = :orderId")
            .setParameter("orderId", id)
            .executeUpdate();

        entityManager.createQuery("DELETE FROM Orders WHERE id = :id")
            .setParameter("id", id)
            .executeUpdate();

        entityManager.getTransaction().commit();
        this.Orders = OrderDAO.GetAll();

    }

    /**
     * @param User the User to set
     */
    public void setPaymentText(String User) {
        this.PaymentText = User;
    }

    public List<Integer> getPaymentList() {
        return PaymentList;
    }

    /**
     * @param User the User to set
     */
    public void setPaymentList(List<Integer> User) {
        this.PaymentList = User;
    }



    /**
     * @return List<Orders> return the Orders
     */
    public List<Orders> getOrders() {
        return Orders;
    }

    /**
     * @param Orders the Orders to set
     */
    public void setOrders(List<Orders> Orders) {
        this.Orders = Orders;
    }

}
