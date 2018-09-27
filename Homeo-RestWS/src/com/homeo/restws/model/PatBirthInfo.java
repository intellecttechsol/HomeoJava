package com.homeo.restws.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="PatBirthInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class PatBirthInfo  implements Serializable {

	private static final long serialVersionUID = -7058914161363815808L;

	 @XmlElement(name="patrefnum", required=true)
	 private String patrefnum;
    
	 
	 @XmlElement(name="birthhistory")
		private String birthhistory;
	 
	 @XmlElement(name="birthweightcat")
		private String birthweightcat;
	 
	 @XmlElement(name="birthweight")
		private String birthweight;
	 
	 @XmlElement(name="birthrash")
		private String birthrash;
	 
	 @XmlElement(name="vaccination")
		private String vaccination;
	 
	 @XmlElement(name="greenstoolduringdentition")
		private String greenstoolduringdentition;
	 
	 @XmlElement(name="teethmilestone")
		private String teethmilestone;
	 
	 @XmlElement(name="teethmilestonecategory")
		private String teethmilestonecategory;
	 
	 @XmlElement(name="walkmilestone")
		private String walkmilestone;
	 
	 @XmlElement(name="walkmilestonecategory")
		private String walkmilestonecategory;
	 
	 @XmlElement(name="talkmilestone")
		private String talkmilestone;
	 
	 @XmlElement(name="talkmilestonecategory")
		private String talkmilestonecategory;
	 
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	// default constructor 
	public PatBirthInfo() {
		super();
	}

	public String getPatrefnum() {
		return patrefnum;
	}

	public void setPatrefnum(String patrefnum) {
		this.patrefnum = patrefnum;
	}

	public String getBirthhistory() {
		return birthhistory;
	}

	public void setBirthhistory(String birthhistory) {
		this.birthhistory = birthhistory;
	}

	public String getBirthweightcat() {
		return birthweightcat;
	}

	public void setBirthweightcat(String birthweightcat) {
		this.birthweightcat = birthweightcat;
	}

	public String getBirthweight() {
		return birthweight;
	}

	public void setBirthweight(String birthweight) {
		this.birthweight = birthweight;
	}

	public String getBirthrash() {
		return birthrash;
	}

	public void setBirthrash(String birthrash) {
		this.birthrash = birthrash;
	}

	public String getVaccination() {
		return vaccination;
	}

	public void setVaccination(String vaccination) {
		this.vaccination = vaccination;
	}

	public String getGreenstoolduringdentition() {
		return greenstoolduringdentition;
	}

	public void setGreenstoolduringdentition(String greenstoolduringdentition) {
		this.greenstoolduringdentition = greenstoolduringdentition;
	}

	public String getTeethmilestone() {
		return teethmilestone;
	}

	public void setTeethmilestone(String teethmilestone) {
		this.teethmilestone = teethmilestone;
	}

	public String getTeethmilestonecategory() {
		return teethmilestonecategory;
	}

	public void setTeethmilestonecategory(String teethmilestonecategory) {
		this.teethmilestonecategory = teethmilestonecategory;
	}

	public String getWalkmilestone() {
		return walkmilestone;
	}

	public void setWalkmilestone(String walkmilestone) {
		this.walkmilestone = walkmilestone;
	}

	public String getWalkmilestonecategory() {
		return walkmilestonecategory;
	}

	public void setWalkmilestonecategory(String walkmilestonecategory) {
		this.walkmilestonecategory = walkmilestonecategory;
	}

	public String getTalkmilestone() {
		return talkmilestone;
	}

	public void setTalkmilestone(String talkmilestone) {
		this.talkmilestone = talkmilestone;
	}

	public String getTalkmilestonecategory() {
		return talkmilestonecategory;
	}

	public void setTalkmilestonecategory(String talkmilestonecategory) {
		this.talkmilestonecategory = talkmilestonecategory;
	}

	@Override
	public String toString() {
		return "PatBirthInfo [patrefnum=" + patrefnum + ", birthhistory=" + birthhistory + ", birthweightcat="
				+ birthweightcat + ", birthweight=" + birthweight + ", birthrash=" + birthrash + ", vaccination="
				+ vaccination + ", greenstoolduringdentition=" + greenstoolduringdentition + ", teethmilestone="
				+ teethmilestone + ", teethmilestonecategory=" + teethmilestonecategory + ", walkmilestone="
				+ walkmilestone + ", walkmilestonecategory=" + walkmilestonecategory + ", talkmilestone="
				+ talkmilestone + ", talkmilestonecategory=" + talkmilestonecategory + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthhistory == null) ? 0 : birthhistory.hashCode());
		result = prime * result + ((birthrash == null) ? 0 : birthrash.hashCode());
		result = prime * result + ((birthweight == null) ? 0 : birthweight.hashCode());
		result = prime * result + ((birthweightcat == null) ? 0 : birthweightcat.hashCode());
		result = prime * result + ((greenstoolduringdentition == null) ? 0 : greenstoolduringdentition.hashCode());
		result = prime * result + ((patrefnum == null) ? 0 : patrefnum.hashCode());
		result = prime * result + ((talkmilestone == null) ? 0 : talkmilestone.hashCode());
		result = prime * result + ((talkmilestonecategory == null) ? 0 : talkmilestonecategory.hashCode());
		result = prime * result + ((teethmilestone == null) ? 0 : teethmilestone.hashCode());
		result = prime * result + ((teethmilestonecategory == null) ? 0 : teethmilestonecategory.hashCode());
		result = prime * result + ((vaccination == null) ? 0 : vaccination.hashCode());
		result = prime * result + ((walkmilestone == null) ? 0 : walkmilestone.hashCode());
		result = prime * result + ((walkmilestonecategory == null) ? 0 : walkmilestonecategory.hashCode());
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
		PatBirthInfo other = (PatBirthInfo) obj;
		if (birthhistory == null) {
			if (other.birthhistory != null)
				return false;
		} else if (!birthhistory.equals(other.birthhistory))
			return false;
		if (birthrash == null) {
			if (other.birthrash != null)
				return false;
		} else if (!birthrash.equals(other.birthrash))
			return false;
		if (birthweight == null) {
			if (other.birthweight != null)
				return false;
		} else if (!birthweight.equals(other.birthweight))
			return false;
		if (birthweightcat == null) {
			if (other.birthweightcat != null)
				return false;
		} else if (!birthweightcat.equals(other.birthweightcat))
			return false;
		if (greenstoolduringdentition == null) {
			if (other.greenstoolduringdentition != null)
				return false;
		} else if (!greenstoolduringdentition.equals(other.greenstoolduringdentition))
			return false;
		if (patrefnum == null) {
			if (other.patrefnum != null)
				return false;
		} else if (!patrefnum.equals(other.patrefnum))
			return false;
		if (talkmilestone == null) {
			if (other.talkmilestone != null)
				return false;
		} else if (!talkmilestone.equals(other.talkmilestone))
			return false;
		if (talkmilestonecategory == null) {
			if (other.talkmilestonecategory != null)
				return false;
		} else if (!talkmilestonecategory.equals(other.talkmilestonecategory))
			return false;
		if (teethmilestone == null) {
			if (other.teethmilestone != null)
				return false;
		} else if (!teethmilestone.equals(other.teethmilestone))
			return false;
		if (teethmilestonecategory == null) {
			if (other.teethmilestonecategory != null)
				return false;
		} else if (!teethmilestonecategory.equals(other.teethmilestonecategory))
			return false;
		if (vaccination == null) {
			if (other.vaccination != null)
				return false;
		} else if (!vaccination.equals(other.vaccination))
			return false;
		if (walkmilestone == null) {
			if (other.walkmilestone != null)
				return false;
		} else if (!walkmilestone.equals(other.walkmilestone))
			return false;
		if (walkmilestonecategory == null) {
			if (other.walkmilestonecategory != null)
				return false;
		} else if (!walkmilestonecategory.equals(other.walkmilestonecategory))
			return false;
		return true;
	}

	

}