package com.homeo.restws.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="PatParticularWrapper")
@XmlAccessorType(XmlAccessType.FIELD)
public class PatParticularWrapper  implements Serializable {

	private static final long serialVersionUID = -4644412441070439447L;

	@XmlElement(name="patrefnum")
	private String patrefnum;
	
	
	@XmlElement(name="vertigo")
	private String vertigo;
	
	
	@XmlElement(name="head")
	private String head;
	
	
	@XmlElement(name="eyevision")
	private String eyevision;
	
	
	@XmlElement(name="earhearing")
	private String earhearing;
	
	
	@XmlElement(name="nosesmell")
	private String nosesmell;
	
	
	@XmlElement(name="face")
	private String face;
	
	
	@XmlElement(name="mouth")
	private String mouth;
	
	
	@XmlElement(name="teeth")
	private String teeth;
	
	@XmlElement(name="tongue")
	private String tongue;
	
	@XmlElement(name="throattonsil")
	private String throattonsil;
	
	@XmlElement(name="stomach")
	private String stomach;
	
	@XmlElement(name="abdomen")
	private String abdomen;
	
	
	@XmlElement(name="bowelrectum")
	private String bowelrectum;
	
	@XmlElement(name="urinaryorgan")
	private String urinaryorgan;
	
	@XmlElement(name="genetalia")
	private String genetalia;
	
	@XmlElement(name="particularmale")
	private String particularmale;
	
	@XmlElement(name="particularfemale")
	private String particularfemale;
	
	@XmlElement(name="respiratory")
	private String respiratory;
	
	@XmlElement(name="chest")
	private String chest;
	
	@XmlElement(name="heart")
	private String heart;
	
	@XmlElement(name="neckback")
	private String neckback;
	
	@XmlElement(name="extremities")
	private String extremities;
	
	@XmlElement(name="fever")
	private String fever;
	
	@XmlElement(name="skin")
	private String skin;
	
	
	@XmlElement(name="createdby")
	private String createdby;

	@XmlElement(name="updatedby")
	private String updatedby;

	@XmlElement(name="_csrf")
	private String _csrf;

	public PatParticularWrapper() {
		super();
	}

	public String getPatrefnum() {
		return patrefnum;
	}

	public void setPatrefnum(String patrefnum) {
		this.patrefnum = patrefnum;
	}

	public String getVertigo() {
		return vertigo;
	}

	public void setVertigo(String vertigo) {
		this.vertigo = vertigo;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getEyevision() {
		return eyevision;
	}

	public void setEyevision(String eyevision) {
		this.eyevision = eyevision;
	}

	public String getEarhearing() {
		return earhearing;
	}

	public void setEarhearing(String earhearing) {
		this.earhearing = earhearing;
	}

	public String getNosesmell() {
		return nosesmell;
	}

	public void setNosesmell(String nosesmell) {
		this.nosesmell = nosesmell;
	}

	public String getFace() {
		return face;
	}

	public void setFace(String face) {
		this.face = face;
	}

	public String getMouth() {
		return mouth;
	}

	public void setMouth(String mouth) {
		this.mouth = mouth;
	}

	public String getTeeth() {
		return teeth;
	}

	public void setTeeth(String teeth) {
		this.teeth = teeth;
	}

	public String getTongue() {
		return tongue;
	}

	public void setTongue(String tongue) {
		this.tongue = tongue;
	}

	public String getThroattonsil() {
		return throattonsil;
	}

	public void setThroattonsil(String throattonsil) {
		this.throattonsil = throattonsil;
	}

	public String getStomach() {
		return stomach;
	}

	public void setStomach(String stomach) {
		this.stomach = stomach;
	}

	public String getAbdomen() {
		return abdomen;
	}

	public void setAbdomen(String abdomen) {
		this.abdomen = abdomen;
	}

	public String getBowelrectum() {
		return bowelrectum;
	}

	public void setBowelrectum(String bowelrectum) {
		this.bowelrectum = bowelrectum;
	}

	public String getUrinaryorgan() {
		return urinaryorgan;
	}

	public void setUrinaryorgan(String urinaryorgan) {
		this.urinaryorgan = urinaryorgan;
	}

	public String getGenetalia() {
		return genetalia;
	}

	public void setGenetalia(String genetalia) {
		this.genetalia = genetalia;
	}

	public String getParticularmale() {
		return particularmale;
	}

	public void setParticularmale(String particularmale) {
		this.particularmale = particularmale;
	}

	public String getParticularfemale() {
		return particularfemale;
	}

	public void setParticularfemale(String particularfemale) {
		this.particularfemale = particularfemale;
	}

	public String getRespiratory() {
		return respiratory;
	}

	public void setRespiratory(String respiratory) {
		this.respiratory = respiratory;
	}

	public String getChest() {
		return chest;
	}

	public void setChest(String chest) {
		this.chest = chest;
	}

	public String getHeart() {
		return heart;
	}

	public void setHeart(String heart) {
		this.heart = heart;
	}

	public String getNeckback() {
		return neckback;
	}

	public void setNeckback(String neckback) {
		this.neckback = neckback;
	}

	public String getExtremities() {
		return extremities;
	}

	public void setExtremities(String extremities) {
		this.extremities = extremities;
	}

	public String getFever() {
		return fever;
	}

	public void setFever(String fever) {
		this.fever = fever;
	}

	public String getSkin() {
		return skin;
	}

	public void setSkin(String skin) {
		this.skin = skin;
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
		return "PatParticularWrapper [patrefnum=" + patrefnum + ", vertigo=" + vertigo + ", head=" + head
				+ ", eyevision=" + eyevision + ", earhearing=" + earhearing + ", nosesmell=" + nosesmell + ", face="
				+ face + ", mouth=" + mouth + ", teeth=" + teeth + ", tongue=" + tongue + ", throattonsil="
				+ throattonsil + ", stomach=" + stomach + ", abdomen=" + abdomen + ", bowelrectum=" + bowelrectum
				+ ", urinaryorgan=" + urinaryorgan + ", genetalia=" + genetalia + ", particularmale=" + particularmale
				+ ", particularfemale=" + particularfemale + ", respiratory=" + respiratory + ", chest=" + chest
				+ ", heart=" + heart + ", neckback=" + neckback + ", extremities=" + extremities + ", fever=" + fever
				+ ", skin=" + skin + ", createdby=" + createdby + ", updatedby=" + updatedby + ", _csrf=" + _csrf + "]";
	}

	
	
	
}