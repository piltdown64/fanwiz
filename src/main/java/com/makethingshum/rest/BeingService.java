package com.makethingshum.rest;

//import com.makethingshum.client.HelloJerseyClient;

import com.makethingshum.fantasy.Animal;
import com.makethingshum.fantasy.Being;
import com.makethingshum.fantasy.builders.BeingBuilder;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.security.NoSuchAlgorithmException;

@Path("/fantasy")
public class BeingService {

	@GET
	@Path("/{param}")
	public Response getMsg(@Context HttpHeaders httpHeaders, @PathParam("param") String msg) throws NoSuchAlgorithmException {

//		MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");

		String output = "Jersey says : " + msg;
//		output = output +" "+ Arrays.toString(messageDigest.digest(output.getBytes()));

		return Response.status(200).entity(output).build();

	}

	@GET
	@Path("/object")
	@Produces(MediaType.APPLICATION_JSON)
	public Being getSomeObject() {

//		return BeingBuilder.aBeing().withAge(1).withAnimal(Animal.DRAGON).withFirstName("John").build();
 return null;
	}

	@GET
	@Path("/object/{param}")
	@Produces(MediaType.APPLICATION_JSON)
	public Being getSomeObjectSpecifyingName(@PathParam("param") String theName) {

		return BeingBuilder.aBeing().withAge(1).withAnimal(Animal.DRAGON).withFirstName(theName).build();

	}

//	@GET
//	@Path("/clientGet")
//	@Produces(MediaType.APPLICATION_JSON)
//	public SomeObject getObjectViaClient() {
//
//		HelloJerseyClient helloJerseyClient = new HelloJerseyClient();
//
//		return helloJerseyClient.getObject();
//
//	}

}