package com.homeo.restws.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="FamilyHistoryInfo")
@XmlAccessorType(XmlAccessType.FIELD)

public class FamilyHistoryInfo implements Serializable{
	
	@XmlElement(name="relation")
	String relation;
	@XmlElement(name="disease")
	String disease;
	
	public FamilyHistoryInfo(String relation, String disease) {
		super();
		this.relation = relation;
		this.disease = disease;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}

}
