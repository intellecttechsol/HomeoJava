package com.homeo.restws.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="MasterRecords")
@XmlAccessorType(XmlAccessType.FIELD)
public class ParticularBodyPartIllness  implements Serializable {

	private static final long serialVersionUID = -7058914161363815808L;

	 @XmlElement(name="patrefnum", required=true)
	private String patrefnum;
    
	 @XmlElement(name="code", required=true) 
	private ParticularBodyPartIllnessType particularBodyPartIllnessType;

	// default constructor 
	public ParticularBodyPartIllness() {
		super();
	}

	

		

}