package com.homeo.restws.model;

import java.io.Serializable;
import java.util.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="PatHistoryOfPastIllnessDetails")
@XmlAccessorType(XmlAccessType.FIELD)
public class PatHistoryOfPastIllnessDetails  implements Serializable {

	private static final long serialVersionUID = 8860467872112783681L;
	
	@XmlElement(name="patrefnum", required=true)
	private String patrefnum;

	@XmlElement(name="vomitingmonths")
	private String vomitingmonths;

	@XmlElement(name="vomitingseverity") 
	private String vomitingseverity;

	@XmlElement(name="movementoffoetus")
	private String movementoffoetus;

	@XmlElement(name="thyroid")
	private String thyroid;

	@XmlElement(name="hypertension")
	private String hypertension;

	@XmlElement(name="asthma")
	private String asthma;

	@XmlElement(name="anyskindisease")
	private String anyskindisease;

	@XmlElement(name="skindiseasedescription")
	private String skindiseasedescription;

	@XmlElement(name="anymentalgrieforshock")
	private String anymentalgrieforshock;

	@XmlElement(name="mentalgriefshockdescription")
	private String mentalgriefshockdescription;

	@XmlElement(name="anyinjuryoraccident")
	private String anyinjuryoraccident;

	@XmlElement(name="injuryaccidentdescription")
	private String injuryaccidentdescription;

	@XmlElement(name="anyoperation")
	private String anyoperation;

	@XmlElement(name="anyoperationdescription")
	private String anyoperationdescription;

	@XmlElement(name="venerealdisease")
	private String venerealdisease;

	@XmlElement(name="venerealdiseasedescription")
	private String venerealdiseasedescription;
	
	@XmlElement(name="diabetesmellitus")
	private String diabetesmellitus;

	@XmlElement(name="birthhistory")
	private String birthhistory;

	@XmlElement(name="birthweight")
	private String birthweight;

	@XmlElement(name="birthrash")
	private String birthrash;

	@XmlElement(name="birthrashdescription")
	private String birthrashdescription;

	@XmlElement(name="vaccination")
	private String vaccination;

	@XmlElement(name="vaccinationdescription")
	private String vaccinationdescription;

	@XmlElement(name="teethmilestone")
	private String teethmilestone;

	@XmlElement(name="walkmilestone")
	private String walkmilestone;

	@XmlElement(name="talkmilestone")
	private String talkmilestone;

	@XmlElement(name="greenstoolduringdentation")
	private String greenstoolduringdentation;

	@XmlElement(name="stooldescription")
	private String stooldescription;
	
	@XmlElement(name="otherdiseaseslist")
	private List<String> otherdiseaseslist=new ArrayList<String>();
	
	@XmlElement(name="createdby")
	private String createdby;

	@XmlElement(name="updatedby")
	private String updatedby;

	@XmlElement(name="_csrf")
	private String _csrf;

	public PatHistoryOfPastIllnessDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_csrf == null) ? 0 : _csrf.hashCode());
		result = prime * result + ((anyinjuryoraccident == null) ? 0 : anyinjuryoraccident.hashCode());
		result = prime * result + ((anymentalgrieforshock == null) ? 0 : anymentalgrieforshock.hashCode());
		result = prime * result + ((anyoperation == null) ? 0 : anyoperation.hashCode());
		result = prime * result + ((anyoperationdescription == null) ? 0 : anyoperationdescription.hashCode());
		result = prime * result + ((anyskindisease == null) ? 0 : anyskindisease.hashCode());
		result = prime * result + ((asthma == null) ? 0 : asthma.hashCode());
		result = prime * result + ((birthhistory == null) ? 0 : birthhistory.hashCode());
		result = prime * result + ((birthrash == null) ? 0 : birthrash.hashCode());
		result = prime * result + ((birthrashdescription == null) ? 0 : birthrashdescription.hashCode());
		result = prime * result + ((birthweight == null) ? 0 : birthweight.hashCode());
		result = prime * result + ((createdby == null) ? 0 : createdby.hashCode());
		result = prime * result + ((diabetesmellitus == null) ? 0 : diabetesmellitus.hashCode());
		result = prime * result + ((greenstoolduringdentation == null) ? 0 : greenstoolduringdentation.hashCode());
		result = prime * result + ((hypertension == null) ? 0 : hypertension.hashCode());
		result = prime * result + ((injuryaccidentdescription == null) ? 0 : injuryaccidentdescription.hashCode());
		result = prime * result + ((mentalgriefshockdescription == null) ? 0 : mentalgriefshockdescription.hashCode());
		result = prime * result + ((movementoffoetus == null) ? 0 : movementoffoetus.hashCode());
		result = prime * result + ((otherdiseaseslist == null) ? 0 : otherdiseaseslist.hashCode());
		result = prime * result + ((patrefnum == null) ? 0 : patrefnum.hashCode());
		result = prime * result + ((skindiseasedescription == null) ? 0 : skindiseasedescription.hashCode());
		result = prime * result + ((stooldescription == null) ? 0 : stooldescription.hashCode());
		result = prime * result + ((talkmilestone == null) ? 0 : talkmilestone.hashCode());
		result = prime * result + ((teethmilestone == null) ? 0 : teethmilestone.hashCode());
		result = prime * result + ((thyroid == null) ? 0 : thyroid.hashCode());
		result = prime * result + ((updatedby == null) ? 0 : updatedby.hashCode());
		result = prime * result + ((vaccination == null) ? 0 : vaccination.hashCode());
		result = prime * result + ((vaccinationdescription == null) ? 0 : vaccinationdescription.hashCode());
		result = prime * result + ((venerealdisease == null) ? 0 : venerealdisease.hashCode());
		result = prime * result + ((venerealdiseasedescription == null) ? 0 : venerealdiseasedescription.hashCode());
		result = prime * result + ((vomitingmonths == null) ? 0 : vomitingmonths.hashCode());
		result = prime * result + ((vomitingseverity == null) ? 0 : vomitingseverity.hashCode());
		result = prime * result + ((walkmilestone == null) ? 0 : walkmilestone.hashCode());
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
		PatHistoryOfPastIllnessDetails other = (PatHistoryOfPastIllnessDetails) obj;
		if (_csrf == null) {
			if (other._csrf != null)
				return false;
		} else if (!_csrf.equals(other._csrf))
			return false;
		if (anyinjuryoraccident == null) {
			if (other.anyinjuryoraccident != null)
				return false;
		} else if (!anyinjuryoraccident.equals(other.anyinjuryoraccident))
			return false;
		if (anymentalgrieforshock == null) {
			if (other.anymentalgrieforshock != null)
				return false;
		} else if (!anymentalgrieforshock.equals(other.anymentalgrieforshock))
			return false;
		if (anyoperation == null) {
			if (other.anyoperation != null)
				return false;
		} else if (!anyoperation.equals(other.anyoperation))
			return false;
		if (anyoperationdescription == null) {
			if (other.anyoperationdescription != null)
				return false;
		} else if (!anyoperationdescription.equals(other.anyoperationdescription))
			return false;
		if (anyskindisease == null) {
			if (other.anyskindisease != null)
				return false;
		} else if (!anyskindisease.equals(other.anyskindisease))
			return false;
		if (asthma == null) {
			if (other.asthma != null)
				return false;
		} else if (!asthma.equals(other.asthma))
			return false;
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
		if (birthrashdescription == null) {
			if (other.birthrashdescription != null)
				return false;
		} else if (!birthrashdescription.equals(other.birthrashdescription))
			return false;
		if (birthweight == null) {
			if (other.birthweight != null)
				return false;
		} else if (!birthweight.equals(other.birthweight))
			return false;
		if (createdby == null) {
			if (other.createdby != null)
				return false;
		} else if (!createdby.equals(other.createdby))
			return false;
		if (diabetesmellitus == null) {
			if (other.diabetesmellitus != null)
				return false;
		} else if (!diabetesmellitus.equals(other.diabetesmellitus))
			return false;
		if (greenstoolduringdentation == null) {
			if (other.greenstoolduringdentation != null)
				return false;
		} else if (!greenstoolduringdentation.equals(other.greenstoolduringdentation))
			return false;
		if (hypertension == null) {
			if (other.hypertension != null)
				return false;
		} else if (!hypertension.equals(other.hypertension))
			return false;
		if (injuryaccidentdescription == null) {
			if (other.injuryaccidentdescription != null)
				return false;
		} else if (!injuryaccidentdescription.equals(other.injuryaccidentdescription))
			return false;
		if (mentalgriefshockdescription == null) {
			if (other.mentalgriefshockdescription != null)
				return false;
		} else if (!mentalgriefshockdescription.equals(other.mentalgriefshockdescription))
			return false;
		if (movementoffoetus == null) {
			if (other.movementoffoetus != null)
				return false;
		} else if (!movementoffoetus.equals(other.movementoffoetus))
			return false;
		if (otherdiseaseslist == null) {
			if (other.otherdiseaseslist != null)
				return false;
		} else if (!otherdiseaseslist.equals(other.otherdiseaseslist))
			return false;
		if (patrefnum == null) {
			if (other.patrefnum != null)
				return false;
		} else if (!patrefnum.equals(other.patrefnum))
			return false;
		if (skindiseasedescription == null) {
			if (other.skindiseasedescription != null)
				return false;
		} else if (!skindiseasedescription.equals(other.skindiseasedescription))
			return false;
		if (stooldescription == null) {
			if (other.stooldescription != null)
				return false;
		} else if (!stooldescription.equals(other.stooldescription))
			return false;
		if (talkmilestone == null) {
			if (other.talkmilestone != null)
				return false;
		} else if (!talkmilestone.equals(other.talkmilestone))
			return false;
		if (teethmilestone == null) {
			if (other.teethmilestone != null)
				return false;
		} else if (!teethmilestone.equals(other.teethmilestone))
			return false;
		if (thyroid == null) {
			if (other.thyroid != null)
				return false;
		} else if (!thyroid.equals(other.thyroid))
			return false;
		if (updatedby == null) {
			if (other.updatedby != null)
				return false;
		} else if (!updatedby.equals(other.updatedby))
			return false;
		if (vaccination == null) {
			if (other.vaccination != null)
				return false;
		} else if (!vaccination.equals(other.vaccination))
			return false;
		if (vaccinationdescription == null) {
			if (other.vaccinationdescription != null)
				return false;
		} else if (!vaccinationdescription.equals(other.vaccinationdescription))
			return false;
		if (venerealdisease == null) {
			if (other.venerealdisease != null)
				return false;
		} else if (!venerealdisease.equals(other.venerealdisease))
			return false;
		if (venerealdiseasedescription == null) {
			if (other.venerealdiseasedescription != null)
				return false;
		} else if (!venerealdiseasedescription.equals(other.venerealdiseasedescription))
			return false;
		if (vomitingmonths == null) {
			if (other.vomitingmonths != null)
				return false;
		} else if (!vomitingmonths.equals(other.vomitingmonths))
			return false;
		if (vomitingseverity == null) {
			if (other.vomitingseverity != null)
				return false;
		} else if (!vomitingseverity.equals(other.vomitingseverity))
			return false;
		if (walkmilestone == null) {
			if (other.walkmilestone != null)
				return false;
		} else if (!walkmilestone.equals(other.walkmilestone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PatHistoryOfPastIllnessDetails [patrefnum=" + patrefnum + ", vomitingmonths=" + vomitingmonths
				+ ", vomitingseverity=" + vomitingseverity + ", movementoffoetus=" + movementoffoetus + ", thyroid="
				+ thyroid + ", hypertension=" + hypertension + ", asthma=" + asthma + ", anyskindisease="
				+ anyskindisease + ", skindiseasedescription=" + skindiseasedescription + ", anymentalgrieforshock="
				+ anymentalgrieforshock + ", mentalgriefshockdescription=" + mentalgriefshockdescription
				+ ", anyinjuryoraccident=" + anyinjuryoraccident + ", injuryaccidentdescription="
				+ injuryaccidentdescription + ", anyoperation=" + anyoperation + ", anyoperationdescription="
				+ anyoperationdescription + ", venerealdisease=" + venerealdisease + ", venerealdiseasedescription="
				+ venerealdiseasedescription + ", diabetesmellitus=" + diabetesmellitus + ", birthhistory="
				+ birthhistory + ", birthweight=" + birthweight + ", birthrash=" + birthrash + ", birthrashdescription="
				+ birthrashdescription + ", vaccination=" + vaccination + ", vaccinationdescription="
				+ vaccinationdescription + ", teethmilestone=" + teethmilestone + ", walkmilestone=" + walkmilestone
				+ ", talkmilestone=" + talkmilestone + ", greenstoolduringdentation=" + greenstoolduringdentation
				+ ", stooldescription=" + stooldescription + ", otherdiseaseslist=" + otherdiseaseslist + ", createdby="
				+ createdby + ", updatedby=" + updatedby + ", _csrf=" + _csrf + "]";
	}

	public String getPatrefnum() {
		return patrefnum;
	}

	public void setPatrefnum(String patrefnum) {
		this.patrefnum = patrefnum;
	}

	public String getVomitingmonths() {
		return vomitingmonths;
	}

	public void setVomitingmonths(String vomitingmonths) {
		this.vomitingmonths = vomitingmonths;
	}

	public String getVomitingseverity() {
		return vomitingseverity;
	}

	public void setVomitingseverity(String vomitingseverity) {
		this.vomitingseverity = vomitingseverity;
	}

	public String getMovementoffoetus() {
		return movementoffoetus;
	}

	public void setMovementoffoetus(String movementoffoetus) {
		this.movementoffoetus = movementoffoetus;
	}

	public String getThyroid() {
		return thyroid;
	}

	public void setThyroid(String thyroid) {
		this.thyroid = thyroid;
	}

	public String getHypertension() {
		return hypertension;
	}

	public void setHypertension(String hypertension) {
		this.hypertension = hypertension;
	}

	public String getAsthma() {
		return asthma;
	}

	public void setAsthma(String asthma) {
		this.asthma = asthma;
	}

	public String getAnyskindisease() {
		return anyskindisease;
	}

	public void setAnyskindisease(String anyskindisease) {
		this.anyskindisease = anyskindisease;
	}

	public String getSkindiseasedescription() {
		return skindiseasedescription;
	}

	public void setSkindiseasedescription(String skindiseasedescription) {
		this.skindiseasedescription = skindiseasedescription;
	}

	public String getAnymentalgrieforshock() {
		return anymentalgrieforshock;
	}

	public void setAnymentalgrieforshock(String anymentalgrieforshock) {
		this.anymentalgrieforshock = anymentalgrieforshock;
	}

	public String getMentalgriefshockdescription() {
		return mentalgriefshockdescription;
	}

	public void setMentalgriefshockdescription(String mentalgriefshockdescription) {
		this.mentalgriefshockdescription = mentalgriefshockdescription;
	}

	public String getAnyinjuryoraccident() {
		return anyinjuryoraccident;
	}

	public void setAnyinjuryoraccident(String anyinjuryoraccident) {
		this.anyinjuryoraccident = anyinjuryoraccident;
	}

	public String getInjuryaccidentdescription() {
		return injuryaccidentdescription;
	}

	public void setInjuryaccidentdescription(String injuryaccidentdescription) {
		this.injuryaccidentdescription = injuryaccidentdescription;
	}

	public String getAnyoperation() {
		return anyoperation;
	}

	public void setAnyoperation(String anyoperation) {
		this.anyoperation = anyoperation;
	}

	public String getAnyoperationdescription() {
		return anyoperationdescription;
	}

	public void setAnyoperationdescription(String anyoperationdescription) {
		this.anyoperationdescription = anyoperationdescription;
	}

	public String getVenerealdisease() {
		return venerealdisease;
	}

	public void setVenerealdisease(String venerealdisease) {
		this.venerealdisease = venerealdisease;
	}

	public String getVenerealdiseasedescription() {
		return venerealdiseasedescription;
	}

	public void setVenerealdiseasedescription(String venerealdiseasedescription) {
		this.venerealdiseasedescription = venerealdiseasedescription;
	}

	public String getDiabetesmellitus() {
		return diabetesmellitus;
	}

	public void setDiabetesmellitus(String diabetesmellitus) {
		this.diabetesmellitus = diabetesmellitus;
	}

	public String getBirthhistory() {
		return birthhistory;
	}

	public void setBirthhistory(String birthhistory) {
		this.birthhistory = birthhistory;
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

	public String getBirthrashdescription() {
		return birthrashdescription;
	}

	public void setBirthrashdescription(String birthrashdescription) {
		this.birthrashdescription = birthrashdescription;
	}

	public String getVaccination() {
		return vaccination;
	}

	public void setVaccination(String vaccination) {
		this.vaccination = vaccination;
	}

	public String getVaccinationdescription() {
		return vaccinationdescription;
	}

	public void setVaccinationdescription(String vaccinationdescription) {
		this.vaccinationdescription = vaccinationdescription;
	}

	public String getTeethmilestone() {
		return teethmilestone;
	}

	public void setTeethmilestone(String teethmilestone) {
		this.teethmilestone = teethmilestone;
	}

	public String getWalkmilestone() {
		return walkmilestone;
	}

	public void setWalkmilestone(String walkmilestone) {
		this.walkmilestone = walkmilestone;
	}

	public String getTalkmilestone() {
		return talkmilestone;
	}

	public void setTalkmilestone(String talkmilestone) {
		this.talkmilestone = talkmilestone;
	}

	public String getGreenstoolduringdentation() {
		return greenstoolduringdentation;
	}

	public void setGreenstoolduringdentation(String greenstoolduringdentation) {
		this.greenstoolduringdentation = greenstoolduringdentation;
	}

	public String getStooldescription() {
		return stooldescription;
	}

	public void setStooldescription(String stooldescription) {
		this.stooldescription = stooldescription;
	}

	public List<String> getOtherdiseaseslist() {
		return otherdiseaseslist;
	}

	public void setOtherdiseaseslist(List<String> otherdiseaseslist) {
		this.otherdiseaseslist = otherdiseaseslist;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

		
}