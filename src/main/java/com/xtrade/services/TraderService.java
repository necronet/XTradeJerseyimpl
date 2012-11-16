package com.xtrade.service;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/trader")
public class TraderService {

@GET
public String getMessage(){
	return "hola Mundo";
}

}
