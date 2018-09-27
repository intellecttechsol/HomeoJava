package com.homeo.restws.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Disease")
@XmlAccessorType(XmlAccessType.FIELD)
public class Disease  implements Serializable {

	private static final long serialVersionUID = -8895876041988628312L;

	@XmlElement(name="diseasename", required=true)
	private String diseasename="";

	@XmlElement(name="diseasedescription")
	private String diseasedescription;

	@XmlElement(name="diseasegender")
	private String diseasegender="";	

	@XmlElement(name="_csrf")
	private String _csrf;

	// default constructor 
	public Disease() {
		super();
	}

	public Disease(String diseasename, String diseasedescription, String diseasegender,
			String _csrf) {
		super();
		this.diseasename = diseasename;
		this.diseasedescription = diseasedescription;
		this.diseasegender = diseasegender;
		this._csrf = _csrf;
	}

	public Disease(String diseasename, String diseasedescription, String diseasegender) {
		super();
		this.diseasename = diseasename;
		this.diseasedescription = diseasedescription;
		this.diseasegender = diseasegender;
	}

	public String getDiseasename() {
		return diseasename;
	}

	public void setDiseasename(String diseasename) {
		this.diseasename = diseasename;
	}

	public String getDiseasedescription() {
		return diseasedescription;
	}

	public void setDiseasedescription(String diseasedescription) {
		this.diseasedescription = diseasedescription;
	}

	public String getDiseasegender() {
		return diseasegender;
	}

	public void setDiseasegender(String diseasegender) {
		this.diseasegender = diseasegender;
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
		result = prime * result + ((diseasedescription == null) ? 0 : diseasedescription.hashCode());
		result = prime * result + ((diseasegender == null) ? 0 : diseasegender.hashCode());
		result = prime * result + ((diseasename == null) ? 0 : diseasename.hashCode());
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
		Disease other = (Disease) obj;
		if (diseasedescription == null) {
			if (other.diseasedescription != null)
				return false;
		} else if (!diseasedescription.equals(other.diseasedescription))
			return false;
		if (diseasegender == null) {
			if (other.diseasegender != null)
				return false;
		} else if (!diseasegender.equals(other.diseasegender))
			return false;
		if (diseasename == null) {
			if (other.diseasename != null)
				return false;
		} else if (!diseasename.equals(other.diseasename))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Disease [diseasename=" + diseasename + ", diseasedescription=" + diseasedescription + ", diseasegender="
				+ diseasegender + ", _csrf=" + _csrf + "]";
	}


}
