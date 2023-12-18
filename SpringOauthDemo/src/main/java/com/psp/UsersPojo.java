package com.psp;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

public class UsersPojo {
	private String username;
	private String password;
	private Collection<GrantedAuthority> listOfgrantedAuthorities = new ArrayList<>();

	public UsersPojo(String username, String password, Collection<GrantedAuthority> listOfgrantedAuthorities) {
		super();
		this.username = username;
		this.password = password;
		this.listOfgrantedAuthorities = listOfgrantedAuthorities;
	}

	public UsersPojo() {
	
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Collection<GrantedAuthority> getListOfgrantedAuthorities() {
		return listOfgrantedAuthorities;
	}

	public void setListOfgrantedAuthorities(Collection<GrantedAuthority> listOfgrantedAuthorities) {
		this.listOfgrantedAuthorities = listOfgrantedAuthorities;
	}

	@Override
	public String toString() {
		return "UserPojo [username=" + username + ", password=" + password + ", listOfgrantedAuthorities="
				+ listOfgrantedAuthorities + "]";
	}

}
