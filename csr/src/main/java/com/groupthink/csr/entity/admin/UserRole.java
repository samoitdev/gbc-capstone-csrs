package com.groupthink.csr.entity.admin;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="authorities")
public class UserRole {

	/*
 	@Id 
	@Column(name="username")
	private String username;
	*/
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="authority") 
	private String authority;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="username", referencedColumnName="username")
	private User user;
	
	public UserRole() { }

	/*
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	*/

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
