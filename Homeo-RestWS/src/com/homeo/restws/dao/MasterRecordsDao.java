package com.homeo.restws.dao;

import java.util.Map;

import com.homeo.restws.model.MasterRecords;

public interface MasterRecordsDao {
	Map create(MasterRecords masterRecords) ;
	//Map retrieveAll() ;
	Map retrieveRecordByCode(String code);
	Map retrieveRecordsByType(String type);
	Map update(MasterRecords masterRecords);
}
