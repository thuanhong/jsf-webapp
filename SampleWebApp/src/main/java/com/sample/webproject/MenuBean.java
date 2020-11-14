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
import com.sample.webproject.models.Menu;
import com.sample.webproject.DAO.MenuDAO;


@ManagedBean
@SessionScoped
public class MenuBean implements Serializable {
    private List<Menu> FoodAndDrink;
    
    public MenuBean() {
        this.FoodAndDrink = MenuDAO.GetAll();
    }

    /**
     * @return List<Menu> return the FoodAndDrink
     */
    public List<Menu> getFoodAndDrink() {
        return FoodAndDrink;
    }

    /**
     * @param FoodAndDrink the FoodAndDrink to set
     */
    public void setFoodAndDrink(List<Menu> FoodAndDrink) {
        this.FoodAndDrink = FoodAndDrink;
    }

}
