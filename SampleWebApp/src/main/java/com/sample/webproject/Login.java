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

import com.sample.webproject.util.HibernateUtil;
import com.sample.webproject.util.SessionUtils;
import com.sample.webproject.DAO.LoginDAO;
import com.sample.webproject.models.Staff;


@ManagedBean
@SessionScoped
public class Login implements Serializable {
    private String Pwd;
	private String Msg;
	private String User;


    public Login() {
        this.Msg = "";
    }

    //validate login
	public String validateUsernamePassword() {
		List<Staff> list = LoginDAO.login(this.User, this.Pwd);
		if (!list.isEmpty()) {
			HttpSession session = SessionUtils.getSession();
            session.setAttribute("username", list.get(0).getStaffName());
            session.setAttribute("id", list.get(0).getId());
            return "/secure/home.xhtml?faces-redirect=true";
		} else {
			this.Msg = "Incorrect Username and Passowrd\nPlease enter correct username and Password";
			return "/login";
		}
	}

	//logout event, invalidate session
	public String logout() {
		// HttpSession session = SessionUtils.getSession();
        // session.invalidate();
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "/login";
	}

    /**
     * @return String return the Pwd
     */
    public String getPwd() {
        return Pwd;
    }

    /**
     * @param Pwd the Pwd to set
     */
    public void setPwd(String Pwd) {
        this.Pwd = Pwd;
    }

    /**
     * @return String return the Msg
     */
    public String getMsg() {
        return Msg;
    }

    /**
     * @param Msg the Msg to set
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    /**
     * @return String return the User
     */
    public String getUser() {
        return User;
    }

    /**
     * @param User the User to set
     */
    public void setUser(String User) {
        this.User = User;
    }

}
