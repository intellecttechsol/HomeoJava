package com.homeo.restws.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.homeo.restws.dao.MasterRecordsDao;
import com.homeo.restws.model.HomeoProdUser;
import com.homeo.restws.model.MasterRecords;
import com.homeo.restws.service.MasterRecordService;

@Service("recordService")
public class MasterRecordServiceImpl implements MasterRecordService {

	@Autowired
	MasterRecordsDao masterRecordsDao;

	@Transactional(rollbackFor = Exception.class)
	@Override
	public String createRecord(MasterRecords masterRecords) {
		try {
			Map outMap = masterRecordsDao.create(masterRecords);
			if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode))
				return masterRecords.getType() + " has been Created Successfully.";
			else
				return "System is unable save record.Please contact your Administrator.";
		}catch(Exception e) {
			return "System is unable save record.Please contact your Administrator.";
		}
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public MasterRecords retrieveRecordByCode(String code) {
		try {
			Map outMap = masterRecordsDao.retrieveRecordByCode(code);
			if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			String errorCode =	(String) outMap.get("errorCode"); 
			if("".equals(errorCode) && outMap.get("object")!=null && (outMap.get("noOfRowsImpacted")!=null && (Integer)outMap.get("noOfRowsImpacted") == 1))
				return (MasterRecords)outMap.get("object");
			else
				return null;
		}catch(Exception e) {
			return null;
		}
	}
	

	@Transactional(rollbackFor = Exception.class)
	@Override
	public List<MasterRecords> retrieveRecordsByType(String type) {
		try {
			Map outMap = masterRecordsDao.retrieveRecordsByType(type);
			if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode) && outMap.get("object")!=null && (outMap.get("noOfRowsImpacted")!=null && (Integer)outMap.get("noOfRowsImpacted") >0)) {
				return (List<MasterRecords>)outMap.get("object");
			}else {
				return null;
			}
		}catch(Exception e) {
			return null;
		}
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public String updateRecord(MasterRecords masterRecords) {
		try {
			Map outMap = masterRecordsDao.update(masterRecords);
			if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode))
				return "Record has been Updated Successfully.";
			else
				return "System is unable to Update the Record.Please contact your Administrator.";
		}catch(Exception e) {
			return "System is unable to Update the Record.Please contact your Administrator.";
		}
	}

	
}
