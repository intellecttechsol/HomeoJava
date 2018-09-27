package com.homeo.restws.model;

import java.io.Serializable;
import java.util.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="PatFamilyHistory")
@XmlAccessorType(XmlAccessType.FIELD)
public class PatFamilyHistory  implements Serializable {

	private static final long serialVersionUID = -7058914161363815808L;

	 @XmlElement(name="patrefnum", required=true)
	private String patrefnum;
    
	 @XmlElement(name="familyhistory", required=true)
		private List<FamilyHistoryInfo> familyhistoryist = new ArrayList<FamilyHistoryInfo>();
	 
	 @XmlElement(name="action")
		private String action;

	public PatFamilyHistory(String patrefnum, List<FamilyHistoryInfo> familyhistoryist, String action) {
		super();
		System.out.println("construcntor...PatFamilyHistory");
		this.patrefnum = patrefnum;
		this.familyhistoryist = familyhistoryist;
		this.action = action;
	}

	public String getPatrefnum() {
		return patrefnum;
	}

	public void setPatrefnum(String patrefnum) {
		this.patrefnum = patrefnum;
	}

	public List<FamilyHistoryInfo> getFamilyhistoryist() {
		return familyhistoryist;
	}

	public void setFamilyhistoryist(List<FamilyHistoryInfo> familyhistoryist) {
		this.familyhistoryist = familyhistoryist;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	 
	 /*@XmlElement(name="createdate") 
	private String createdate;

	 @XmlElement(name="createdby")
	private String createdby;
	 
	 @XmlElement(name="maritalstatus")
		private String maritalstatus;
	 
	 @XmlElement(name="sexhabit")
		private String sexhabit;*/
	 
	 



	
}