package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@Column(name="user_id", unique = true, nullable = false)
	private int id;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="user_password")
	private String userPassword;
	
	@Column(name="user_email")
	private String userEmail;
	
	@Column(name="user_status")
	private int userStatus;
	
	@Column(name="user_pw")
	private String userPw;		
	
	public User() {}
		
		public User(int id, String userName, String userPassword, String userEmail, int userStatus, String userPw) {
			super();
			this.id = id;
			this.userName = userName;
			this.userPassword = userPassword;
			this.userEmail = userEmail;
			this.userStatus = userStatus;
			this.userPw = userPw;
		}

		@Override
		public String toString() {
			return "User [id=" + id + ", userName=" + userName + ", userPassword=" + userPassword + ", userEmail="
					+ userEmail + ", userStatus=" + userStatus + ", userPw=" + userPw + "]";
		}
			 	
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getUserPassword() {
			return userPassword;
		}
		public void setUserPassword(String userPassword) {
			this.userPassword = userPassword;
		}
		public String getUserEmail() {
			return userEmail;
		}
		public void setUserEmail(String userEmail) {
			this.userEmail = userEmail;
		}
		public int getUserStatus() {
			return userStatus;
		}
		public void setUserStatus(int userStatus) {
			this.userStatus = userStatus;
		}
		public String getUserPw() {
			return userPw;
		}
		public void setUserPw(String userPw) {
			this.userPw = userPw;
		}
			
}
