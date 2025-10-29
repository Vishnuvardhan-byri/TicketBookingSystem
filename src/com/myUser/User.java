package com.myUser;

import java.io.Serializable;

import com.myTicket.Ticket;

public class User implements Serializable
{
	private final int userID;
	private String userName;
	private String emailId;
	private long mobileNo;
	private char gender;
	
	private Ticket t;

	public User(int userID, String userName, String emailId, char gender, long mobileNo) {
		
		this.userID = userID;
		this.userName = userName;
		this.emailId = emailId;
		this.gender = gender;
		this.mobileNo = mobileNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMailID() {
		return emailId;
	}

	public void setMailID(String emailId ) {
		this.emailId = emailId;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public int getUserId()
	{
		return userID;
	}
	public void displayUserDetails()
	{
		System.out.println("User Id is "+userID);
		System.out.println("Username is "+userName);
		System.out.println("User Age is "+emailId);
		System.out.println("User Gender is "+gender);
		System.out.println("User Mobile Number is "+mobileNo);
		System.out.println("--------------------------------------------------------");	
	}

	@Override
	public String toString() {
		return "User userID=" + userID + "\n userName=" + userName + "\n EmailID=" + emailId + "\n gender=" + gender
				+ "\n mobileNo=" + mobileNo + "\n-------------------------------------------------------------";
	}
	
	

	
	
	
}
