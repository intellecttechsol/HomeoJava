package com.homeo.restws.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="PatPersonalDetails")
@XmlAccessorType(XmlAccessType.FIELD)
public class PatPersonalDetails  implements Serializable {


	private static final long serialVersionUID = 8860467872112783681L;

	@XmlElement(name="patid", required=true)
	private String patide;

	@XmlElement(name="name", required=true)
	private String name;

	@XmlElement(name="address", required=true) 
	private String address;

	@XmlElement(name="pincode")
	private String pincode;

	@XmlElement(name="patrefnum")
	private String patrefnum;

	@XmlElement(name="patfileno")
	private String patfileno;

	@XmlElement(name="occupation")
	private String occupation;

	@XmlElement(name="sex")
	private String sex;

	@XmlElement(name="religion")
	private String religion;

	@XmlElement(name="dob")
	private String dob;

	@XmlElement(name="dateOfExamination")
	private String dateOfExamination;

	@XmlElement(name="dateOfAdmission")
	private String dateOfAdmission;


	@XmlElement(name="createdby")
	private String createdby;

	@XmlElement(name="updatedby")
	private String updatedby;

	@XmlElement(name="_csrf")
	private String _csrf;

	public PatPersonalDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PatPersonalDetails(String name, String address, String pincode, String occupation, String sex,
			String religion, String dob, String dateOfExamination, String dateOfAdmission,String patfileno, String createdby,String _csrf) {
		super();
		this.name = name;
		this.address = address;
		this.pincode = pincode;
		this.occupation = occupation;
		this.sex = sex;
		this.religion = religion;
		this.dob = dob;
		this.dateOfExamination = dateOfExamination;
		this.dateOfAdmission = dateOfAdmission;
		this.patfileno = patfileno;
		this.createdby = createdby;
		this._csrf = _csrf;
	}

	public PatPersonalDetails(String name, String address, String pincode, String occupation, String patrefnum,String sex,
			String religion, String dob, String dateOfExamination, String dateOfAdmission,String patfileno, String updatedby,String _csrf) {
		super();
		this.name = name;
		this.address = address;
		this.pincode = pincode;
		this.occupation = occupation;
		this.patrefnum=patrefnum;
		this.sex = sex;
		this.religion = religion;
		this.dob = dob;
		this.dateOfExamination = dateOfExamination;
		this.dateOfAdmission = dateOfAdmission;
		this.patfileno = patfileno;
		this.updatedby = updatedby;
		this._csrf = _csrf;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((createdby == null) ? 0 : createdby.hashCode());
		result = prime * result + ((dateOfAdmission == null) ? 0 : dateOfAdmission.hashCode());
		result = prime * result + ((dateOfExamination == null) ? 0 : dateOfExamination.hashCode());
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((occupation == null) ? 0 : occupation.hashCode());
		result = prime * result + ((patfileno == null) ? 0 : patfileno.hashCode());
		result = prime * result + ((patide == null) ? 0 : patide.hashCode());
		result = prime * result + ((patrefnum == null) ? 0 : patrefnum.hashCode());
		result = prime * result + ((pincode == null) ? 0 : pincode.hashCode());
		result = prime * result + ((religion == null) ? 0 : religion.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		result = prime * result + ((updatedby == null) ? 0 : updatedby.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "PatPersonalDetails [patide=" + patide + ", name=" + name + ", address=" + address + ", pincode="
				+ pincode + ", patrefnum=" + patrefnum + ", patfileno=" + patfileno + ", occupation=" + occupation
				+ ", sex=" + sex + ", religion=" + religion + ", dob=" + dob + ", dateOfExamination="
				+ dateOfExamination + ", dateOfAdmission=" + dateOfAdmission + ", createdby=" + createdby
				+ ", updatedby=" + updatedby + ", _csrf=" + _csrf + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PatPersonalDetails other = (PatPersonalDetails) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (createdby == null) {
			if (other.createdby != null)
				return false;
		} else if (!createdby.equals(other.createdby))
			return false;
		if (dateOfAdmission == null) {
			if (other.dateOfAdmission != null)
				return false;
		} else if (!dateOfAdmission.equals(other.dateOfAdmission))
			return false;
		if (dateOfExamination == null) {
			if (other.dateOfExamination != null)
				return false;
		} else if (!dateOfExamination.equals(other.dateOfExamination))
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (occupation == null) {
			if (other.occupation != null)
				return false;
		} else if (!occupation.equals(other.occupation))
			return false;
		if (patfileno == null) {
			if (other.patfileno != null)
				return false;
		} else if (!patfileno.equals(other.patfileno))
			return false;
		if (patide == null) {
			if (other.patide != null)
				return false;
		} else if (!patide.equals(other.patide))
			return false;
		if (patrefnum == null) {
			if (other.patrefnum != null)
				return false;
		} else if (!patrefnum.equals(other.patrefnum))
			return false;
		if (pincode == null) {
			if (other.pincode != null)
				return false;
		} else if (!pincode.equals(other.pincode))
			return false;
		if (religion == null) {
			if (other.religion != null)
				return false;
		} else if (!religion.equals(other.religion))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		if (updatedby == null) {
			if (other.updatedby != null)
				return false;
		} else if (!updatedby.equals(other.updatedby))
			return false;
		return true;
	}

	public String getPatfileno() {
		return patfileno;
	}

	public void setPatfileno(String patfileno) {
		this.patfileno = patfileno;
	}

	public String get_csrf() {
		return _csrf;
	}

	public void set_csrf(String _csrf) {
		this._csrf = _csrf;
	}

	public String getPatide() {
		return patide;
	}

	public void setPatide(String patide) {
		this.patide = patide;
	}

	public String getDateOfExamination() {
		return dateOfExamination;
	}

	public void setDateOfExamination(String dateOfExamination) {
		this.dateOfExamination = dateOfExamination;
	}

	public String getDateOfAdmission() {
		return dateOfAdmission;
	}

	public void setDateOfAdmission(String dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
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


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getPatrefnum() {
		return patrefnum;
	}

	public void setPatrefnum(String patrefnum) {
		this.patrefnum = patrefnum;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}