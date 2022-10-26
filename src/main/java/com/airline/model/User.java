package com.airline.model;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.bind.DefaultValue;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name= "Users")
public class User {
	
	     @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	     private String fname;
	     private String lname;
	     private String email;
	     private String pass;
	     
	     private String dob;
	     private long phone;

	     
	     
		public User(Long id, String fname, String lname, String email, String pass, String dob, long phone) {
			
			this.id = id;
			this.fname = fname;
			this.lname = lname;
			this.email = email;
			this.pass = pass;
			this.dob = dob;
			this.phone = phone;
		}
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPass() {
			return pass;
		}
		public void setPass(String pass) {
			this.pass = pass;
		}
		public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
		public long getPhone() {
			return phone;
		}
		public void setPhone(long phone) {
			this.phone = phone;
		}
		@Override
		public String toString() {
			return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", pass=" + pass
					+ ", dob=" + dob + ", phone=" + phone + "]";
		}
	     
	     
	     
	     
	     

}
