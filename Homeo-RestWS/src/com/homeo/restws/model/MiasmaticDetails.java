package com.homeo.restws.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="MiasmaticDetails")
@XmlAccessorType(XmlAccessType.FIELD)
public class MiasmaticDetails  implements Serializable {


	private static final long serialVersionUID = 8221785440713485540L;

	@XmlElement(name="patrefnum")
	private String patrefnum;

	@XmlElement(name="dateofMiasmatic")
	private String dateofMiasmatic;

	@XmlElement(name="miasmatic")
	private String miasmatic;
	
	@XmlElement(name="createdby")
	private String createdby;

	@XmlElement(name="updatedby")
	private String updatedby;
	
	@XmlElement(name="_csrf")
	private String _csrf;

	public MiasmaticDetails() {
		super();
	}

	public String getPatrefnum() {
		return patrefnum;
	}

	public void setPatrefnum(String patrefnum) {
		this.patrefnum = patrefnum;
	}

	public String getDateofMiasmatic() {
		return dateofMiasmatic;
	}

	public void setDateofMiasmatic(String dateofMiasmatic) {
		this.dateofMiasmatic = dateofMiasmatic;
	}

	public String getMiasmatic() {
		return miasmatic;
	}

	public void setMiasmatic(String miasmatic) {
		this.miasmatic = miasmatic;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateofMiasmatic == null) ? 0 : dateofMiasmatic.hashCode());
		result = prime * result + ((miasmatic == null) ? 0 : miasmatic.hashCode());
		result = prime * result + ((patrefnum == null) ? 0 : patrefnum.hashCode());
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
		MiasmaticDetails other = (MiasmaticDetails) obj;
		if (dateofMiasmatic == null) {
			if (other.dateofMiasmatic != null)
				return false;
		} else if (!dateofMiasmatic.equals(other.dateofMiasmatic))
			return false;
		if (miasmatic == null) {
			if (other.miasmatic != null)
				return false;
		} else if (!miasmatic.equals(other.miasmatic))
			return false;
		if (patrefnum == null) {
			if (other.patrefnum != null)
				return false;
		} else if (!patrefnum.equals(other.patrefnum))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MiasmaticDetails [patrefnum=" + patrefnum + ", dateofMiasmatic=" + dateofMiasmatic + ", miasmatic="
				+ miasmatic + ", createdby=" + createdby + ", updatedby=" + updatedby + ", _csrf=" + _csrf + "]";
	}

	public MiasmaticDetails(String patrefnum, String dateofMiasmatic, String miasmatic, String createdby,
			String _csrf) {
		super();
		this.patrefnum = patrefnum;
		this.dateofMiasmatic = dateofMiasmatic;
		this.miasmatic = miasmatic;
		this.createdby = createdby;
		this._csrf = _csrf;
	}
	
	public MiasmaticDetails(String patrefnum, String dateofMiasmatic,
			String _csrf) {
		super();
		this.patrefnum = patrefnum;
		this.dateofMiasmatic = dateofMiasmatic;
		this._csrf = _csrf;
	}
	
	
	
}