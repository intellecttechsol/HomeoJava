package com.homeo.restws.dao.impl;

import java.util.Date;
import java.sql.*;
import java.lang.reflect.*;
import java.sql.SQLException;
import java.text.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.homeo.restws.dao.*;
import com.homeo.restws.model.*;

import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

@Repository
public class PatientServiceDaoImpl implements PatientServiceDao {

	private Logger logger = Logger.getLogger(HomeoProdUserDao.class);

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	
	StaticDataAccess staticDataAccess = new StaticDataAccess();
	
	public void updateSeq(String type)
	{
		System.out.println("inside updateSeq");
		String errorCode = "";
		String errorMsg = "";
		try
		{
			String sqlQuery = "update homeopathsequence set currnum=currnum+1 where type='"+type+"'";
			System.out.println(sqlQuery);
			int noOfRowsImpacted = jdbcTemplate.update(sqlQuery);
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "HomeoProdUserDaoImplcreate";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}
	}

	@Override
	public Map createPersonalDetails(PatPersonalDetails patPersonalDetails) {

		String sqlQuery = null;
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		String typeCode="PAT";
		Map returnMap = new HashMap();


		try{
			MapSqlParameterSource parameters = new MapSqlParameterSource();
			parameters.addValue("name", patPersonalDetails.getName());
			parameters.addValue("address", patPersonalDetails.getAddress());
			parameters.addValue("pincode", patPersonalDetails.getPincode());
			parameters.addValue("occupation", patPersonalDetails.getOccupation());
			parameters.addValue("sex", patPersonalDetails.getSex());
			parameters.addValue("religion", patPersonalDetails.getReligion());
			parameters.addValue("patfileno", patPersonalDetails.getPatfileno());

			System.out.println("inside try..."+patPersonalDetails.toString());
			DateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");

			parameters.addValue("dob", (Date)formatter.parse(patPersonalDetails.getDob()));
			//parameters.addValue("doa", (Date)formatter.parse(patPersonalDetails.getDateOfAdmission()));
			if(patPersonalDetails.getDateOfExamination()!="")
				parameters.addValue("doe", (Date)formatter.parse(patPersonalDetails.getDateOfExamination()));
			else
				parameters.addValue("doe",null);
			parameters.addValue("createdby", patPersonalDetails.getCreatedby());

			final String SQL = "INSERT INTO homeopathydb.patpersonaldetails(name,address,pincode,occupation,sex,religion,dob,dateofexamination,createdby,patfileno)"
					+ " VALUES(:name,:address,:pincode,:occupation,:sex,:religion,:dob,:doe,:createdby,:patfileno)";

			System.out.println("check...");
			KeyHolder keyHolder = new GeneratedKeyHolder();
			noOfRowsImpacted = namedParameterJdbcTemplate.update(SQL, parameters, keyHolder, new String[]{"patid"});
			Long generatedId = keyHolder.getKey().longValue();
			if(noOfRowsImpacted == 1 && generatedId != null) {
				sqlQuery = "UPDATE homeopathydb.patpersonaldetails set patrefnum='"+typeCode+""+generatedId+"' where patid="
						+ generatedId; 
				logger.info(sqlQuery);
				if(sqlQuery != null) {
					noOfRowsImpacted = 0;
					noOfRowsImpacted = jdbcTemplate.update(sqlQuery);
					if(noOfRowsImpacted == 1) {
						returnMap.put("patrefnum", typeCode+""+generatedId);
					}
				}	
			}
		}catch(Exception ex){
			ex.printStackTrace();
			errorMsg = ex.getMessage();
			errorCode = "PatientServiceDaoImplcreatePersonalDetails";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode); 
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("noOfRowsImpacted", noOfRowsImpacted);
		return returnMap; 
	}

	@Override
	public Map updatePersonalDetails(PatPersonalDetails patPersonalDetails) {
		
		System.out.println("inside PatientServiceDaoImpl updatePersonalDetails...");
		String sqlQuery = null;
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		try{
			sqlQuery = "UPDATE homeopathydb.patpersonaldetails set "
					+"name = " + "'" + patPersonalDetails.getName() +"',"
					+"address = " + "'" + patPersonalDetails.getAddress() +"',"
					+"pincode = " + "'" + patPersonalDetails.getPincode() +"',"
					+"sex = " + "'" + patPersonalDetails.getSex() +"',"
					+"religion = " + "'" + patPersonalDetails.getReligion() +"',"
					+"updatedby = " + "'" + patPersonalDetails.getUpdatedby() +"'"
					+ "WHERE patrefnum = " + "'" + patPersonalDetails.getPatrefnum() +"'"
					;
			
			System.out.println(sqlQuery);
			logger.info(sqlQuery);
			if(sqlQuery != null)
				noOfRowsImpacted = jdbcTemplate.update(sqlQuery);
			System.out.println("updatePersonalDetails>>noOfRowsImpacted>>"+noOfRowsImpacted);
			
			
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "PatientServiceDaoImplupdateComplaintDetails";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode); 
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("noOfRowsImpacted", String.valueOf(noOfRowsImpacted));
		System.out.println(returnMap);
		return returnMap;
	}


	@Override
	public Map createComplaintDetails(ComplaintDetails complaintDetails) {
		
		System.out.println("inside PatientServiceDaoImpl createComplaintDetails...");
		String sqlQuery = null;
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		try{
			sqlQuery = "INSERT INTO homeopathydb.complaintdetails ( PatRefNum,SesstionID,OverallStatus) VALUES "
					+ "("
					+ "'" + complaintDetails.getPatrefnum() +"',"
					+ "'" + complaintDetails.getSessionid() +"',"
					//+ "'" + complaintDetails.getComplaintdate() +"',"
					+ "'" + complaintDetails.getOverallstatus() +"'"
					+ ")";
			
			System.out.println(sqlQuery);
			logger.info(sqlQuery);
			if(sqlQuery != null)
				noOfRowsImpacted = jdbcTemplate.update(sqlQuery);
			
			System.out.println("query executed");
	
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "PatientServiceDaoImplcreateComplaintDetails";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode); 
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("noOfRowsImpacted", noOfRowsImpacted);
		return returnMap;
	}
	
	@Override
	public Map updateComplaintDetails(ComplaintDetails complaintDetails) {
		
		System.out.println("inside PatientServiceDaoImpl updateComplaintDetails...");
		String sqlQuery = null;
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		try{
			sqlQuery = "update homeopathydb.complaintdetails set "
					+"SesstionID = " + "'" + complaintDetails.getSessionid() +"',"
					//+"ComplaintDate = " + "'" + complaintDetails.getComplaintdate() +"',"
					+"OverallStatus = " + "'" + complaintDetails.getOverallstatus() +"'"
					+ "WHERE patrefnum = " + "'" + complaintDetails.getPatrefnum() +"'"
					;
			
			System.out.println(sqlQuery);
			logger.info(sqlQuery);
			if(sqlQuery != null)
				noOfRowsImpacted = jdbcTemplate.update(sqlQuery);
			System.out.println("query executed");
			
			
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "PatientServiceDaoImplupdateComplaintDetails";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode); 
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("noOfRowsImpacted", String.valueOf(noOfRowsImpacted));
		return returnMap;
	}

	@Override
	public Map createComplaintFollowupDetails(ComplaintFollowupDetails complaintFollowupDetails) {
		
		System.out.println("inside PatientServiceDaoImpl createComplaintFollowupDetails...");
		String sqlQuery = null;
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		try{
			sqlQuery = "INSERT INTO homeopathydb.complaintfollowupdetails ( PatRefNum, SesstionID, CurrentStatus, Treatment, Remarks) VALUES "
					+ "("
					+ "'" + complaintFollowupDetails.getPatrefnum() +"',"
					+ "'" + complaintFollowupDetails.getSessionid() +"',"
					+ "'" + complaintFollowupDetails.getCurrentstatus() +"',"
					//+ "'" + complaintFollowupDetails.getComplaintdate() +"',"
					+ "'" + complaintFollowupDetails.getTreatment() +"',"
					+ "'" + complaintFollowupDetails.getRemarks() +"'"
					+ ")";
			
			System.out.println(sqlQuery);
			logger.info(sqlQuery);
			if(sqlQuery != null)
				noOfRowsImpacted = jdbcTemplate.update(sqlQuery);
			
			System.out.println("query executed");
	
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "PatientServiceDaoImplcreateComplaintFollowupDetails";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode); 
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("noOfRowsImpacted", noOfRowsImpacted);
		return returnMap;
	}
	
	@Override
	public Map updateComplaintFollowupDetails(ComplaintFollowupDetails complaintFollowupDetails) {
		
		System.out.println("inside PatientServiceDaoImpl updateComplaintDetails...");
		String sqlQuery = null;
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		try{
			sqlQuery = "update homeopathydb.complaintfollowupdetails set "
					+"SesstionID = " + "'" + complaintFollowupDetails.getSessionid() +"',"
					+"CurrentStatus = " + "'" + complaintFollowupDetails.getCurrentstatus() +"',"
					+"Treatment = " + "'" + complaintFollowupDetails.getTreatment() +"',"
					//+"ComplaintDate = " + "'" + complaintDetails.getComplaintdate() +"',"
					+"Remarks = " + "'" + complaintFollowupDetails.getRemarks() +"'"
					+ "WHERE patrefnum = " + "'" + complaintFollowupDetails.getPatrefnum() +"'"
					;
			
			System.out.println(sqlQuery);
			logger.info(sqlQuery);
			if(sqlQuery != null)
				noOfRowsImpacted = jdbcTemplate.update(sqlQuery);
			System.out.println("query executed");
			
			
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "PatientServiceDaoImplupdateComplaintDetails";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode); 
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("noOfRowsImpacted", String.valueOf(noOfRowsImpacted));
		return returnMap;
	}
	
	@Override
	public Map createIntraUterineLife(IntraUterineLife intraUterineLife) {
		
		System.out.println("inside PatientServiceDaoImpl createIntraUterineLife...");
		String sqlQuery = null;
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		try{
			sqlQuery = "INSERT INTO homeopathydb.intrauterinelife ( PatRefNum, Symptom, Description) VALUES "
					+ "("
					+ "'" + intraUterineLife.getPatrefnum() +"',"
					+ "'" + intraUterineLife.getSymptom() +"',"
					+ "'" + intraUterineLife.getDescription() +"'"
					+ ")";
			
			System.out.println(sqlQuery);
			logger.info(sqlQuery);
			if(sqlQuery != null)
				noOfRowsImpacted = jdbcTemplate.update(sqlQuery);
			
			System.out.println("query executed");
	
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "PatientServiceDaoImplcreateIntraUterineLife";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode); 
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("noOfRowsImpacted", noOfRowsImpacted);
		return returnMap;
	}
	
	@Override
	public Map updateIntraUterineLife(IntraUterineLife intraUterineLife) {
		
		System.out.println("inside PatientServiceDaoImpl updateIntraUterineLife...");
		String sqlQuery = null;
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		try{
			sqlQuery = "update homeopathydb.intrauterinelife set "
					+"Symptom = " + "'" + intraUterineLife.getSymptom() +"',"
					+"Description = " + "'" + intraUterineLife.getDescription() +"'"
					+ "WHERE patrefnum = " + "'" + intraUterineLife.getPatrefnum() +"'"
					;
			
			System.out.println(sqlQuery);
			logger.info(sqlQuery);
			if(sqlQuery != null)
				noOfRowsImpacted = jdbcTemplate.update(sqlQuery);
			System.out.println("query executed");
			
			
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "PatientServiceDaoImplupdateIntraUterineLife";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode); 
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("noOfRowsImpacted", String.valueOf(noOfRowsImpacted));
		return returnMap;
	}
	
	@Override
	public Map createPatBirthInfo(PatBirthInfo patBirthInfo) {
		
		System.out.println("inside PatientServiceDaoImpl createPatBirthInfo...");
		String sqlQuery = null;
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		try{
			sqlQuery = "INSERT INTO homeopathydb.patbirthinfo ( PatRefNum, BirthHistory, BirthWeightCat, BirthWeight, BirthRash, Vaccination, GreenStoolDuringDentition,"
					+ "TeethMilestone,TeethMilestoneCategory,WalkMilestone,WalkMilestoneCategory,TalkMilestone,TalkMilestoneCategory) VALUES "
					+ "("
					+ "'" + patBirthInfo.getPatrefnum() +"',"
					+ "'" + patBirthInfo.getBirthhistory() +"',"
					+ "'" + patBirthInfo.getBirthweightcat() +"',"
					+ "" + Integer.parseInt(patBirthInfo.getBirthweight()) +","
					+ "'" + patBirthInfo.getBirthrash() +"',"
					+ "'" + patBirthInfo.getVaccination() +"',"
					+ "'" + patBirthInfo.getGreenstoolduringdentition() +"',"
					+ "" + Integer.parseInt(patBirthInfo.getTeethmilestone()) +","
					+ "'" + patBirthInfo.getTeethmilestonecategory() +"',"
					+ "" + Integer.parseInt(patBirthInfo.getWalkmilestone()) +","
					+ "'" + patBirthInfo.getWalkmilestonecategory() +"',"
					+ "" + Integer.parseInt(patBirthInfo.getTalkmilestone()) +","
					+ "'" + patBirthInfo.getTalkmilestonecategory() +"'"
					+ ")";
			
			System.out.println(sqlQuery);
			logger.info(sqlQuery);
			if(sqlQuery != null)
				noOfRowsImpacted = jdbcTemplate.update(sqlQuery);
			
			System.out.println("query executed");
	
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "PatientServiceDaoImplcreatePatBirthInfo";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode); 
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("noOfRowsImpacted", noOfRowsImpacted);
		return returnMap;
	}
	
	@Override
	public Map updatePatBirthInfo(PatBirthInfo patBirthInfo) {
		
		System.out.println("inside PatientServiceDaoImpl updateIntraUterineLife...");
		String sqlQuery = null;
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		try{
			sqlQuery = "update homeopathydb.patbirthinfo set "
					+"BirthHistory = " + "'" + patBirthInfo.getBirthhistory() +"',"
					+"BirthWeight = " + "" + Integer.parseInt(patBirthInfo.getBirthweight()) +","
					+"BirthRash = " + "'" + patBirthInfo.getBirthrash() +"',"
					+"Vaccination = " + "'" + patBirthInfo.getVaccination() +"',"
					+"GreenStoolDuringDentition = " + "'" + patBirthInfo.getGreenstoolduringdentition() +"',"
					+"TeethMilestone = " + "" + Integer.parseInt(patBirthInfo.getTeethmilestone()) +","
					+"TeethMilestoneCategory = " + "'" + patBirthInfo.getTeethmilestonecategory() +"',"
					+"WalkMilestone = " + "" + Integer.parseInt(patBirthInfo.getWalkmilestone()) +","
					+"WalkMilestoneCategory = " + "'" + patBirthInfo.getWalkmilestonecategory() +"',"
					+"TalkMilestone = " + "" + Integer.parseInt(patBirthInfo.getTalkmilestone()) +","
					+"TalkMilestoneCategory = " + "'" + patBirthInfo.getTalkmilestonecategory() +"',"
					+"BirthWeightCat = " + "'" + patBirthInfo.getBirthweightcat() +"'"
					+ "WHERE patrefnum = " + "'" + patBirthInfo.getPatrefnum() +"'"
					;
			
			System.out.println(sqlQuery);
			logger.info(sqlQuery);
			if(sqlQuery != null)
				noOfRowsImpacted = jdbcTemplate.update(sqlQuery);
			System.out.println("query executed");
			
			
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "PatientServiceDaoImplupdatePatBirthInfo";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode); 
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("noOfRowsImpacted", String.valueOf(noOfRowsImpacted));
		return returnMap;
	}
	
	@Override
	public Map createPatPersonalHistory(PatPersonalHistory patPersonalHistory) {
		
		System.out.println("inside PatientServiceDaoImpl createPatPersonalHistory...");
		String sqlQuery = null;
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		try{
			sqlQuery = "INSERT INTO homeopathydb.patpersonalhistory ( PatRefNum, Accommodation, Diet, MaritalStatus, SexHabit, SexSatisfaction,"
					+ "SexDesire,Ejaculation,Erection,UlcerationOverGlancePenis,DischargeOfPusFromPenis,ItchingEruptionInVagina,"
					+ "Dysperunia,DrynessOfVagina,HoneymoonCystitis,AbnormalDischargeFromVagina) VALUES "
					+ "("
					+ "'" + patPersonalHistory.getPatrefnum() +"',"
					+ "'" + patPersonalHistory.getAccommodation() +"',"
					+ "'" + patPersonalHistory.getDiet() +"',"
					+ "'" + patPersonalHistory.getMaritalstatus() +"',"
					+ "'" + patPersonalHistory.getSexdesire() +"',"
					+ "'" + patPersonalHistory.getSexsatisfaction() +"',"
					+ "'" + patPersonalHistory.getSexdesire() +"',"
					+ "'" + patPersonalHistory.getEjaculation() +"',"
					+ "'" + patPersonalHistory.getErection() +"',"
					+ "'" + patPersonalHistory.getUlcerationoverglancepenis() +"',"
					+ "'" + patPersonalHistory.getDischargeofpusfrompenis() +"',"
					+ "'" + patPersonalHistory.getItchingeruptioninvagina() +"',"
					+ "'" + patPersonalHistory.getDysperunia() +"',"
					+ "'" + patPersonalHistory.getDrynessofvagina() +"',"
					+ "'" + patPersonalHistory.getHoneymooncystitis() +"',"
					+ "'" + patPersonalHistory.getAbnormaldischargefromvagina() +"'"
					+ ")";
			
			System.out.println(sqlQuery);
			logger.info(sqlQuery);
			if(sqlQuery != null)
				noOfRowsImpacted = jdbcTemplate.update(sqlQuery);
			
			System.out.println("query executed");
	
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "PatientServiceDaoImplcreatePatPersonalHistory";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode); 
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("noOfRowsImpacted", noOfRowsImpacted);
		return returnMap;
	}
	
	@Override
	public Map updatePatPersonalHistory(PatPersonalHistory patPersonalHistory) {
					
		System.out.println("inside PatientServiceDaoImpl updatePatPersonalHistory...");
		String sqlQuery = null;
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		try{
			sqlQuery = "update homeopathydb.patpersonalhistory set "
					+"Accommodation = " + "'" + patPersonalHistory.getAccommodation() +"',"
					+"Diet = " + "" + "'" + patPersonalHistory.getDiet() +"',"
					+"MaritalStatus = " + "'" + patPersonalHistory.getMaritalstatus()+"',"
					+"SexHabit = " + "'" + patPersonalHistory.getSexhabit()+"',"
					+"SexSatisfaction = " + "'" + patPersonalHistory.getSexsatisfaction() +"',"
					+"SexDesire = " + "'" + patPersonalHistory.getSexdesire() +"',"
					+"Ejaculation = " + "'" + patPersonalHistory.getEjaculation() +"',"
					+"Erection = " + "'" + patPersonalHistory.getErection() +"',"
					+"UlcerationOverGlancePenis = " + "'" + patPersonalHistory.getUlcerationoverglancepenis() +"',"
					+"DischargeOfPusFromPenis = " + "'" + patPersonalHistory.getDischargeofpusfrompenis() +"',"
					+"ItchingEruptionInVagina = " + "'" + patPersonalHistory.getItchingeruptioninvagina() +"',"
					+"Dysperunia = " + "'" + patPersonalHistory.getDysperunia() +"',"
					+"DrynessOfVagina = " + "'" + patPersonalHistory.getDrynessofvagina() +"',"
					+"HoneymoonCystitis = " + "'" + patPersonalHistory.getHoneymooncystitis() +"',"
					+"AbnormalDischargeFromVagina = " + "'" + patPersonalHistory.getAbnormaldischargefromvagina() +"'"
					+ "WHERE patrefnum = " + "'" + patPersonalHistory.getPatrefnum() +"'"
					;
			
			System.out.println(sqlQuery);
			logger.info(sqlQuery);
			if(sqlQuery != null)
				noOfRowsImpacted = jdbcTemplate.update(sqlQuery);
			System.out.println("query executed");
			
			
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "PatientServiceDaoImplupdatePatPersonalHistory";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode); 
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("noOfRowsImpacted", String.valueOf(noOfRowsImpacted));
		return returnMap;
	}
	
	@Override
	public Map storePatFamilyHistory(PatFamilyHistory patFamilyHistory) {
					
		System.out.println("inside PatientServiceDaoImpl updatePatPersonalHistory...");
		String sqlQuery = null;
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		try{
			/*sqlQuery = "update homeopathydb.patpersonalhistory set "
					+"Accommodation = " + "'" + patPersonalHistory.getAccommodation() +"',"
					+"Diet = " + "" + "'" + patPersonalHistory.getDiet() +"',"
					+"MaritalStatus = " + "'" + patPersonalHistory.getMaritalstatus()+"',"
					+"SexHabit = " + "'" + patPersonalHistory.getSexhabit()+"',"
					+"SexSatisfaction = " + "'" + patPersonalHistory.getSexsatisfaction() +"',"
					+"SexDesire = " + "'" + patPersonalHistory.getSexdesire() +"',"
					+"Ejaculation = " + "'" + patPersonalHistory.getEjaculation() +"',"
					+"Erection = " + "'" + patPersonalHistory.getErection() +"',"
					+"UlcerationOverGlancePenis = " + "'" + patPersonalHistory.getUlcerationoverglancepenis() +"',"
					+"DischargeOfPusFromPenis = " + "'" + patPersonalHistory.getDischargeofpusfrompenis() +"',"
					+"ItchingEruptionInVagina = " + "'" + patPersonalHistory.getItchingeruptioninvagina() +"',"
					+"Dysperunia = " + "'" + patPersonalHistory.getDysperunia() +"',"
					+"DrynessOfVagina = " + "'" + patPersonalHistory.getDrynessofvagina() +"',"
					+"HoneymoonCystitis = " + "'" + patPersonalHistory.getHoneymooncystitis() +"',"
					+"AbnormalDischargeFromVagina = " + "'" + patPersonalHistory.getAbnormaldischargefromvagina() +"'"
					+ "WHERE patrefnum = " + "'" + patPersonalHistory.getPatrefnum() +"'"*/
					;
			List<FamilyHistoryInfo> familyhistoryist = patFamilyHistory.getFamilyhistoryist();
			System.out.println("size of familyhistoryist>>>"+familyhistoryist.size());
			logger.info(sqlQuery);
			if(sqlQuery != null)
				noOfRowsImpacted = jdbcTemplate.update(sqlQuery);
			System.out.println("query executed");
			
			
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "PatientServiceDaoImplupdatePatPersonalHistory";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode); 
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("noOfRowsImpacted", String.valueOf(noOfRowsImpacted));
		return returnMap;
	}
	
	
	
	
	//arijit da code
	@Override
	public Map createMiasmaticForPat(MiasmaticDetails miasmaticDetails) {
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		
		try{
			MapSqlParameterSource parameters = new MapSqlParameterSource();
			parameters.addValue("patrefnum", miasmaticDetails.getPatrefnum());
			parameters.addValue("miasmatic", miasmaticDetails.getMiasmatic());
			parameters.addValue("createdby", miasmaticDetails.getCreatedby());

			DateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
			parameters.addValue("dom", (Date)formatter.parse(miasmaticDetails.getDateofMiasmatic()));

			System.out.println((Date)formatter.parse(miasmaticDetails.getDateofMiasmatic()));
			
			final String SQL = "INSERT INTO homeopathydb.patmiasmaticdiagnosis(patrefnum,diagdate,miasmatic,createdby)"
					+ " VALUES(:patrefnum,:dom,:miasmatic,:createdby)";
			System.out.println(SQL);
			noOfRowsImpacted = namedParameterJdbcTemplate.update(SQL, parameters);
			
		}catch(DuplicateKeyException de) {
			errorMsg = de.getMessage();
			errorCode = "PatientServiceDaoImplcreateMiasmaticForPatDuplicate";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}catch(Exception ex){
			ex.printStackTrace();
			errorMsg = ex.getMessage();
			errorCode = "PatientServiceDaoImplcreateMiasmaticForPat";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode); 
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("noOfRowsImpacted", noOfRowsImpacted);
		return returnMap; 

	}


	@Override
	public Map retrieveAllMiasmaticByPatRefNum(String patrefnum) {
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		System.out.println(patrefnum);
		try {
			List<MiasmaticDetails> listOfObjects = this.jdbcTemplate.query(
					"select * from homeopathydb.patmiasmaticdiagnosis where patrefnum = '"+patrefnum+"'",
					new RowMapper<MiasmaticDetails>() {
						public MiasmaticDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
							MiasmaticDetails miasmaticDetailsObj = new MiasmaticDetails();
							miasmaticDetailsObj.setDateofMiasmatic(rs.getDate("diagdate").toString());
							miasmaticDetailsObj.setMiasmatic(rs.getString("miasmatic"));
							miasmaticDetailsObj.setPatrefnum(rs.getString("patrefnum"));
							System.out.println(miasmaticDetailsObj);
							return miasmaticDetailsObj;
						}
					});
			returnMap.put("noOfRowsImpacted", listOfObjects.size());
			returnMap.put("object", listOfObjects);
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "MasterRecordsDaoImplretrieveAllMiasmaticByPatRefNum";
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode);
		returnMap.put("errorMsg", errorMsg);
		System.out.println(returnMap);
		return returnMap;

	}


	@Override
	public Map deleteMiasmaticPat(MiasmaticDetails miasmaticDetails) {
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		try{
			MapSqlParameterSource parameters = new MapSqlParameterSource();
			parameters.addValue("patrefnum", miasmaticDetails.getPatrefnum());
			DateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
			parameters.addValue("dom", (Date)formatter.parse(miasmaticDetails.getDateofMiasmatic()));

			final String SQL = "delete from homeopathydb.patmiasmaticdiagnosis where patrefnum= :patrefnum and diagdate=:dom";

			noOfRowsImpacted = namedParameterJdbcTemplate.update(SQL, parameters);
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "DiseaseDaoImpldeleteMiasmaticPat";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode); 
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("noOfRowsImpacted", noOfRowsImpacted);
		return returnMap;
	}
	
	@Override
	public Map createProvDiagnosisPat(ProvisionalDiagnosis provisionalDiagnosis) {
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();


		try{
			MapSqlParameterSource parameters = new MapSqlParameterSource();
			parameters.addValue("patrefnum", provisionalDiagnosis.getPatrefnum());
			parameters.addValue("provDiagnosis", provisionalDiagnosis.getProvDiagnosis());
			parameters.addValue("remarks", provisionalDiagnosis.getRemarks());
			parameters.addValue("createdby", provisionalDiagnosis.getCreatedby());

			DateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
			parameters.addValue("pdd", (Date)formatter.parse(provisionalDiagnosis.getProvDiagDate()));

			final String SQL = "INSERT INTO homeopathydb.provisionaldiagnosis(patrefnum,ProvDiagDate,ProvDiagnosis,remarks,createdby)"
					+ " VALUES(:patrefnum,:pdd,:provDiagnosis,:remarks,:createdby)";

			noOfRowsImpacted = namedParameterJdbcTemplate.update(SQL, parameters);

		}catch(DuplicateKeyException de) {
			errorMsg = de.getMessage();
			errorCode = "PatientServiceDaoImplcreateProvDiagnosisPatDuplicate";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}catch(Exception ex){
			ex.printStackTrace();
			errorMsg = ex.getMessage();
			errorCode = "PatientServiceDaoImplcreateProvDiagnosisPat";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode); 
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("noOfRowsImpacted", noOfRowsImpacted);
		return returnMap; 

	}


	@Override
	public Map retrieveAllProvDiagnosisByPatRefNum(String patrefnum) {
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		System.out.println(patrefnum);
		try {
			List<ProvisionalDiagnosis> listOfObjects = this.jdbcTemplate.query(
					"select * from homeopathydb.provisionaldiagnosis where patrefnum = '"+patrefnum+"'",
					new RowMapper<ProvisionalDiagnosis>() {
						public ProvisionalDiagnosis mapRow(ResultSet rs, int rowNum) throws SQLException {
							ProvisionalDiagnosis provisionalDiagnosis = new ProvisionalDiagnosis();
							provisionalDiagnosis.setProvDiagDate(rs.getDate("provDiagDate").toString());
							provisionalDiagnosis.setProvDiagnosis(rs.getString("provDiagnosis"));
							provisionalDiagnosis.setPatrefnum(rs.getString("patrefnum"));
							provisionalDiagnosis.setRemarks(rs.getString("remarks"));
							System.out.println(provisionalDiagnosis);
							return provisionalDiagnosis;
						}
					});
			returnMap.put("noOfRowsImpacted", listOfObjects.size());
			returnMap.put("object", listOfObjects);
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "MasterRecordsDaoImplretrieveAllProvDiagnosisByPatRefNum";
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode);
		returnMap.put("errorMsg", errorMsg);
		System.out.println(returnMap);
		return returnMap;

	}


	@Override
	public Map deleteProvDiagnosisPat(ProvisionalDiagnosis provisionalDiagnosis) {
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		System.out.println("delete>"+provisionalDiagnosis);
		try{
			MapSqlParameterSource parameters = new MapSqlParameterSource();
			parameters.addValue("patrefnum", provisionalDiagnosis.getPatrefnum());
			parameters.addValue("ProvDiagnosis",provisionalDiagnosis.getProvDiagnosis());
			DateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
			parameters.addValue("pdd", (Date)formatter.parse(provisionalDiagnosis.getProvDiagDate()));

			final String SQL = "delete from homeopathydb.provisionaldiagnosis where patrefnum= :patrefnum and ProvDiagDate=:pdd and ProvDiagnosis=:ProvDiagnosis";

			noOfRowsImpacted = namedParameterJdbcTemplate.update(SQL, parameters);
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "DiseaseDaoImpldeleteProvDiagnosisPat";//code will be class name plus methodname
			System.out.println(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode); 
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("noOfRowsImpacted", noOfRowsImpacted);
		return returnMap;
	}
	
	/*@Override
	public Map createPatParticular(PatParticularWrapper patParticularWrapper) {
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		
		Map returnMap = new HashMap();

		System.out.println("inside dao impl....");
		try{
			MapSqlParameterSource parameters = new MapSqlParameterSource();
			parameters.addValue("patrefnum", patParticularWrapper.getPatrefnum());
			parameters.addValue("createdby", patParticularWrapper.getCreatedby());

			List<PatParticular> particularList = patParticularWrapper.getParticularList();
			
			String SQL ="delete from homeopathydb.patparticularbodypartillness where patrefnum=:patrefnum";
			noOfRowsImpacted = namedParameterJdbcTemplate.update(SQL, parameters);
			System.out.println("No of rows deleted:"+noOfRowsImpacted);
			
			for (int i=0;i<particularList.size();i++)
			{
				parameters.addValue("bodypart", particularList.get(i).getBodyPart());
				parameters.addValue("illnessdesc",particularList.get(i).getIllnessDesc());
				SQL = "INSERT INTO homeopathydb.patparticularbodypartillness(patrefnum,bodypart,illnessdesc,createdby)"
						+ " VALUES(:patrefnum,:bodypart,:illnessdesc,:createdby)";
				noOfRowsImpacted = namedParameterJdbcTemplate.update(SQL, parameters);
			}

		}catch(DuplicateKeyException de) {
			errorMsg = de.getMessage();
			errorCode = "PatientServiceDaoImplcreatePatParticularDuplicate";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}catch(Exception ex){
			ex.printStackTrace();
			errorMsg = ex.getMessage();
			errorCode = "PatientServiceDaoImplcreatePatParticular";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode); 
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("noOfRowsImpacted", noOfRowsImpacted);
		return returnMap; 

	}*/
	
	@Override
	public Map createPatParticular(PatParticularWrapper patParticularWrapper) {
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		
		Map returnMap = new HashMap();

		
		System.out.println("inside dao impl....");
		try{
			
			Date date = new Date();
			
			MapSqlParameterSource parameters = new MapSqlParameterSource();
			parameters.addValue("createdate", date);
			parameters.addValue("patrefnum", patParticularWrapper.getPatrefnum());
			parameters.addValue("vertigo", patParticularWrapper.getVertigo());
			parameters.addValue("head", patParticularWrapper.getHead());
			parameters.addValue("eyevision", patParticularWrapper.getEyevision());
			parameters.addValue("earhearing", patParticularWrapper.getEarhearing());
			parameters.addValue("nosesmell", patParticularWrapper.getNosesmell());
			parameters.addValue("face", patParticularWrapper.getFace());
			parameters.addValue("mouth", patParticularWrapper.getMouth());
			parameters.addValue("teeth", patParticularWrapper.getTeeth());
			parameters.addValue("tongue", patParticularWrapper.getTongue());
			parameters.addValue("throattonsil", patParticularWrapper.getThroattonsil());
			parameters.addValue("stomach", patParticularWrapper.getStomach());
			parameters.addValue("abdomen", patParticularWrapper.getAbdomen());
			parameters.addValue("bowelrecumt", patParticularWrapper.getBowelrectum());
			parameters.addValue("urinaryorgan", patParticularWrapper.getUrinaryorgan());
			parameters.addValue("genetelia", patParticularWrapper.getGenetalia());
			parameters.addValue("particularmale", patParticularWrapper.getParticularmale());
			parameters.addValue("particularfemale", patParticularWrapper.getParticularfemale());
			parameters.addValue("respiratory", patParticularWrapper.getRespiratory());
			parameters.addValue("chest", patParticularWrapper.getChest());
			parameters.addValue("heart", patParticularWrapper.getHeart());
			parameters.addValue("neckback", patParticularWrapper.getNeckback());
			parameters.addValue("extremities", patParticularWrapper.getExtremities());
			parameters.addValue("fever", patParticularWrapper.getFever());
			parameters.addValue("skin", patParticularWrapper.getSkin());
			
			
			String SQL ="delete from homeopathydb.patparticulardetails where patrefnum=:patrefnum";
			noOfRowsImpacted = namedParameterJdbcTemplate.update(SQL, parameters);
			System.out.println("No of rows deleted:"+noOfRowsImpacted);
			
			SQL = "INSERT INTO homeopathydb.patparticulardetails(patrefnum,vertigo,head,eyevision,"
					+ "earhearing,nosesmell,"
					+ "face,mouth,teeth,tongue,throattonsil,stomach,abdomen,bowelrecumt,urinaryorgan,genetelia,particularmale,particularfemale,respiratory,chest,"
					+ "heart,neckback,extremities,fever,skin,CreateDate)"
					+ " VALUES(:patrefnum,:vertigo,:head,:eyevision,:earhearing,:nosesmell,"
					+ ":face,:mouth,:teeth,:tongue,:throattonsil,:stomach,:abdomen,:bowelrecumt,:urinaryorgan,:genetelia,"
					+ ":particularmale,:particularfemale,:respiratory,:chest,"
					+ ":heart,:neckback,:extremities,:fever,:skin,:createdate)";

			noOfRowsImpacted = namedParameterJdbcTemplate.update(SQL, parameters);

		}catch(DuplicateKeyException de) {
			errorMsg = de.getMessage();
			errorCode = "PatientServiceDaoImplcreatePatParticularDuplicate";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}catch(Exception ex){
			ex.printStackTrace();
			errorMsg = ex.getMessage();
			errorCode = "PatientServiceDaoImplcreatePatParticular";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode); 
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("noOfRowsImpacted", noOfRowsImpacted);
		return returnMap; 

	}
	
	@Override
	public Map createRemedySelection(PatRemedySelection patRemedySelection) {
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();

		System.out.println("inside dao impl....");
		try{
			MapSqlParameterSource parameters = new MapSqlParameterSource();
			parameters.addValue("patrefnum", patRemedySelection.getPatrefnum());
			parameters.addValue("createdby", patRemedySelection.getCreatedby());
			parameters.addValue("findCharacteristics", patRemedySelection.getFindCharacteristics());
			parameters.addValue("evaluationSympt", patRemedySelection.getEvaluationSympt());
			parameters.addValue("caseAnalysis", patRemedySelection.getCaseAnalysis());
			parameters.addValue("repertorisation", patRemedySelection.getRepertorisation());
			parameters.addValue("finalRemedySel", patRemedySelection.getFinalRemedySel());
			
			Date date = new Date();
			parameters.addValue("createdate", date);
			
			String SQL ="delete from homeopathydb.remedyselection where patrefnum=:patrefnum";
			noOfRowsImpacted = namedParameterJdbcTemplate.update(SQL, parameters);
			System.out.println("No of rows deleted:"+noOfRowsImpacted);
			
			SQL = "INSERT INTO homeopathydb.remedyselection(patrefnum,findCharacteristics,evaluationSympt,caseAnalysis,"
					+ "repertorisation,finalRemedySel,createdby,createdate)"
					+ " VALUES(:patrefnum,:findCharacteristics,:evaluationSympt,:caseAnalysis,:repertorisation,:finalRemedySel,:createdby,:createdate)";

			noOfRowsImpacted = namedParameterJdbcTemplate.update(SQL, parameters);
			
			}catch(DuplicateKeyException de) {
			errorMsg = de.getMessage();
			errorCode = "PatientServiceDaoImplcreateRemedySelectionDuplicate";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}catch(Exception ex){
			ex.printStackTrace();
			errorMsg = ex.getMessage();
			errorCode = "PatientServiceDaoImplcreateProvDiagnosisPat";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode); 
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("noOfRowsImpacted", noOfRowsImpacted);
		return returnMap; 
	}
	
	
	@Override
	public Map createPrescription(Prescription prescription) {
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();

		System.out.println("inside dao impl....");
		try{
			MapSqlParameterSource parameters = new MapSqlParameterSource();
			parameters.addValue("patrefnum", prescription.getPatrefnum());
			parameters.addValue("medicine", prescription.getMedicine());
			parameters.addValue("potency", prescription.getPotency());
			parameters.addValue("dose", prescription.getDose());
			parameters.addValue("actionfrom", prescription.getActionfrom());
			parameters.addValue("createdby", prescription.getActionfrom());
		
			Date date = new Date();
			parameters.addValue("createdate", date);
			
			String SQL ="delete from homeopathydb.patprescription where patrefnum=:patrefnum";
			noOfRowsImpacted = namedParameterJdbcTemplate.update(SQL, parameters);
			System.out.println("No of rows deleted:"+noOfRowsImpacted);
			
			SQL = "INSERT INTO homeopathydb.patprescription(patrefnum,Medicine,Potency,Dose,"
					+ "actionFrom,createdby,createdate)"
					+ " VALUES(:patrefnum,:medicine,:potency,:dose,:actionfrom,:createdby,:createdate)";

			noOfRowsImpacted = namedParameterJdbcTemplate.update(SQL, parameters);
			
			}catch(DuplicateKeyException de) {
			errorMsg = de.getMessage();
			errorCode = "PatientServiceDaoImplcreatePrescription";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}catch(Exception ex){
			ex.printStackTrace();
			errorMsg = ex.getMessage();
			errorCode = "PatientServiceDaoImplcreatePrescription";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode); 
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("noOfRowsImpacted", noOfRowsImpacted);
		return returnMap; 
	}
	
	public Map saveHistoryOfPastIllness(PatHistoryOfPastIllnessDetails patHistoryOfPastIllnessDetails) {

		String sqlQuery = null;
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		
		try{
			MapSqlParameterSource parameters = new MapSqlParameterSource();
			parameters.addValue("PatRefNo", patHistoryOfPastIllnessDetails.getPatrefnum());
			parameters.addValue("vomitingpregencyduration", patHistoryOfPastIllnessDetails.getVomitingmonths());
			parameters.addValue("vomitingseverity", patHistoryOfPastIllnessDetails.getVomitingseverity());
			parameters.addValue("foetusmovement", patHistoryOfPastIllnessDetails.getMovementoffoetus());
			parameters.addValue("IUL_skindiseasepresent", patHistoryOfPastIllnessDetails.getAnyskindisease());
			parameters.addValue("IUL_skindisease_desc", patHistoryOfPastIllnessDetails.getSkindiseasedescription());
			parameters.addValue("IUL_mentalgrief", patHistoryOfPastIllnessDetails.getAnymentalgrieforshock());
			parameters.addValue("IUL_mentalgrief_desc", patHistoryOfPastIllnessDetails.getMentalgriefshockdescription());
			parameters.addValue("IUL_diabetesmellitus", patHistoryOfPastIllnessDetails.getDiabetesmellitus());
			parameters.addValue("IUL_thyroid", patHistoryOfPastIllnessDetails.getThyroid());
			parameters.addValue("IUL_Hypertension", patHistoryOfPastIllnessDetails.getHypertension());
			parameters.addValue("IUL_injury", patHistoryOfPastIllnessDetails.getAnyinjuryoraccident());
			parameters.addValue("IUL_injury_desc", patHistoryOfPastIllnessDetails.getInjuryaccidentdescription());
			parameters.addValue("IUL_anyoperation", patHistoryOfPastIllnessDetails.getAnyoperation());
			parameters.addValue("IUL_anyoperation_Desc", patHistoryOfPastIllnessDetails.getAnyoperationdescription());
			parameters.addValue("IUL_venerealdisease", patHistoryOfPastIllnessDetails.getVenerealdisease());
			parameters.addValue("IUL_venerealdisease_desc", patHistoryOfPastIllnessDetails.getVenerealdiseasedescription());
			parameters.addValue("IUL_Asthma", patHistoryOfPastIllnessDetails.getAsthma());
			parameters.addValue("createdby", patHistoryOfPastIllnessDetails.getCreatedby());
			
			Date date = new Date();
			parameters.addValue("createdate", date);
			
			String SQL ="delete from homeopathydb.intrauterinelife where PatRefNo=:PatRefNo";
			noOfRowsImpacted = namedParameterJdbcTemplate.update(SQL, parameters);

			SQL = "INSERT INTO homeopathydb.intrauterinelife(PatRefNo,vomitingpregencyduration,vomitingseverity,foetusmovement,IUL_skindiseasepresent,IUL_skindisease_desc,IUL_mentalgrief,IUL_mentalgrief_desc,IUL_diabetesmellitus,IUL_thyroid,IUL_Hypertension,IUL_injury,IUL_injury_desc,IUL_anyoperation,IUL_anyoperation_Desc,IUL_venerealdisease,IUL_venerealdisease_desc,IUL_Asthma,CreatedBy,CreateDate)"
					+ " VALUES(:PatRefNo,:vomitingpregencyduration,:vomitingseverity,:foetusmovement,:IUL_skindiseasepresent,:IUL_skindisease_desc,:IUL_mentalgrief,:IUL_mentalgrief_desc,:IUL_diabetesmellitus,:IUL_thyroid,:IUL_Hypertension,:IUL_injury,:IUL_injury_desc,:IUL_anyoperation,:IUL_anyoperation_Desc,:IUL_venerealdisease,:IUL_venerealdisease_desc,:IUL_Asthma,:createdby,:createdate)";

			noOfRowsImpacted = namedParameterJdbcTemplate.update(SQL, parameters);

			parameters.addValue("birthhistory", patHistoryOfPastIllnessDetails.getBirthhistory());
			parameters.addValue("birthweight", patHistoryOfPastIllnessDetails.getBirthweight());
			parameters.addValue("birthrash", patHistoryOfPastIllnessDetails.getBirthrash());
			parameters.addValue("vacc_sideeffect", patHistoryOfPastIllnessDetails.getVaccination());
			parameters.addValue("vacc_sideeffect_desc", patHistoryOfPastIllnessDetails.getVaccinationdescription());
			parameters.addValue("teeth_milestone", patHistoryOfPastIllnessDetails.getTeethmilestone());
			parameters.addValue("talk_milestone", patHistoryOfPastIllnessDetails.getTalkmilestone());
			parameters.addValue("walk_milestone", patHistoryOfPastIllnessDetails.getWalkmilestone());
			parameters.addValue("greenstool", patHistoryOfPastIllnessDetails.getGreenstoolduringdentation());
			
			SQL ="delete from homeopathydb.pastillnesshistory where PatRefNo=:PatRefNo";
			noOfRowsImpacted = namedParameterJdbcTemplate.update(SQL, parameters);

			SQL = "INSERT INTO homeopathydb.pastillnesshistory(PatRefNo,birthhistory,birthweight,birthrash,vacc_sideeffect,vacc_sideeffect_desc,teeth_milestone,talk_milestone,walk_milestone,greenstool,CreatedBy,CreateDate)"
					+ " VALUES(:PatRefNo,:birthhistory,:birthweight,:birthrash,:vacc_sideeffect,:vacc_sideeffect_desc,:teeth_milestone,:talk_milestone,:walk_milestone,:greenstool,:createdby,:createdate)";

			noOfRowsImpacted = namedParameterJdbcTemplate.update(SQL, parameters);

			List<String> otherDiseaseList = patHistoryOfPastIllnessDetails.getOtherdiseaseslist();
			
			SQL ="delete from homeopathydb.pastillnessotherdisease where PatRefNo=:PatRefNo";
			noOfRowsImpacted = namedParameterJdbcTemplate.update(SQL, parameters);
			
			for (int i=0;i<otherDiseaseList.size();i++)
			{
				
				parameters.addValue("Disease", otherDiseaseList.get(i));
				SQL = "INSERT INTO homeopathydb.pastillnessotherdisease(PatRefNo,Disease,CreatedBy,CreateDate)"
						+ " VALUES(:PatRefNo,:Disease,:createdby,:createdate)";
				noOfRowsImpacted = namedParameterJdbcTemplate.update(SQL, parameters);
			}

		}catch(Exception ex){
			ex.printStackTrace();
			errorMsg = ex.getMessage();
			errorCode = "PatientServiceDaoImplsaveHistoryOfPastIllness";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode); 
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("patrefnum", patHistoryOfPastIllnessDetails.getPatrefnum());
		returnMap.put("noOfRowsImpacted", noOfRowsImpacted);
		return returnMap; 
	}
	
	public Map saveHomeoGeneralities(HomeoGeneralities homeoGeneralities) {

		String sqlQuery = null;
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		Date date = new Date();
		parameters.addValue("createdate", date);
		
		System.out.println(homeoGeneralities);
		try{
			
			/***Storing Basics data***/
			parameters.addValue("patrefnum", homeoGeneralities.getPatrefnum());
			parameters.addValue("desire1", homeoGeneralities.getDesire1());
			parameters.addValue("desireTaste", homeoGeneralities.getDesireTaste());
			parameters.addValue("desire2", homeoGeneralities.getDesire2());
			parameters.addValue("desire3", homeoGeneralities.getDesire3());
			parameters.addValue("extraSalt", homeoGeneralities.getExtraSalt());
			parameters.addValue("milk", homeoGeneralities.getMilk());
			parameters.addValue("iceCream", homeoGeneralities.getIceCream());
			parameters.addValue("coldDrink", homeoGeneralities.getColdDrink());
			parameters.addValue("chocolate", homeoGeneralities.getChocolate());
			parameters.addValue("fattyfood", homeoGeneralities.getFattyfood());
			parameters.addValue("indigestableThing", homeoGeneralities.getIndigestableThing());
			parameters.addValue("aversion", homeoGeneralities.getAversion());
			parameters.addValue("intolerance", homeoGeneralities.getIntolerance());
			parameters.addValue("appetite", homeoGeneralities.getAppetite());
			parameters.addValue("appetiteTolerance", homeoGeneralities.getAppetiteTolerance());
			parameters.addValue("reactiontoheatncold", homeoGeneralities.getReactiontoheatncold());
			parameters.addValue("worseweatherreaction", homeoGeneralities.getWorseweatherreaction());
			parameters.addValue("betterweatherreaction", homeoGeneralities.getBetterweatherreaction());
			parameters.addValue("hypersusceptibility", homeoGeneralities.getHypersusceptibility());
			parameters.addValue("thirst", homeoGeneralities.getThirst());
			parameters.addValue("preferredwater", homeoGeneralities.getPreferredwater());
			parameters.addValue("sleep", homeoGeneralities.getSleep());
			parameters.addValue("positionofsleep", homeoGeneralities.getPositionofsleep());
			parameters.addValue("dream", homeoGeneralities.getDream());
			//parameters.addValue("createdby", homeoGeneralities.getCreatedby());
			
	
			
			String SQL ="delete from homeopathydb.generalities_basics where patrefnum=:patrefnum";
			noOfRowsImpacted = namedParameterJdbcTemplate.update(SQL, parameters);

			SQL = "INSERT INTO homeopathydb.generalities_basics(patrefnum,desire1,desireTaste,desire2,desire3,extraSalt,milk,iceCream,coldDrink,	chocolate,		fattyfood,	indigestableThing,aversion,	intolerance, appetite,appetiteTolerance,reactiontoheatncold,worseweatherreaction,betterweatherreaction,	hypersusceptibility,	thirst,preferredwater,	sleep,	positionofsleep,dream,	CreateDate)"
												+ " VALUES(:patrefnum,:desire1,:desireTaste,:desire2,:desire3,:extraSalt,:milk,:iceCream,:coldDrink,:chocolate,:fattyfood,	:indigestableThing, :aversion,	:intolerance,		:appetite,:appetiteTolerance,:reactiontoheatncold,:worseweatherreaction,:betterweatherreaction,:hypersusceptibility,:thirst,:preferredwater,:sleep,:positionofsleep,:dream,:createdate)";
			noOfRowsImpacted = namedParameterJdbcTemplate.update(SQL, parameters);
			
			/***Storing Stool data***/
			parameters.addValue("patrefnum", homeoGeneralities.getPatrefnum());
			parameters.addValue("stoolconsistency", homeoGeneralities.getStoolconsistency());
			parameters.addValue("stooltolerance", homeoGeneralities.getStooltolerance());
			parameters.addValue("stoolineffectualurging", homeoGeneralities.getStoolineffectualurging());
			parameters.addValue("stoolmucous", homeoGeneralities.getStoolmucous());
			parameters.addValue("stoolbleeding", homeoGeneralities.getStoolbleeding());
			parameters.addValue("stoolregularity", homeoGeneralities.getStoolregularity());
			parameters.addValue("stoolpain", homeoGeneralities.getStoolpain());
			parameters.addValue("stoolcolour", homeoGeneralities.getStoolcolour());
			parameters.addValue("stooloffensiveness", homeoGeneralities.getStooloffensiveness());
			parameters.addValue("stoolsatisfaction", homeoGeneralities.getStoolsatisfaction());
			parameters.addValue("stoolfrequency", homeoGeneralities.getStoolfrequency());
			parameters.addValue("stooltiming", homeoGeneralities.getStooltiming());

			//parameters.addValue("createdby", homeoGeneralities.getCreatedby());
			
	
			
			SQL ="delete from homeopathydb.generalities_stool where patrefnum=:patrefnum";
			noOfRowsImpacted = namedParameterJdbcTemplate.update(SQL, parameters);

			SQL = "INSERT INTO homeopathydb.generalities_stool(patrefnum,stoolconsistency,stooltolerance,stoolineffectualurging,stoolmucous,stoolbleeding,	stoolregularity,stoolpain,stoolcolour,	stooloffensiveness,		stoolsatisfaction,	stoolfrequency,	stooltiming,CreateDate)"
												+ " VALUES(:patrefnum,:stoolconsistency,:stooltolerance,:stoolineffectualurging,:stoolmucous,:stoolbleeding,:stoolregularity,:stoolpain,:stoolcolour,:stooloffensiveness,:stoolsatisfaction,:stoolfrequency,:stooltiming,:createdate)";
			noOfRowsImpacted = namedParameterJdbcTemplate.update(SQL, parameters);


			/***Storing Urine Data***/
			parameters.addValue("patrefnum", homeoGeneralities.getPatrefnum());
			parameters.addValue("urinefrequency", homeoGeneralities.getUrinefrequency());
			parameters.addValue("burningurination", homeoGeneralities.getBurningurination());
			parameters.addValue("urinetolerance", homeoGeneralities.getUrinetolerance());
			parameters.addValue("urinestream", homeoGeneralities.getUrinestream());
			parameters.addValue("urineflow", homeoGeneralities.getUrineflow());
			parameters.addValue("urinepain", homeoGeneralities.getUrinepain());
			parameters.addValue("urinecharacterofpain", homeoGeneralities.getUrinecharacterofpain());
			parameters.addValue("urinebleeding", homeoGeneralities.getUrinebleeding());
			parameters.addValue("urinepus", homeoGeneralities.getUrinepus());
			parameters.addValue("urineodour", homeoGeneralities.getUrineodour());
	
			//parameters.addValue("createdby", homeoGeneralities.getCreatedby());
					
			SQL ="delete from homeopathydb.generalities_urine where patrefnum=:patrefnum";
			noOfRowsImpacted = namedParameterJdbcTemplate.update(SQL, parameters);

			SQL = "INSERT INTO homeopathydb.generalities_urine(patrefnum,urinefrequency,burningurination,urinetolerance,urinestream,		urineflow,	urinepain,urinecharacterofpain,urinebleeding,	urinepus, urineodour,CreateDate)"
												+ " 	VALUES(:patrefnum,:urinefrequency,:burningurination,:urinetolerance,:urinestream,:urineflow,:urinepain,:urinecharacterofpain,:urinebleeding,:urinepus,:urineodour,:createdate)";
			noOfRowsImpacted = namedParameterJdbcTemplate.update(SQL, parameters);
			
			
			/***Storing Sweat Data***/
			parameters.addValue("patrefnum", homeoGeneralities.getPatrefnum());
			parameters.addValue("sweatquantity", homeoGeneralities.getSweatquantity());
			parameters.addValue("sweatbodypart", homeoGeneralities.getSweatbodypart());
			parameters.addValue("sweatoffensiveodour", homeoGeneralities.getSweatoffensiveodour());
			parameters.addValue("sweatstain", homeoGeneralities.getSweatstain());
			parameters.addValue("sweatweakness", homeoGeneralities.getSweatweakness());
			parameters.addValue("sweatrelief", homeoGeneralities.getSweatrelief());
			
	
			//parameters.addValue("createdby", homeoGeneralities.getCreatedby());
					
			SQL ="delete from homeopathydb.generalities_sweat where patrefnum=:patrefnum";
			noOfRowsImpacted = namedParameterJdbcTemplate.update(SQL, parameters);

			SQL = "INSERT INTO homeopathydb.generalities_sweat(patrefnum,sweatquantity,sweatbodypart,sweatoffensiveodour,sweatstain,		sweatweakness,sweatrelief, CreateDate)"
												+ " 	VALUES(:patrefnum,:sweatquantity,:sweatbodypart,:sweatoffensiveodour,:sweatstain,:sweatweakness,:sweatrelief, :createdate)";
			noOfRowsImpacted = namedParameterJdbcTemplate.update(SQL, parameters);

			/***Storing Menstruation Data***/
			parameters.addValue("patrefnum", homeoGeneralities.getPatrefnum());
			parameters.addValue("menstruationmenarche", homeoGeneralities.getMenstruationmenarche());
			parameters.addValue("menstruationcycle", homeoGeneralities.getMenstruationcycle());
			parameters.addValue("menstruationfrequency", homeoGeneralities.getMenstruationfrequency());
			parameters.addValue("menstruationduration", homeoGeneralities.getMenstruationduration());
			parameters.addValue("menstruationtypeofflow", homeoGeneralities.getMenstruationtypeofflow());
			parameters.addValue("menstruationpain", homeoGeneralities.getMenstruationpain());
			parameters.addValue("menstruationclot", homeoGeneralities.getMenstruationclot());
			parameters.addValue("menstruationclotcolour", homeoGeneralities.getMenstruationclotcolour());
			parameters.addValue("menstruationcolourofflow", homeoGeneralities.getMenstruationcolourofflow());
			parameters.addValue("menstruationodour", homeoGeneralities.getMenstruationodour());
			
			DateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
			if(homeoGeneralities.getMenstrucomplaintsincedate()!=null && homeoGeneralities.getMenstrucomplaintsincedate()!="")
				parameters.addValue("menstrucomplaintsincedate", (Date)formatter.parse(homeoGeneralities.getMenstrucomplaintsincedate()));
			else
				parameters.addValue("menstrucomplaintsincedate",null);
			
			//parameters.addValue("menstrucomplaintsincedate", homeoGeneralities.getMenstrucomplaintsincedate());
			parameters.addValue("menstruationagemenopause", homeoGeneralities.getMenstruationagemenopause());
			parameters.addValue("menstruationleucorrhoea", homeoGeneralities.getMenstruationleucorrhoea());
			parameters.addValue("menstruleucorrhconsistency", homeoGeneralities.getMenstruleucorrhconsistency());
			parameters.addValue("menstruleucorrhcolour", homeoGeneralities.getMenstruleucorrhcolour());
			parameters.addValue("menstruleucorrhitching", homeoGeneralities.getMenstruleucorrhitching());
			parameters.addValue("menstruleucorrhexcoriation", homeoGeneralities.getMenstruleucorrhexcoriation());
			parameters.addValue("menstruleucorrhsmell", homeoGeneralities.getMenstruleucorrhsmell());
	
			//parameters.addValue("createdby", homeoGeneralities.getCreatedby());
					
			SQL ="delete from homeopathydb.generalities_menstruation where patrefnum=:patrefnum";
			noOfRowsImpacted = namedParameterJdbcTemplate.update(SQL, parameters);

			SQL = "INSERT INTO homeopathydb.generalities_menstruation(patrefnum,menstruationmenarche,menstruationcycle,menstruationfrequency,menstruationduration"
					+ "	,menstruationtypeofflow,menstruationpain,menstruationclot,menstruationclotcolour,menstruationcolourofflow,menstruationodour,menstrucomplaintsincedate,menstruationagemenopause,menstruationleucorrhoea,			menstruleucorrhconsistency,	menstruleucorrhcolour,menstruleucorrhitching,menstruleucorrhexcoriation,menstruleucorrhsmell,CreateDate)"
					+ " 	VALUES(:patrefnum,:menstruationmenarche,:menstruationcycle,:menstruationfrequency,:menstruationduration"
					+ ",:menstruationtypeofflow,:menstruationpain,:menstruationclot,:menstruationclotcolour,:menstruationcolourofflow,:menstruationodour,:menstrucomplaintsincedate,:menstruationagemenopause,:menstruationleucorrhoea,:menstruleucorrhconsistency,:menstruleucorrhcolour,:menstruleucorrhitching,:menstruleucorrhexcoriation,:menstruleucorrhsmell,:createdate)";
			noOfRowsImpacted = namedParameterJdbcTemplate.update(SQL, parameters);
			
			
			
			/***Storing Physical Data***/
			parameters.addValue("patrefnum", homeoGeneralities.getPatrefnum());
			parameters.addValue("phygenleucorrhoea", homeoGeneralities.getPhygenleucorrhoea());
			parameters.addValue("phygenconsistency", homeoGeneralities.getPhygenconsistency());
			parameters.addValue("phygencolour", homeoGeneralities.getPhygencolour());
			parameters.addValue("phygenitching", homeoGeneralities.getPhygenitching());
			parameters.addValue("phygenexcoriation", homeoGeneralities.getPhygenexcoriation());
			parameters.addValue("phygensmell", homeoGeneralities.getPhygensmell());
			parameters.addValue("phygenalternation", homeoGeneralities.getPhygenalternation());
			parameters.addValue("phygensidesofbody", homeoGeneralities.getPhygensidesofbody());
			parameters.addValue("phygenperiodicity", homeoGeneralities.getPhygenperiodicity());
			parameters.addValue("phygengeneralmodality", homeoGeneralities.getPhygengeneralmodality());
			parameters.addValue("phygenconstitution", homeoGeneralities.getPhygenconstitution());
			parameters.addValue("phygenothergeneral", homeoGeneralities.getPhygenothergeneral());
			parameters.addValue("phygencharacterstics", homeoGeneralities.getPhygencharacterstics());
			
			
			//parameters.addValue("createdby", homeoGeneralities.getCreatedby());
					
			SQL ="delete from homeopathydb.generalities_physical where patrefnum=:patrefnum";
			noOfRowsImpacted = namedParameterJdbcTemplate.update(SQL, parameters);

			SQL = "INSERT INTO homeopathydb.generalities_physical(patrefnum,phygenleucorrhoea,phygenconsistency,phygencolour,phygenitching,	phygenexcoriation,	phygensmell,phygenalternation,phygensidesofbody,	phygenperiodicity, phygengeneralmodality,	phygenconstitution,phygenothergeneral,phygencharacterstics,CreateDate)"
												+ " 	VALUES(:patrefnum,:phygenleucorrhoea,:phygenconsistency,:phygencolour,:phygenitching,:phygenexcoriation,:phygensmell,:phygenalternation,:phygensidesofbody,:phygenperiodicity,:phygengeneralmodality,:phygenconstitution,:phygenothergeneral,:phygencharacterstics,:createdate)";
			noOfRowsImpacted = namedParameterJdbcTemplate.update(SQL, parameters);
			
			
			/***Storing Mental Data***/
			parameters.addValue("patrefnum", homeoGeneralities.getPatrefnum());
			parameters.addValue("mengencompany", homeoGeneralities.getMengencompany());
			parameters.addValue("mengengrief", homeoGeneralities.getMengengrief());
			parameters.addValue("mengengriefdesc", homeoGeneralities.getMengengriefdesc());
			parameters.addValue("mengendislove", homeoGeneralities.getMengendislove());
			parameters.addValue("mengendislovedesc", homeoGeneralities.getMengendislovedesc());
			parameters.addValue("mengendindignation", homeoGeneralities.getMengendindignation());
			parameters.addValue("mengendindignationdesc", homeoGeneralities.getMengendindignationdesc());
			parameters.addValue("mengenconsolation", homeoGeneralities.getMengenconsolation());
			parameters.addValue("mengencontradiction", homeoGeneralities.getMengencontradiction());
			parameters.addValue("mengenanger", homeoGeneralities.getMengenanger());
			parameters.addValue("mengenangerdesc", homeoGeneralities.getMengenangerdesc());
			parameters.addValue("mengenanimal", homeoGeneralities.getMengenanimal());
			parameters.addValue("mengenfastideousness", homeoGeneralities.getMengenfastideousness());
			parameters.addValue("mengenmisery", homeoGeneralities.getMengenmisery());
			parameters.addValue("mengenweepingdisposition", homeoGeneralities.getMengenweepingdisposition());
			
			//parameters.addValue("createdby", homeoGeneralities.getCreatedby());
					
			SQL ="delete from homeopathydb.generalities_mental where patrefnum=:patrefnum";
			noOfRowsImpacted = namedParameterJdbcTemplate.update(SQL, parameters);

			SQL = "INSERT INTO homeopathydb.generalities_mental(patrefnum,mengencompany,mengengrief,mengengriefdesc,mengendislove,	mengendislovedesc,	mengendindignation,mengendindignationdesc,mengenconsolation,	mengencontradiction, mengenanger,	mengenangerdesc,mengenanimal,mengenfastideousness,mengenmisery,mengenweepingdisposition,CreateDate)"
					+ "VALUES(:patrefnum,:mengencompany,:mengengrief,:mengengriefdesc,:mengendislove,:mengendislovedesc,:mengendindignation,:mengendindignationdesc,:mengenconsolation,:mengencontradiction,:mengenanger,:mengenangerdesc,:mengenanimal,:mengenfastideousness,:mengenmisery,:mengenweepingdisposition,:createdate)";
			
			noOfRowsImpacted = namedParameterJdbcTemplate.update(SQL, parameters);
			
			
			

		}catch(Exception ex){
			ex.printStackTrace();
			errorMsg = ex.getMessage();
			errorCode = "PatientServiceDaoImplsaveHomeoGeneralities";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode); 
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("patrefnum", homeoGeneralities.getPatrefnum());
		returnMap.put("noOfRowsImpacted", noOfRowsImpacted);
		return returnMap; 
	}
	
	@Override
	public Map retrieveHomeoGeneralitiesByPatRefNum(String patrefnum) {
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();

		System.out.println("inside PatientServiceDaoImpl retrieveHomeoGeneralitiesByPatRefNum for patrefnum>>"+patrefnum);
		try {
			List<HomeoGeneralities> listOfObjects = this.jdbcTemplate.query(
					"select * from homeopathydb.generalities_mental M, homeopathydb.generalities_physical P, homeopathydb.generalities_stool S, homeopathydb.generalities_urine U, homeopathydb.generalities_menstruation ME, homeopathydb.generalities_sweat SW, homeopathydb.generalities_basics B"
					+ " where M.patrefnum=P.patrefnum and M.patrefnum=S.patrefnum and M.patrefnum=U.patrefnum and M.patrefnum=SW.patrefnum and M.patrefnum=B.patrefnum and M.patrefnum=ME.patrefnum and M.patrefnum='"+patrefnum+"'",
					new RowMapper<HomeoGeneralities>() {
						public HomeoGeneralities mapRow(ResultSet rs, int rowNum) throws SQLException {
							System.out.println("inside mapper");
							HomeoGeneralities homeoGeneralities = new HomeoGeneralities();
							
							ResultSetMetaData rsmd = rs.getMetaData();
							int columnCount = rsmd.getColumnCount();

							System.out.println("total no of columns>>"+columnCount);
							Method method=null;
							try{
								String colNames="";
								StringBuilder methodName=new StringBuilder();
								for (int i = 1; i <= columnCount; i++ ) {
									
									colNames = rsmd.getColumnName(i);
									methodName=new StringBuilder(colNames);
									methodName.setCharAt(0, Character.toUpperCase(methodName.charAt(0)));
									methodName.insert(0, "set");
									System.out.println("method in "+i+" is "+methodName);
									
									if(rs.getString(rsmd.getColumnName(i))!=null && !colNames.equalsIgnoreCase("_csrf") && !colNames.equalsIgnoreCase("createdby") && !colNames.equalsIgnoreCase("createdate") && !colNames.equalsIgnoreCase("updatedby") && !colNames.equalsIgnoreCase("updatedate"))
									{
										method = HomeoGeneralities.class.getMethod(methodName.toString(), String.class);
										Object returnValue = method.invoke(homeoGeneralities, rs.getString(rsmd.getColumnName(i)));
									}
								  
								}
							}
							catch(Exception ex)
							{
								System.out.println("reflexion exception");
							}
							
							System.out.println(homeoGeneralities);
							return homeoGeneralities;
						}
					});
			returnMap.put("noOfRowsImpacted", listOfObjects.size());
			returnMap.put("object", listOfObjects.get(0));
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "LoadHomeoGeneralities";
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode);
		returnMap.put("errorMsg", errorMsg);
		return returnMap;
	}
	
	@Override
	public Map retrieveSelectionOfRemedyByPatRefNum(String patrefnum) {
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();

		try {
			List<PatRemedySelection> listOfObjects = this.jdbcTemplate.query(
					"select * from homeopathydb.remedyselection where patrefnum='"+patrefnum+"'",
					new RowMapper<PatRemedySelection>() {
						public PatRemedySelection mapRow(ResultSet rs, int rowNum) throws SQLException {
							
							PatRemedySelection patRemedySelection = new PatRemedySelection();
							
							ResultSetMetaData rsmd = rs.getMetaData();
							int columnCount = rsmd.getColumnCount();

							Method method=null;
							try{
								String colNames="";
								StringBuilder methodName=new StringBuilder();
								for (int i = 1; i <= columnCount; i++ ) {
									
									colNames = rsmd.getColumnName(i);
									methodName=new StringBuilder(colNames);
									methodName.setCharAt(0, Character.toUpperCase(methodName.charAt(0)));
									methodName.insert(0, "set");
									System.out.println("method in "+i+" is "+methodName);
									
									if(!colNames.equals("_csrf") && !colNames.equals("createdby") && !colNames.equals("createdate") && !colNames.equals("updatedby") && !colNames.equals("updatedate"))
									{
										method = PatRemedySelection.class.getMethod(methodName.toString(), String.class);
										Object returnValue = method.invoke(patRemedySelection, rs.getString(rsmd.getColumnName(i)));
									}
								  
								}
							}
							catch(Exception ex)
							{
								System.out.println("reflexion exception");
							}
							
							/*patRemedySelection.setCaseAnalysis(rs.getString("caseAnalysis"));
							patRemedySelection.setEvaluationSympt(rs.getString("evaluationSympt"));
							patRemedySelection.setFindCharacteristics(rs.getString("findCharacteristics"));
							patRemedySelection.setFinalRemedySel(rs.getString("finalRemedySel"));
							patRemedySelection.setRepertorisation(rs.getString("repertorisation"));
							patRemedySelection.setPatrefnum(patrefnum);*/
							System.out.println(patRemedySelection);
							return patRemedySelection;
						}
					});
			returnMap.put("noOfRowsImpacted", listOfObjects.size());
			returnMap.put("object", listOfObjects.get(0));
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "MedicineDaoImplretrieveMedicineByCode";
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode);
		returnMap.put("errorMsg", errorMsg);
		return returnMap;
	}
	
	
	@Override
	public Map retrieveExaminationOfPatByPatRefNum(String patrefnum) {
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();

		System.out.println("inside retrieveExaminationOfPatByPatRefNum...in DaoImpl");
		try {
			List<ExaminationDetails> listOfObjects = this.jdbcTemplate.query(
					"select * from homeopathydb.generalexaminationDetails G, homeopathydb.systematicexaminationdetails S where G.patrefnum=S.patrefnum and  G.patrefnum='"+patrefnum+"'",
					new RowMapper<ExaminationDetails>() {
						public ExaminationDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
							
							ExaminationDetails examinationDetails = new ExaminationDetails();
							
							ResultSetMetaData rsmd = rs.getMetaData();
							int columnCount = rsmd.getColumnCount();

							Method method=null;
							try{
								String colNames="";
								StringBuilder methodName=new StringBuilder();
								System.out.println("columnCount>>"+columnCount);
								for (int i = 1; i <= columnCount; i++ ) {
									
									colNames = rsmd.getColumnName(i);
									methodName=new StringBuilder(colNames);
									methodName.setCharAt(0, Character.toUpperCase(methodName.charAt(0)));
									methodName.insert(0, "set");
									System.out.println("method in "+i+" for colNames >>"+ colNames +" is "+methodName);
									
									if(!colNames.equals("_csrf") && !colNames.equalsIgnoreCase("createdby") && !colNames.equalsIgnoreCase("createdate") && !colNames.equalsIgnoreCase("updatedby") && !colNames.equalsIgnoreCase("updatedate"))
									{
										method = ExaminationDetails.class.getMethod(methodName.toString(), String.class);
										Object returnValue = method.invoke(examinationDetails, rs.getString(rsmd.getColumnName(i)));
									}
								  
								}
							}
							catch(Exception ex)
							{
								System.out.println("reflexion exception");
							}
							
							
							System.out.println(examinationDetails);
							return examinationDetails;
						}
					});
			returnMap.put("noOfRowsImpacted", listOfObjects.size());
			returnMap.put("object", listOfObjects.get(0));
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "MedicineDaoImplretrieveMedicineByCode";
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode);
		returnMap.put("errorMsg", errorMsg);
		return returnMap;
	}
	
		
	@Override
	public Map retrieveParticularHeadToFootByPatRefNum(String patrefnum) {
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();

		System.out.println("Inside retrieveParticularHeadToFootByPatRefNum in PatientServiceDaoImpl...for patrefnum>>"+patrefnum);
		try {
			List<PatParticularWrapper> listOfObjects = this.jdbcTemplate.query(
					"select * from homeopathydb.patparticulardetails where patrefnum='"+patrefnum+"'",
					new RowMapper<PatParticularWrapper>() {
						public PatParticularWrapper mapRow(ResultSet rs, int rowNum) throws SQLException {
							
							PatParticularWrapper patParticularWrapper = new PatParticularWrapper();
							
							ResultSetMetaData rsmd = rs.getMetaData();
							int columnCount = rsmd.getColumnCount();

							Method method=null;
							try{
								String colNames="";
								StringBuilder methodName=new StringBuilder();
								for (int i = 1; i <= columnCount; i++ ) {
									
									colNames = rsmd.getColumnName(i);
									methodName=new StringBuilder(colNames);
									methodName.setCharAt(0, Character.toUpperCase(methodName.charAt(0)));
									methodName.insert(0, "set");
									System.out.println("method in "+i+" is "+methodName);
									
									if(!colNames.equals("_csrf") && !colNames.equals("createdby") && !colNames.equals("createdate") && !colNames.equals("updatedby") && !colNames.equals("updatedate"))
									{
										method = PatParticularWrapper.class.getMethod(methodName.toString(), String.class);
										Object returnValue = method.invoke(patParticularWrapper, rs.getString(rsmd.getColumnName(i)));
									}
								  
								}
							}
							catch(Exception ex)
							{
								System.out.println("reflexion exception");
							}
							
							
							System.out.println(patParticularWrapper);
							return patParticularWrapper;
						}
					});
			returnMap.put("noOfRowsImpacted", listOfObjects.size());
			returnMap.put("object", listOfObjects.get(0));
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "PatientServiceDaoImplretrievePatParticular";
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode);
		returnMap.put("errorMsg", errorMsg);
		return returnMap;
	}
	
	
	
	@Override
	public Map retrieveAllPatientDetails() {
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		try {
			List<PatPersonalDetails> listOfObjects = this.jdbcTemplate.query(
					"select * from homeopathydb.patpersonaldetails",
					new RowMapper<PatPersonalDetails>() {
						public PatPersonalDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
							PatPersonalDetails patPersonalDetails = new PatPersonalDetails();
							patPersonalDetails.setPatfileno(rs.getString("patfileno"));
							patPersonalDetails.setPatide(rs.getString("PatRefNum"));
							patPersonalDetails.setAddress(rs.getString("Address"));
							patPersonalDetails.setName(rs.getString("Name"));
							return patPersonalDetails;
						}
					});
			returnMap.put("noOfRowsImpacted", listOfObjects.size());
			returnMap.put("object", listOfObjects);
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "MasterRecordsDaoImplretrieveAllPatientDetails";
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode);
		returnMap.put("errorMsg", errorMsg);
		System.out.println(returnMap);
		return returnMap;

	}


	@Override
	public Map retrievePatientDetailsByDifferentParameters(PatPersonalDetails patPersonalDetails) {
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		int flag = 0;
		StringBuffer query = new StringBuffer("select * from homeopathydb.patpersonaldetails");
		
		if(!"".equals(patPersonalDetails.getPatfileno()) || !"".equals(patPersonalDetails.getPatide()) || 
				!"".equals(patPersonalDetails.getAddress()) || !"".equals(patPersonalDetails.getName())) {
			query.append(" where");
		}

		if(!"".equals(patPersonalDetails.getPatfileno())) {
			if(flag == 1) {
				query.append(" and 	patfileno like '%"+patPersonalDetails.getPatfileno()+"%'");
			}else {
				query.append(" 	patfileno like '%"+patPersonalDetails.getPatfileno()+"%'");
				flag = 1;
			}
		}
		if(!"".equals(patPersonalDetails.getPatide())) {
			if(flag == 1) {
				query.append(" and 	PatRefNum = '"+patPersonalDetails.getPatide()+"'");
			}else {
				query.append(" 	PatRefNum = '"+patPersonalDetails.getPatide()+"'");
				flag = 1;
			}
		}
		if(!"".equals(patPersonalDetails.getAddress())) {
			if(flag == 1) {
				query.append(" and Address = '"+patPersonalDetails.getAddress()+"'");
			}else {
				query.append(" Address = '"+patPersonalDetails.getAddress()+"'");
				flag = 1;
			}
		}
		if(!"".equals(patPersonalDetails.getName())) {
			if(flag == 1) {
				query.append(" and Name = '"+patPersonalDetails.getName()+"'");
			}else {
				query.append(" Name = '"+patPersonalDetails.getName()+"'");
				flag = 1;
			}
		}
		System.out.println(query);
		try {
			List<PatPersonalDetails> listOfObjects = this.jdbcTemplate.query(
					query.toString(),
					new RowMapper<PatPersonalDetails>() {
						public PatPersonalDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
							patPersonalDetails.setPatfileno(rs.getString("patfileno"));
							patPersonalDetails.setPatide(rs.getString("PatRefNum"));
							patPersonalDetails.setAddress(rs.getString("Address"));
							patPersonalDetails.setName(rs.getString("Name"));
							return patPersonalDetails;
						}
					});
			returnMap.put("noOfRowsImpacted", listOfObjects.size());
			returnMap.put("object", listOfObjects);
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "MasterRecordsDaoImplretrievePatientDetailsByDifferentParameters";
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode);
		returnMap.put("errorMsg", errorMsg);
		System.out.println(returnMap);
		return returnMap;
	}
	
	@Override
	public Map retrieveIntroductionByPatRefNum(String patrefnum) {
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		try {
			List<PatPersonalDetails> listOfObjects = this.jdbcTemplate.query(
					"select * from homeopathydb.patpersonaldetails where patrefnum='"+patrefnum+"'",
					new RowMapper<PatPersonalDetails>() {
						public PatPersonalDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
							PatPersonalDetails patPersonalDetails = new PatPersonalDetails();
							patPersonalDetails.setName(rs.getString("name"));
							patPersonalDetails.setAddress(rs.getString("address"));
							patPersonalDetails.setPincode(rs.getString("pincode"));
							patPersonalDetails.setOccupation(rs.getString("occupation"));
							patPersonalDetails.setSex(rs.getString("sex"));
							patPersonalDetails.setReligion(rs.getString("religion"));
							patPersonalDetails.setPatfileno(rs.getString("patfileno"));
							SimpleDateFormat sdfr = new SimpleDateFormat("MM-dd-yyyy");
							try{
								patPersonalDetails.setDob(sdfr.format(rs.getDate("dob")));
								patPersonalDetails.setDateOfAdmission(sdfr.format(rs.getDate("DateOfAdmission")));
								patPersonalDetails.setDateOfExamination(sdfr.format(rs.getDate("DateOfExamination")));
							}catch (Exception ex ){
								System.out.println(ex);
							}
							
							patPersonalDetails.setPatide(rs.getString("patid"));
							patPersonalDetails.setPatrefnum(patrefnum);
							System.out.println(patPersonalDetails);
							return patPersonalDetails;
						}
					});
			returnMap.put("noOfRowsImpacted", listOfObjects.size());
			returnMap.put("object", listOfObjects.get(0));
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "MedicineDaoImplretrieveIntroductionByPatRefNum";
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode);
		returnMap.put("errorMsg", errorMsg);
		return returnMap;
	}
	
	@Override
	public Map saveexaminationofpatientdetails(ExaminationDetails examinationDetails) {
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();

		System.out.println("inside saveexaminationofpatientdetails>>\n"+examinationDetails);
		try{
			MapSqlParameterSource parameters = new MapSqlParameterSource();
			
			parameters.addValue("patrefnum", examinationDetails.getPatrefnum());
			parameters.addValue("decubitus", examinationDetails.getDecubitus());
			parameters.addValue("decubitusdescription", examinationDetails.getDecubitusdescription());
			parameters.addValue("facies", examinationDetails.getFacies());
			parameters.addValue("faciesdescription", examinationDetails.getFaciesdescription());
			parameters.addValue("anaemia", examinationDetails.getAnaemia());
			parameters.addValue("cyanosis", examinationDetails.getCyanosis());
			parameters.addValue("jaundice", examinationDetails.getJaundice());
			parameters.addValue("oedema", examinationDetails.getOedema());
			parameters.addValue("clubbing", examinationDetails.getClubbing());
			parameters.addValue("nutrition", examinationDetails.getNutrition());
			parameters.addValue("height", examinationDetails.getHeight());
			parameters.addValue("weight", examinationDetails.getWeight());
			parameters.addValue("built", examinationDetails.getBuilt());
			parameters.addValue("pulse", examinationDetails.getPulse());
			parameters.addValue("bp", examinationDetails.getBp());
			parameters.addValue("respiration", examinationDetails.getRespiration());
			parameters.addValue("neckvein", examinationDetails.getNeckvein());
			parameters.addValue("neckgland", examinationDetails.getNeckgland());
			parameters.addValue("temperature", examinationDetails.getTemperature());
			
			parameters.addValue("respiratorysysteminspection", examinationDetails.getRespiratorysysteminspection());
			parameters.addValue("respiratorysystempalpitation", examinationDetails.getRespiratorysystempalpitation());
			parameters.addValue("respiratorysystempercussion", examinationDetails.getRespiratorysystempercussion());
			parameters.addValue("respiratorysystemauscultation", examinationDetails.getRespiratorysystemauscultation());
			parameters.addValue("cardiovascularsysteminspection", examinationDetails.getCardiovascularsysteminspection());
			parameters.addValue("cardiovascularsystempalpitation", examinationDetails.getCardiovascularsystempalpitation());
			parameters.addValue("cardiovascularsystempercussion", examinationDetails.getCardiovascularsystempercussion());
			parameters.addValue("cardiovascularsystemauscultation", examinationDetails.getCardiovascularsystemauscultation());
			parameters.addValue("alimenatarysysteminspection", examinationDetails.getAlimenatarysysteminspection());
			parameters.addValue("alimenatarysystempalpitation", examinationDetails.getAlimenatarysystempalpitation());
			parameters.addValue("alimenatarysystempercussion", examinationDetails.getAlimenatarysystempercussion());
			parameters.addValue("alimenatarysystemauscultation", examinationDetails.getAlimenatarysystemauscultation());
			parameters.addValue("nervoussysteminspection", examinationDetails.getNervoussysteminspection());
			parameters.addValue("nervoussystempalpitation", examinationDetails.getNervoussystempalpitation());
			parameters.addValue("nervoussystempercussion", examinationDetails.getNervoussystempercussion());
			parameters.addValue("nervoussystemauscultation", examinationDetails.getNervoussystemauscultation());
			parameters.addValue("otherinspection", examinationDetails.getOtherinspection());
			parameters.addValue("otherpalpitation", examinationDetails.getOtherpalpitation());
			parameters.addValue("otherpercussion", examinationDetails.getOtherpercussion());
			parameters.addValue("otherauscultation", examinationDetails.getOtherauscultation());
			parameters.addValue("createdby", examinationDetails.getCreatedby());
			
			Date date = new Date();
			parameters.addValue("createdate", date);

			String SQL ="delete from homeopathydb.generalexaminationDetails where patrefnum=:patrefnum";
			noOfRowsImpacted = namedParameterJdbcTemplate.update(SQL, parameters);
			System.out.println("No of rows deleted from generalexaminationDetails:"+noOfRowsImpacted);
			
			SQL = "INSERT INTO homeopathydb.generalexaminationDetails(patrefnum,Decubitus,Decubitusdescription,Facies,Faciesdescription,Anaemia,"
					+ "Cyanosis,Jaundice,Oedema,Clubbing,Nutrition,		Height,Weight,	Built,Pulse,Bp,Respiration,		Neckvein,Neckgland,Temperature,createDate,createdBy)"
					+ " VALUES(:patrefnum,:decubitus,:decubitusdescription,:facies,:faciesdescription,:anaemia,"
					+ ":cyanosis,:jaundice,:oedema,:clubbing,:nutrition,:height,:weight,:built,:pulse,:bp,:respiration,:neckvein,:neckgland,:temperature,:createdate,:createdby)";

			noOfRowsImpacted = namedParameterJdbcTemplate.update(SQL, parameters);
			
			
			SQL ="delete from homeopathydb.systematicexaminationDetails where patrefnum=:patrefnum";
			noOfRowsImpacted = namedParameterJdbcTemplate.update(SQL, parameters);
			System.out.println("No of rows deleted from systematicexaminationDetails:"+noOfRowsImpacted);
			
			SQL = "INSERT INTO homeopathydb.systematicexaminationDetails(patrefnum,Respiratorysysteminspection,Respiratorysystempalpitation,Respiratorysystempercussion,"
					+ "Respiratorysystemauscultation,Cardiovascularsysteminspection,Cardiovascularsystempalpitation,Cardiovascularsystempercussion,Cardiovascularsystemauscultation,"
					+ "Alimenatarysysteminspection,Alimenatarysystempalpitation,Alimenatarysystempercussion,Alimenatarysystemauscultation,"
					+ "Nervoussysteminspection,Nervoussystempalpitation,Nervoussystempercussion,Nervoussystemauscultation,Otherinspection,Otherpalpitation,"
					+ "Otherpercussion,Otherauscultation,createDate,createdBy)"
					+ " VALUES(:patrefnum,:respiratorysysteminspection,:respiratorysystempalpitation,:respiratorysystempercussion,:respiratorysystemauscultation,"
					+ ":cardiovascularsysteminspection,:cardiovascularsystempalpitation,:cardiovascularsystempercussion,:cardiovascularsystemauscultation,"
					+ ":alimenatarysysteminspection,:alimenatarysystempalpitation,:alimenatarysystempercussion,:alimenatarysystemauscultation,:nervoussysteminspection,"
					+ ":nervoussystempalpitation,:nervoussystempercussion,:nervoussystemauscultation,:otherinspection,:otherpalpitation,:otherpercussion,:otherauscultation,"
					+ ":createdate,:createdby)";

			noOfRowsImpacted = namedParameterJdbcTemplate.update(SQL, parameters);

		}catch(DuplicateKeyException de) {
			errorMsg = de.getMessage();
			errorCode = "PatientServiceDaoImplsaveexaminationofpatientdetails";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}catch(Exception ex){
			ex.printStackTrace();
			errorMsg = ex.getMessage();
			errorCode = "PatientServiceDaoImplsaveexaminationofpatientdetails";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode); 
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("patrefnum", examinationDetails.getPatrefnum());
		returnMap.put("noOfRowsImpacted", noOfRowsImpacted);
		return returnMap; 

	}
	
	
	
}
