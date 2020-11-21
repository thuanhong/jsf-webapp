package com.sample.webproject;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import javax.faces.application.FacesMessage;
import javax.faces.event.ActionEvent;
import java.util.Date;
import java.io.Serializable;
import org.hibernate.Session;
import java.util.List;
import java.util.ArrayList;

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

@ManagedBean
@SessionScoped
public class Home implements Serializable {
    private List<Tables> Table;
    private List<Orders> Order;
    private List<OrderAndFood> Food;
    
    public Home() {
        this.Table = TableDAO.GetAll();
    }
    public void listener() {
    }

    public void listener(int id) {
        this.Food = OrderAndFoodDAO.GetAll(id);
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

}
