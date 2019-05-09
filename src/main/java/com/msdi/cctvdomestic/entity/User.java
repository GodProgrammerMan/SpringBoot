package com.msdi.cctvdomestic.entity;

public class User {
	private Integer id;
	private String userName;
	private String passWord;

	@Override
	public String toString() {
		return "User [id=" + id + ", age=" + userName + ", name=" + passWord + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
}
