package com.homeo.restws.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.homeo.restws.model.Medicine;

//future we need to secure the request

@Path("/medicineservice")
public interface MedicineService {

	/*http://localhost:8082/Homeo-RestWS/services/medicineservice/addMedicine*/
	@POST
	@Path("addMedicine")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	String addMedicine(Medicine medicine);

	//http://localhost:8082/Homeo-RestWS/services/medicineservice/retrieveMedicineByCode/<medcode>
	@GET
	@Path("retrieveMedicineByCode/{medcode}")
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	Medicine retrieveMedicineByCode(@PathParam("medcode") String medcode);

	//http://localhost:8082/Homeo-RestWS/services/medicineservice/retrieveMedicinesByComp/<medcompname>
	@GET
	@Path("retrieveMedicinesByComp/{medcompname}")
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Medicine> retrieveMedicinesByComp(@PathParam("medcompname") String medcompname);

	//http://localhost:8082/Homeo-RestWS/services/medicineservice/updateMedicine
	@POST
	@Path("updateMedicine")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	String updateMedicine(Medicine medicine);

	//http://localhost:8082/Homeo-RestWS/services/medicineservice/deleteMedicine/<medcode>
	@POST
	@Path("deleteMedicine/{medcode}")
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	String deleteMedicine(@PathParam("medcode") String medcode);

	//http://localhost:8082/Homeo-RestWS/services/medicineservice/retrieveAllMedicines
	@GET
	@Path("retrieveAllMedicines")
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Medicine> retrieveAllMedicines();

	/*http://localhost:8082/Homeo-RestWS/services/medicineservice/retrieveMedicinesByDifferentParameters*/
	@POST
	@Path("retrieveMedicinesByDifferentParameters")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	List<Medicine> retrieveMedicinesByDifferentParameters(Medicine medicine);

	//http://localhost:8082/Homeo-RestWS/services/medicineservice/retrieveMedicineByMedName/<medname>
	@GET
	@Path("retrieveMedicineByMedName/{medname}")
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	List<Medicine> retrieveMedicineByMedName(@PathParam("medname") String medname);

}
