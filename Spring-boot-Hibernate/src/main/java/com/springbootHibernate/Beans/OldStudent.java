package com.springbootHibernate.Beans;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OLDSTUDENT")
 
public class OldStudent {
 @Id
   @Column(name = "id")
   private int id;
   
   @Column(name = "name")
    private String name;
   
   @Column(name = "email")
	private String email;
   
   @Column(name = "address")
	private String address;
   
   
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public OldStudent(int id, String name, String email, String address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
	}
	
OldStudent(){
	
}
@Override
public String toString() {
	return "OldStudent [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + "]";
}


	
	
}