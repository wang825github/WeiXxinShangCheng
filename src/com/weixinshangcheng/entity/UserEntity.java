package com.weixinshangcheng.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USERINFO")
public class UserEntity implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4714409877460991636L;

	private Integer id;

	private String username;

	private String password;

	private String name;
	
	private String email;
	
	private String memo;
	
	private String qq;
	
	private Boolean isadmin;
	
	private String weixin;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="NAME",nullable=false,length=255)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	@Column(name="PASSWORD",nullable=false,length=255)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name="NAME",nullable=true,length=255)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Column(name="EMAIL",nullable=true,length=255)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@Column(name="MEMO",nullable=true,length=255)
	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	@Column(name="QQ",nullable=true,length=255)
	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}
	@Column(name="ISADMIN",nullable=true,length=255)
	public Boolean getIsadmin() {
		return isadmin;
	}

	public void setIsadmin(Boolean isadmin) {
		this.isadmin = isadmin;
	}
	@Column(name="WEIXIN",nullable=true,length=255)
	public String getWeixin() {
		return weixin;
	}

	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
