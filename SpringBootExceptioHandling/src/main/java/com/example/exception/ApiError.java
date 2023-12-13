package com.example.exception;

import java.util.Date;

public class ApiError {
	private Integer errorCode;
	private String erroMsg;
	private Date date;
	private String errorDetails;

	public Integer getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getErroMsg() {
		return erroMsg;
	}

	public void setErroMsg(String erroMsg) {
		this.erroMsg = erroMsg;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	


	public String getErrorDetails() {
		return errorDetails;
	}

	public void setErrorDetails(String errorDetails) {
		this.errorDetails = errorDetails;
	}

	@Override
	public String toString() {
		return "ApiError [errorCode=" + errorCode + ", erroMsg=" + erroMsg + ", date=" + date + ", errorDetails="
				+ errorDetails + "]";
	}


}
