package com.homeo.restws.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.homeo.restws.dao.HomeoProdUserDao;
import com.homeo.restws.dao.MasterRecordsDao;
import com.homeo.restws.model.HomeoProdUser;
import com.homeo.restws.model.MasterRecords;


@Repository
public class MasterRecordsDaoImpl implements MasterRecordsDao {

	private Logger logger = Logger.getLogger(HomeoProdUserDao.class);

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void updateSeq(String type)
	{
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
	public Map create(MasterRecords masterRecords) {
		System.out.println("inside MasterRecordsDaoImpl create...");
		String sqlQuery = null;
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		String typeCode=masterRecords.getType().substring(0, 3);
		Map returnMap = new HashMap();
		try{
			/*sqlQuery = "INSERT INTO homeopathydb.masterrecord ( type,code,value,description) VALUES "
					+ "('a','b','c','d')";*/
			sqlQuery = "INSERT INTO homeopathydb.masterrecord ( type,code,value,description) VALUES "
					+ "("
					+ "'" + masterRecords.getType() +"',"
					+ "concat('"+typeCode+"',(select currnum from homeopathsequence where type='"+masterRecords.getType()+"')),"
					+ "'" + masterRecords.getValue() +"',"
					+ "'" + masterRecords.getDescription() + "'"
					+ ")";
			System.out.println(sqlQuery);
			logger.info(sqlQuery);
			if(sqlQuery != null)
				noOfRowsImpacted = jdbcTemplate.update(sqlQuery);
			updateSeq(masterRecords.getType());
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "HomeoProdUserDaoImplcreate";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode); 
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("noOfRowsImpacted", noOfRowsImpacted);
		return returnMap;
	}
	
	@Override
	public Map update(MasterRecords masterRecords) {
		System.out.println("inside MasterRecordsDaoImpl create...");
		String sqlQuery = null;
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		String typeCode=masterRecords.getType().substring(0, 3);
		Map returnMap = new HashMap();
		try{
			/*sqlQuery = "INSERT INTO homeopathydb.masterrecord ( type,code,value,description) VALUES "
					+ "('a','b','c','d')";*/
			sqlQuery = "INSERT INTO homeopathydb.masterrecord ( type,code,value,description) VALUES "
					+ "("
					+ "'" + masterRecords.getType() +"',"
					+ "concat('"+typeCode+"',(select currnum from homeopathsequence where type='"+masterRecords.getType()+"')),"
					+ "'" + masterRecords.getValue() +"',"
					+ "'" + masterRecords.getDescription() + "'"
					+ ")";
			System.out.println(sqlQuery);
			logger.info(sqlQuery);
			if(sqlQuery != null)
				noOfRowsImpacted = jdbcTemplate.update(sqlQuery);
			updateSeq(masterRecords.getType());
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "HomeoProdUserDaoImplcreate";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode); 
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("noOfRowsImpacted", noOfRowsImpacted);
		return returnMap;
	}
	
	/*@Override
	public Map retrieveAll() {
		String sqlQuery = null;
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		try {
			List<HomeoProdUser> listOfObjects = this.jdbcTemplate.query(
					"select * from homeopathydb.users",
					new RowMapper<HomeoProdUser>() {
						public HomeoProdUser mapRow(ResultSet rs, int rowNum) throws SQLException {
							HomeoProdUser homeoProdUserObj = new HomeoProdUser();
							homeoProdUserObj.setName(rs.getString("name"));
							homeoProdUserObj.setPassword(rs.getString("password"));
							homeoProdUserObj.setUsername(rs.getString("username"));
							return homeoProdUserObj;
						}
					});
			returnMap.put("noOfRowsImpacted", listOfObjects.size());
			returnMap.put("object", listOfObjects);
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "HomeoProdUserDaoImplretrieveAllHomeoProdUsers";
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode);
		returnMap.put("errorMsg", errorMsg);
		return returnMap;

	}*/
	
	@Override
	public Map retrieveRecordByCode(String code) {
		String sqlQuery = null;
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		try {
			List<HomeoProdUser> listOfObjects = this.jdbcTemplate.query(
					"select * from homeopathydb.users",
					new RowMapper<HomeoProdUser>() {
						public HomeoProdUser mapRow(ResultSet rs, int rowNum) throws SQLException {
							HomeoProdUser homeoProdUserObj = new HomeoProdUser();
							homeoProdUserObj.setName(rs.getString("name"));
							homeoProdUserObj.setPassword(rs.getString("password"));
							homeoProdUserObj.setUsername(rs.getString("username"));
							return homeoProdUserObj;
						}
					});
			returnMap.put("noOfRowsImpacted", listOfObjects.size());
			returnMap.put("object", listOfObjects);
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "HomeoProdUserDaoImplretrieveAllHomeoProdUsers";
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode);
		returnMap.put("errorMsg", errorMsg);
		return returnMap;

	}
	
	@Override
	public Map retrieveRecordsByType(String type) {
		String sqlQuery = null;
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		try {
			List<HomeoProdUser> listOfObjects = this.jdbcTemplate.query(
					"select * from homeopathydb.users",
					new RowMapper<HomeoProdUser>() {
						public HomeoProdUser mapRow(ResultSet rs, int rowNum) throws SQLException {
							HomeoProdUser homeoProdUserObj = new HomeoProdUser();
							homeoProdUserObj.setName(rs.getString("name"));
							homeoProdUserObj.setPassword(rs.getString("password"));
							homeoProdUserObj.setUsername(rs.getString("username"));
							return homeoProdUserObj;
						}
					});
			returnMap.put("noOfRowsImpacted", listOfObjects.size());
			returnMap.put("object", listOfObjects);
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "HomeoProdUserDaoImplretrieveAllHomeoProdUsers";
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode);
		returnMap.put("errorMsg", errorMsg);
		return returnMap;

	}

	




}
