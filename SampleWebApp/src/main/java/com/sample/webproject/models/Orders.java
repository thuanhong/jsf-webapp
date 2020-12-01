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

import com.sample.webproject.models.Staff;
import com.sample.webproject.models.OrderAndFood;
import com.sample.webproject.models.Tables;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "Orders")

public class Orders {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
    @ManyToOne
    @JoinColumn(name="tableId")
	private Tables table_id;

	@Column(name = "total")
	private int total;

	@Column(name = "createAt")
	private Date createAt;

    @ManyToOne
    @JoinColumn(name="staffId")
	private Staff staff;
	
	@OneToMany(mappedBy = "orderId")
    private List<OrderAndFood> order = new ArrayList<OrderAndFood>();

    public Orders() {
 
    }
    
    public Orders(String id, Tables table_id, int total, Staff staff) {
        this.id = id;
        this.table_id = table_id;
        this.total = total;
        this.staff = staff;
    }

    /**
     * @return String return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return Tables return the table_id
     */
    public Tables getTable_id() {
        return table_id;
    }

    /**
     * @param table_id the table_id to set
     */
    public void setTable_id(Tables table_id) {
        this.table_id = table_id;
    }

    /**
     * @return int return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * @return Date return the createAt
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * @param createAt the createAt to set
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * @return Staff return the staff
     */
    public Staff getStaff() {
        return staff;
    }

    /**
     * @param staff the staff to set
     */
    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    /**
     * @return List<OrderAndFood> return the order
     */
    public List<OrderAndFood> getOrder() {
        return order;
    }

    /**
     * @param order the order to set
     */
    public void setOrder(List<OrderAndFood> order) {
        this.order = order;
    }

}