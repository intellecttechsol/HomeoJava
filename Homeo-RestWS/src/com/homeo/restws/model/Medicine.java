package com.homeo.restws.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Medicine")
@XmlAccessorType(XmlAccessType.FIELD)
public class Medicine  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5856575619474955296L;


	@XmlElement(name="medid", required=true)
	private String medid;

	@XmlElement(name="medcode", required=true) 
	private String medcode;

	@XmlElement(name="medname", required=true)
	private String medname;

	@XmlElement(name="meddescription")
	private String meddescription;

	@XmlElement(name="medcompname")
	private String medcompname;	
	
	@XmlElement(name="_csrf")
	private String _csrf;

	// default constructor 
	public Medicine() {
		super();
	}

	public Medicine(String medicine_code, String medicine_name, String medicine_desc, String medicine_comp_name,
			String _csrf) {
		super();
		this.medcode = medicine_code;
		this.medname = medicine_name;
		this.meddescription = medicine_desc;
		this.medcompname = medicine_comp_name;
		this._csrf = _csrf;
	}

	public Medicine(String medicine_name, String medicine_desc, String medicine_comp_name, String _csrf) {
		super();
		this.medname = medicine_name;
		this.meddescription = medicine_desc;
		this.medcompname = medicine_comp_name;
		this._csrf = _csrf;
	}

	
	public String getMedid() {
		return medid;
	}

	public void setMedid(String medid) {
		this.medid = medid;
	}

	public String getMedcode() {
		return medcode;
	}

	public void setMedcode(String medcode) {
		this.medcode = medcode;
	}

	public String getMedname() {
		return medname;
	}

	public void setMedname(String medname) {
		this.medname = medname;
	}

	public String getMeddescription() {
		return meddescription;
	}

	public void setMeddescription(String meddescription) {
		this.meddescription = meddescription;
	}

	public String getMedcompname() {
		return medcompname;
	}

	public void setMedcompname(String medcompname) {
		this.medcompname = medcompname;
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
		result = prime * result + ((medcode == null) ? 0 : medcode.hashCode());
		result = prime * result + ((medcompname == null) ? 0 : medcompname.hashCode());
		result = prime * result + ((meddescription == null) ? 0 : meddescription.hashCode());
		result = prime * result + ((medid == null) ? 0 : medid.hashCode());
		result = prime * result + ((medname == null) ? 0 : medname.hashCode());
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
		Medicine other = (Medicine) obj;
		if (medcode == null) {
			if (other.medcode != null)
				return false;
		} else if (!medcode.equals(other.medcode))
			return false;
		if (medcompname == null) {
			if (other.medcompname != null)
				return false;
		} else if (!medcompname.equals(other.medcompname))
			return false;
		if (meddescription == null) {
			if (other.meddescription != null)
				return false;
		} else if (!meddescription.equals(other.meddescription))
			return false;
		if (medid == null) {
			if (other.medid != null)
				return false;
		} else if (!medid.equals(other.medid))
			return false;
		if (medname == null) {
			if (other.medname != null)
				return false;
		} else if (!medname.equals(other.medname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Medicine [medid=" + medid + ", medcode=" + medcode + ", medname=" + medname + ", meddescription="
				+ meddescription + ", medcompname=" + medcompname + ", _csrf=" + _csrf + "]";
	}

	
}
