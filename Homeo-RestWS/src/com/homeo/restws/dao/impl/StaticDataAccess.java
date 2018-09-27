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

import com.homeo.restws.dao.*;
import com.homeo.restws.model.*;




public class StaticDataAccess {

	private Logger logger = Logger.getLogger(HomeoProdUserDao.class);

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public StaticDataAccess()
	{
		super();
		System.out.println("inside constructor");
	}
	
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
	


}
