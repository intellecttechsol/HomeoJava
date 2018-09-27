package com.homeo.restws.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="PatPersonalHistory")
@XmlAccessorType(XmlAccessType.FIELD)
public class PatPersonalHistory  implements Serializable {

	private static final long serialVersionUID = -7058914161363815808L;

	 @XmlElement(name="patrefnum", required=true)
	private String patrefnum;
    
	 @XmlElement(name="accommodation") 
	private String accommodation;

	 @XmlElement(name="diet")
	private String diet;
	 
	 @XmlElement(name="maritalstatus")
		private String maritalstatus;
	 
	 @XmlElement(name="sexhabit")
		private String sexhabit;
	 
	 
	@XmlElement(name="sexsatisfaction")
		private String sexsatisfaction;
	 
	 @XmlElement(name="sexdesire")
	private String sexdesire;
	 
	 @XmlElement(name="ejaculation")
		private String ejaculation;
	 
	 @XmlElement(name="erection")
		private String erection;
	 
	 @XmlElement(name="ulcerationoverglancepenis")
		private String ulcerationoverglancepenis;
	 
	 @XmlElement(name="dischargeofpusfrompenis")
		private String dischargeofpusfrompenis;

	 @XmlElement(name="itchingeruptioninvagina")
		private String itchingeruptioninvagina;

	 @XmlElement(name="dysperunia")
		private String dysperunia;
	 
	 @XmlElement(name="drynessofvagina")
		private String drynessofvagina;
	 
	 @XmlElement(name="honeymooncystitis")
		private String honeymooncystitis;
	 
	 @XmlElement(name="abnormaldischargefromvagina")
		private String abnormaldischargefromvagina;

	public String getPatrefnum() {
		return patrefnum;
	}

	public void setPatrefnum(String patrefnum) {
		this.patrefnum = patrefnum;
	}

	public String getAccommodation() {
		return accommodation;
	}

	public void setAccommodation(String accommodation) {
		this.accommodation = accommodation;
	}

	public String getDiet() {
		return diet;
	}

	public void setDiet(String diet) {
		this.diet = diet;
	}

	public String getMaritalstatus() {
		return maritalstatus;
	}

	public void setMaritalstatus(String maritalstatus) {
		this.maritalstatus = maritalstatus;
	}

	public String getSexhabit() {
		return sexhabit;
	}

	public void setSexhabit(String sexhabit) {
		this.sexhabit = sexhabit;
	}

	public String getSexsatisfaction() {
		return sexsatisfaction;
	}

	public void setSexsatisfaction(String sexsatisfaction) {
		this.sexsatisfaction = sexsatisfaction;
	}

	public String getSexdesire() {
		return sexdesire;
	}

	public void setSexdesire(String sexdesire) {
		this.sexdesire = sexdesire;
	}

	public String getEjaculation() {
		return ejaculation;
	}

	public void setEjaculation(String ejaculation) {
		this.ejaculation = ejaculation;
	}

	public String getErection() {
		return erection;
	}

	public void setErection(String erection) {
		this.erection = erection;
	}

	public String getUlcerationoverglancepenis() {
		return ulcerationoverglancepenis;
	}

	public void setUlcerationoverglancepenis(String ulcerationoverglancepenis) {
		this.ulcerationoverglancepenis = ulcerationoverglancepenis;
	}

	public String getDischargeofpusfrompenis() {
		return dischargeofpusfrompenis;
	}

	public void setDischargeofpusfrompenis(String dischargeofpusfrompenis) {
		this.dischargeofpusfrompenis = dischargeofpusfrompenis;
	}

	public String getItchingeruptioninvagina() {
		return itchingeruptioninvagina;
	}

	public void setItchingeruptioninvagina(String itchingeruptioninvagina) {
		this.itchingeruptioninvagina = itchingeruptioninvagina;
	}

	public String getDysperunia() {
		return dysperunia;
	}

	public void setDysperunia(String dysperunia) {
		this.dysperunia = dysperunia;
	}

	public String getDrynessofvagina() {
		return drynessofvagina;
	}

	public void setDrynessofvagina(String drynessofvagina) {
		this.drynessofvagina = drynessofvagina;
	}

	public String getHoneymooncystitis() {
		return honeymooncystitis;
	}

	public void setHoneymooncystitis(String honeymooncystitis) {
		this.honeymooncystitis = honeymooncystitis;
	}

	public String getAbnormaldischargefromvagina() {
		return abnormaldischargefromvagina;
	}

	public void setAbnormaldischargefromvagina(String abnormaldischargefromvagina) {
		this.abnormaldischargefromvagina = abnormaldischargefromvagina;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((abnormaldischargefromvagina == null) ? 0 : abnormaldischargefromvagina.hashCode());
		result = prime * result + ((accommodation == null) ? 0 : accommodation.hashCode());
		result = prime * result + ((diet == null) ? 0 : diet.hashCode());
		result = prime * result + ((dischargeofpusfrompenis == null) ? 0 : dischargeofpusfrompenis.hashCode());
		result = prime * result + ((drynessofvagina == null) ? 0 : drynessofvagina.hashCode());
		result = prime * result + ((dysperunia == null) ? 0 : dysperunia.hashCode());
		result = prime * result + ((ejaculation == null) ? 0 : ejaculation.hashCode());
		result = prime * result + ((erection == null) ? 0 : erection.hashCode());
		result = prime * result + ((honeymooncystitis == null) ? 0 : honeymooncystitis.hashCode());
		result = prime * result + ((itchingeruptioninvagina == null) ? 0 : itchingeruptioninvagina.hashCode());
		result = prime * result + ((maritalstatus == null) ? 0 : maritalstatus.hashCode());
		result = prime * result + ((patrefnum == null) ? 0 : patrefnum.hashCode());
		result = prime * result + ((sexdesire == null) ? 0 : sexdesire.hashCode());
		result = prime * result + ((sexhabit == null) ? 0 : sexhabit.hashCode());
		result = prime * result + ((sexsatisfaction == null) ? 0 : sexsatisfaction.hashCode());
		result = prime * result + ((ulcerationoverglancepenis == null) ? 0 : ulcerationoverglancepenis.hashCode());
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
		PatPersonalHistory other = (PatPersonalHistory) obj;
		if (abnormaldischargefromvagina == null) {
			if (other.abnormaldischargefromvagina != null)
				return false;
		} else if (!abnormaldischargefromvagina.equals(other.abnormaldischargefromvagina))
			return false;
		if (accommodation == null) {
			if (other.accommodation != null)
				return false;
		} else if (!accommodation.equals(other.accommodation))
			return false;
		if (diet == null) {
			if (other.diet != null)
				return false;
		} else if (!diet.equals(other.diet))
			return false;
		if (dischargeofpusfrompenis == null) {
			if (other.dischargeofpusfrompenis != null)
				return false;
		} else if (!dischargeofpusfrompenis.equals(other.dischargeofpusfrompenis))
			return false;
		if (drynessofvagina == null) {
			if (other.drynessofvagina != null)
				return false;
		} else if (!drynessofvagina.equals(other.drynessofvagina))
			return false;
		if (dysperunia == null) {
			if (other.dysperunia != null)
				return false;
		} else if (!dysperunia.equals(other.dysperunia))
			return false;
		if (ejaculation == null) {
			if (other.ejaculation != null)
				return false;
		} else if (!ejaculation.equals(other.ejaculation))
			return false;
		if (erection == null) {
			if (other.erection != null)
				return false;
		} else if (!erection.equals(other.erection))
			return false;
		if (honeymooncystitis == null) {
			if (other.honeymooncystitis != null)
				return false;
		} else if (!honeymooncystitis.equals(other.honeymooncystitis))
			return false;
		if (itchingeruptioninvagina == null) {
			if (other.itchingeruptioninvagina != null)
				return false;
		} else if (!itchingeruptioninvagina.equals(other.itchingeruptioninvagina))
			return false;
		if (maritalstatus == null) {
			if (other.maritalstatus != null)
				return false;
		} else if (!maritalstatus.equals(other.maritalstatus))
			return false;
		if (patrefnum == null) {
			if (other.patrefnum != null)
				return false;
		} else if (!patrefnum.equals(other.patrefnum))
			return false;
		if (sexdesire == null) {
			if (other.sexdesire != null)
				return false;
		} else if (!sexdesire.equals(other.sexdesire))
			return false;
		if (sexhabit == null) {
			if (other.sexhabit != null)
				return false;
		} else if (!sexhabit.equals(other.sexhabit))
			return false;
		if (sexsatisfaction == null) {
			if (other.sexsatisfaction != null)
				return false;
		} else if (!sexsatisfaction.equals(other.sexsatisfaction))
			return false;
		if (ulcerationoverglancepenis == null) {
			if (other.ulcerationoverglancepenis != null)
				return false;
		} else if (!ulcerationoverglancepenis.equals(other.ulcerationoverglancepenis))
			return false;
		return true;
	}

	
}