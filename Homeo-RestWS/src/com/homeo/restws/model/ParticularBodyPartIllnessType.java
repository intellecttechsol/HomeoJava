package com.homeo.restws.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="MasterRecords")
@XmlAccessorType(XmlAccessType.FIELD)
public class ParticularBodyPartIllnessType  implements Serializable {

	private static final long serialVersionUID = -7058914161363815808L;

	 @XmlElement(name="bodypart", required=true)
	private String bodypart;
    
	 @XmlElement(name="illnessdesc", required=true) 
	private String illnessdesc;

	public ParticularBodyPartIllnessType(String bodypart, String illnessdesc) {
		super();
		this.bodypart = bodypart;
		this.illnessdesc = illnessdesc;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bodypart == null) ? 0 : bodypart.hashCode());
		result = prime * result + ((illnessdesc == null) ? 0 : illnessdesc.hashCode());
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
		ParticularBodyPartIllnessType other = (ParticularBodyPartIllnessType) obj;
		if (bodypart == null) {
			if (other.bodypart != null)
				return false;
		} else if (!bodypart.equals(other.bodypart))
			return false;
		if (illnessdesc == null) {
			if (other.illnessdesc != null)
				return false;
		} else if (!illnessdesc.equals(other.illnessdesc))
			return false;
		return true;
	}

	public String getBodypart() {
		return bodypart;
	}

	public void setBodypart(String bodypart) {
		this.bodypart = bodypart;
	}

	public String getIllnessdesc() {
		return illnessdesc;
	}

	public void setIllnessdesc(String illnessdesc) {
		this.illnessdesc = illnessdesc;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	// default constructor 
	public ParticularBodyPartIllnessType() {
		super();
	}

	

		

}