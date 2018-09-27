package com.homeo.restws.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.homeo.restws.dao.MedicineDao;
import com.homeo.restws.model.Medicine;
import com.homeo.restws.service.MedicineService;

@Service("medicineService")
public class MedicineServiceImpl implements MedicineService {

	@Autowired
	MedicineDao medicineDao;

	@Transactional(rollbackFor = Exception.class)
	@Override
	public String addMedicine(Medicine medicine) {
		System.out.println("addMedicine"+medicine);
		try {
			Map outMap = medicineDao.addMedicine(medicine);
			if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode))
				return "Medicine("+(String)outMap.get("medcode")+") has been saved Successfully.";
			else
				return "System is unable to save Medicine Details.Please contact your Administrator.";
		}catch(Exception e) {
			e.printStackTrace();
			return "System is unable to save Medicine Details.Please contact your Administrator.";
		}
	}

	@Override
	public Medicine retrieveMedicineByCode(String medcode) {
		try {
			Map outMap = medicineDao.retrieveMedicineByCode(medcode);
			String errorCode =	(String) outMap.get("errorCode"); 
			if("".equals(errorCode) && outMap.get("object")!=null && (outMap.get("noOfRowsImpacted")!=null && (Integer)outMap.get("noOfRowsImpacted") == 1))
				return (Medicine)outMap.get("object");
			else
				return null;
		}catch(Exception e) {
			return null;
		}
	}


	@Override
	public List<Medicine> retrieveMedicinesByComp(String medcompname) {
		try {
			Map outMap = medicineDao.retrieveMedicinesByComp(medcompname);
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode) && outMap.get("object")!=null && (outMap.get("noOfRowsImpacted")!=null && (Integer)outMap.get("noOfRowsImpacted") >0)) {
				return (List<Medicine>)outMap.get("object");
			}else {
				return null;
			}
		}catch(Exception e) {
			return null;
		}
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public String updateMedicine(Medicine medicine) {
		try {
			Map outMap = medicineDao.updateMedicine(medicine);
			if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode))
				return "Medicine Details has been Updated Successfully.";
			else
				return "System is unable to Update the Medicine Details.Please contact your Administrator.";
		}catch(Exception e) {
			return "System is unable to Update the Medicine Details.Please contact your Administrator.";
		}
	}

	@Override
	public List<Medicine> retrieveAllMedicines() {
		try {
			Map outMap = medicineDao.retrieveAllMedicines();
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode) && outMap.get("object")!=null && (outMap.get("noOfRowsImpacted")!=null && (Integer)outMap.get("noOfRowsImpacted") >0)) {
				return (List<Medicine>)outMap.get("object");
			}else {
				return null;
			}
		}catch(Exception e) {
			return null;
		}
	}



	@Override
	public List<Medicine> retrieveMedicinesByDifferentParameters(Medicine medicine) {
		System.out.println("retrieveMedicinesByDifferentParameters---"+medicine);
		try {
			Map outMap = medicineDao.retrieveMedicinesByDifferentParameters(medicine);
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode) && outMap.get("object")!=null && (outMap.get("noOfRowsImpacted")!=null && (Integer)outMap.get("noOfRowsImpacted") >0)) {
				return (List<Medicine>)outMap.get("object");
			}else {
				return null;
			}
		}catch(Exception e) {
			return null;
		}
	}

	@Override
	public List<Medicine> retrieveMedicineByMedName(String medname) {
		try {
			Map outMap = medicineDao.retrieveMedicineByMedName(medname);
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode) && outMap.get("object")!=null && (outMap.get("noOfRowsImpacted")!=null && (Integer)outMap.get("noOfRowsImpacted") >0)) {
				return (List<Medicine>)outMap.get("object");
			}else {
				return null;
			}
		}catch(Exception e) {
			return null;
		}
	}

	
	@Transactional(rollbackFor = Exception.class)
	@Override
	public String deleteMedicine(String medcode) {
		try {
			Map outMap = medicineDao.deleteMedicine(medcode);
			if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode))
				return "Medicine has been Deleted Successfully.";
			else
				return "System is unable to Delete the Medicine Details.Please contact your Administrator.";
		}catch(Exception e) {
			return "System is unable to Delete the Medicine Details.Please contact your Administrator.";
		}
	}



}
