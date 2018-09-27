package com.homeo.restws.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ProvisionalDiagnosis")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProvisionalDiagnosis  implements Serializable {

	private static final long serialVersionUID = -4644412441070439447L;

	@XmlElement(name="patrefnum")
	private String patrefnum;

	@XmlElement(name="provDiagDate")
	private String provDiagDate;

	@XmlElement(name="provDiagnosis")
	private String provDiagnosis;

	@XmlElement(name="remarks")
	private String remarks;

	@XmlElement(name="createdby")
	private String createdby;

	@XmlElement(name="updatedby")
	private String updatedby;

	@XmlElement(name="_csrf")
	private String _csrf;

	public ProvisionalDiagnosis() {
		super();
	}


	public String getPatrefnum() {
		return patrefnum;
	}


	public void setPatrefnum(String patrefnum) {
		this.patrefnum = patrefnum;
	}


	public String getProvDiagDate() {
		return provDiagDate;
	}


	public void setProvDiagDate(String provDiagDate) {
		this.provDiagDate = provDiagDate;
	}


	public String getProvDiagnosis() {
		return provDiagnosis;
	}


	public void setProvDiagnosis(String provDiagnosis) {
		this.provDiagnosis = provDiagnosis;
	}


	public String getRemarks() {
		return remarks;
	}


	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}


	public String getCreatedby() {
		return createdby;
	}


	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}


	public String getUpdatedby() {
		return updatedby;
	}


	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}


	public String get_csrf() {
		return _csrf;
	}


	public void set_csrf(String _csrf) {
		this._csrf = _csrf;
	}


	@Override
	public String toString() {
		return "ProvisionalDiagnosis [patrefnum=" + patrefnum + ", provDiagDate=" + provDiagDate + ", provDiagnosis="
				+ provDiagnosis + ", remarks=" + remarks + ", createdby=" + createdby + ", updatedby=" + updatedby
				+ ", _csrf=" + _csrf + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patrefnum == null) ? 0 : patrefnum.hashCode());
		result = prime * result + ((provDiagDate == null) ? 0 : provDiagDate.hashCode());
		result = prime * result + ((provDiagnosis == null) ? 0 : provDiagnosis.hashCode());
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
		ProvisionalDiagnosis other = (ProvisionalDiagnosis) obj;
		if (patrefnum == null) {
			if (other.patrefnum != null)
				return false;
		} else if (!patrefnum.equals(other.patrefnum))
			return false;
		if (provDiagDate == null) {
			if (other.provDiagDate != null)
				return false;
		} else if (!provDiagDate.equals(other.provDiagDate))
			return false;
		if (provDiagnosis == null) {
			if (other.provDiagnosis != null)
				return false;
		} else if (!provDiagnosis.equals(other.provDiagnosis))
			return false;
		return true;
	}


	public ProvisionalDiagnosis(String patrefnum, String provDiagDate, String provDiagnosis,String remarks, String createdby,
			String _csrf) {
		super();
		this.patrefnum = patrefnum;
		this.provDiagDate = provDiagDate;
		this.provDiagnosis = provDiagnosis;
		this.remarks = remarks;
		this.createdby = createdby;
		this._csrf = _csrf;
	}

	public ProvisionalDiagnosis(String patrefnum, String provDiagDate,String provDiagnosis,String remarks,
			String _csrf) {
		super();
		this.patrefnum = patrefnum;
		this.provDiagDate = provDiagDate;
		this.provDiagnosis = provDiagnosis;
		this.remarks=remarks;
		this._csrf = _csrf;
	}



}