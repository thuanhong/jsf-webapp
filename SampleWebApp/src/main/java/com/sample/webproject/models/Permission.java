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

@Entity
@Table(name = "permission")
@NamedQueries({ @NamedQuery(name = "@FIND_ALL", query = "FROM Permission") })
@NamedNativeQueries({ @NamedNativeQuery(name = "@SQL_GET_ALL_ADDRESS", query = "SELECT id, name, address from permission") })

public class Permission {
	@Id
	@Column(name = "permission_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "permission_role_id")
	private String permissionRoleId;

	@Column(name = "permission_title")
    private String permissionTitle;

	@Column(name = "permission_module")
    private String permissionModule;

	@Column(name = "permission_description")
	private String permissionDescription;
	
	public Permission() {
	}

	public Permission(String role_id, String title, String module, String description) {
        this.permissionRoleId = role_id;
        this.permissionTitle = title;
        this.permissionModule = module;
        this.permissionDescription = description;
	}

	// @Override
	// public String toString() {
	// 	return "Permission [id=" + id + ", role_id=" + permissionRoleId + ", title=" + permissionTitle + ", module=" + permissionModule + ", description=" + permissionDescription "]";
    // }

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
     * @return String return the permissionRoleId
     */
    public String getPermissionRoleId() {
        return permissionRoleId;
    }

    /**
     * @param permissionRoleId the permissionRoleId to set
     */
    public void setPermissionRoleId(String permissionRoleId) {
        this.permissionRoleId = permissionRoleId;
    }

    /**
     * @return String return the permissionTitle
     */
    public String getPermissionTitle() {
        return permissionTitle;
    }

    /**
     * @param permissionTitle the permissionTitle to set
     */
    public void setPermissionTitle(String permissionTitle) {
        this.permissionTitle = permissionTitle;
    }

    /**
     * @return String return the permissionModule
     */
    public String getPermissionModule() {
        return permissionModule;
    }

    /**
     * @param permissionModule the permissionModule to set
     */
    public void setPermissionModule(String permissionModule) {
        this.permissionModule = permissionModule;
    }

    /**
     * @return String return the permissionDescription
     */
    public String getPermissionDescription() {
        return permissionDescription;
    }

    /**
     * @param permissionDescription the permissionDescription to set
     */
    public void setPermissionDescription(String permissionDescription) {
        this.permissionDescription = permissionDescription;
    }

}