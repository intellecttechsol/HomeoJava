package com.homeo.restws.dao;

import java.util.Map;

import com.homeo.restws.model.*;

public interface PatientServiceDao {
	Map createPersonalDetails(PatPersonalDetails patPersonalDetails) ;
	
	Map updatePersonalDetails(PatPersonalDetails patPersonalDetails) ;
	
	Map createComplaintDetails(ComplaintDetails complaintDetails) ;
	
	Map updateComplaintDetails(ComplaintDetails complaintDetails) ;
	
	Map createComplaintFollowupDetails(ComplaintFollowupDetails complaintFollowupDetails) ;
	
	Map updateComplaintFollowupDetails(ComplaintFollowupDetails complaintFollowupDetails) ;
	
	Map createIntraUterineLife(IntraUterineLife intraUterineLife) ;
	
	Map updateIntraUterineLife(IntraUterineLife intraUterineLife) ;

	Map createPatBirthInfo(PatBirthInfo patBirthInfo) ;
	
	Map updatePatBirthInfo(PatBirthInfo patBirthInfo) ;
	
	Map createPatPersonalHistory(PatPersonalHistory patPersonalHistory) ;
	
	Map updatePatPersonalHistory(PatPersonalHistory patPersonalHistory) ;
	
	Map storePatFamilyHistory(PatFamilyHistory patFamilyHistory) ;
	
	
	//arijit da code
	Map createMiasmaticForPat(MiasmaticDetails miasmaticDetails) ;
	Map retrieveAllMiasmaticByPatRefNum(String patrefnum);
	Map deleteMiasmaticPat(MiasmaticDetails miasmaticDetails) ;
	
	Map createProvDiagnosisPat(ProvisionalDiagnosis provisionalDiagnosis) ;
	Map retrieveAllProvDiagnosisByPatRefNum(String patrefnum);
	Map deleteProvDiagnosisPat(ProvisionalDiagnosis provisionalDiagnosis) ;
	
	Map createPatParticular(PatParticularWrapper patParticularWrapper) ;
	
	Map createRemedySelection(PatRemedySelection patRemedySelection) ;
	
	Map createPrescription(Prescription prescription) ;
	
	Map saveHistoryOfPastIllness(PatHistoryOfPastIllnessDetails patHistoryOfPastIllnessDetails) ;
	
	Map saveHomeoGeneralities(HomeoGeneralities homeoGeneralities) ;
	
	Map retrieveSelectionOfRemedyByPatRefNum(String patrefnum);
	
	Map retrieveParticularHeadToFootByPatRefNum(String patrefnum);
	
	Map retrieveHomeoGeneralitiesByPatRefNum(String patrefnum);
	
	Map retrieveExaminationOfPatByPatRefNum(String patrefnum);
	
	Map saveexaminationofpatientdetails(ExaminationDetails examinationDetails) ;
	
	Map retrieveAllPatientDetails();
	Map retrievePatientDetailsByDifferentParameters(PatPersonalDetails patPersonalDetails);
	Map retrieveIntroductionByPatRefNum(String patrefnum);
}
