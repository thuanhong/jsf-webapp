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

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import com.sample.webproject.models.Staff;

@Entity
@Table(name = "Role")

public class Role{
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "role_name")
	private String roleName;

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
    public String getRoleName() {
        return roleName;
    }

    /**
     * @param staffName the staffName to set
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    public Role(){

    }

    public Role(int id, String roleName){
        this.id = id;
        this.roleName = roleName;
    }

    @OneToMany(mappedBy = "roleId")
    private List<Staff> staff = new ArrayList<Staff>();


}