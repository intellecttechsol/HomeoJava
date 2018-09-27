package com.homeo.restws.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ComplaintFollowupDetails")
@XmlAccessorType(XmlAccessType.FIELD)
public class ComplaintFollowupDetails  implements Serializable {

	private static final long serialVersionUID = -7058914161363815808L;

	 @XmlElement(name="sessionid", required=true)
	 private String sessionid;
    
	 
	 @XmlElement(name="patrefnum")
		private String patrefnum;
	 
	 @XmlElement(name="currentstatus")
		private String currentstatus;
	 
	 @XmlElement(name="visitdate")
		private String visitdate;
	 
	 @XmlElement(name="treatment")
		private String treatment;
	 
	 @XmlElement(name="remarks")
		private String remarks;
	 
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	// default constructor 
	public ComplaintFollowupDetails() {
		super();
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

	public String getCurrentstatus() {
		return currentstatus;
	}

	public void setCurrentstatus(String currentstatus) {
		this.currentstatus = currentstatus;
	}

	public String getVisitdate() {
		return visitdate;
	}

	public void setVisitdate(String visitdate) {
		this.visitdate = visitdate;
	}

	public String getTreatment() {
		return treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "ComplaintFollowupDetails [sessionid=" + sessionid + ", patrefnum=" + patrefnum + ", currentstatus="
				+ currentstatus + ", visitdate=" + visitdate + ", treatment=" + treatment + ", remarks=" + remarks
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((currentstatus == null) ? 0 : currentstatus.hashCode());
		result = prime * result + ((patrefnum == null) ? 0 : patrefnum.hashCode());
		result = prime * result + ((remarks == null) ? 0 : remarks.hashCode());
		result = prime * result + ((sessionid == null) ? 0 : sessionid.hashCode());
		result = prime * result + ((treatment == null) ? 0 : treatment.hashCode());
		result = prime * result + ((visitdate == null) ? 0 : visitdate.hashCode());
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
		ComplaintFollowupDetails other = (ComplaintFollowupDetails) obj;
		if (currentstatus == null) {
			if (other.currentstatus != null)
				return false;
		} else if (!currentstatus.equals(other.currentstatus))
			return false;
		if (patrefnum == null) {
			if (other.patrefnum != null)
				return false;
		} else if (!patrefnum.equals(other.patrefnum))
			return false;
		if (remarks == null) {
			if (other.remarks != null)
				return false;
		} else if (!remarks.equals(other.remarks))
			return false;
		if (sessionid == null) {
			if (other.sessionid != null)
				return false;
		} else if (!sessionid.equals(other.sessionid))
			return false;
		if (treatment == null) {
			if (other.treatment != null)
				return false;
		} else if (!treatment.equals(other.treatment))
			return false;
		if (visitdate == null) {
			if (other.visitdate != null)
				return false;
		} else if (!visitdate.equals(other.visitdate))
			return false;
		return true;
	}

	
}