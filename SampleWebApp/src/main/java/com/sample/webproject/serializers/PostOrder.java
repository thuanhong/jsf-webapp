package com.sample.webproject.serializers;

import org.hibernate.Session;
// import org.hibernate.SessionFactory;
// import org.hibernate.cfg.Configuration;

import java.util.*;
import com.sample.webproject.util.HibernateUtil;
import com.sample.webproject.models.Tables;
import com.sample.webproject.models.OrderAndFood;

public class PostOrder {
  private int tableId;
  private String orderId;
  private Map<String,Integer> listFood;
  private int staffId;


    /**
     * @return int return the tableId
     */
    public int getTableId() {
        return tableId;
    }

    /**
     * @param tableId the tableId to set
     */
    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    /**
     * @return Map<Integer,Integer> return the listFood
     */
    public Map<String,Integer> getListFood() {
        return listFood;
    }

    /**
     * @param listFood the listFood to set
     */
    public void setListFood(Map<String,Integer> listFood) {
        this.listFood = listFood;
    }

    /**
     * @return int return the staffId
     */
    public int getStaffId() {
        return staffId;
    }

    /**
     * @param staffId the staffId to set
     */
    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }


    /**
     * @return String return the orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String toString() { 
        return "PostOrder [ table: "+this.tableId+", staff: "+this.staffId+ ", order: "+ this.orderId + ", list: "+this.listFood+"  ]"; 
    }  

}