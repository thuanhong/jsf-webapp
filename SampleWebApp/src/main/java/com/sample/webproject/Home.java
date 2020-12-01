package com.sample.webproject;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import javax.faces.application.FacesMessage;
import javax.faces.event.ActionEvent;
import org.hibernate.Session;
import java.io.*;
import java.util.*;

import com.sample.webproject.models.Staff;
import com.sample.webproject.models.Tables;
import com.sample.webproject.models.Orders;
import com.sample.webproject.models.OrderAndFood;

import com.sample.webproject.util.HibernateUtil;
import com.sample.webproject.util.SessionUtils;

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
    private String Test;
    
    public Home() {
        this.Table = TableDAO.GetAll();
        this.Test = "";
    }

    public void listener() {
    }

    public void listener(int id) {
        this.Food = OrderAndFoodDAO.GetAll(id);
    }

    public void print() {
        System.out.println(this.Test);
        HttpSession session = SessionUtils.getSession();

        int user = (session != null) ? (Integer)session.getAttribute("id") : -1;
        System.out.println(user);

        if (user == -1) {
            return;
        }
        GsonBuilder builder = new GsonBuilder(); 
        builder.setPrettyPrinting(); 
        
        Gson gson = builder.create(); 
        PostOrder postOrder = gson.fromJson(this.Test, PostOrder.class);
        postOrder.setStaffId(user);
        postOrder.setOrderId(Integer.toString(postOrder.getTableId()) + " " + Integer.toString(user));
        System.out.println(postOrder);

        // Orders newOrder = new Orders(postOrder.getOrderId(), TableDAO.getTableById(postOrder.getTableId()), 0, StaffDAO.getStaffById(user));
        // List<OrderAndFood> tempList = new ArrayList<OrderAndFood>();
        
        // for (Map.Entry<String,Integer> entry : postOrder.getListFood().entrySet()) {
        //     System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        //     tempList.add(new OrderAndFood(entry.getValue(), newOrder, MenuDAO.getMenuById(Integer.parseInt(entry.getKey()))));
        // }
        
        // newOrder.setOrder(tempList);
        // OrderDAO.createNewOrder(newOrder);

        // for (int counter = 0; counter < tempList.size(); counter++) {
        //     OrderAndFoodDAO.createNewOrderAndFood(tempList.get(counter));
        // }
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
     * @return String return the Test
     */
    public String getTest() {
        return Test;
    }

    /**
     * @param Test the Test to set
     */
    public void setTest(String Test) {
        this.Test = Test;
    }

}
