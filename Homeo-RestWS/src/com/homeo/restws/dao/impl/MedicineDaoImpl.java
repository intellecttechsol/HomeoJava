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
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.homeo.restws.dao.MedicineDao;
import com.homeo.restws.model.Medicine;


@Repository
public class MedicineDaoImpl implements MedicineDao {

	private Logger logger = Logger.getLogger(MedicineDao.class);

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;


	@Override
	public Map addMedicine(Medicine medicine) {
		String sqlQuery = null;
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		String typeCode="MED";
		Map returnMap = new HashMap();


		try{
			MapSqlParameterSource parameters = new MapSqlParameterSource();
			parameters.addValue("medicine_name", medicine.getMedname());
			parameters.addValue("medicine_desc", medicine.getMeddescription());
			parameters.addValue("medicine_comp_name", medicine.getMedcompname());

			final String SQL = "INSERT INTO homeopathydb.medicine(medicine_name,medicine_desc,medicine_comp_name)"
					+ " VALUES(:medicine_name,:medicine_desc,:medicine_comp_name)";

			KeyHolder keyHolder = new GeneratedKeyHolder();
			noOfRowsImpacted = namedParameterJdbcTemplate.update(SQL, parameters, keyHolder, new String[]{"medicine_record_id"});
			Long generatedId = keyHolder.getKey().longValue();
			if(noOfRowsImpacted == 1 && generatedId != null) {
				sqlQuery = "UPDATE homeopathydb.medicine set medicine_code='"+typeCode+""+generatedId+"' where medicine_record_id="
						+ generatedId;
				logger.info(sqlQuery);
				if(sqlQuery != null) {
					noOfRowsImpacted = 0;
					noOfRowsImpacted = jdbcTemplate.update(sqlQuery);
					if(noOfRowsImpacted == 1) {
						returnMap.put("medcode", typeCode+""+generatedId);
					}
				}	
			}
		}catch(Exception ex){
			ex.printStackTrace();
			errorMsg = ex.getMessage();
			errorCode = "MedicineDaoImpladdMedicine";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode); 
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("noOfRowsImpacted", noOfRowsImpacted);
		return returnMap; 
	}


	@Override
	public Map retrieveMedicineByCode(String medcode) {
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();

		try {
			List<Medicine> listOfObjects = this.jdbcTemplate.query(
					"select * from homeopathydb.medicine where medicine_code='"+medcode+"'",
					new RowMapper<Medicine>() {
						public Medicine mapRow(ResultSet rs, int rowNum) throws SQLException {
							Medicine medicineRecordsObj = new Medicine();
							medicineRecordsObj.setMedcode(rs.getString("medicine_code"));
							medicineRecordsObj.setMedcompname(rs.getString("medicine_comp_name"));
							medicineRecordsObj.setMeddescription(rs.getString("medicine_desc"));
							medicineRecordsObj.setMedname(rs.getString("medicine_name"));
							medicineRecordsObj.setMedid(rs.getString("medicine_record_id"));
							return medicineRecordsObj;
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
	public Map retrieveMedicinesByComp(String medcompname) {
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		try {
			List<Medicine> listOfObjects = this.jdbcTemplate.query(
					"select * from homeopathydb.medicine where medicine_comp_name like '%"+medcompname+"%'",
					new RowMapper<Medicine>() {
						public Medicine mapRow(ResultSet rs, int rowNum) throws SQLException {
							Medicine medicineRecordsObj = new Medicine();
							medicineRecordsObj.setMedcode(rs.getString("medicine_code"));
							medicineRecordsObj.setMedcompname(rs.getString("medicine_comp_name"));
							medicineRecordsObj.setMeddescription(rs.getString("medicine_desc"));
							medicineRecordsObj.setMedname(rs.getString("medicine_name"));
							medicineRecordsObj.setMedid(rs.getString("medicine_record_id"));
							return medicineRecordsObj;
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
		return returnMap;

	}


	@Override
	public Map updateMedicine(Medicine medicine) {
		String sqlQuery = null;
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		try{
			sqlQuery = "UPDATE homeopathydb.medicine set medicine_name='"+ medicine.getMedname() +"',medicine_desc='"+medicine.getMeddescription()+"',medicine_comp_name='"+medicine.getMedcompname()+"' where medicine_code='"
					+ medicine.getMedcode() +"'";
			logger.info(sqlQuery);
			if(sqlQuery != null)
				noOfRowsImpacted = jdbcTemplate.update(sqlQuery);
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "MedicineDaoImplupdateMedicine";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode); 
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("noOfRowsImpacted", noOfRowsImpacted);
		return returnMap;
	}


	@Override
	public Map retrieveAllMedicines() {
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		try {
			List<Medicine> listOfObjects = this.jdbcTemplate.query(
					"select * from homeopathydb.medicine",
					new RowMapper<Medicine>() {
						public Medicine mapRow(ResultSet rs, int rowNum) throws SQLException {
							Medicine medicineRecordsObj = new Medicine();
							medicineRecordsObj.setMedcode(rs.getString("medicine_code"));
							medicineRecordsObj.setMedcompname(rs.getString("medicine_comp_name"));
							medicineRecordsObj.setMeddescription(rs.getString("medicine_desc"));
							medicineRecordsObj.setMedname(rs.getString("medicine_name"));
							medicineRecordsObj.setMedid(rs.getString("medicine_record_id"));
							return medicineRecordsObj;
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
	public Map retrieveMedicinesByDifferentParameters(Medicine medicine) {
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		int flag = 0;
		StringBuffer query = new StringBuffer("select * from homeopathydb.medicine");
		if(!"".equals(medicine.getMedcode()) || !"".equals(medicine.getMedcompname()) || !"".equals(medicine.getMeddescription()) || !"".equals(medicine.getMedname())) {
			query.append(" where");
		}
		
		if(!"".equals(medicine.getMedcode())) {
			query.append(" medicine_code='"+medicine.getMedcode()+"'");
			flag = 1;
		}
		
		if(!"".equals(medicine.getMedcompname())) {
			if(flag == 1) {
				query.append(" and medicine_comp_name like '%"+medicine.getMedcompname()+"%'");
			}else {
				query.append(" medicine_comp_name like '%"+medicine.getMedcompname()+"%'");
				flag = 1;
			}
		}
		
		if(!"".equals(medicine.getMeddescription())) {
			if(flag == 1) {
				query.append(" and medicine_desc like '%"+medicine.getMeddescription()+"%'");
			}else {
				query.append(" medicine_desc like '%"+medicine.getMeddescription()+"%'");
				flag = 1;
			}
		}
		
		if(!"".equals(medicine.getMedname())) {
			if(flag == 1) {
				query.append(" and medicine_name like '%"+medicine.getMedname()+"%'");
			}else {
				query.append(" medicine_name like '%"+medicine.getMedname()+"%'");
				flag = 1;
			}
		}
		
		try {
			List<Medicine> listOfObjects = this.jdbcTemplate.query(
					query.toString(),
					new RowMapper<Medicine>() {
						public Medicine mapRow(ResultSet rs, int rowNum) throws SQLException {
							Medicine medicineRecordsObj = new Medicine();
							medicineRecordsObj.setMedcode(rs.getString("medicine_code"));
							medicineRecordsObj.setMedcompname(rs.getString("medicine_comp_name"));
							medicineRecordsObj.setMeddescription(rs.getString("medicine_desc"));
							medicineRecordsObj.setMedname(rs.getString("medicine_name"));
							medicineRecordsObj.setMedid(rs.getString("medicine_record_id"));
							return medicineRecordsObj;
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
	public Map retrieveMedicineByMedName(String medname) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Map deleteMedicine(String medcode) {
		String sqlQuery = null;
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		try{
			sqlQuery = "delete from homeopathydb.medicine where medicine_code='"+ medcode +"'";
			logger.info(sqlQuery);
			if(sqlQuery != null)
				noOfRowsImpacted = jdbcTemplate.update(sqlQuery);
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "MedicineDaoImpldeleteMedicine";//code will be class name plus methodname
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode); 
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("noOfRowsImpacted", noOfRowsImpacted);
		return returnMap;

	}

}
