package com.homeo.restws.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Prescription")
@XmlAccessorType(XmlAccessType.FIELD)
public class Prescription  implements Serializable {

	private static final long serialVersionUID = -7058914161363815808L;

	 @XmlElement(name="sessionid", required=true)
	 private String sessionid;
    
	 @XmlElement(name="patrefnum")
		private String patrefnum;
	 
	 @XmlElement(name="medicine")
		private String medicine;
	 
	 @XmlElement(name="potency")
		private String potency;
	 
	 @XmlElement(name="dose")
		private String dose;
	 
	 @XmlElement(name="actionfrom")
		private String actionfrom;
	 
	 @XmlElement(name="_csrf")
		private String _csrf;

	public String get_csrf() {
		return _csrf;
	}

	public void set_csrf(String _csrf) {
		this._csrf = _csrf;
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

	public String getMedicine() {
		return medicine;
	}

	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}

	public String getPotency() {
		return potency;
	}

	public void setPotency(String potency) {
		this.potency = potency;
	}

	public String getDose() {
		return dose;
	}

	public void setDose(String dose) {
		this.dose = dose;
	}

	public String getActionfrom() {
		return actionfrom;
	}

	public void setActionfrom(String actionfrom) {
		this.actionfrom = actionfrom;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Prescription [sessionid=" + sessionid + ", patrefnum=" + patrefnum + ", medicine=" + medicine
				+ ", potency=" + potency + ", dose=" + dose + ", actionfrom=" + actionfrom + ", getSessionid()="
				+ getSessionid() + ", getPatrefnum()=" + getPatrefnum() + ", getMedicine()=" + getMedicine()
				+ ", getPotency()=" + getPotency() + ", getDose()=" + getDose() + ", getActionfrom()=" + getActionfrom()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actionfrom == null) ? 0 : actionfrom.hashCode());
		result = prime * result + ((dose == null) ? 0 : dose.hashCode());
		result = prime * result + ((medicine == null) ? 0 : medicine.hashCode());
		result = prime * result + ((patrefnum == null) ? 0 : patrefnum.hashCode());
		result = prime * result + ((potency == null) ? 0 : potency.hashCode());
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
		Prescription other = (Prescription) obj;
		if (actionfrom == null) {
			if (other.actionfrom != null)
				return false;
		} else if (!actionfrom.equals(other.actionfrom))
			return false;
		if (dose == null) {
			if (other.dose != null)
				return false;
		} else if (!dose.equals(other.dose))
			return false;
		if (medicine == null) {
			if (other.medicine != null)
				return false;
		} else if (!medicine.equals(other.medicine))
			return false;
		if (patrefnum == null) {
			if (other.patrefnum != null)
				return false;
		} else if (!patrefnum.equals(other.patrefnum))
			return false;
		if (potency == null) {
			if (other.potency != null)
				return false;
		} else if (!potency.equals(other.potency))
			return false;
		if (sessionid == null) {
			if (other.sessionid != null)
				return false;
		} else if (!sessionid.equals(other.sessionid))
			return false;
		return true;
	}


		

}