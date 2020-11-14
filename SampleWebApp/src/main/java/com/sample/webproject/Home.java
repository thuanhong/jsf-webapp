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


@ManagedBean
@SessionScoped
public class Home implements Serializable {
    private List<Integer> Users = new ArrayList<Integer>();
    private Integer Count;
    
    public Home() {
        this.Users.add(1); 
        this.Users.add(2); 
        this.Users.add(3); 
        this.Users.add(4); 
        this.Users.add(5);
        this.Users.add(6); 
        this.Users.add(7); 
        this.Users.add(8); 
        this.Users.add(9); 
        this.Users.add(10); 
        this.Count = 10;
    }


    /**
     * @return List<Integer> return the Users
     */
    public List<Integer> getUsers() {
        return Users;
    }

    /**
     * @param Users the Users to set
     */
    public void setUsers(List<Integer> Users) {
        this.Users = Users;
    }


    /**
     * @return Integer return the Count
     */
    public Integer getCount() {
        return Count;
    }

    /**
     * @param Count the Count to set
     */
    public void setCount(Integer Count) {
        this.Count = Count;
    }

}
