package com.mmit.entity;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import static javax.persistence.AccessType.FIELD;
import static javax.persistence.AccessType.PROPERTY;
import static javax.persistence.FetchType.EAGER;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.TemporalType.DATE;

/**
 * Entity implementation class for Entity: Student
 *
 */
@Entity
@Table(name="students")
public class Student implements Serializable {

	   
	@Id
	@Column(name = "student_id")
	private int id;
	@Column(name="student_name", length = 20)
	private String name;
	@Column(nullable = false)
	private String email;
	@Temporal(DATE)
	private Date dateOfbirth;
	@Embedded
	private Address address;
	@Transient
	private boolean is_active;
	@ElementCollection
	private List<String> phones;
	
	private static final long serialVersionUID = 1L;
	
	
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public boolean isIs_active() {
		return is_active;
	}
	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}
	public Date getDateOfbirth() {
		return dateOfbirth;
	}
	public void setDateOfbirth(Date dateOfbirth) {
		this.dateOfbirth = dateOfbirth;
	}

	

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Student() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
   
}
