package com.homeo.restws.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.servlet.http.HttpServletRequest;

import com.homeo.restws.model.*;
import org.json.simple.JSONObject;

//future we need to secure the request

@Path("/patientservice")
public interface PatientService {

	/*http://localhost:8080/Homeo-RestWS/services/patientservice/createPatPersonal*/
	@POST
	@Path("createPatPersonal")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	String createPatPersonal(PatPersonalDetails patPersonalDetails);
	
	@POST
	@Path("updatePatPersonal")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	String updatePersonalDetails(PatPersonalDetails patPersonalDetails);

	//http://localhost:8082/Homeo-RestWS/services/userservice/retrieveUserByUsername/<username>
	/*@GET
	@Path("retrieveUserByUsername/{username}")
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	HomeoProdUser retrieveUserByUsername(@PathParam("username") String username);

	//http://localhost:8082/Homeo-RestWS/services/userservice/retrieveAllUsers
	@GET
	@Path("retrieveAllUsers")
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<HomeoProdUser> retrieveAllUsers();

	//http://localhost:8082/Homeo-RestWS/services/userservice/updateUser
	@POST
	@Path("updateUser")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	String updateUser(HomeoProdUser homeoProdUser);

	//http://localhost:8082/Homeo-RestWS/services/userservice/deleteUserByUsername/<username>
	@POST
	@Path("deleteUserByUsername/{username}")
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	String deleteUserByUsername(@PathParam("username") String username);*/
	
	/*http://localhost:8082/Homeo-RestWS/services/userservice/createUser*/
	@POST
	@Path("createComplaintDetails")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	String createComplaintDetails(ComplaintDetails complaintDetails);
	
	@POST
	@Path("updateComplaintDetails")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	String updateComplaintDetails(ComplaintDetails complaintDetails);
	
	@POST
	@Path("createComplaintFollowupDetails")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	String createComplaintFollowupDetails(ComplaintFollowupDetails complaintFollowupDetails);
	
	@POST
	@Path("updateComplaintFollowupDetails")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	String updateComplaintFollowupDetails(ComplaintFollowupDetails complaintFollowupDetails);
	
	@POST
	@Path("createIntraUterineLife")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	String createIntraUterineLife(IntraUterineLife intraUterineLife);
	
	@POST
	@Path("updateIntraUterineLife")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	String updateIntraUterineLife(IntraUterineLife intraUterineLife);
	
	@POST
	@Path("createPatBirthInfo")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	String createPatBirthInfo(PatBirthInfo patBirthInfo);
	
	@POST
	@Path("updatePatBirthInfo")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	String updatePatBirthInfo(PatBirthInfo patBirthInfo);
	
	@POST
	@Path("createPatPersonalHistory")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	String createPatPersonalHistory(PatPersonalHistory patPersonalHistory);
	
	@POST
	@Path("updatePatPersonalHistory")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	String updatePatPersonalHistory(PatPersonalHistory patPersonalHistory);
	
	@POST
	@Path("storePatFamilyHistory")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	String storePatFamilyHistory(PatFamilyHistory patFamilyHistory);
	
	
	//arijit da code
	/*http://localhost:8082/Homeo-RestWS/services/patientservice/createMiasmaticForPat*/
	@POST
	@Path("createMiasmaticForPat")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	String createMiasmaticForPat(MiasmaticDetails miasmaticDetails) ;
	
	/*http://localhost:8082/Homeo-RestWS/services/patientservice/retrieveAllMiasmaticByPatRefNum/<patrefnum>*/
	@GET
	@Path("retrieveAllMiasmaticByPatRefNum/{patrefnum}")
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<MiasmaticDetails> retrieveAllMiasmaticByPatRefNum(@PathParam("patrefnum") String patrefnum);
	
	/*http://localhost:8082/Homeo-RestWS/services/patientservice/deleteMiasmaticPat*/
	@POST
	@Path("deleteMiasmaticPat")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	String deleteMiasmaticPat(MiasmaticDetails miasmaticDetails) ;
	
	/*http://localhost:8082/Homeo-RestWS/services/patientservice/createProvDiagnosisPat*/
	@POST
	@Path("createProvDiagnosisPat")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	String createProvDiagnosisPat(ProvisionalDiagnosis provisionalDiagnosis) ;
	
	/*http://localhost:8082/Homeo-RestWS/services/patientservice/retrieveAllProvDiagnosisByPatRefNum/<patrefnum>*/
	@GET
	@Path("retrieveAllProvDiagnosisByPatRefNum/{patrefnum}")
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<ProvisionalDiagnosis> retrieveAllProvDiagnosisByPatRefNum(@PathParam("patrefnum") String patrefnum);
	
	/*http://localhost:8082/Homeo-RestWS/services/patientservice/deleteProvDiagnosisPat*/
	@POST
	@Path("deleteProvDiagnosisPat")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	String deleteProvDiagnosisPat(ProvisionalDiagnosis provisionalDiagnosis) ;
	
	/*http://localhost:8082/Homeo-RestWS/services/patientservice/createPatParticular*/
	@POST
	@Path("createPatParticular")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	String createPatParticular(PatParticularWrapper patParticularWrapper) ;
	
	/*
	http://localhost:8082/Homeo-RestWS/services/patientservice/retrieveAllProvDiagnosisByPatRefNum/<patrefnum>
	@GET
	@Path("retrieveAllProvDiagnosisByPatRefNum/{patrefnum}")
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<ProvisionalDiagnosis> retrieveAllPatParticularByPatRefNum(@PathParam("patrefnum") String patrefnum);
	
	http://localhost:8082/Homeo-RestWS/services/patientservice/deleteProvDiagnosisPat
	@POST
	@Path("deleteProvDiagnosisPat")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	String deletePatParticular(PatParticularWrapper patParticularWrapper) ;*/
	
	/*http://localhost:8082/Homeo-RestWS/services/patientservice/createPatParticular*/
	@POST
	@Path("createRemedySelection")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	String createRemedySelection(PatRemedySelection patRemedySelection) ;
	
	/*http://localhost:8082/Homeo-RestWS/services/patientservice/createPrescription*/
	@POST
	@Path("createPrescription")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	String createPrescription(Prescription prescription) ;
	
	/*http://localhost:8082/Homeo-RestWS/services/patientservice/saveHistoryOfPastIllness*/
	@POST
	@Path("saveHistoryOfPastIllness")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	String saveHistoryOfPastIllness(PatHistoryOfPastIllnessDetails patHistoryOfPastIllnessDetails);
	
	/*http://localhost:8082/Homeo-RestWS/services/patientservice/saveHistoryOfPastIllness*/
	@POST
	@Path("saveHomeoGeneralities")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	String saveHomeoGeneralities(HomeoGeneralities homeoGeneralities);
	
	/*http://localhost:8082/Homeo-RestWS/services/patientservice/uploadFile*/
	@POST
	@Path("uploadFile")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	@Produces(MediaType.APPLICATION_JSON)     
	JSONObject uploadFile(@Context HttpServletRequest request) ;
	
	
	//http://localhost:8080/Homeo-RestWS/services/patientservice/retrieveSelectionOfRemedyByPatRefNum/<patrefnum>
	@GET
	@Path("retrieveSelectionOfRemedyByPatRefNum/{patrefnum}")
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	PatRemedySelection retrieveSelectionOfRemedyByPatRefNum(@PathParam("patrefnum") String patrefnum);
	
	//http://localhost:8080/Homeo-RestWS/services/patientservice/retrieveHomeoGeneralitiesByPatRefNum/<patrefnum>
	@GET
	@Path("retrieveHomeoGeneralitiesByPatRefNum/{patrefnum}")
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	HomeoGeneralities retrieveHomeoGeneralitiesByPatRefNum(@PathParam("patrefnum") String patrefnum);
	
	//http://localhost:8080/Homeo-RestWS/services/patientservice/retrieveExaminationOfPatByPatRefNum/<patrefnum>
	@GET
	@Path("retrieveExaminationOfPatByPatRefNum/{patrefnum}")
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	ExaminationDetails retrieveExaminationOfPatByPatRefNum(@PathParam("patrefnum") String patrefnum);
	
	//http://localhost:8080/Homeo-RestWS/services/patientservice/retrieveParticularHeadToFootByPatRefNum/<patrefnum>
	@GET
	@Path("retrieveParticularHeadToFootByPatRefNum/{patrefnum}")
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	PatParticular retrieveParticularHeadToFootByPatRefNum(@PathParam("patrefnum") String patrefnum);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//http://localhost:8082/Homeo-RestWS/services/diseaseservice/retrieveAllPatientDetails
	@GET
	@Path("retrieveAllPatientDetails")
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<PatPersonalDetails> retrieveAllPatientDetails();

	/*http://localhost:8082/Homeo-RestWS/services/diseaseservice/retrieveDiseasesByDifferentParameters*/
	@POST
	@Path("retrievePatientDetailsByDifferentParameters")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	List<PatPersonalDetails> retrievePatientDetailsByDifferentParameters(PatPersonalDetails patPersonalDetails);
	
	//http://localhost:8080/Homeo-RestWS/services/patientservice/retrieveIntroductionByPatRefNum/<patrefnum>
	@GET
	@Path("retrieveIntroductionByPatRefNum/{patrefnum}")
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	PatPersonalDetails retrieveIntroductionByPatRefNum(@PathParam("patrefnum") String patrefnum);
	
	/*http://localhost:8080/Homeo-RestWS/services/patientservice/saveexaminationofpatientdetails*/
	@POST
	@Path("saveexaminationofpatientdetails")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	String saveexaminationofpatientdetails(ExaminationDetails examinationDetails);
}
