package com.homeo.restws.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="HomeoGeneralities")
@XmlAccessorType(XmlAccessType.FIELD)
public class HomeoGeneralities  implements Serializable {

	private static final long serialVersionUID = -7058914161363815808L;

	 @XmlElement(name="sessionid", required=true)
	 private String sessionid;
    
	 @XmlElement(name="patrefnum")
	 private String patrefnum;
	 
	//Basics
	 @XmlElement(name="desire1")
		private String desire1;
	 
	 @XmlElement(name="desireTaste")
		private String desireTaste;
	 
	 @XmlElement(name="desire2")
		private String desire2;
	 
	 @XmlElement(name="desire3")
		private String desire3;
	 
	 @XmlElement(name="extraSalt")
		private String extraSalt;
	 
	 @XmlElement(name="milk")
		private String milk;
	 
	 @XmlElement(name="iceCream")
		private String iceCream;
	 
	 @XmlElement(name="coldDrink")
		private String coldDrink;
	 
	 @XmlElement(name="chocolate")
		private String chocolate;
	 
	 @XmlElement(name="fattyfood")
		private String fattyfood;
	 
	 @XmlElement(name="indigestableThing")
		private String indigestableThing;
	 
	 @XmlElement(name="aversion")
		private String aversion;
	 
	 public String getAversion() {
		return aversion;
	}

	public void setAversion(String aversion) {
		this.aversion = aversion;
	}

	@XmlElement(name="intolerance")
		private String intolerance;

		
	 @XmlElement(name="appetite")
		private String appetite;
	 
	 @XmlElement(name="appetiteTolerance")
		private String appetiteTolerance;
	 
	 @XmlElement(name="reactiontoheatncold")
		private String reactiontoheatncold;
	 
	 @XmlElement(name="worseweatherreaction")
		private String worseweatherreaction;
	 
	 @XmlElement(name="betterweatherreaction")
		private String betterweatherreaction;
	 
	 @XmlElement(name="hypersusceptibility")
		private String hypersusceptibility;
 
	 @XmlElement(name="thirst")
		private String thirst;
	 
	 @XmlElement(name="preferredwater")
		private String preferredwater;
	 
	 @XmlElement(name="sleep")
		private String sleep;
	 
	 @XmlElement(name="positionofsleep")
		private String positionofsleep;
	 
	 @XmlElement(name="dream")
		private String dream;
		 

	 //Stool
	 @XmlElement(name="stoolconsistency")
		private String stoolconsistency;
	 
	 public String getDesire1() {
		return desire1;
	}

	public void setDesire1(String desire1) {
		this.desire1 = desire1;
	}

	public String getDesireTaste() {
		return desireTaste;
	}

	public void setDesireTaste(String desireTaste) {
		this.desireTaste = desireTaste;
	}

	public String getDesire2() {
		return desire2;
	}

	public void setDesire2(String desire2) {
		this.desire2 = desire2;
	}

	public String getDesire3() {
		return desire3;
	}

	public void setDesire3(String desire3) {
		this.desire3 = desire3;
	}

	public String getExtraSalt() {
		return extraSalt;
	}

	public void setExtraSalt(String extraSalt) {
		this.extraSalt = extraSalt;
	}

	public String getMilk() {
		return milk;
	}

	public void setMilk(String milk) {
		this.milk = milk;
	}

	public String getIceCream() {
		return iceCream;
	}

	public void setIceCream(String iceCream) {
		this.iceCream = iceCream;
	}

	public String getColdDrink() {
		return coldDrink;
	}

	public void setColdDrink(String coldDrink) {
		this.coldDrink = coldDrink;
	}

	public String getChocolate() {
		return chocolate;
	}

	public void setChocolate(String chocolate) {
		this.chocolate = chocolate;
	}

	public String getFattyfood() {
		return fattyfood;
	}

	public void setFattyfood(String fattyfood) {
		this.fattyfood = fattyfood;
	}

	public String getIndigestableThing() {
		return indigestableThing;
	}

	public void setIndigestableThing(String indigestableThing) {
		this.indigestableThing = indigestableThing;
	}

	public String getIntolerance() {
		return intolerance;
	}

	public void setIntolerance(String intolerance) {
		this.intolerance = intolerance;
	}

	public String getAppetite() {
		return appetite;
	}

	public void setAppetite(String appetite) {
		this.appetite = appetite;
	}

	public String getAppetiteTolerance() {
		return appetiteTolerance;
	}

	public void setAppetiteTolerance(String appetiteTolerance) {
		this.appetiteTolerance = appetiteTolerance;
	}

	public String getReactiontoheatncold() {
		return reactiontoheatncold;
	}

	public void setReactiontoheatncold(String reactiontoheatncold) {
		this.reactiontoheatncold = reactiontoheatncold;
	}

	public String getWorseweatherreaction() {
		return worseweatherreaction;
	}

	public void setWorseweatherreaction(String worseweatherreaction) {
		this.worseweatherreaction = worseweatherreaction;
	}

	public String getBetterweatherreaction() {
		return betterweatherreaction;
	}

	public void setBetterweatherreaction(String betterweatherreaction) {
		this.betterweatherreaction = betterweatherreaction;
	}

	public String getHypersusceptibility() {
		return hypersusceptibility;
	}

	public void setHypersusceptibility(String hypersusceptibility) {
		this.hypersusceptibility = hypersusceptibility;
	}

	public String getThirst() {
		return thirst;
	}

	public void setThirst(String thirst) {
		this.thirst = thirst;
	}

	public String getPreferredwater() {
		return preferredwater;
	}

	public void setPreferredwater(String preferredwater) {
		this.preferredwater = preferredwater;
	}

	public String getSleep() {
		return sleep;
	}

	public void setSleep(String sleep) {
		this.sleep = sleep;
	}

	public String getPositionofsleep() {
		return positionofsleep;
	}

	public void setPositionofsleep(String positionofsleep) {
		this.positionofsleep = positionofsleep;
	}

	public String getDream() {
		return dream;
	}

	public void setDream(String dream) {
		this.dream = dream;
	}

	@XmlElement(name="stooltolerance")
		private String stooltolerance;
	 
	 @XmlElement(name="stoolineffectualurging")
		private String stoolineffectualurging;
	 
	 @XmlElement(name="stoolmucous")
		private String stoolmucous;
	 
	 @XmlElement(name="stoolbleeding")
		private String stoolbleeding;
	 
	 @XmlElement(name="stoolregularity")
		private String stoolregularity;
	 
	 @XmlElement(name="stoolpain")
		private String stoolpain;
	 
	 @XmlElement(name="stoolcolour")
		private String stoolcolour;
	 
	 @XmlElement(name="stooloffensiveness")
		private String stooloffensiveness;
	 
	 @XmlElement(name="stoolsatisfaction")
		private String stoolsatisfaction;
	 
	 @XmlElement(name="stoolfrequency")
		private String stoolfrequency;
	 
	 @XmlElement(name="stooltiming")
		private String stooltiming;

	 
	//Urine
	 @XmlElement(name="urinefrequency")
		private String urinefrequency;
	 
	 @XmlElement(name="burningurination")
		private String burningurination;
	 
	 @XmlElement(name="urinetolerance")
		private String urinetolerance;
	 
	 @XmlElement(name="urinestream")
		private String urinestream;
	 
	 @XmlElement(name="urineflow")
		private String urineflow;
	 
	 @XmlElement(name="urinepain")
		private String urinepain;
	 
	 @XmlElement(name="urinecharacterofpain")
		private String urinecharacterofpain;
	 
	 @XmlElement(name="urinebleeding")
		private String urinebleeding;
	 
	 @XmlElement(name="urinepus")
		private String urinepus;
	 
	 @XmlElement(name="urineodour")
		private String urineodour;
	 
	 
	//Sweat
	 @XmlElement(name="sweatquantity")
		private String sweatquantity;
	 
	 @XmlElement(name="sweatbodypart")
		private String sweatbodypart;
	 
	 @XmlElement(name="sweatoffensiveodour")
		private String sweatoffensiveodour;
	 
	 @XmlElement(name="sweatstain")
		private String sweatstain;
	 
	 @XmlElement(name="sweatweakness")
		private String sweatweakness;
	 
	@XmlElement(name="sweatrelief")
		private String sweatrelief;
	
	
	//Menstruaction
	 @XmlElement(name="menstruationmenarche")
		private String menstruationmenarche;
	 
	 @XmlElement(name="menstruationcycle")
		private String menstruationcycle;
	 
	 @XmlElement(name="menstruationfrequency")
		private String menstruationfrequency;
	 
	 @XmlElement(name="menstruationduration")
		private String menstruationduration;
	 
	 @XmlElement(name="menstruationtypeofflow")
		private String menstruationtypeofflow;
	 
	 @XmlElement(name="menstruationpain")
		private String menstruationpain;
	 
	 @XmlElement(name="menstruationclot")
		private String menstruationclot;
	 
	 @XmlElement(name="menstruationclotcolour")
		private String menstruationclotcolour;
	 
	 @XmlElement(name="menstruationcolourofflow")
		private String menstruationcolourofflow;
	 
	 @XmlElement(name="menstruationodour")
		private String menstruationodour;
	 
	 @XmlElement(name="menstrucomplaintsincedate")
		private String menstrucomplaintsincedate;
	 
	 @XmlElement(name="menstruationagemenopause")
		private String menstruationagemenopause;
	 
	 @XmlElement(name="menstruationleucorrhoea")
		private String menstruationleucorrhoea;
	 
	 @XmlElement(name="menstruleucorrhconsistency")
		private String menstruleucorrhconsistency;
	 
	 @XmlElement(name="menstruleucorrhcolour")
		private String menstruleucorrhcolour;
	 
	 @XmlElement(name="menstruleucorrhitching")
		private String menstruleucorrhitching;
	 
	 @XmlElement(name="menstruleucorrhexcoriation")
		private String menstruleucorrhexcoriation;
	 
	 @XmlElement(name="menstruleucorrhsmell")
		private String menstruleucorrhsmell;
	 
	 
	//Physical
	 @XmlElement(name="phygenleucorrhoea")
		private String phygenleucorrhoea;
	 
	 @XmlElement(name="phygenconsistency")
		private String phygenconsistency;
	 
	 @XmlElement(name="phygencolour")
		private String phygencolour;
	 
	 @XmlElement(name="phygenitching")
		private String phygenitching;
	 
	 @XmlElement(name="phygenexcoriation")
		private String phygenexcoriation;
	 
	 @XmlElement(name="phygensmell")
		private String phygensmell;
	 
	 @XmlElement(name="phygenalternation")
		private String phygenalternation;
	 
	 @XmlElement(name="phygensidesofbody")
		private String phygensidesofbody;
	 
	 @XmlElement(name="phygenperiodicity")
		private String phygenperiodicity;
	 
	 @XmlElement(name="phygengeneralmodality")
		private String phygengeneralmodality;
	 
	 @XmlElement(name="phygenconstitution")
		private String phygenconstitution;
	 
	 @XmlElement(name="phygenothergeneral")
		private String phygenothergeneral;
	 
	 @XmlElement(name="phygencharacterstics")
		private String phygencharacterstics;
	 
	
	 //Mental
	 @XmlElement(name="mengencompany")
		private String mengencompany;
	 
	 @XmlElement(name="mengengrief")
		private String mengengrief;
	 
	 @XmlElement(name="mengengriefdesc")
		private String mengengriefdesc;
	 
	 @XmlElement(name="mengendislove")
		private String mengendislove;
	 
	 @XmlElement(name="mengendislovedesc")
		private String mengendislovedesc;
	 
	 @XmlElement(name="mengendindignation")
		private String mengendindignation;
	 
	 @XmlElement(name="mengendindignationdesc")
		private String mengendindignationdesc;
	 
	 @XmlElement(name="mengenconsolation")
		private String mengenconsolation;
	 
	 @XmlElement(name="mengencontradiction")
		private String mengencontradiction;
	 
	 @XmlElement(name="mengenanger")
		private String mengenanger;
	 
	 @XmlElement(name="mengenangerdesc")
		private String mengenangerdesc;
	 
	 @XmlElement(name="mengenanimal")
		private String mengenanimal;
	 
	 @XmlElement(name="mengenfastideousness")
		private String mengenfastideousness;
 
	 @XmlElement(name="mengenmisery")
		private String mengenmisery;
	 
	 @XmlElement(name="mengenweepingdisposition")
		private String mengenweepingdisposition;
	 

	 
	public String getPhygenleucorrhoea() {
		return phygenleucorrhoea;
	}

	public void setPhygenleucorrhoea(String phygenleucorrhoea) {
		this.phygenleucorrhoea = phygenleucorrhoea;
	}

	public String getPhygenconsistency() {
		return phygenconsistency;
	}

	public void setPhygenconsistency(String phygenconsistency) {
		this.phygenconsistency = phygenconsistency;
	}

	public String getPhygencolour() {
		return phygencolour;
	}

	public void setPhygencolour(String phygencolour) {
		this.phygencolour = phygencolour;
	}

	public String getPhygenitching() {
		return phygenitching;
	}

	public void setPhygenitching(String phygenitching) {
		this.phygenitching = phygenitching;
	}

	public String getPhygenexcoriation() {
		return phygenexcoriation;
	}

	public void setPhygenexcoriation(String phygenexcoriation) {
		this.phygenexcoriation = phygenexcoriation;
	}

	public String getPhygensmell() {
		return phygensmell;
	}

	public void setPhygensmell(String phygensmell) {
		this.phygensmell = phygensmell;
	}

	public String getPhygenalternation() {
		return phygenalternation;
	}

	public void setPhygenalternation(String phygenalternation) {
		this.phygenalternation = phygenalternation;
	}

	public String getPhygensidesofbody() {
		return phygensidesofbody;
	}

	public void setPhygensidesofbody(String phygensidesofbody) {
		this.phygensidesofbody = phygensidesofbody;
	}

	public String getPhygenperiodicity() {
		return phygenperiodicity;
	}

	public void setPhygenperiodicity(String phygenperiodicity) {
		this.phygenperiodicity = phygenperiodicity;
	}

	public String getPhygengeneralmodality() {
		return phygengeneralmodality;
	}

	public void setPhygengeneralmodality(String phygengeneralmodality) {
		this.phygengeneralmodality = phygengeneralmodality;
	}

	public String getPhygenconstitution() {
		return phygenconstitution;
	}

	public void setPhygenconstitution(String phygenconstitution) {
		this.phygenconstitution = phygenconstitution;
	}

	public String getPhygenothergeneral() {
		return phygenothergeneral;
	}

	public void setPhygenothergeneral(String phygenothergeneral) {
		this.phygenothergeneral = phygenothergeneral;
	}

	public String getPhygencharacterstics() {
		return phygencharacterstics;
	}

	public void setPhygencharacterstics(String phygencharacterstics) {
		this.phygencharacterstics = phygencharacterstics;
	}

	public String getMengencompany() {
		return mengencompany;
	}

	public void setMengencompany(String mengencompany) {
		this.mengencompany = mengencompany;
	}

	public String getMengengrief() {
		return mengengrief;
	}

	public void setMengengrief(String mengengrief) {
		this.mengengrief = mengengrief;
	}

	public String getMengengriefdesc() {
		return mengengriefdesc;
	}

	public void setMengengriefdesc(String mengengriefdesc) {
		this.mengengriefdesc = mengengriefdesc;
	}

	public String getMengendislove() {
		return mengendislove;
	}

	public void setMengendislove(String mengendislove) {
		this.mengendislove = mengendislove;
	}

	public String getMengendislovedesc() {
		return mengendislovedesc;
	}

	public void setMengendislovedesc(String mengendislovedesc) {
		this.mengendislovedesc = mengendislovedesc;
	}

	public String getMengendindignation() {
		return mengendindignation;
	}

	public void setMengendindignation(String mengendindignation) {
		this.mengendindignation = mengendindignation;
	}

	public String getMengendindignationdesc() {
		return mengendindignationdesc;
	}

	public void setMengendindignationdesc(String mengendindignationdesc) {
		this.mengendindignationdesc = mengendindignationdesc;
	}

	public String getMengenconsolation() {
		return mengenconsolation;
	}

	public void setMengenconsolation(String mengenconsolation) {
		this.mengenconsolation = mengenconsolation;
	}

	public String getMengencontradiction() {
		return mengencontradiction;
	}

	public void setMengencontradiction(String mengencontradiction) {
		this.mengencontradiction = mengencontradiction;
	}

	public String getMengenanger() {
		return mengenanger;
	}

	public void setMengenanger(String mengenanger) {
		this.mengenanger = mengenanger;
	}

	public String getMengenangerdesc() {
		return mengenangerdesc;
	}

	public void setMengenangerdesc(String mengenangerdesc) {
		this.mengenangerdesc = mengenangerdesc;
	}

	public String getMengenanimal() {
		return mengenanimal;
	}

	public void setMengenanimal(String mengenanimal) {
		this.mengenanimal = mengenanimal;
	}

	public String getMengenfastideousness() {
		return mengenfastideousness;
	}

	public void setMengenfastideousness(String mengenfastideousness) {
		this.mengenfastideousness = mengenfastideousness;
	}

	public String getMengenmisery() {
		return mengenmisery;
	}

	public void setMengenmisery(String mengenmisery) {
		this.mengenmisery = mengenmisery;
	}

	public String getMengenweepingdisposition() {
		return mengenweepingdisposition;
	}

	public void setMengenweepingdisposition(String mengenweepingdisposition) {
		this.mengenweepingdisposition = mengenweepingdisposition;
	}

	public String getMenstruationmenarche() {
		return menstruationmenarche;
	}

	public void setMenstruationmenarche(String menstruationmenarche) {
		this.menstruationmenarche = menstruationmenarche;
	}

	public String getMenstruationcycle() {
		return menstruationcycle;
	}

	public void setMenstruationcycle(String menstruationcycle) {
		this.menstruationcycle = menstruationcycle;
	}

	public String getMenstruationfrequency() {
		return menstruationfrequency;
	}

	public void setMenstruationfrequency(String menstruationfrequency) {
		this.menstruationfrequency = menstruationfrequency;
	}

	public String getMenstruationduration() {
		return menstruationduration;
	}

	public void setMenstruationduration(String menstruationduration) {
		this.menstruationduration = menstruationduration;
	}

	public String getMenstruationtypeofflow() {
		return menstruationtypeofflow;
	}

	public void setMenstruationtypeofflow(String menstruationtypeofflow) {
		this.menstruationtypeofflow = menstruationtypeofflow;
	}

	public String getMenstruationpain() {
		return menstruationpain;
	}

	public void setMenstruationpain(String menstruationpain) {
		this.menstruationpain = menstruationpain;
	}

	public String getMenstruationclot() {
		return menstruationclot;
	}

	public void setMenstruationclot(String menstruationclot) {
		this.menstruationclot = menstruationclot;
	}

	public String getMenstruationclotcolour() {
		return menstruationclotcolour;
	}

	public void setMenstruationclotcolour(String menstruationclotcolour) {
		this.menstruationclotcolour = menstruationclotcolour;
	}

	public String getMenstruationcolourofflow() {
		return menstruationcolourofflow;
	}

	public void setMenstruationcolourofflow(String menstruationcolourofflow) {
		this.menstruationcolourofflow = menstruationcolourofflow;
	}

	public String getMenstruationodour() {
		return menstruationodour;
	}

	public void setMenstruationodour(String menstruationodour) {
		this.menstruationodour = menstruationodour;
	}

	public String getMenstrucomplaintsincedate() {
		return menstrucomplaintsincedate;
	}

	public void setMenstrucomplaintsincedate(String menstrucomplaintsincedate) {
		this.menstrucomplaintsincedate = menstrucomplaintsincedate;
	}

	public String getMenstruationagemenopause() {
		return menstruationagemenopause;
	}

	public void setMenstruationagemenopause(String menstruationagemenopause) {
		this.menstruationagemenopause = menstruationagemenopause;
	}

	public String getMenstruationleucorrhoea() {
		return menstruationleucorrhoea;
	}

	public void setMenstruationleucorrhoea(String menstruationleucorrhoea) {
		this.menstruationleucorrhoea = menstruationleucorrhoea;
	}

	public String getMenstruleucorrhconsistency() {
		return menstruleucorrhconsistency;
	}

	public void setMenstruleucorrhconsistency(String menstruleucorrhconsistency) {
		this.menstruleucorrhconsistency = menstruleucorrhconsistency;
	}

	public String getMenstruleucorrhcolour() {
		return menstruleucorrhcolour;
	}

	public void setMenstruleucorrhcolour(String menstruleucorrhcolour) {
		this.menstruleucorrhcolour = menstruleucorrhcolour;
	}

	public String getMenstruleucorrhitching() {
		return menstruleucorrhitching;
	}

	public void setMenstruleucorrhitching(String menstruleucorrhitching) {
		this.menstruleucorrhitching = menstruleucorrhitching;
	}

	public String getMenstruleucorrhexcoriation() {
		return menstruleucorrhexcoriation;
	}

	public void setMenstruleucorrhexcoriation(String menstruleucorrhexcoriation) {
		this.menstruleucorrhexcoriation = menstruleucorrhexcoriation;
	}

	public String getMenstruleucorrhsmell() {
		return menstruleucorrhsmell;
	}

	public void setMenstruleucorrhsmell(String menstruleucorrhsmell) {
		this.menstruleucorrhsmell = menstruleucorrhsmell;
	}

	public String getSweatquantity() {
		return sweatquantity;
	}

	public void setSweatquantity(String sweatquantity) {
		this.sweatquantity = sweatquantity;
	}

	public String getSweatbodypart() {
		return sweatbodypart;
	}

	public void setSweatbodypart(String sweatbodypart) {
		this.sweatbodypart = sweatbodypart;
	}

	public String getSweatoffensiveodour() {
		return sweatoffensiveodour;
	}

	public void setSweatoffensiveodour(String sweatoffensiveodour) {
		this.sweatoffensiveodour = sweatoffensiveodour;
	}

	public String getSweatstain() {
		return sweatstain;
	}

	public void setSweatstain(String sweatstain) {
		this.sweatstain = sweatstain;
	}

	public String getSweatweakness() {
		return sweatweakness;
	}

	public void setSweatweakness(String sweatweakness) {
		this.sweatweakness = sweatweakness;
	}

	 public String getSweatrelief() {
			return sweatrelief;
		}

		public void setSweatrelief(String sweatrelief) {
			this.sweatrelief = sweatrelief;
		}
		
	public String getUrinefrequency() {
		return urinefrequency;
	}

	public void setUrinefrequency(String urinefrequency) {
		this.urinefrequency = urinefrequency;
	}

	public String getBurningurination() {
		return burningurination;
	}

	public void setBurningurination(String burningurination) {
		this.burningurination = burningurination;
	}

	public String getUrinetolerance() {
		return urinetolerance;
	}

	public void setUrinetolerance(String urinetolerance) {
		this.urinetolerance = urinetolerance;
	}

	public String getUrinestream() {
		return urinestream;
	}

	public void setUrinestream(String urinestream) {
		this.urinestream = urinestream;
	}

	public String getUrineflow() {
		return urineflow;
	}

	public void setUrineflow(String urineflow) {
		this.urineflow = urineflow;
	}

	public String getUrinepain() {
		return urinepain;
	}

	public void setUrinepain(String urinepain) {
		this.urinepain = urinepain;
	}

	public String getUrinecharacterofpain() {
		return urinecharacterofpain;
	}

	public void setUrinecharacterofpain(String urinecharacterofpain) {
		this.urinecharacterofpain = urinecharacterofpain;
	}

	public String getUrinebleeding() {
		return urinebleeding;
	}

	public void setUrinebleeding(String urinebleeding) {
		this.urinebleeding = urinebleeding;
	}

	public String getUrinepus() {
		return urinepus;
	}

	public void setUrinepus(String urinepus) {
		this.urinepus = urinepus;
	}

	public String getUrineodour() {
		return urineodour;
	}

	public void setUrineodour(String urineodour) {
		this.urineodour = urineodour;
	}

	public String getSessionid() {
		return sessionid;
	}

	public void setSessionid(String sessionid) {
		this.sessionid = sessionid;
	}

	public String getPatrefnum() {
		return patrefnum;
	}

	public void setPatrefnum(String patrefnum) {
		this.patrefnum = patrefnum;
	}

	public String getStoolconsistency() {
		return stoolconsistency;
	}

	public void setStoolconsistency(String stoolconsistency) {
		this.stoolconsistency = stoolconsistency;
	}

	public String getStooltolerance() {
		return stooltolerance;
	}

	public void setStooltolerance(String stooltolerance) {
		this.stooltolerance = stooltolerance;
	}

	public String getStoolineffectualurging() {
		return stoolineffectualurging;
	}

	public void setStoolineffectualurging(String stoolineffectualurging) {
		this.stoolineffectualurging = stoolineffectualurging;
	}

	public String getStoolmucous() {
		return stoolmucous;
	}

	public void setStoolmucous(String stoolmucous) {
		this.stoolmucous = stoolmucous;
	}

	public String getStoolbleeding() {
		return stoolbleeding;
	}

	public void setStoolbleeding(String stoolbleeding) {
		this.stoolbleeding = stoolbleeding;
	}

	public String getStoolregularity() {
		return stoolregularity;
	}

	public void setStoolregularity(String stoolregularity) {
		this.stoolregularity = stoolregularity;
	}

	public String getStoolpain() {
		return stoolpain;
	}

	public void setStoolpain(String stoolpain) {
		this.stoolpain = stoolpain;
	}

	public String getStoolcolour() {
		return stoolcolour;
	}

	public void setStoolcolour(String stoolcolour) {
		this.stoolcolour = stoolcolour;
	}

	public String getStooloffensiveness() {
		return stooloffensiveness;
	}

	public void setStooloffensiveness(String stooloffensiveness) {
		this.stooloffensiveness = stooloffensiveness;
	}

	public String getStoolsatisfaction() {
		return stoolsatisfaction;
	}

	public void setStoolsatisfaction(String stoolsatisfaction) {
		this.stoolsatisfaction = stoolsatisfaction;
	}

	public String getStoolfrequency() {
		return stoolfrequency;
	}

	public void setStoolfrequency(String stoolfrequency) {
		this.stoolfrequency = stoolfrequency;
	}

	public String getStooltiming() {
		return stooltiming;
	}

	public void setStooltiming(String stooltiming) {
		this.stooltiming = stooltiming;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@XmlElement(name="_csrf")
	private String _csrf;

	
	public String get_csrf() {
		return _csrf;
	}

	public void set_csrf(String _csrf) {
		this._csrf = _csrf;
	}

	public HomeoGeneralities() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "HomeoGeneralities [sessionid=" + sessionid + ", patrefnum=" + patrefnum + ", desire1=" + desire1
				+ ", desireTaste=" + desireTaste + ", desire2=" + desire2 + ", desire3=" + desire3 + ", extraSalt="
				+ extraSalt + ", milk=" + milk + ", iceCream=" + iceCream + ", coldDrink=" + coldDrink + ", chocolate="
				+ chocolate + ", fattyfood=" + fattyfood + ", indigestableThing=" + indigestableThing + ", intolerance="
				+ intolerance + ", appetite=" + appetite + ", appetiteTolerance=" + appetiteTolerance
				+ ", reactiontoheatncold=" + reactiontoheatncold + ", worseweatherreaction=" + worseweatherreaction
				+ ", betterweatherreaction=" + betterweatherreaction + ", hypersusceptibility=" + hypersusceptibility
				+ ", thirst=" + thirst + ", preferredwater=" + preferredwater + ", sleep=" + sleep
				+ ", positionofsleep=" + positionofsleep + ", dream=" + dream + ", stoolconsistency=" + stoolconsistency
				+ ", stooltolerance=" + stooltolerance + ", stoolineffectualurging=" + stoolineffectualurging
				+ ", stoolmucous=" + stoolmucous + ", stoolbleeding=" + stoolbleeding + ", stoolregularity="
				+ stoolregularity + ", stoolpain=" + stoolpain + ", stoolcolour=" + stoolcolour
				+ ", stooloffensiveness=" + stooloffensiveness + ", stoolsatisfaction=" + stoolsatisfaction
				+ ", stoolfrequency=" + stoolfrequency + ", stooltiming=" + stooltiming + ", urinefrequency="
				+ urinefrequency + ", burningurination=" + burningurination + ", urinetolerance=" + urinetolerance
				+ ", urinestream=" + urinestream + ", urineflow=" + urineflow + ", urinepain=" + urinepain
				+ ", urinecharacterofpain=" + urinecharacterofpain + ", urinebleeding=" + urinebleeding + ", urinepus="
				+ urinepus + ", urineodour=" + urineodour + ", sweatquantity=" + sweatquantity + ", sweatbodypart="
				+ sweatbodypart + ", sweatoffensiveodour=" + sweatoffensiveodour + ", sweatstain=" + sweatstain
				+ ", sweatweakness=" + sweatweakness + ", sweatrelief=" + sweatrelief + ", menstruationmenarche="
				+ menstruationmenarche + ", menstruationcycle=" + menstruationcycle + ", menstruationfrequency="
				+ menstruationfrequency + ", menstruationduration=" + menstruationduration + ", menstruationtypeofflow="
				+ menstruationtypeofflow + ", menstruationpain=" + menstruationpain + ", menstruationclot="
				+ menstruationclot + ", menstruationclotcolour=" + menstruationclotcolour
				+ ", menstruationcolourofflow=" + menstruationcolourofflow + ", menstruationodour=" + menstruationodour
				+ ", menstrucomplaintsincedate=" + menstrucomplaintsincedate + ", menstruationagemenopause="
				+ menstruationagemenopause + ", menstruationleucorrhoea=" + menstruationleucorrhoea
				+ ", menstruleucorrhconsistency=" + menstruleucorrhconsistency + ", menstruleucorrhcolour="
				+ menstruleucorrhcolour + ", menstruleucorrhitching=" + menstruleucorrhitching
				+ ", menstruleucorrhexcoriation=" + menstruleucorrhexcoriation + ", menstruleucorrhsmell="
				+ menstruleucorrhsmell + ", phygenleucorrhoea=" + phygenleucorrhoea + ", phygenconsistency="
				+ phygenconsistency + ", phygencolour=" + phygencolour + ", phygenitching=" + phygenitching
				+ ", phygenexcoriation=" + phygenexcoriation + ", phygensmell=" + phygensmell + ", phygenalternation="
				+ phygenalternation + ", phygensidesofbody=" + phygensidesofbody + ", phygenperiodicity="
				+ phygenperiodicity + ", phygengeneralmodality=" + phygengeneralmodality + ", phygenconstitution="
				+ phygenconstitution + ", phygenothergeneral=" + phygenothergeneral + ", phygencharacterstics="
				+ phygencharacterstics + ", mengencompany=" + mengencompany + ", mengengrief=" + mengengrief
				+ ", mengengriefdesc=" + mengengriefdesc + ", mengendislove=" + mengendislove + ", mengendislovedesc="
				+ mengendislovedesc + ", mengendindignation=" + mengendindignation + ", mengendindignationdesc="
				+ mengendindignationdesc + ", mengenconsolation=" + mengenconsolation + ", mengencontradiction="
				+ mengencontradiction + ", mengenanger=" + mengenanger + ", mengenangerdesc=" + mengenangerdesc
				+ ", mengenanimal=" + mengenanimal + ", mengenfastideousness=" + mengenfastideousness
				+ ", mengenmisery=" + mengenmisery + ", mengenweepingdisposition=" + mengenweepingdisposition
				+ ", _csrf=" + _csrf + "]";
	}
	 

	 
	 
	
		

}