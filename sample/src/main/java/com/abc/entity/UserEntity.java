package com.abc.entity;

import java.io.Serializable;
import java.security.Timestamp;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_profile")
public class UserEntity implements Serializable  {
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="user_id")
	private long userId;
	@Column(name="email_id")
	private String emailId;
	@Column(name="business_name")
	private String businessName;
	@Column(name="mobile_number")
	private long mobileNumber;
	@Column(name="password")
	private long password;
	@Column(name="aadhar_card")
	private long aadharCard;
	@Column(name="registration_date")
	private String registationDate;
	@Column(name="otp")
	private long otp;
	@Column(name="otp_verification")
	private long otpVerification;
	@Column(name="flat_no")
	private String flatNo;
	@Column(name="user_profilebuidling_street_address")
	private String userProfilebuidlingStreetAddress;
	@Column(name="area")
	private String area;
	
	@Column(name="city_id")
	private long city;
	
	@Column(name="state_id")
	private long state;
	
	@Column(name="pincode")
	private long pincode;
	
	@Column(name="status")
	private String status;
	
	@Column(name="user_type")
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

	public String getRegistationDate() {
		return registationDate;
	}

	public void setRegistationDate(String registationDate) {
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

	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", emailId=" + emailId + ", businessName=" + businessName
				+ ", mobileNumber=" + mobileNumber + ", aadharCard=" + aadharCard + ", registationDate="
				+ registationDate + ", otp=" + otp + ", otpVerification=" + otpVerification + ", flatNo=" + flatNo
				+ ", userProfilebuidlingStreetAddress=" + userProfilebuidlingStreetAddress + ", area=" + area
				+ ", city=" + city + ", state=" + state + ", pincode=" + pincode + ", status=" + status + ", userType="
				+ userType + "]";
	}
	

}