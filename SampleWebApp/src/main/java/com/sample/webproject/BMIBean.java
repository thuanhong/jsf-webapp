package com.sample.webproject;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
 
import java.util.Date;
 
import org.hibernate.Session;
import com.sample.webproject.HibernateUtil;
import com.sample.webproject.Customer;


@ManagedBean
@RequestScoped
public class BMIBean {
    private double ChieuCao;
    private double CanNang;
    private String ChiSo;

    public double getChieuCao() {
        return this.ChieuCao;
    }

    public double getCanNang() {
        return this.CanNang;
    }

    public String getChiSo() {
        return this.ChiSo;
    }

    public void setChieuCao(double ChieuCao) {
        this.ChieuCao = ChieuCao;
    }

    public void setCanNang(double cannang) {
        this.CanNang = cannang;
    }

    public void setChiSo(String chiso) {
        this.ChiSo = chiso;
    }

    public String getResponse(){
        String kq ="";
        if (FacesContext.getCurrentInstance().isPostback()){
            double bmi = CanNang/ Math.pow(ChieuCao,2);
            if(bmi<18){
                kq="Gay";
            }else{
                kq ="Map";
            }
        }
        this.ChiSo = kq;
        return kq;
    }


    public BMIBean() {
        this.ChieuCao = 10;
        this.ChiSo = "";
        Session session = HibernateUtil.getSessionFactory().openSession();
 
        session.beginTransaction();
        session.save(new Customer("Kai", "Viet Nam"));
        session.getTransaction().commit();
        

        session.flush();
        session.close();
    }
}
