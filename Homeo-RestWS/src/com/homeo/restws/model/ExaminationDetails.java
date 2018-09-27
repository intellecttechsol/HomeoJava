package com.homeo.restws.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ExaminationDetails")
@XmlAccessorType(XmlAccessType.FIELD)
public class ExaminationDetails implements Serializable {

	private static final long serialVersionUID = 2093132446916609890L;

	@XmlElement(name="patrefnum")
	private String patrefnum;
	
	@XmlElement(name="decubitus", required=true)
	private String decubitus;
	
	@XmlElement(name="decubitusdescription", required=true)
	private String decubitusdescription;

	@XmlElement(name="facies")
	private String facies;

	@XmlElement(name="faciesdescription")
	private String faciesdescription;
	
	@XmlElement(name="anaemia")
	private String anaemia;

	@XmlElement(name="cyanosis")
	private String cyanosis;
	
	@XmlElement(name="jaundice")
	private String jaundice;
	
	
	@XmlElement(name="oedema")
	private String oedema;
	
	
	@XmlElement(name="clubbing")
	private String clubbing;
	
	
	@XmlElement(name="nutrition")
	private String nutrition;
	
	
	@XmlElement(name="height")
	private String height;
	
	
	@XmlElement(name="weight")
	private String weight;
	
	
	@XmlElement(name="built")
	private String built;
	
	@XmlElement(name="pulse")
	private String pulse;
	
	@XmlElement(name="bp")
	private String bp;
	
	@XmlElement(name="respiration")
	private String respiration;
	
	@XmlElement(name="neckvein")
	private String neckvein;
	
	@XmlElement(name="neckgland")
	private String neckgland;
	
	@XmlElement(name="temperature")
	private String temperature;
	
	@XmlElement(name="respiratorysysteminspection")
	private String respiratorysysteminspection;
	
	@XmlElement(name="respiratorysystempalpitation")
	private String respiratorysystempalpitation;
	
	@XmlElement(name="respiratorysystempercussion")
	private String respiratorysystempercussion;
	
	@XmlElement(name="respiratorysystemauscultation")
	private String respiratorysystemauscultation;
	
	@XmlElement(name="cardiovascularsysteminspection")
	private String cardiovascularsysteminspection;
	
	@XmlElement(name="cardiovascularsystempalpitation")
	private String cardiovascularsystempalpitation;
	
	@XmlElement(name="cardiovascularsystempercussion")
	private String cardiovascularsystempercussion;
	
	@XmlElement(name="cardiovascularsystemauscultation")
	private String cardiovascularsystemauscultation;
	
	@XmlElement(name="alimenatarysysteminspection")
	private String alimenatarysysteminspection;
	
	@XmlElement(name="alimenatarysystempalpitation")
	private String alimenatarysystempalpitation;
	
	@XmlElement(name="alimenatarysystempercussion")
	private String alimenatarysystempercussion;
	
	@XmlElement(name="alimenatarysystemauscultation")
	private String alimenatarysystemauscultation;
	
	@XmlElement(name="nervoussysteminspection")
	private String nervoussysteminspection;
	
	@XmlElement(name="nervoussystempalpitation")
	private String nervoussystempalpitation;
	
	@XmlElement(name="nervoussystempercussion")
	private String nervoussystempercussion;
	
	@XmlElement(name="nervoussystemauscultation")
	private String nervoussystemauscultation;
	
	@XmlElement(name="otherinspection")
	private String otherinspection;
	
	@XmlElement(name="otherpalpitation")
	private String otherpalpitation;
	
	@XmlElement(name="otherpercussion")
	private String otherpercussion;
	
	@XmlElement(name="otherauscultation")
	private String otherauscultation;
	
	
	@XmlElement(name="createdby")
	private String createdby;

	@XmlElement(name="updatedby")
	private String updatedby;
	
	@XmlElement(name="_csrf")
	private String _csrf;

	public String getPatrefnum() {
		return patrefnum;
	}

	public void setPatrefnum(String patrefnum) {
		this.patrefnum = patrefnum;
	}

	public String getDecubitus() {
		return decubitus;
	}

	public void setDecubitus(String decubitus) {
		this.decubitus = decubitus;
	}

	public String getDecubitusdescription() {
		return decubitusdescription;
	}

	public void setDecubitusdescription(String decubitusdescription) {
		this.decubitusdescription = decubitusdescription;
	}

	public String getFacies() {
		return facies;
	}

	public void setFacies(String facies) {
		this.facies = facies;
	}

	public String getFaciesdescription() {
		return faciesdescription;
	}

	public void setFaciesdescription(String faciesdescription) {
		this.faciesdescription = faciesdescription;
	}

	public String getAnaemia() {
		return anaemia;
	}

	public void setAnaemia(String anaemia) {
		this.anaemia = anaemia;
	}

	public String getCyanosis() {
		return cyanosis;
	}

	public void setCyanosis(String cyanosis) {
		this.cyanosis = cyanosis;
	}

	public String getJaundice() {
		return jaundice;
	}

	public void setJaundice(String jaundice) {
		this.jaundice = jaundice;
	}

	public String getOedema() {
		return oedema;
	}

	public void setOedema(String oedema) {
		this.oedema = oedema;
	}

	public String getClubbing() {
		return clubbing;
	}

	public void setClubbing(String clubbing) {
		this.clubbing = clubbing;
	}

	public String getNutrition() {
		return nutrition;
	}

	public void setNutrition(String nutrition) {
		this.nutrition = nutrition;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getBuilt() {
		return built;
	}

	public void setBuilt(String built) {
		this.built = built;
	}

	public String getPulse() {
		return pulse;
	}

	public void setPulse(String pulse) {
		this.pulse = pulse;
	}

	public String getBp() {
		return bp;
	}

	public void setBp(String bp) {
		this.bp = bp;
	}

	public String getRespiration() {
		return respiration;
	}

	public void setRespiration(String respiration) {
		this.respiration = respiration;
	}

	public String getNeckvein() {
		return neckvein;
	}

	public void setNeckvein(String neckvein) {
		this.neckvein = neckvein;
	}

	public String getNeckgland() {
		return neckgland;
	}

	public void setNeckgland(String neckgland) {
		this.neckgland = neckgland;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getRespiratorysysteminspection() {
		return respiratorysysteminspection;
	}

	public void setRespiratorysysteminspection(String respiratorysysteminspection) {
		this.respiratorysysteminspection = respiratorysysteminspection;
	}

	public String getRespiratorysystempalpitation() {
		return respiratorysystempalpitation;
	}

	public void setRespiratorysystempalpitation(String respiratorysystempalpitation) {
		this.respiratorysystempalpitation = respiratorysystempalpitation;
	}

	public String getRespiratorysystempercussion() {
		return respiratorysystempercussion;
	}

	public void setRespiratorysystempercussion(String respiratorysystempercussion) {
		this.respiratorysystempercussion = respiratorysystempercussion;
	}

	public String getRespiratorysystemauscultation() {
		return respiratorysystemauscultation;
	}

	public void setRespiratorysystemauscultation(String respiratorysystemauscultation) {
		this.respiratorysystemauscultation = respiratorysystemauscultation;
	}

	public String getCardiovascularsysteminspection() {
		return cardiovascularsysteminspection;
	}

	public void setCardiovascularsysteminspection(String cardiovascularsysteminspection) {
		this.cardiovascularsysteminspection = cardiovascularsysteminspection;
	}

	public String getCardiovascularsystempalpitation() {
		return cardiovascularsystempalpitation;
	}

	public void setCardiovascularsystempalpitation(String cardiovascularsystempalpitation) {
		this.cardiovascularsystempalpitation = cardiovascularsystempalpitation;
	}

	public String getCardiovascularsystempercussion() {
		return cardiovascularsystempercussion;
	}

	public void setCardiovascularsystempercussion(String cardiovascularsystempercussion) {
		this.cardiovascularsystempercussion = cardiovascularsystempercussion;
	}

	public String getCardiovascularsystemauscultation() {
		return cardiovascularsystemauscultation;
	}

	public void setCardiovascularsystemauscultation(String cardiovascularsystemauscultation) {
		this.cardiovascularsystemauscultation = cardiovascularsystemauscultation;
	}

	public String getAlimenatarysysteminspection() {
		return alimenatarysysteminspection;
	}

	public void setAlimenatarysysteminspection(String alimenatarysysteminspection) {
		this.alimenatarysysteminspection = alimenatarysysteminspection;
	}

	public String getAlimenatarysystempalpitation() {
		return alimenatarysystempalpitation;
	}

	public void setAlimenatarysystempalpitation(String alimenatarysystempalpitation) {
		this.alimenatarysystempalpitation = alimenatarysystempalpitation;
	}

	public String getAlimenatarysystempercussion() {
		return alimenatarysystempercussion;
	}

	public void setAlimenatarysystempercussion(String alimenatarysystempercussion) {
		this.alimenatarysystempercussion = alimenatarysystempercussion;
	}

	public String getAlimenatarysystemauscultation() {
		return alimenatarysystemauscultation;
	}

	public void setAlimenatarysystemauscultation(String alimenatarysystemauscultation) {
		this.alimenatarysystemauscultation = alimenatarysystemauscultation;
	}

	public String getNervoussysteminspection() {
		return nervoussysteminspection;
	}

	public void setNervoussysteminspection(String nervoussysteminspection) {
		this.nervoussysteminspection = nervoussysteminspection;
	}

	public String getNervoussystempalpitation() {
		return nervoussystempalpitation;
	}

	public void setNervoussystempalpitation(String nervoussystempalpitation) {
		this.nervoussystempalpitation = nervoussystempalpitation;
	}

	public String getNervoussystempercussion() {
		return nervoussystempercussion;
	}

	public void setNervoussystempercussion(String nervoussystempercussion) {
		this.nervoussystempercussion = nervoussystempercussion;
	}

	public String getNervoussystemauscultation() {
		return nervoussystemauscultation;
	}

	public void setNervoussystemauscultation(String nervoussystemauscultation) {
		this.nervoussystemauscultation = nervoussystemauscultation;
	}

	public String getOtherinspection() {
		return otherinspection;
	}

	public void setOtherinspection(String otherinspection) {
		this.otherinspection = otherinspection;
	}

	public String getOtherpalpitation() {
		return otherpalpitation;
	}

	public void setOtherpalpitation(String otherpalpitation) {
		this.otherpalpitation = otherpalpitation;
	}

	public String getOtherpercussion() {
		return otherpercussion;
	}

	public void setOtherpercussion(String otherpercussion) {
		this.otherpercussion = otherpercussion;
	}

	public String getOtherauscultation() {
		return otherauscultation;
	}

	public void setOtherauscultation(String otherauscultation) {
		this.otherauscultation = otherauscultation;
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

	@Override
	public String toString() {
		return "ExaminationDetails [patrefnum=" + patrefnum + ", decubitus=" + decubitus + ", decubitusdescription="
				+ decubitusdescription + ", facies=" + facies + ", faciesdescription=" + faciesdescription
				+ ", anaemia=" + anaemia + ", cyanosis=" + cyanosis + ", jaundice=" + jaundice + ", oedema=" + oedema
				+ ", clubbing=" + clubbing + ", nutrition=" + nutrition + ", height=" + height + ", weight=" + weight
				+ ", built=" + built + ", pulse=" + pulse + ", bp=" + bp + ", respiration=" + respiration
				+ ", neckvein=" + neckvein + ", neckgland=" + neckgland + ", temperature=" + temperature
				+ ", respiratorysysteminspection=" + respiratorysysteminspection + ", respiratorysystempalpitation="
				+ respiratorysystempalpitation + ", respiratorysystempercussion=" + respiratorysystempercussion
				+ ", respiratorysystemauscultation=" + respiratorysystemauscultation
				+ ", cardiovascularsysteminspection=" + cardiovascularsysteminspection
				+ ", cardiovascularsystempalpitation=" + cardiovascularsystempalpitation
				+ ", cardiovascularsystempercussion=" + cardiovascularsystempercussion
				+ ", cardiovascularsystemauscultation=" + cardiovascularsystemauscultation
				+ ", alimenatarysysteminspection=" + alimenatarysysteminspection + ", alimenatarysystempalpitation="
				+ alimenatarysystempalpitation + ", alimenatarysystempercussion=" + alimenatarysystempercussion
				+ ", alimenatarysystemauscultation=" + alimenatarysystemauscultation + ", nervoussysteminspection="
				+ nervoussysteminspection + ", nervoussystempalpitation=" + nervoussystempalpitation
				+ ", nervoussystempercussion=" + nervoussystempercussion + ", nervoussystemauscultation="
				+ nervoussystemauscultation + ", otherinspection=" + otherinspection + ", otherpalpitation="
				+ otherpalpitation + ", otherpercussion=" + otherpercussion + ", otherauscultation=" + otherauscultation
				+ ", createdby=" + createdby + ", updatedby=" + updatedby + ", _csrf=" + _csrf + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_csrf == null) ? 0 : _csrf.hashCode());
		result = prime * result
				+ ((alimenatarysystemauscultation == null) ? 0 : alimenatarysystemauscultation.hashCode());
		result = prime * result + ((alimenatarysysteminspection == null) ? 0 : alimenatarysysteminspection.hashCode());
		result = prime * result
				+ ((alimenatarysystempalpitation == null) ? 0 : alimenatarysystempalpitation.hashCode());
		result = prime * result + ((alimenatarysystempercussion == null) ? 0 : alimenatarysystempercussion.hashCode());
		result = prime * result + ((anaemia == null) ? 0 : anaemia.hashCode());
		result = prime * result + ((bp == null) ? 0 : bp.hashCode());
		result = prime * result + ((built == null) ? 0 : built.hashCode());
		result = prime * result
				+ ((cardiovascularsystemauscultation == null) ? 0 : cardiovascularsystemauscultation.hashCode());
		result = prime * result
				+ ((cardiovascularsysteminspection == null) ? 0 : cardiovascularsysteminspection.hashCode());
		result = prime * result
				+ ((cardiovascularsystempalpitation == null) ? 0 : cardiovascularsystempalpitation.hashCode());
		result = prime * result
				+ ((cardiovascularsystempercussion == null) ? 0 : cardiovascularsystempercussion.hashCode());
		result = prime * result + ((clubbing == null) ? 0 : clubbing.hashCode());
		result = prime * result + ((createdby == null) ? 0 : createdby.hashCode());
		result = prime * result + ((cyanosis == null) ? 0 : cyanosis.hashCode());
		result = prime * result + ((decubitus == null) ? 0 : decubitus.hashCode());
		result = prime * result + ((decubitusdescription == null) ? 0 : decubitusdescription.hashCode());
		result = prime * result + ((facies == null) ? 0 : facies.hashCode());
		result = prime * result + ((faciesdescription == null) ? 0 : faciesdescription.hashCode());
		result = prime * result + ((height == null) ? 0 : height.hashCode());
		result = prime * result + ((jaundice == null) ? 0 : jaundice.hashCode());
		result = prime * result + ((neckgland == null) ? 0 : neckgland.hashCode());
		result = prime * result + ((neckvein == null) ? 0 : neckvein.hashCode());
		result = prime * result + ((nervoussystemauscultation == null) ? 0 : nervoussystemauscultation.hashCode());
		result = prime * result + ((nervoussysteminspection == null) ? 0 : nervoussysteminspection.hashCode());
		result = prime * result + ((nervoussystempalpitation == null) ? 0 : nervoussystempalpitation.hashCode());
		result = prime * result + ((nervoussystempercussion == null) ? 0 : nervoussystempercussion.hashCode());
		result = prime * result + ((nutrition == null) ? 0 : nutrition.hashCode());
		result = prime * result + ((oedema == null) ? 0 : oedema.hashCode());
		result = prime * result + ((otherauscultation == null) ? 0 : otherauscultation.hashCode());
		result = prime * result + ((otherinspection == null) ? 0 : otherinspection.hashCode());
		result = prime * result + ((otherpalpitation == null) ? 0 : otherpalpitation.hashCode());
		result = prime * result + ((otherpercussion == null) ? 0 : otherpercussion.hashCode());
		result = prime * result + ((patrefnum == null) ? 0 : patrefnum.hashCode());
		result = prime * result + ((pulse == null) ? 0 : pulse.hashCode());
		result = prime * result + ((respiration == null) ? 0 : respiration.hashCode());
		result = prime * result
				+ ((respiratorysystemauscultation == null) ? 0 : respiratorysystemauscultation.hashCode());
		result = prime * result + ((respiratorysysteminspection == null) ? 0 : respiratorysysteminspection.hashCode());
		result = prime * result
				+ ((respiratorysystempalpitation == null) ? 0 : respiratorysystempalpitation.hashCode());
		result = prime * result + ((respiratorysystempercussion == null) ? 0 : respiratorysystempercussion.hashCode());
		result = prime * result + ((temperature == null) ? 0 : temperature.hashCode());
		result = prime * result + ((updatedby == null) ? 0 : updatedby.hashCode());
		result = prime * result + ((weight == null) ? 0 : weight.hashCode());
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
		ExaminationDetails other = (ExaminationDetails) obj;
		if (_csrf == null) {
			if (other._csrf != null)
				return false;
		} else if (!_csrf.equals(other._csrf))
			return false;
		if (alimenatarysystemauscultation == null) {
			if (other.alimenatarysystemauscultation != null)
				return false;
		} else if (!alimenatarysystemauscultation.equals(other.alimenatarysystemauscultation))
			return false;
		if (alimenatarysysteminspection == null) {
			if (other.alimenatarysysteminspection != null)
				return false;
		} else if (!alimenatarysysteminspection.equals(other.alimenatarysysteminspection))
			return false;
		if (alimenatarysystempalpitation == null) {
			if (other.alimenatarysystempalpitation != null)
				return false;
		} else if (!alimenatarysystempalpitation.equals(other.alimenatarysystempalpitation))
			return false;
		if (alimenatarysystempercussion == null) {
			if (other.alimenatarysystempercussion != null)
				return false;
		} else if (!alimenatarysystempercussion.equals(other.alimenatarysystempercussion))
			return false;
		if (anaemia == null) {
			if (other.anaemia != null)
				return false;
		} else if (!anaemia.equals(other.anaemia))
			return false;
		if (bp == null) {
			if (other.bp != null)
				return false;
		} else if (!bp.equals(other.bp))
			return false;
		if (built == null) {
			if (other.built != null)
				return false;
		} else if (!built.equals(other.built))
			return false;
		if (cardiovascularsystemauscultation == null) {
			if (other.cardiovascularsystemauscultation != null)
				return false;
		} else if (!cardiovascularsystemauscultation.equals(other.cardiovascularsystemauscultation))
			return false;
		if (cardiovascularsysteminspection == null) {
			if (other.cardiovascularsysteminspection != null)
				return false;
		} else if (!cardiovascularsysteminspection.equals(other.cardiovascularsysteminspection))
			return false;
		if (cardiovascularsystempalpitation == null) {
			if (other.cardiovascularsystempalpitation != null)
				return false;
		} else if (!cardiovascularsystempalpitation.equals(other.cardiovascularsystempalpitation))
			return false;
		if (cardiovascularsystempercussion == null) {
			if (other.cardiovascularsystempercussion != null)
				return false;
		} else if (!cardiovascularsystempercussion.equals(other.cardiovascularsystempercussion))
			return false;
		if (clubbing == null) {
			if (other.clubbing != null)
				return false;
		} else if (!clubbing.equals(other.clubbing))
			return false;
		if (createdby == null) {
			if (other.createdby != null)
				return false;
		} else if (!createdby.equals(other.createdby))
			return false;
		if (cyanosis == null) {
			if (other.cyanosis != null)
				return false;
		} else if (!cyanosis.equals(other.cyanosis))
			return false;
		if (decubitus == null) {
			if (other.decubitus != null)
				return false;
		} else if (!decubitus.equals(other.decubitus))
			return false;
		if (decubitusdescription == null) {
			if (other.decubitusdescription != null)
				return false;
		} else if (!decubitusdescription.equals(other.decubitusdescription))
			return false;
		if (facies == null) {
			if (other.facies != null)
				return false;
		} else if (!facies.equals(other.facies))
			return false;
		if (faciesdescription == null) {
			if (other.faciesdescription != null)
				return false;
		} else if (!faciesdescription.equals(other.faciesdescription))
			return false;
		if (height == null) {
			if (other.height != null)
				return false;
		} else if (!height.equals(other.height))
			return false;
		if (jaundice == null) {
			if (other.jaundice != null)
				return false;
		} else if (!jaundice.equals(other.jaundice))
			return false;
		if (neckgland == null) {
			if (other.neckgland != null)
				return false;
		} else if (!neckgland.equals(other.neckgland))
			return false;
		if (neckvein == null) {
			if (other.neckvein != null)
				return false;
		} else if (!neckvein.equals(other.neckvein))
			return false;
		if (nervoussystemauscultation == null) {
			if (other.nervoussystemauscultation != null)
				return false;
		} else if (!nervoussystemauscultation.equals(other.nervoussystemauscultation))
			return false;
		if (nervoussysteminspection == null) {
			if (other.nervoussysteminspection != null)
				return false;
		} else if (!nervoussysteminspection.equals(other.nervoussysteminspection))
			return false;
		if (nervoussystempalpitation == null) {
			if (other.nervoussystempalpitation != null)
				return false;
		} else if (!nervoussystempalpitation.equals(other.nervoussystempalpitation))
			return false;
		if (nervoussystempercussion == null) {
			if (other.nervoussystempercussion != null)
				return false;
		} else if (!nervoussystempercussion.equals(other.nervoussystempercussion))
			return false;
		if (nutrition == null) {
			if (other.nutrition != null)
				return false;
		} else if (!nutrition.equals(other.nutrition))
			return false;
		if (oedema == null) {
			if (other.oedema != null)
				return false;
		} else if (!oedema.equals(other.oedema))
			return false;
		if (otherauscultation == null) {
			if (other.otherauscultation != null)
				return false;
		} else if (!otherauscultation.equals(other.otherauscultation))
			return false;
		if (otherinspection == null) {
			if (other.otherinspection != null)
				return false;
		} else if (!otherinspection.equals(other.otherinspection))
			return false;
		if (otherpalpitation == null) {
			if (other.otherpalpitation != null)
				return false;
		} else if (!otherpalpitation.equals(other.otherpalpitation))
			return false;
		if (otherpercussion == null) {
			if (other.otherpercussion != null)
				return false;
		} else if (!otherpercussion.equals(other.otherpercussion))
			return false;
		if (patrefnum == null) {
			if (other.patrefnum != null)
				return false;
		} else if (!patrefnum.equals(other.patrefnum))
			return false;
		if (pulse == null) {
			if (other.pulse != null)
				return false;
		} else if (!pulse.equals(other.pulse))
			return false;
		if (respiration == null) {
			if (other.respiration != null)
				return false;
		} else if (!respiration.equals(other.respiration))
			return false;
		if (respiratorysystemauscultation == null) {
			if (other.respiratorysystemauscultation != null)
				return false;
		} else if (!respiratorysystemauscultation.equals(other.respiratorysystemauscultation))
			return false;
		if (respiratorysysteminspection == null) {
			if (other.respiratorysysteminspection != null)
				return false;
		} else if (!respiratorysysteminspection.equals(other.respiratorysysteminspection))
			return false;
		if (respiratorysystempalpitation == null) {
			if (other.respiratorysystempalpitation != null)
				return false;
		} else if (!respiratorysystempalpitation.equals(other.respiratorysystempalpitation))
			return false;
		if (respiratorysystempercussion == null) {
			if (other.respiratorysystempercussion != null)
				return false;
		} else if (!respiratorysystempercussion.equals(other.respiratorysystempercussion))
			return false;
		if (temperature == null) {
			if (other.temperature != null)
				return false;
		} else if (!temperature.equals(other.temperature))
			return false;
		if (updatedby == null) {
			if (other.updatedby != null)
				return false;
		} else if (!updatedby.equals(other.updatedby))
			return false;
		if (weight == null) {
			if (other.weight != null)
				return false;
		} else if (!weight.equals(other.weight))
			return false;
		return true;
	}

	
	
}