package com.homeo.restws.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.homeo.restws.dao.*;
import com.homeo.restws.model.*;
import com.homeo.restws.service.MasterRecordService;
import com.homeo.restws.service.PatientService;
import com.homeo.restws.service.UserService;
import com.sun.prism.MaskTextureGraphics;

import java.io.File;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.PathParam;

import org.apache.commons.io.FileUtils;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileItemFactory;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.servlet.ServletRequestContext;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

@Service("patientService")
public class PatientServiceImpl implements PatientService {

	@Autowired
	PatientServiceDao patientServiceDao;
	
	@Transactional(rollbackFor = Exception.class)
	@Override
	public String createPatPersonal(PatPersonalDetails patPersonalDetails) {
		try {
			System.out.println("inside PatientServiceImpl createPersonalDetails...");
			Map outMap = patientServiceDao.createPersonalDetails(patPersonalDetails);
			if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode))
				return "Patient("+(String)outMap.get("patrefnum")+") has been on-boarded Successfully.";
			else
				return "System is unable to save record.Please contact your Administrator.";
		}catch(Exception e) {
			e.printStackTrace();
			e.printStackTrace();
			return "System is unable to save record.Please contact your Administrator.";
		}
	}
	
	@Transactional(rollbackFor = Exception.class)
	@Override
	public String updatePersonalDetails(PatPersonalDetails patPersonalDetails) {
		try {
			System.out.println("inside PatientServiceImpl updatePersonalDetails...");
			Map outMap = patientServiceDao.updatePersonalDetails(patPersonalDetails);
			if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			String errorCode =	(String) outMap.get("errorCode"); 
			String errorMsg =	(String) outMap.get("errorMsg"); 
			String noOfRowsImpacted =	(String) outMap.get("noOfRowsImpacted"); 
			//in future all these msg will come from properties file 
			System.out.println("noOfRowsImpacted...."+noOfRowsImpacted);
			if("".equals(errorCode))
			{
				if(noOfRowsImpacted.equals("0"))
					return "Record not found for update";
				else
					return patPersonalDetails.getName() + " has been updated Successfully.";
			}else
				return errorMsg;
		}catch(Exception e) {
	
			return "System is unable save record.Please contact your Administrator.";
		}
	}

	
	@Transactional(rollbackFor = Exception.class)
	@Override
	public String createComplaintDetails(ComplaintDetails complaintDetails) {
		try {
			System.out.println("inside PatientServiceImpl createComplaintDetails...");
			Map outMap = patientServiceDao.createComplaintDetails(complaintDetails);
			if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode))
				return complaintDetails.getPatrefnum() + " Patient complaint has been created Successfully.";
			else
				return "System is save record.Please contact your Administrator.";
		}catch(Exception e) {
			return "System is unable save record.Please contact your Administrator.";
		}
	}
	
	@Transactional(rollbackFor = Exception.class)
	@Override
	public String updateComplaintDetails(ComplaintDetails complaintDetails) {
		try {
			System.out.println("inside PatientServiceImpl updateComplaintDetails...");
			Map outMap = patientServiceDao.updateComplaintDetails(complaintDetails);
			if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			String errorCode =	(String) outMap.get("errorCode"); 
			String noOfRowsImpacted =	(String) outMap.get("noOfRowsImpacted"); 
			System.out.println("noOfRowsImpacted...."+noOfRowsImpacted);
			//in future all these msg will come from properties file 
			if("".equals(errorCode))
			{
				if(noOfRowsImpacted.equals("0"))
					return "Record not found for update";
				else
					return complaintDetails.getPatrefnum() + " Patient complaint has been updated Successfully.";
			}else
				return "System is save record.Please contact your Administrator.";
		}catch(Exception e) {
	
			return "System is unable save record.Please contact your Administrator.";
		}
	}
	
	@Transactional(rollbackFor = Exception.class)
	@Override
	public String createComplaintFollowupDetails(ComplaintFollowupDetails complaintFollowupDetails) {
		try {
			System.out.println("inside PatientServiceImpl createComplaintFollowupDetails...");
			Map outMap = patientServiceDao.createComplaintFollowupDetails(complaintFollowupDetails);
			if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode))
				return complaintFollowupDetails.getPatrefnum() + " Patient complaint has been created Successfully.";
			else
				return "System is save record.Please contact your Administrator.";
		}catch(Exception e) {
			return "System is unable save record.Please contact your Administrator.";
		}
	}
	
	@Transactional(rollbackFor = Exception.class)
	@Override
	public String updateComplaintFollowupDetails(ComplaintFollowupDetails complaintFollowupDetails) {
		try {
			System.out.println("inside PatientServiceImpl updateComplaintFollowupDetails...");
			Map outMap = patientServiceDao.updateComplaintFollowupDetails(complaintFollowupDetails);
			if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			String errorCode =	(String) outMap.get("errorCode"); 
			String noOfRowsImpacted =	(String) outMap.get("noOfRowsImpacted"); 
			System.out.println("noOfRowsImpacted...."+noOfRowsImpacted);
			//in future all these msg will come from properties file 
			if("".equals(errorCode))
			{
				if(noOfRowsImpacted.equals("0"))
					return "Record not found for update";
				else
					return complaintFollowupDetails.getPatrefnum() + " Patient complaint has been updated Successfully.";
			}else
				return "System is save record.Please contact your Administrator.";
		}catch(Exception e) {
	
			return "System is unable save record.Please contact your Administrator.";
		}
	}
	
	@Transactional(rollbackFor = Exception.class)
	@Override
	public String createIntraUterineLife(IntraUterineLife intraUterineLife) {
		try {
			System.out.println("inside PatientServiceImpl createIntraUterineLife...");
			Map outMap = patientServiceDao.createIntraUterineLife(intraUterineLife);
			if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode))
				return intraUterineLife.getPatrefnum() + " Patient IntraUterineLife has been created Successfully.";
			else
				return "System is save record.Please contact your Administrator.";
		}catch(Exception e) {
			return "System is unable save record.Please contact your Administrator.";
		}
	}
	
	@Transactional(rollbackFor = Exception.class)
	@Override
	public String updateIntraUterineLife(IntraUterineLife intraUterineLife) {
		try {
			System.out.println("inside PatientServiceImpl updateComplaintFollowupDetails...");
			Map outMap = patientServiceDao.updateIntraUterineLife(intraUterineLife);
			if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			String errorCode =	(String) outMap.get("errorCode"); 
			String noOfRowsImpacted =	(String) outMap.get("noOfRowsImpacted"); 
			System.out.println("noOfRowsImpacted...."+noOfRowsImpacted);
			//in future all these msg will come from properties file 
			if("".equals(errorCode))
			{
				if(noOfRowsImpacted.equals("0"))
					return "Record not found for update";
				else
					return intraUterineLife.getPatrefnum() + " Patient IntraUterineLife has been updated Successfully.";
			}else
				return "System is save record.Please contact your Administrator.";
		}catch(Exception e) {
	
			return "System is unable save record.Please contact your Administrator.";
		}
	}
	
	@Transactional(rollbackFor = Exception.class)
	@Override
	public String createPatBirthInfo(PatBirthInfo patBirthInfo) {
		try {
			System.out.println("inside PatientServiceImpl createIntraUterineLife...");
			Map outMap = patientServiceDao.createPatBirthInfo(patBirthInfo);
			if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode))
				return patBirthInfo.getPatrefnum() + " Patient PatBirthInfo has been created Successfully.";
			else
				return "System is save record.Please contact your Administrator.";
		}catch(Exception e) {
			return "System is unable save record.Please contact your Administrator.";
		}
	}
	
	@Transactional(rollbackFor = Exception.class)
	@Override
	public String updatePatBirthInfo(PatBirthInfo patBirthInfo) {
		try {
			System.out.println("inside PatientServiceImpl updatePatBirthInfo...");
			Map outMap = patientServiceDao.updatePatBirthInfo(patBirthInfo);
			if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			String errorCode =	(String) outMap.get("errorCode"); 
			String noOfRowsImpacted =	(String) outMap.get("noOfRowsImpacted"); 
			System.out.println("noOfRowsImpacted...."+noOfRowsImpacted);
			//in future all these msg will come from properties file 
			if("".equals(errorCode))
			{
				if(noOfRowsImpacted.equals("0"))
					return "Record not found for update";
				else
					return patBirthInfo.getPatrefnum() + " Patient PatBirthInfo has been updated Successfully.";
			}else
				return "System is save record.Please contact your Administrator.";
		}catch(Exception e) {
	
			return "System is unable save record.Please contact your Administrator.";
		}
	}
	
	@Transactional(rollbackFor = Exception.class)
	@Override
	public String createPatPersonalHistory(PatPersonalHistory patPersonalHistory) {
		try {
			System.out.println("inside PatientServiceImpl createPatPersonalHistory...");
			Map outMap = patientServiceDao.createPatPersonalHistory(patPersonalHistory);
			if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode))
				return patPersonalHistory.getPatrefnum() + " Patient PatPersonalHistory has been created Successfully.";
			else
				return "System is save record.Please contact your Administrator.";
		}catch(Exception e) {
			return "System is unable save record.Please contact your Administrator.";
		}
	}
	
	@Transactional(rollbackFor = Exception.class)
	@Override
	public String updatePatPersonalHistory(PatPersonalHistory patPersonalHistory) {
		try {
			System.out.println("inside PatientServiceImpl updatePatPersonalHistory...");
			Map outMap = patientServiceDao.updatePatPersonalHistory(patPersonalHistory);
			if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			String errorCode =	(String) outMap.get("errorCode"); 
			String noOfRowsImpacted =	(String) outMap.get("noOfRowsImpacted"); 
			System.out.println("noOfRowsImpacted...."+noOfRowsImpacted);
			//in future all these msg will come from properties file 
			if("".equals(errorCode))
			{
				if(noOfRowsImpacted.equals("0"))
					return "Record not found for update";
				else
					return patPersonalHistory.getPatrefnum() + " Patient PatPersonalHistory has been updated Successfully.";
			}else
				return "System is save record.Please contact your Administrator.";
		}catch(Exception e) {
	
			return "System is unable save record.Please contact your Administrator.";
		}
	}
	
	@Transactional(rollbackFor = Exception.class)
	@Override
	public String storePatFamilyHistory(PatFamilyHistory patFamilyHistory) {
		try {
			System.out.println("inside PatientServiceImpl storePatFamilyHistory...");
			Map outMap = patientServiceDao.storePatFamilyHistory(patFamilyHistory);
			if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			String errorCode =	(String) outMap.get("errorCode"); 
			String noOfRowsImpacted =	(String) outMap.get("noOfRowsImpacted"); 
			System.out.println("noOfRowsImpacted...."+noOfRowsImpacted);
			//in future all these msg will come from properties file 
			if("".equals(errorCode))
			{
				if(noOfRowsImpacted.equals("0"))
					return "Record not found for update";
				else
					return patFamilyHistory.getPatrefnum() + " Patient PatFamilyHistory has been updated Successfully.";
			}else
				return "System is save record.Please contact your Administrator.";
		}catch(Exception e) {
	
			return "System is unable save record.Please contact your Administrator.";
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	//arijit da code
	@Transactional(rollbackFor = Exception.class)
	@Override
	public String createMiasmaticForPat(MiasmaticDetails miasmaticDetails) {
		System.out.println("miasmaticDetails>"+miasmaticDetails);
		try {
			Map outMap = patientServiceDao.createMiasmaticForPat(miasmaticDetails);
			if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode))
				return "Miasmatic has been saved Successfully.";
			else if("PatientServiceDaoImplcreateMiasmaticForPatDuplicate".equals(errorCode))
				return "There is a existing Miasmatic on the same date.Please delete it and save again.";
			else
				return "System is unable to save Miasmatic Details.Please contact your Administrator.";
		}catch(Exception e) {
			e.printStackTrace();
			return "System is unable to save Miasmatic Details.Please contact your Administrator.";
		}
	}

	@Override
	public List<MiasmaticDetails> retrieveAllMiasmaticByPatRefNum(String patrefnum) {
		try {
			System.out.println("retrieveAllMiasmaticByPatRefNum patrefnum>"+patrefnum);
			Map outMap = patientServiceDao.retrieveAllMiasmaticByPatRefNum(patrefnum);
			System.out.println("retrieveAllMiasmaticByPatRefNum>"+outMap);
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode) && outMap.get("object")!=null && (outMap.get("noOfRowsImpacted")!=null && (Integer)outMap.get("noOfRowsImpacted") >0)) {
				return (List<MiasmaticDetails>)outMap.get("object");
			}else {
				return new ArrayList<MiasmaticDetails>();
			}
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public String deleteMiasmaticPat(MiasmaticDetails miasmaticDetails) {
		try {
			Map outMap = patientServiceDao.deleteMiasmaticPat(miasmaticDetails);
			if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode))
				return "Miasmatic has been Deleted Successfully.";
			else
				return "System is unable to Delete the Miasmatic Details.Please contact your Administrator.";
		}catch(Exception e) {
			return "System is unable to Delete the Miasmatic Details.Please contact your Administrator.";
		}

	}
	
	@Transactional(rollbackFor = Exception.class)
	@Override
	public String createProvDiagnosisPat(ProvisionalDiagnosis provisionalDiagnosis) {
		System.out.println("provisionalDiagnosis>"+provisionalDiagnosis);
		try {
			Map outMap = patientServiceDao.createProvDiagnosisPat(provisionalDiagnosis);
			if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode))
				return "Provisional Diagnosis has been saved Successfully.";
			else if("PatientServiceDaoImplcreateProvDiagnosisPatDuplicate".equals(errorCode))
				return "There is a existing Provisional Diagnosis.Please delete it and save again.";
			else
				return "System is unable to save Provisional Diagnosis.Please contact your Administrator.";
		}catch(Exception e) {
			e.printStackTrace();
			return "System is unable to save Provisional Diagnosis.Please contact your Administrator.";
		}
	}

	@Override
	public List<ProvisionalDiagnosis> retrieveAllProvDiagnosisByPatRefNum(String patrefnum) {
		try {
			System.out.println("retrieveAllProvDiagnosisByPatRefNum patrefnum>"+patrefnum);
			Map outMap = patientServiceDao.retrieveAllProvDiagnosisByPatRefNum(patrefnum);
			System.out.println("retrieveAllProvDiagnosisByPatRefNum>"+outMap);
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode) && outMap.get("object")!=null && (outMap.get("noOfRowsImpacted")!=null && (Integer)outMap.get("noOfRowsImpacted") >0)) {
				return (List<ProvisionalDiagnosis>)outMap.get("object");
			}else {
				return new ArrayList<ProvisionalDiagnosis>();
			}
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}

	}
	
	@Transactional(rollbackFor = Exception.class)
	@Override
	public String deleteProvDiagnosisPat(ProvisionalDiagnosis provisionalDiagnosis) {
		System.out.println("deleteProvDiagnosisPat"+provisionalDiagnosis);
		try {
			Map outMap = patientServiceDao.deleteProvDiagnosisPat(provisionalDiagnosis);
			if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode))
				return "Provisional Diagnosis has been Deleted Successfully.";
			else
				return "System is unable to Delete the Provisional Diagnosis.Please contact your Administrator.";
		}catch(Exception e) {
			return "System is unable to Delete the Provisional Diagnosis.Please contact your Administrator.";
		}
	}
	
	@Transactional(rollbackFor = Exception.class)
	@Override
	public String createPatParticular(PatParticularWrapper patParticularWrapper) {
		System.out.println("createPatParticular>"+patParticularWrapper);
		try {
			Map outMap = patientServiceDao.createPatParticular(patParticularWrapper);
			if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode))
				return "Particular has been saved Successfully.";
			else if("PatientServiceDaoImplcreateProvDiagnosisPatDuplicate".equals(errorCode))
				return "There is a existing Patient Particular.Please delete it and save again.";
			else
				return "System is unable to save Patient Particular.Please contact your Administrator.";
		}catch(Exception e) {
			e.printStackTrace();
			return "System is unable to save Patient Particular.Please contact your Administrator.";
		}
	}
	
	@Transactional(rollbackFor = Exception.class)
	@Override
	public String createRemedySelection(PatRemedySelection patRemedySelection) {
		try {
			Map outMap = patientServiceDao.createRemedySelection(patRemedySelection);
			if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode))
				return "Particular has been saved Successfully.";
			else if("PatientServiceDaoImplcreateProvDiagnosisPatDuplicate".equals(errorCode))
				return "There is a existing Remedy Selection.Please delete it and save again.";
			else
				return "System is unable to save Remedy Selection.Please contact your Administrator.";
		}catch(Exception e) {
			e.printStackTrace();
			return "System is unable to save Remedy Selection.Please contact your Administrator.";
		}
	}
	
	@Transactional(rollbackFor = Exception.class)
	@Override
	public String createPrescription(Prescription prescription) {
		try {
			System.out.println("inside PatientServiceImpl createPrescription...");
			Map outMap = patientServiceDao.createPrescription(prescription);
			if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode))
				return " Prescription has been Created Successfully.";
			else
				return "System is save record.Please contact your Administrator.";
		}catch(Exception e) {
			return "System is unable save record.Please contact your Administrator.";
		}
	}
	
	@Transactional(rollbackFor = Exception.class)
	@Override
	public String saveHistoryOfPastIllness(PatHistoryOfPastIllnessDetails patHistoryOfPastIllnessDetails) {
		try {
			System.out.println("inside PatientServiceImpl saveHistoryOfPastIllness...");
			Map outMap = patientServiceDao.saveHistoryOfPastIllness(patHistoryOfPastIllnessDetails);
			if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode))
				return "History of Past Illness of Patient("+(String)outMap.get("patrefnum")+") has been saved Successfully.";
			else
				return "System is unable to save record.Please contact your Administrator.";
		}catch(Exception e) {
			e.printStackTrace();
			e.printStackTrace();
			return "System is unable to save record.Please contact your Administrator.";
		}
	}
	
	@Transactional(rollbackFor = Exception.class)
	@Override
	public String saveHomeoGeneralities(HomeoGeneralities homeoGeneralities) {
		try {
			System.out.println("inside PatientServiceImpl saveHomeoGeneralities...");
			Map outMap = patientServiceDao.saveHomeoGeneralities(homeoGeneralities);
			if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode))
				return "Homeopathy Generalities of Patient("+(String)outMap.get("patrefnum")+") has been saved Successfully.";
			else
				return "System is unable to save record for Homeopathy Generalities.Please contact your Administrator.";
		}catch(Exception e) {
			e.printStackTrace();
			e.printStackTrace();
			return "System is unable to save record for Homeopathy Generalities.Please contact your Administrator.";
		}
	}
	
	@Override
	public JSONObject uploadFile(HttpServletRequest request) {

		FileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);
		List attachments = null;
		try {
			attachments = upload.parseRequest(new ServletRequestContext(request));
		} catch (FileUploadException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	    	
		Iterator<FileItem> iter = attachments.iterator();
		List<FileUpload> lstFileUpload = new ArrayList<FileUpload>();
		JSONObject objFileUpload = new JSONObject();
		String labreportname ="";
		String labreportdate ="";
		String labreportremarks="";
		String labInvcomplaintid="";
		while (iter.hasNext()) {
			FileItem item = iter.next();
			if (item.isFormField()) {
				String name = item.getFieldName();
				String value = item.getString();
				if("labreportname".equals(name)) {
					labreportname=value;
					objFileUpload.put("labreportname", labreportname);
				}	
				if("labreportdate".equals(name)) {
					labreportdate=value;
					objFileUpload.put("labreportdate", labreportdate);
				}	
				if("labreportremarks".equals(name)) {
					labreportremarks=value;
					objFileUpload.put("labreportremarks", labreportremarks);
				}	
				if("labInvcomplaintid".equals(name)) {
					labInvcomplaintid=value;
					objFileUpload.put("labInvcomplaintid", labInvcomplaintid);
				}	
				System.out.println(value);
			} else {
				String fieldName = item.getFieldName();
				String fileName = item.getName();
				System.out.println(fieldName);
				File directory = new File("D://Softwares//apache-tomcat-8.0.36//webapps//Homeo-Web-App1-Spring//static//upload");
				if (! directory.exists()){
					directory.mkdir();
					// If you require it to make the entire directory path including parents,
					// use directory.mkdirs(); here instead.
				}
				File uploadedFile = new File("D://Softwares//apache-tomcat-8.0.36//webapps//Homeo-Web-App1-Spring//static//upload//" + fileName);
				File directory1 = new File("D://upload");
				if (! directory1.exists()){
					directory1.mkdir();
					// If you require it to make the entire directory path including parents,
					// use directory.mkdirs(); here instead.
				}
				File uploadedFile1 = new File("D://upload//" + fileName);
				try {
					try {
						FileUtils.copyDirectory(new File("D://upload"),new File("D://Softwares//apache-tomcat-8.0.36//webapps//Homeo-Web-App1-Spring//static//upload"));
					} catch (IOException e) {
						e.printStackTrace();
					}
					item.write(uploadedFile);
					try {
						FileUtils.copyDirectory(new File("D://Softwares//apache-tomcat-8.0.36//webapps//Homeo-Web-App1-Spring//static//upload"), new File("D://upload"));
					} catch (IOException e) {
						e.printStackTrace();
					}
					objFileUpload.put("success", "Uploaded Successfully");
					objFileUpload.put("deleteType", "DELETE");
					objFileUpload.put("size", item.getSize());
					objFileUpload.put("type", item.getSize());
					objFileUpload.put("url", "static/upload/"+uploadedFile.getName());
					objFileUpload.put("name", uploadedFile.getName());
					objFileUpload.put("thumbnailUrl", "static/upload/"+uploadedFile.getName());
					objFileUpload.put("deleteUrl", uploadedFile.getCanonicalPath());
					/*objFileUpload.setSuccess("Uploaded Successfully");
					objFileUpload.setError("Uploaded Successfully");
					objFileUpload.setDeleteType("DELETE");
					objFileUpload.setSize(item.getSize()+"");
					objFileUpload.setType(item.getContentType());
					objFileUpload.setUrl(uploadedFile.getAbsolutePath()); 
					objFileUpload.setName(fileName);
					objFileUpload.setThumbnailUrl(uploadedFile.getAbsolutePath());
					objFileUpload.setDeleteUrl(uploadedFile.getCanonicalPath());*/ 
					System.out.println(objFileUpload.toString());
				} catch (Exception e) {
					e.printStackTrace();
					objFileUpload.put("error", "Error :"+e.getMessage());
					System.out.println(objFileUpload.toString());
				}
			}
		}
		JSONArray ja = new JSONArray();
		ja.add(objFileUpload);
		JSONObject obj = new JSONObject(); 
		obj.put("files", ja);
		return obj;
	}
	
	@Override
	public PatRemedySelection retrieveSelectionOfRemedyByPatRefNum(String patrefnum) {
		System.out.println("inside PatientServiceImpl retrieveSelectionOfRemedyByPatRefNum...");
		try {
			Map outMap = patientServiceDao.retrieveSelectionOfRemedyByPatRefNum(patrefnum);
			String errorCode =	(String) outMap.get("errorCode"); 
			if("".equals(errorCode) && outMap.get("object")!=null && (outMap.get("noOfRowsImpacted")!=null && (Integer)outMap.get("noOfRowsImpacted") == 1))
				return (PatRemedySelection)outMap.get("object");
			else
				return null;
		}catch(Exception e) {
			return null;
		}
	}
	
	@Override
	public PatParticular retrieveParticularHeadToFootByPatRefNum(String patrefnum) {
		System.out.println("inside PatientServiceImpl retrieveParticularHeadToFootByPatRefNum...");
		try {
			Map outMap = patientServiceDao.retrieveParticularHeadToFootByPatRefNum(patrefnum);
			String errorCode =	(String) outMap.get("errorCode"); 
			if("".equals(errorCode) && outMap.get("object")!=null && (outMap.get("noOfRowsImpacted")!=null && (Integer)outMap.get("noOfRowsImpacted") == 1))
				return (PatParticular)outMap.get("object");
			else
				return null;
		}catch(Exception e) {
			return null;
		}
	}
	
	@Override
	public HomeoGeneralities retrieveHomeoGeneralitiesByPatRefNum(String patrefnum) {
		System.out.println("inside PatientServiceImpl retrieveHomeoGeneralitiesByPatRefNum...");
		try {
			Map outMap = patientServiceDao.retrieveHomeoGeneralitiesByPatRefNum(patrefnum);
			String errorCode =	(String) outMap.get("errorCode"); 
			if("".equals(errorCode) && outMap.get("object")!=null && (outMap.get("noOfRowsImpacted")!=null && (Integer)outMap.get("noOfRowsImpacted") == 1))
				return (HomeoGeneralities)outMap.get("object");
			else
				return null;
		}catch(Exception e) {
			return null;
		}
	}
	
	@Override
	public ExaminationDetails retrieveExaminationOfPatByPatRefNum(String patrefnum) {
		System.out.println("inside PatientServiceImpl retrieveExaminationOfPatByPatRefNum...");
		try {
			Map outMap = patientServiceDao.retrieveExaminationOfPatByPatRefNum(patrefnum);
			String errorCode =	(String) outMap.get("errorCode"); 
			if("".equals(errorCode) && outMap.get("object")!=null && (outMap.get("noOfRowsImpacted")!=null && (Integer)outMap.get("noOfRowsImpacted") == 1))
				return (ExaminationDetails)outMap.get("object");
			else
				return null;
		}catch(Exception e) {
			return null;
		}
	}
	
	@Override
	public List<PatPersonalDetails> retrieveAllPatientDetails() {
		try {
			Map outMap = patientServiceDao.retrieveAllPatientDetails();
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode) && outMap.get("object")!=null && (outMap.get("noOfRowsImpacted")!=null && (Integer)outMap.get("noOfRowsImpacted") >0)) {
				return (List<PatPersonalDetails>)outMap.get("object");
			}else {
				return null;
			}
		}catch(Exception e) {
			return null;
		}
	}
	@Override
	public List<PatPersonalDetails> retrievePatientDetailsByDifferentParameters(PatPersonalDetails patPersonalDetails) {
		System.out.println("retrievePatientDetailsByDifferentParameters---"+patPersonalDetails);
		try {
			Map outMap = patientServiceDao.retrievePatientDetailsByDifferentParameters(patPersonalDetails);
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode) && outMap.get("object")!=null && (outMap.get("noOfRowsImpacted")!=null && (Integer)outMap.get("noOfRowsImpacted") >0)) {
				return (List<PatPersonalDetails>)outMap.get("object");
			}else {
				return null;
			}
		}catch(Exception e) {
			return null;
		}
	}
	
	@Override
	public PatPersonalDetails retrieveIntroductionByPatRefNum(String patrefnum) {
		System.out.println("inside PatientServiceImpl retrieveSelectionOfRemedyByPatRefNum...");
		try {
			Map outMap = patientServiceDao.retrieveIntroductionByPatRefNum(patrefnum);
			String errorCode =	(String) outMap.get("errorCode"); 
			if("".equals(errorCode) && outMap.get("object")!=null && (outMap.get("noOfRowsImpacted")!=null && (Integer)outMap.get("noOfRowsImpacted") == 1))
				return (PatPersonalDetails)outMap.get("object");
			else
				return null;
		}catch(Exception e) {
			return null;
		}
	}
	
	@Transactional(rollbackFor = Exception.class)
	@Override
	public String saveexaminationofpatientdetails(ExaminationDetails examinationDetails) {
		try {
			System.out.println("inside PatientServiceImpl saveexaminationofpatientdetails...");
			Map outMap = patientServiceDao.saveexaminationofpatientdetails(examinationDetails);
			if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode))
				return "Examination Details of Patient("+(String)outMap.get("patrefnum")+") has been saved Successfully.";
			else
				return "System is unable to save record.Please contact your Administrator.";
		}catch(Exception e) {
			e.printStackTrace();
			e.printStackTrace();
			return "System is unable to save record.Please contact your Administrator.";
		}
	}

}
