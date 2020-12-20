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

import com.sample.webproject.util.HibernateUtil;
import com.sample.webproject.models.Payment;
import com.sample.webproject.DAO.PaymentDAO;


@ManagedBean
@SessionScoped
public class AdminBean implements Serializable {
    private List<Payment> PaymentList;

    public AdminBean() {
        this.PaymentList = PaymentDAO.GetAll(1);
    }

}
