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
import com.sample.webproject.util.SessionUtils;
import com.sample.webproject.DAO.LoginDAO;
import com.sample.webproject.models.Staff;
import com.sample.webproject.models.Tables;
import com.sample.webproject.DAO.TableDAO;

@ManagedBean
@SessionScoped
public class Home implements Serializable {
    private List<Tables> Table;
    
    public Home() {
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

}
