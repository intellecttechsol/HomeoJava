package com.homeo.restws.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.homeo.restws.dao.DiseaseDao;
import com.homeo.restws.model.Disease;


@Repository
public class DiseaseDaoImpl implements DiseaseDao {

	private Logger logger = Logger.getLogger(DiseaseDaoImpl.class);

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;


	@Override
	public Map addDisease(Disease disease) {
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		String typeCode="MED";
		Map returnMap = new HashMap();


		try{
			MapSqlParameterSource parameters = new MapSqlParameterSource();
			parameters.addValue("diseasename", disease.getDiseasename());
			parameters.addValue("diseasedescription", disease.getDiseasedescription());
			parameters.addValue("diseasegender", disease.getDiseasegender());

			final String sqlQuery = "INSERT INTO homeopathydb.disease(diseasename,diseasedescription,diseasegender)"
					+ " VALUES(:diseasename,:diseasedescription,:diseasegender)";

			noOfRowsImpacted = namedParameterJdbcTemplate.update(sqlQuery, parameters);
		}catch(DuplicateKeyException de) {
			errorMsg = de.getMessage();
			errorCode = "DiseaseDaoImpladdDiseaseDuplicate";//code will be class name plus methodname
			logger.error(errorCode+"-addDisease-"+errorMsg);
		}catch(Exception ex){
			ex.printStackTrace();
			errorMsg = ex.getMessage();
			errorCode = "DiseaseDaoImpladdDisease";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode); 
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("noOfRowsImpacted", noOfRowsImpacted);
		return returnMap; 
	}


	@Override
	public Map updateDisease(Disease disease) {
		String sqlQuery = null;
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		try{
			sqlQuery = "UPDATE homeopathydb.disease set diseasename='"+ disease.getDiseasename() +"',diseasedescription='"+disease.getDiseasedescription()+"',diseasegender='"+disease.getDiseasegender()+"' where diseasename='"
					+ disease.getDiseasename() +"'";
			logger.info(sqlQuery);
			if(sqlQuery != null)
				noOfRowsImpacted = jdbcTemplate.update(sqlQuery);
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "DiseaseDaoImplupdateDisease";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode); 
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("noOfRowsImpacted", noOfRowsImpacted);
		return returnMap;
	}


	@Override
	public Map retrieveAllDiseases() {
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		try {
			List<Disease> listOfObjects = this.jdbcTemplate.query(
					"select * from homeopathydb.disease",
					new RowMapper<Disease>() {
						public Disease mapRow(ResultSet rs, int rowNum) throws SQLException {
							Disease diseaseRecordsObj = new Disease();
							diseaseRecordsObj.setDiseasedescription(rs.getString("diseasedescription"));
							diseaseRecordsObj.setDiseasename(rs.getString("diseasename"));
							diseaseRecordsObj.setDiseasegender(rs.getString("diseasegender"));
							return diseaseRecordsObj;
						}
					});
			returnMap.put("noOfRowsImpacted", listOfObjects.size());
			returnMap.put("object", listOfObjects);
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "MasterRecordsDaoImplretrieveRecordsByType";
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode);
		returnMap.put("errorMsg", errorMsg);
		System.out.println(returnMap);
		return returnMap;

	}


	@Override
	public Map retrieveDiseasesByDifferentParameters(Disease disease) {
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		int flag = 0;
		StringBuffer query = new StringBuffer("select * from homeopathydb.disease");
		if(!"".equals(disease.getDiseasename()) || !"".equals(disease.getDiseasegender())) {
			query.append(" where");
		}

		if(!"".equals(disease.getDiseasename())) {
			if(flag == 1) {
				query.append(" and diseasename like '%"+disease.getDiseasename()+"%'");
			}else {
				query.append(" diseasename like '%"+disease.getDiseasename()+"%'");
				flag = 1;
			}
		}


		if(!"".equals(disease.getDiseasegender())) {
			if(flag == 1) {
				query.append(" and diseasegender = '"+disease.getDiseasegender()+"'");
			}else {
				query.append(" diseasegender = '"+disease.getDiseasegender()+"'");
				flag = 1;
			}
		}
		System.out.println(query);
		try {
			List<Disease> listOfObjects = this.jdbcTemplate.query(
					query.toString(),
					new RowMapper<Disease>() {
						public Disease mapRow(ResultSet rs, int rowNum) throws SQLException {
							Disease diseaseRecordsObj = new Disease();
							diseaseRecordsObj.setDiseasedescription(rs.getString("diseasedescription"));
							diseaseRecordsObj.setDiseasegender(rs.getString("diseasegender"));
							diseaseRecordsObj.setDiseasename(rs.getString("diseasename"));
							return diseaseRecordsObj;
						}
					});
			returnMap.put("noOfRowsImpacted", listOfObjects.size());
			returnMap.put("object", listOfObjects);
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "MasterRecordsDaoImplretrieveRecordsByType";
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode);
		returnMap.put("errorMsg", errorMsg);
		System.out.println(returnMap);
		return returnMap;
	}


	@Override
	public Map retrieveDiseaseByDiseaseName(String diseasename) {
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();

		try {
			List<Disease> listOfObjects = this.jdbcTemplate.query(
					"select * from homeopathydb.disease where diseasename='"+diseasename+"'",
					new RowMapper<Disease>() {
						public Disease mapRow(ResultSet rs, int rowNum) throws SQLException {
							Disease diseaseRecordsObj = new Disease();
							diseaseRecordsObj.setDiseasename(rs.getString("diseasename"));
							diseaseRecordsObj.setDiseasedescription(rs.getString("diseasedescription"));
							diseaseRecordsObj.setDiseasegender(rs.getString("diseasegender"));
							return diseaseRecordsObj;
						}
					});
			returnMap.put("noOfRowsImpacted", listOfObjects.size());
			returnMap.put("object", listOfObjects.get(0));
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "MedicineDaoImplretrieveDiseaseByDiseaseName";
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode);
		returnMap.put("errorMsg", errorMsg);
		return returnMap;



	}


	@Override
	public Map deleteDisease(String diseasename) {
		String sqlQuery = null;
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		try{
			sqlQuery = "delete from homeopathydb.disease where diseasename='"+ diseasename +"'";
			logger.info(sqlQuery);
			if(sqlQuery != null)
				noOfRowsImpacted = jdbcTemplate.update(sqlQuery);
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "DiseaseDaoImpldeleteDisease";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode); 
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("noOfRowsImpacted", noOfRowsImpacted);
		return returnMap;
	}


	@Override
	public Map retrieveDiseasesByGender(String diseasegender) {
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		int flag = 0;
		StringBuffer query = new StringBuffer("select * from homeopathydb.disease where diseasegender = '"+diseasegender+"' or diseasegender = 'Both'");
		System.out.println(query);
		try {
			List<Disease> listOfObjects = this.jdbcTemplate.query(
					query.toString(),
					new RowMapper<Disease>() {
						public Disease mapRow(ResultSet rs, int rowNum) throws SQLException {
							Disease diseaseRecordsObj = new Disease();
							diseaseRecordsObj.setDiseasedescription(rs.getString("diseasedescription"));
							diseaseRecordsObj.setDiseasegender(rs.getString("diseasegender"));
							diseaseRecordsObj.setDiseasename(rs.getString("diseasename"));
							return diseaseRecordsObj;
						}
					});
			returnMap.put("noOfRowsImpacted", listOfObjects.size());
			returnMap.put("object", listOfObjects);
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "MasterRecordsDaoImplretrieveRecordsByType";
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode);
		returnMap.put("errorMsg", errorMsg);
		System.out.println(returnMap);
		return returnMap;

	}

}
