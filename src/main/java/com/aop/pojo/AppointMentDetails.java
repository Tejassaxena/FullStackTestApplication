package com.aop.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "AppointMentDetails")
public class AppointMentDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int appID;
	private int consID;
	private String slots;
	private String session;
	private String status;
	@OneToOne
	@MapsId
	private ConsultantDetails consDetails;

	
	
	public AppointMentDetails() {
		// TODO Auto-generated constructor stub
	};
	
	public AppointMentDetails(int appID, int consID, String slots, String session, String status,
			ConsultantDetails consDetails) {
		super();
		this.appID = appID;
		this.consID = consID;
		this.slots = slots;
		this.session = session;
		this.status = status;
		this.consDetails = consDetails;
	}
	

	public int getAppID() {
		return appID;
	}

	public void setAppID(int appID) {
		this.appID = appID;
	}

	public int getConsID() {
		return consID;
	}

	public void setConsID(int consID) {
		this.consID = consID;
	}

	public String getSlots() {
		return slots;
	}

	public void setSlots(String slots) {
		this.slots = slots;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
//
//	public ConsultantDetails getConsDetails() {
//		return consDetails;
//	}
//
//	public void setConsDetails(ConsultantDetails consDetails) {
//		this.consDetails = consDetails;
//	}
//
	@Override
	public String toString() {
		return "AppointMentDetails [appID=" + appID + ", consID=" + consID + ", slots=" + slots + ", session=" + session
				+ ", status=" + status + ", consDetails=" + consDetails + "]";
	}


}