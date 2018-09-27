package com.homeo.restws.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.homeo.restws.dao.DiseaseDao;
import com.homeo.restws.model.Disease;
import com.homeo.restws.service.DiseaseService;

@Service("diseaseService")
public class DiseaseServiceImpl implements DiseaseService {

	@Autowired
	DiseaseDao diseaseDao;

	@Transactional(rollbackFor = Exception.class)
	@Override
	public String addDisease(Disease disease) {
		System.out.println("addDisease"+disease);
		try {
			Map outMap = diseaseDao.addDisease(disease);
			if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode))
				return "Disease has been saved Successfully.";
			else if("DiseaseDaoImpladdDiseaseDuplicate".equals(errorCode))
				return "There is a existing Disease in the same name.Please change it and save again.";
			else
				return "System is unable to save Disease Details.Please contact your Administrator.";
		}catch(Exception e) {
			e.printStackTrace();
			return "System is unable to save Disease Details.Please contact your Administrator.";
		}
	}


	@Override
	public List<Disease> retrieveDiseaseByDiseaseName(String diseaseName) {
		try {
			Map outMap = diseaseDao.retrieveDiseaseByDiseaseName(diseaseName);
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode) && outMap.get("object")!=null && (outMap.get("noOfRowsImpacted")!=null && (Integer)outMap.get("noOfRowsImpacted") >0)) {
				return (List<Disease>)outMap.get("object");
			}else {
				return null;
			}
		}catch(Exception e) {
			return null;
		}
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public String updateDisease(Disease disease) {
		try {
			Map outMap = diseaseDao.updateDisease(disease);
			if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode))
				return "Disease Details has been Updated Successfully.";
			else
				return "System is unable to Update the Disease Details.Please contact your Administrator.";
		}catch(Exception e) {
			return "System is unable to Update the Disease Details.Please contact your Administrator.";
		}
	}

	@Override
	public List<Disease> retrieveAllDiseases() {
		try {
			Map outMap = diseaseDao.retrieveAllDiseases();
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode) && outMap.get("object")!=null && (outMap.get("noOfRowsImpacted")!=null && (Integer)outMap.get("noOfRowsImpacted") >0)) {
				return (List<Disease>)outMap.get("object");
			}else {
				return null;
			}
		}catch(Exception e) {
			return null;
		}
	}



	@Override
	public List<Disease> retrieveDiseasesByDifferentParameters(Disease disease) {
		System.out.println("retrieveDiseasesByDifferentParameters---"+disease);
		try {
			Map outMap = diseaseDao.retrieveDiseasesByDifferentParameters(disease);
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode) && outMap.get("object")!=null && (outMap.get("noOfRowsImpacted")!=null && (Integer)outMap.get("noOfRowsImpacted") >0)) {
				return (List<Disease>)outMap.get("object");
			}else {
				return null;
			}
		}catch(Exception e) {
			return null;
		}
	}
	
	@Transactional(rollbackFor = Exception.class)
	@Override
	public String deleteDisease(String medcode) {
		try {
			Map outMap = diseaseDao.deleteDisease(medcode);
			if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode))
				return "Disease has been Deleted Successfully.";
			else
				return "System is unable to Delete the Disease Details.Please contact your Administrator.";
		}catch(Exception e) {
			return "System is unable to Delete the Disease Details.Please contact your Administrator.";
		}
	}


	@Override
	public List<Disease> retrieveDiseasesByGender(String diseasegender) {
		try {
			Map outMap = diseaseDao.retrieveDiseasesByGender(diseasegender);
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode) && outMap.get("object")!=null && (outMap.get("noOfRowsImpacted")!=null && (Integer)outMap.get("noOfRowsImpacted") >0)) {
				return (List<Disease>)outMap.get("object");
			}else {
				return null;
			}
		}catch(Exception e) {
			return null;
		}
	}



}
