package com.zibetech.erp.userprocess.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name="USERLOGIN")
public class UserLogin {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long iduserlogin;
	
	@Column(name="USERNAME", unique=true, nullable=false)
	private String username;
	
	@Column(name="USERPASSWORD", nullable=false)
	private String userpassword;
		
	@Column(name="USERTYPE", nullable=false)
	private String usertype;

	@Column(name="STATE", nullable=false)
	private String state=State.ACTIVE.getState();

	

	public Long getIduserlogin() {
		return iduserlogin;
	}

	public void setIduserlogin(Long iduserlogin) {
		this.iduserlogin = iduserlogin;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	
	
	

}
