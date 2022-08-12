package com.aop.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ConsultantDetails")
public class ConsultantDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	public Integer ID;
	public String consName;
	public Long consContact;
	public String speciality;

	
	
	public ConsultantDetails(Integer ID, String consName, Long consContact, String speciality) {
		super();
		this.ID = ID;
		this.consName = consName;
		this.consContact = consContact;
		this.speciality = speciality;
	}

	public ConsultantDetails() {
		// TODO Auto-generated constructor stub
	}

	public Integer getConsID() {
		return ID;
	}

	public void setConsID(Integer ID) {
		this.ID = ID;
	}

	public String getConsName() {
		return consName;
	}

	public void setConsName(String consName) {
		this.consName = consName;
	}

	public Long getConsContact() {
		return consContact;
	}

	public void setConsContact(Long consContact) {
		this.consContact = consContact;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	@Override
	public String toString() {
		return "ConsultantDetails [ID=" + ID + ", consName=" + consName + ", consContact=" + consContact
				+ ", speciality=" + speciality + "]";
	}

}
