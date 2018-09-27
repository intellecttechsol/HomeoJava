package com.homeo.restws.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="PatParticular")
@XmlAccessorType(XmlAccessType.FIELD)
public class PatParticular  implements Serializable {

	@Override
	public String toString() {
		return "PatParticular [bodyPart=" + bodyPart + ", illnessDesc=" + illnessDesc + "]";
	}

	private static final long serialVersionUID = -4644412441070439447L;

	@XmlElement(name="bodyPart")
	private String bodyPart;

	@XmlElement(name="illnessDesc")
	private String illnessDesc;

	@XmlElement(name="_csrf")
	private String _csrf;

	public PatParticular() {
		super();
	}

	public String getBodyPart() {
		return bodyPart;
	}

	public void setBodyPart(String bodyPart) {
		this.bodyPart = bodyPart;
	}

	public String getIllnessDesc() {
		return illnessDesc;
	}

	public void setIllnessDesc(String illnessDesc) {
		this.illnessDesc = illnessDesc;
	}

	public String get_csrf() {
		return _csrf;
	}

	public void set_csrf(String _csrf) {
		this._csrf = _csrf;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public PatParticular(String bodyPart, String illnessDesc, String _csrf) {
		super();
		this.bodyPart = bodyPart;
		this.illnessDesc = illnessDesc;
		this._csrf = _csrf;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_csrf == null) ? 0 : _csrf.hashCode());
		result = prime * result + ((bodyPart == null) ? 0 : bodyPart.hashCode());
		result = prime * result + ((illnessDesc == null) ? 0 : illnessDesc.hashCode());
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
		PatParticular other = (PatParticular) obj;
		if (_csrf == null) {
			if (other._csrf != null)
				return false;
		} else if (!_csrf.equals(other._csrf))
			return false;
		if (bodyPart == null) {
			if (other.bodyPart != null)
				return false;
		} else if (!bodyPart.equals(other.bodyPart))
			return false;
		if (illnessDesc == null) {
			if (other.illnessDesc != null)
				return false;
		} else if (!illnessDesc.equals(other.illnessDesc))
			return false;
		return true;
	}

}