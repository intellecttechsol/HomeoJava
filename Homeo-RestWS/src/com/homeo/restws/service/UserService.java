package com.homeo.restws.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.homeo.restws.model.HomeoProdUser;

//future we need to secure the request

@Path("/userservice")
public interface UserService {

	/*http://localhost:8082/Homeo-RestWS/services/userservice/createUser*/
	@POST
	@Path("createUser")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	String createUser(HomeoProdUser homeoProdUser);

	//http://localhost:8082/Homeo-RestWS/services/userservice/retrieveUserByUsername/<username>
	@GET
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
	String deleteUserByUsername(@PathParam("username") String username);
}
