package com.sample.webproject;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import javax.faces.application.FacesMessage;
import javax.faces.event.ActionEvent;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import javax.persistence.Query;
import java.io.*;
import java.util.*;

import com.sample.webproject.models.Staff;
import com.sample.webproject.models.Tables;
import com.sample.webproject.models.Orders;
import com.sample.webproject.models.OrderAndFood;

import com.sample.webproject.util.HibernateUtil;
import com.sample.webproject.util.SessionUtils;
import com.sample.webproject.util.PersistenceUtil;

import com.sample.webproject.DAO.LoginDAO;
import com.sample.webproject.DAO.TableDAO;
import com.sample.webproject.DAO.OrderDAO;
import com.sample.webproject.DAO.OrderAndFoodDAO;
import com.sample.webproject.DAO.StaffDAO;
import com.sample.webproject.DAO.MenuDAO;

import com.sample.webproject.serializers.PostOrder;

import com.google.gson.Gson; 
import com.google.gson.GsonBuilder; 

@ManagedBean
@SessionScoped
public class Home implements Serializable {
    private List<Tables> Table;
    private List<Orders> Order;
    private List<OrderAndFood> Food;
    private String PostContext;
    
    public Home() {
        this.Table = TableDAO.GetAll();
        this.PostContext = "";
        OrderDAO.GetAll();
    }

    public void listener() {
    }

    public void listener(int id) {
        this.Food = OrderAndFoodDAO.GetAll(id);
    }

    public void createOrder() {
        System.out.println(this.PostContext);
        HttpSession session = SessionUtils.getSession();

        int user = (session != null) ? (Integer)session.getAttribute("id") : -1;
        System.out.println(user);

        if (user == -1) {
            return;
        }
        GsonBuilder builder = new GsonBuilder(); 
        builder.setPrettyPrinting(); 
        
        Gson gson = builder.create(); 
        PostOrder postOrder = gson.fromJson(this.PostContext, PostOrder.class);
        postOrder.setStaffId(user);
        postOrder.setOrderId(Integer.toString(postOrder.getTableId()) + " " + Integer.toString(user));
        System.out.println(postOrder);

        if (postOrder.getListFood().isEmpty()) {
            return;
        }
        EntityManager entityManager = PersistenceUtil.getEntityManager();
        Query createNewOrder = entityManager.createNativeQuery("INSERT INTO Orders (id, total, staffId, tableId) VALUES (?, ?, ?, ?)");
        entityManager.getTransaction().begin();

        try {
            System.out.println("-----------------------------");
            System.out.println(this.Food.isEmpty());
            System.out.println("-----------------------------");
            if (this.Food.isEmpty()) {
                createNewOrder.setParameter(1, postOrder.getOrderId());
                createNewOrder.setParameter(2, 100);
                createNewOrder.setParameter(3, postOrder.getStaffId());
                createNewOrder.setParameter(4, postOrder.getTableId());
                createNewOrder.executeUpdate();
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Something was wrong");
        }

        for (Map.Entry<String,Integer> entry : postOrder.getListFood().entrySet()) {
            createNewOrder = entityManager.createNativeQuery("INSERT INTO OrderAndFood (amount, food_id, order_id) VALUES (?, ?, ?)");
            createNewOrder.setParameter(1, entry.getValue());
            createNewOrder.setParameter(2, Integer.parseInt(entry.getKey()));
            createNewOrder.setParameter(3, postOrder.getOrderId());
            createNewOrder.executeUpdate();
        }
        entityManager.getTransaction().commit();

        this.Table = TableDAO.GetAll();
    }

    public void payment() {

        System.out.println(this.PostContext);
        if (this.Food.isEmpty()) {
            return;
        } 
        HttpSession session = SessionUtils.getSession();

        int user = (session != null) ? (Integer)session.getAttribute("id") : -1;
        System.out.println(user);

        if (user == -1) {
            return;
        }
        GsonBuilder builder = new GsonBuilder(); 
        builder.setPrettyPrinting(); 
        
        Gson gson = builder.create(); 
        PostOrder postOrder = gson.fromJson(this.PostContext, PostOrder.class);
        postOrder.setStaffId(user);
        postOrder.setOrderId(Integer.toString(postOrder.getTableId()) + " " + Integer.toString(user));
        System.out.println(postOrder);

        EntityManager entityManager = PersistenceUtil.getEntityManager();
        entityManager.getTransaction().begin();
        
        entityManager.createQuery("DELETE FROM OrderAndFood WHERE order_id = :orderId")
            .setParameter("orderId", postOrder.getOrderId())
            .executeUpdate();

        entityManager.createQuery("DELETE FROM Orders WHERE id = :id")
            .setParameter("id", postOrder.getOrderId())
            .executeUpdate();

        entityManager.getTransaction().commit();

        this.Table = TableDAO.GetAll();   
    }

    /**
     * @return List<Tables> return the Table
     */
    public List<Tables> getTable() {
        return Table;
    }

    /**
     * @param Table the Table to set
     */
    public void setTable(List<Tables> Table) {
        this.Table = Table;
    }


    /**
     * @return List<Orders> return the Order
     */
    public List<Orders> getOrder() {
        return Order;
    }

    /**
     * @param Order the Order to set
     */
    public void setOrder(List<Orders> Order) {
        this.Order = Order;
    }


    /**
     * @return List<OrderAndFood> return the Food
     */
    public List<OrderAndFood> getFood() {
        return Food;
    }

    /**
     * @param Food the Food to set
     */
    public void setFood(List<OrderAndFood> Food) {
        this.Food = Food;
    }


    /**
     * @return String return the PostContext
     */
    public String getPostContext() {
        return PostContext;
    }

    /**
     * @param PostContext the PostContext to set
     */
    public void setPostContext(String PostContext) {
        this.PostContext = PostContext;
    }

}
