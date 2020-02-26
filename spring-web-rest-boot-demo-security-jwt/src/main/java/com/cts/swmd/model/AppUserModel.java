package com.cts.swmd.model;

import java.io.Serializable;

public class AppUserModel implements Serializable {
	private static final long serialVersionUID = 5924367487246876233L;
	private String username;
	private String password;
	
	public AppUserModel() {
	}
	
	public AppUserModel(String username, String password) {
		super();
		this.username = username;
		this.password = password;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
