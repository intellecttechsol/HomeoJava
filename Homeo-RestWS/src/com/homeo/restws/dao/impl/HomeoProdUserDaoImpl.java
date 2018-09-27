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
import com.homeo.restws.model.HomeoProdUser;


@Repository
public class HomeoProdUserDaoImpl implements HomeoProdUserDao {

	private Logger logger = Logger.getLogger(HomeoProdUserDao.class);

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Map create(HomeoProdUser homeoProdUser) {
		String sqlQuery = null;
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		try{
			sqlQuery = "INSERT INTO homeopathydb.users ("
					+ " username,"
					+ " password,"
					+ " name,"
					+ " enabled)VALUES ('"+ homeoProdUser.getUsername() +"','"
					+ homeoProdUser.getPassword() +"','"
					+ homeoProdUser.getName() +"',1)";
			logger.info(sqlQuery);
			if(sqlQuery != null)
				noOfRowsImpacted = jdbcTemplate.update(sqlQuery);
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
	public Map retrieveByUsername(String username) {
		String sqlQuery = null;
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		try {
			List<HomeoProdUser> listOfObjects = this.jdbcTemplate.query(
					"select * from homeopathydb.users where username='"+username+"'",
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
			returnMap.put("object", listOfObjects.get(0));
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "HomeoProdUserDaoImplretrieveByUsername";
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode);
		returnMap.put("errorMsg", errorMsg);
		return returnMap;
	}

	@Override
	public Map retrieveAllHomeoProdUsers() {
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
	public Map deleteByUsername(String username) {
		String sqlQuery = null;
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		try{
			sqlQuery = "delete from homeopathydb.users where username='"+ username +"'";
			logger.info(sqlQuery);
			if(sqlQuery != null)
				noOfRowsImpacted = jdbcTemplate.update(sqlQuery);
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "HomeoProdUserDaoImpldeleteByUsername";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode); 
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("noOfRowsImpacted", noOfRowsImpacted);
		return returnMap;
	}

	@Override
	public Map updateUser(HomeoProdUser homeoProdUser) {
		String sqlQuery = null;
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		try{
			sqlQuery = "UPDATE homeopathydb.users set name='"+ homeoProdUser.getName() +"' where username='"
					+ homeoProdUser.getUsername() +"'";
			logger.info(sqlQuery);
			if(sqlQuery != null)
				noOfRowsImpacted = jdbcTemplate.update(sqlQuery);
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "HomeoProdUserDaoImplupdateUser";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode); 
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("noOfRowsImpacted", noOfRowsImpacted);
		return returnMap;
	}




}
