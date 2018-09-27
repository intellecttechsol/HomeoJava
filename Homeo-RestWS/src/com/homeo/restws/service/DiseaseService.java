package com.homeo.restws.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.homeo.restws.model.Disease;

//future we need to secure the request

@Path("/diseaseservice")
public interface DiseaseService {

	/*http://localhost:8082/Homeo-RestWS/services/diseaseservice/addDisease*/
	@POST
	@Path("addDisease")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	String addDisease(Disease disease);

	//http://localhost:8082/Homeo-RestWS/services/diseaseservice/updateDisease
	@POST
	@Path("updateDisease")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	String updateDisease(Disease disease);

	//http://localhost:8082/Homeo-RestWS/services/diseaseservice/deleteDisease/<diseasename>
	@POST
	@Path("deleteDisease/{diseasename}")
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	String deleteDisease(@PathParam("diseasename") String diseasename);

	//http://localhost:8082/Homeo-RestWS/services/diseaseservice/retrieveAllDiseases
	@GET
	@Path("retrieveAllDiseases")
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Disease> retrieveAllDiseases();

	/*http://localhost:8082/Homeo-RestWS/services/diseaseservice/retrieveDiseasesByDifferentParameters*/
	@POST
	@Path("retrieveDiseasesByDifferentParameters")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	List<Disease> retrieveDiseasesByDifferentParameters(Disease Disease);
	
	/*http://localhost:8082/Homeo-RestWS/services/diseaseservice/retrieveDiseasesByGender/<diseasegender>*/
	@GET
	@Path("retrieveDiseasesByGender/{diseasegender}")
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	List<Disease> retrieveDiseasesByGender(@PathParam("diseasegender") String diseasegender);

	//http://localhost:8082/Homeo-RestWS/services/diseaseservice/retrieveDiseaseByDiseaseName/<diseasename>
	@GET
	@Path("retrieveDiseaseByDiseaseName/{diseasename}")
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	List<Disease> retrieveDiseaseByDiseaseName(@PathParam("diseasename") String diseasename);

}
