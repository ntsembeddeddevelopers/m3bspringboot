package com.abc.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class User {

	
	private long userId;
	
	private String emailId;
	
	private String businessName;
	
	private long mobileNumber;

	private long aadharCard;
	
	private Date registationDate;
	
	private long otp;
	
	private long otpVerification;
	
	private String flatNo;

	private String userProfilebuidlingStreetAddress;
	
	private String area;

	private long city;

	private long state;

	private long pincode;

	private String status;

	private long userType;


	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public long getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(long aadharCard) {
		this.aadharCard = aadharCard;
	}

	public Date getRegistationDate() {
		return registationDate;
	}

	public void setRegistationDate(Date registationDate) {
		this.registationDate = registationDate;
	}

	public long getOtp() {
		return otp;
	}

	public void setOtp(long otp) {
		this.otp = otp;
	}

	public long getOtpVerification() {
		return otpVerification;
	}

	public void setOtpVerification(long otpVerification) {
		this.otpVerification = otpVerification;
	}

	public String getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}

	public String getUserProfilebuidlingStreetAddress() {
		return userProfilebuidlingStreetAddress;
	}

	public void setUserProfilebuidlingStreetAddress(String userProfilebuidlingStreetAddress) {
		this.userProfilebuidlingStreetAddress = userProfilebuidlingStreetAddress;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public long getCity() {
		return city;
	}

	public void setCity(long city) {
		this.city = city;
	}

	public long getState() {
		return state;
	}

	public void setState(long state) {
		this.state = state;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getUserType() {
		return userType;
	}

	public void setUserType(long userType) {
		this.userType = userType;
	}

	
}