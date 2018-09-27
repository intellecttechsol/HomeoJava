package com.homeo.restws.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.homeo.restws.model.MasterRecords;

//future we need to secure the request

@Path("/recordservice")
public interface MasterRecordService {

	/*http://localhost:8082/Homeo-RestWS/services/recordservice/createRecord*/
	@POST
	@Path("createRecord")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	String createRecord(MasterRecords masterRecords);

	//http://localhost:8082/Homeo-RestWS/services/recordservice/retrieveRecordByCode/<code>
	@GET
	@Path("retrieveRecordByCode/{code}")
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	MasterRecords retrieveRecordByCode(@PathParam("code") String code);

	//http://localhost:8082/Homeo-RestWS/services/recordservice/retrieveRecordsByType/<type>
	@GET
	@Path("retrieveRecordsByType/{type}")
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<MasterRecords> retrieveRecordsByType(@PathParam("type") String type);

	//http://localhost:8082/Homeo-RestWS/services/recordservice/updateRecord
	@POST
	@Path("updateRecord")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	String updateRecord(MasterRecords masterRecords);

}
