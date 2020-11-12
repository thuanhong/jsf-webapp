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

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import com.sample.webproject.models.Orders;


@Entity
@Table(name = "Tables")
// @NamedQueries({ @NamedQuery(name = "@FIND_ALL", query = "FROM User") })
// @NamedNativeQueries({ @NamedNativeQuery(name = "@SQL_GET_ALL_ADDRESS", query = "SELECT id, name, address from user") })

public class Tables {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "capacity")
	private int capacity;

	@Column(name = "position")
	private String position;

	@Column(name = "status")
	private String status;

	@OneToMany(mappedBy = "table_id")
	private List<Orders> table = new ArrayList<Orders>();


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
     * @return int return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * @return String return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return String return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return List<Orders> return the table
     */
    public List<Orders> getTable() {
        return table;
    }

    /**
     * @param table the table to set
     */
    public void setTable(List<Orders> table) {
        this.table = table;
    }

}