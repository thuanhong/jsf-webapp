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
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import com.sample.webproject.models.Orders;

@Entity
@Table(name = "Staff")

public class Staff{
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "staff_name")
	private String staffName;

	@Column(name = "dob")
	private Date dob;

	@Column(name = "address")
	private String address;

    @Column(name = "create_at")
    @CreationTimestamp
	private Date createdAt;

	@Column(name = "password")
	private String password;

	@OneToMany(mappedBy = "staff")
    private List<Orders> order = new ArrayList<Orders>();

    // @ManyToOne
    // @JoinColumn(name="role_name")
	// private Role role;

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
     * @return String return the staffName
     */
    public String getStaffName() {
        return staffName;
    }

    /**
     * @param staffName the staffName to set
     */
    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    /**
     * @return Date return the dob
     */
    public Date getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(Date dob) {
        this.dob = dob;
    }

    /**
     * @return String return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return Date return the createdAt
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt the createdAt to set
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return String return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return List<Orders> return the order
     */
    public List<Orders> getOrder() {
        return order;
    }

    /**
     * @param order the order to set
     */
    public void setOrder(List<Orders> order) {
        this.order = order;
    }
}