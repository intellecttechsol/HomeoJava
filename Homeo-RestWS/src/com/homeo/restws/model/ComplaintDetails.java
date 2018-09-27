package com.homeo.restws.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ComplaintDetails")
@XmlAccessorType(XmlAccessType.FIELD)
public class ComplaintDetails  implements Serializable {

	private static final long serialVersionUID = -7058914161363815808L;

	 @XmlElement(name="sessionid", required=true)
	 private String sessionid;
    
	 
	 @XmlElement(name="patrefnum")
		private String patrefnum;
	 
	 @XmlElement(name="complaintdate")
		private String complaintdate;
	 
	 @XmlElement(name="overallstatus")
		private String overallstatus;
	 
	 

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((complaintdate == null) ? 0 : complaintdate.hashCode());
		result = prime * result + ((overallstatus == null) ? 0 : overallstatus.hashCode());
		result = prime * result + ((patrefnum == null) ? 0 : patrefnum.hashCode());
		result = prime * result + ((sessionid == null) ? 0 : sessionid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ComplaintDetails other = (ComplaintDetails) obj;
		if (complaintdate == null) {
			if (other.complaintdate != null)
				return false;
		} else if (!complaintdate.equals(other.complaintdate))
			return false;
		if (overallstatus == null) {
			if (other.overallstatus != null)
				return false;
		} else if (!overallstatus.equals(other.overallstatus))
			return false;
		if (patrefnum == null) {
			if (other.patrefnum != null)
				return false;
		} else if (!patrefnum.equals(other.patrefnum))
			return false;
		if (sessionid == null) {
			if (other.sessionid != null)
				return false;
		} else if (!sessionid.equals(other.sessionid))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ComplaintDetails [sessionid=" + sessionid + ", patrefnum=" + patrefnum + ", complaintdate="
				+ complaintdate + ", overallstatus=" + overallstatus + ", getSessionid()=" + getSessionid()
				+ ", getPatrefnum()=" + getPatrefnum() + ", getComplaintdate()=" + getComplaintdate()
				+ ", getOverallstatus()=" + getOverallstatus() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public String getSessionid() {
		return sessionid;
	}

	public void setSessionid(String sessionid) {
		this.sessionid = sessionid;
	}

	public String getPatrefnum() {
		return patrefnum;
	}

	public void setPatrefnum(String patrefnum) {
		this.patrefnum = patrefnum;
	}

	public String getComplaintdate() {
		return complaintdate;
	}

	public void setComplaintdate(String complaintdate) {
		this.complaintdate = complaintdate;
	}

	public String getOverallstatus() {
		return overallstatus;
	}

	public void setOverallstatus(String overallstatus) {
		this.overallstatus = overallstatus;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	// default constructor 
	public ComplaintDetails() {
		super();
	}

		

}