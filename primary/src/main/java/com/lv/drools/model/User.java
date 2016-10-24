package com.lv.drools.model;

import java.util.Date;

public class User {
	private String authUuid;

	private String authUid;

	private String password;


	private String idCardNo;


	private String accessToken;

	private Date accessTokenExpireTime;

	private Boolean isNew = Boolean.TRUE;

	private Boolean accountNonLocked = Boolean.TRUE;

	public String getAuthUuid() {
		return authUuid;
	}

	public void setAuthUuid(String authUuid) {
		this.authUuid = authUuid;
	}

	public String getAuthUid() {
		return authUid;
	}

	public void setAuthUid(String authUid) {
		this.authUid = authUid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIdCardNo() {
		return idCardNo;
	}

	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public Date getAccessTokenExpireTime() {
		return accessTokenExpireTime;
	}

	public void setAccessTokenExpireTime(Date accessTokenExpireTime) {
		this.accessTokenExpireTime = accessTokenExpireTime;
	}

	public Boolean getIsNew() {
		return isNew;
	}

	public void setIsNew(Boolean isNew) {
		this.isNew = isNew;
	}

	public Boolean getAccountNonLocked() {
		return accountNonLocked;
	}

	public void setAccountNonLocked(Boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}
}
