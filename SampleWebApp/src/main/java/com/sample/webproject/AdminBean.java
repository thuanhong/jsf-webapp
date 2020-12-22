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

import com.sample.webproject.util.HibernateUtil;
import com.sample.webproject.models.Payment;
import com.sample.webproject.DAO.PaymentDAO;


@ManagedBean
@SessionScoped
public class AdminBean implements Serializable {
    private List<Integer> PaymentList;
    public String PaymentText;

    public AdminBean() {
        this.PaymentList = PaymentDAO.GetAll();
        this.PaymentText= "TAI";

        // System.out.println(this.PaymentList);
    }
    public String content() {
        return this.PaymentText;
    }

    public String getPaymentText() {
        return PaymentText;
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


}
