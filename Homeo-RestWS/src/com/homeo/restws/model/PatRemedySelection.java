package com.homeo.restws.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="PatRemedySelection")
@XmlAccessorType(XmlAccessType.FIELD)
public class PatRemedySelection  implements Serializable {

	private static final long serialVersionUID = -7058914161363815808L;

	 @XmlElement(name="patrefnum", required=true)
	private String patrefnum;
    
	 @XmlElement(name="findCharacteristics") 
	private String findCharacteristics;
	
	@XmlElement(name="evaluationSympt") 
	private String evaluationSympt;

	 	@XmlElement(name="caseAnalysis")
	private String caseAnalysis;
	 
	 @XmlElement(name="repertorisation")
		private String repertorisation;
	 
	 @XmlElement(name="finalRemedySel")
		private String finalRemedySel;
	 
	 
	 @XmlElement(name="createdby")
		private String createdby;
	 
	 @XmlElement(name="updatedby")
		private String updatedby;
	 
	 @XmlElement(name="_csrf")
		private String _csrf;

	public String get_csrf() {
		return _csrf;
	}

	public void set_csrf(String _csrf) {
		this._csrf = _csrf;
	}

	public String getPatrefnum() {
		return patrefnum;
	}

	public void setPatrefnum(String patrefnum) {
		this.patrefnum = patrefnum;
	}

	public String getFindCharacteristics() {
		return findCharacteristics;
	}

	public void setFindCharacteristics(String findCharacteristics) {
		this.findCharacteristics = findCharacteristics;
	}
	
	public String getEvaluationSympt() {
		return evaluationSympt;
	}

	public void setEvaluationSympt(String evaluationSympt) {
		this.evaluationSympt = evaluationSympt;
	}

	public String getCaseAnalysis() {
		return caseAnalysis;
	}

	public void setCaseAnalysis(String caseAnalysis) {
		this.caseAnalysis = caseAnalysis;
	}

	public String getRepertorisation() {
		return repertorisation;
	}

	public void setRepertorisation(String repertorisation) {
		this.repertorisation = repertorisation;
	}

	public String getFinalRemedySel() {
		return finalRemedySel;
	}

	public void setFinalRemedySel(String finalRemedySel) {
		this.finalRemedySel = finalRemedySel;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "PatRemedySelection [patrefnum=" + patrefnum + ", findCharacteristics=" + findCharacteristics
				+ ", evaluationSympt=" + evaluationSympt + ", caseAnalysis=" + caseAnalysis + ", repertorisation="
				+ repertorisation + ", finalRemedySel=" + finalRemedySel + ", createdby=" + createdby + ", updatedby="
				+ updatedby + ", _csrf=" + _csrf + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((caseAnalysis == null) ? 0 : caseAnalysis.hashCode());
		result = prime * result + ((createdby == null) ? 0 : createdby.hashCode());
		result = prime * result + ((finalRemedySel == null) ? 0 : finalRemedySel.hashCode());
		result = prime * result + ((findCharacteristics == null) ? 0 : findCharacteristics.hashCode());
		result = prime * result + ((patrefnum == null) ? 0 : patrefnum.hashCode());
		result = prime * result + ((repertorisation == null) ? 0 : repertorisation.hashCode());
		result = prime * result + ((updatedby == null) ? 0 : updatedby.hashCode());
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
		PatRemedySelection other = (PatRemedySelection) obj;
		if (caseAnalysis == null) {
			if (other.caseAnalysis != null)
				return false;
		} else if (!caseAnalysis.equals(other.caseAnalysis))
			return false;
		if (createdby == null) {
			if (other.createdby != null)
				return false;
		} else if (!createdby.equals(other.createdby))
			return false;
		if (finalRemedySel == null) {
			if (other.finalRemedySel != null)
				return false;
		} else if (!finalRemedySel.equals(other.finalRemedySel))
			return false;
		if (findCharacteristics == null) {
			if (other.findCharacteristics != null)
				return false;
		} else if (!findCharacteristics.equals(other.findCharacteristics))
			return false;
		if (patrefnum == null) {
			if (other.patrefnum != null)
				return false;
		} else if (!patrefnum.equals(other.patrefnum))
			return false;
		if (repertorisation == null) {
			if (other.repertorisation != null)
				return false;
		} else if (!repertorisation.equals(other.repertorisation))
			return false;
		if (updatedby == null) {
			if (other.updatedby != null)
				return false;
		} else if (!updatedby.equals(other.updatedby))
			return false;
		return true;
	}

		

}