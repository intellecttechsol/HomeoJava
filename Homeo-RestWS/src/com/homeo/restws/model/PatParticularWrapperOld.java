package com.homeo.restws.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="PatParticularWrapperOld")
@XmlAccessorType(XmlAccessType.FIELD)
public class PatParticularWrapperOld  implements Serializable {

	private static final long serialVersionUID = -4644412441070439447L;

	@XmlElement(name="patrefnum")
	private String patrefnum;

	@XmlElement(name="particularList")
	private List<PatParticular> particularList=new ArrayList<PatParticular>();
	
	@XmlElement(name="createdby")
	private String createdby;

	@XmlElement(name="updatedby")
	private String updatedby;

	@XmlElement(name="_csrf")
	private String _csrf;

	public PatParticularWrapperOld() {
		super();
	}

	public String getPatrefnum() {
		return patrefnum;
	}

	public void setPatrefnum(String patrefnum) {
		this.patrefnum = patrefnum;
	}

	public List<PatParticular> getParticularList() {
		return particularList;
	}

	public void setParticularList(List<PatParticular> particularList) {
		this.particularList = particularList;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_csrf == null) ? 0 : _csrf.hashCode());
		result = prime * result + ((createdby == null) ? 0 : createdby.hashCode());
		result = prime * result + ((particularList == null) ? 0 : particularList.hashCode());
		result = prime * result + ((patrefnum == null) ? 0 : patrefnum.hashCode());
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
		PatParticularWrapperOld other = (PatParticularWrapperOld) obj;
		if (_csrf == null) {
			if (other._csrf != null)
				return false;
		} else if (!_csrf.equals(other._csrf))
			return false;
		if (createdby == null) {
			if (other.createdby != null)
				return false;
		} else if (!createdby.equals(other.createdby))
			return false;
		if (particularList == null) {
			if (other.particularList != null)
				return false;
		} else if (!particularList.equals(other.particularList))
			return false;
		if (patrefnum == null) {
			if (other.patrefnum != null)
				return false;
		} else if (!patrefnum.equals(other.patrefnum))
			return false;
		if (updatedby == null) {
			if (other.updatedby != null)
				return false;
		} else if (!updatedby.equals(other.updatedby))
			return false;
		return true;
	}

	
}