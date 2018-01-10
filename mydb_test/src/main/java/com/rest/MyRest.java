package com.rest;
 
import java.util.Date;
import com.data.User;
import java.util.ArrayList;
 
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
 
@Path("/")
public class MyRest 
{
	ArrayList<User> users=new ArrayList<User>();
	
	@GET
	@Produces("text/html")
	public Response getStartingPage()
	{
		String output = "<h1>Hello World!<h1>" +
				"<p>RESTful Service is running ... <br>Ping @ " + new Date().toString() + "</p<br>";
		return Response.status(200).entity(output).build();
	}
	
	@GET
	@Path("/user")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUsers()
	{
		//String[] hbb = new String[]{"Foo","Bar","Baz"};
		User myUser= new User("sanu","29","nedumtharayil",new String[]{"Cricket","BasketBall"});
		return myUser;
	}
	
	@POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response postStudentRecord(User user){
		users.add(user);
		String result = "Record entered: "+ user;
		return Response.status(201).entity(result).build();	
	}
	
	@GET
	@Path("/listUsers")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<User> getUserList()
	{
		return users;
	}
	
}