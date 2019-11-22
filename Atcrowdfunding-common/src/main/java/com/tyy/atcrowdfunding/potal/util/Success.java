package com.tyy.atcrowdfunding.potal.util;

public class Success {
	
	private boolean isSuccess;
	public void setIsSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	
	public boolean getIsSuccess() {
		return isSuccess;
	}
	private String message;


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public static Success innit(boolean flag){
		Success success = new Success();
		success.setIsSuccess(flag);
		return success;
	}
	
	public  Success addMessage(String message){
		this.setMessage(message);
		return this;
	}

}
