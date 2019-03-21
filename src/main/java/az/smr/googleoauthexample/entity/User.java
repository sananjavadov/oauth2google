package az.smr.googleoauthexample.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

	@Id
	@Column(name="user_mail")
	private String mail;
	
	@Column(name="user_name")
	private String name;
	
	@Column(name="user_surname")
	private String surname;
	
	@Column(name="profile_picture")
	private String picture;
	

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public User() {
		
	}

	public User(String mail, String name, String surname,String picture) {
		this.mail = mail;
		this.name = name;
		this.surname = surname;
		this.picture=picture;
	}
	

}
