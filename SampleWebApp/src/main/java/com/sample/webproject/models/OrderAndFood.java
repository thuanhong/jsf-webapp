package com.sample.webproject.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.sample.webproject.models.Orders;
import com.sample.webproject.models.Menu;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "OrderAndFood")

public class OrderAndFood{
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "amount")
	private int amount;

    @ManyToOne
    @JoinColumn(name="order_id")
	private Orders orderId;

    @ManyToOne
    @JoinColumn(name="food_id")
    private Menu foodId;

    public OrderAndFood() {
    }
    
    public OrderAndFood(int amount, Orders order, Menu food) {
        this.amount = amount;
        this.orderId = order;
        this.foodId = food;
    }


    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return int return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * @return Orders return the orderId
     */
    public Orders getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(Orders orderId) {
        this.orderId = orderId;
    }

    /**
     * @return Menu return the foodId
     */
    public Menu getFoodId() {
        return foodId;
    }

    /**
     * @param foodId the foodId to set
     */
    public void setFoodId(Menu foodId) {
        this.foodId = foodId;
    }

}