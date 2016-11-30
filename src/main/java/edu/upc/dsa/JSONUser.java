package edu.upc.dsa;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pauli on 29/11/2016.
 */

@Path("/user")
public class JSONUser {

    protected List<User> listUser;

    public JSONUser() {
       listUser = new ArrayList<>();
        User u1 = new User();
        u1.setIdUser(1);
        u1.setName("Antonio");
        u1.setEmail("aoller@entel.upc.edu");
        u1.setNick("TekJson");
        u1.setBattle(2);
        u1.setBattleWon(1);
        listUser.add(u1);

        User u2 = new User();
        u2.setIdUser(2);
        u2.setName("Juan");
        u2.setEmail("juan.lopez-rubio@upc.edu");
        u2.setNick("JekJson");
        u2.setBattle(4);
        u2.setBattleWon(2);
        listUser.add(u2);
    }

    @GET
    @Path("/{idUser}")
    @Produces(MediaType.APPLICATION_JSON)
    public User getidUser(@PathParam("idUser") Integer idUser){

        return listUser.get(idUser);
    }

    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUserInJSON(){


      User user = new User();
        user.setNick("JekJson");


        return user;
    }

    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createUserInJSON(User user){

        String result = "User guaradado: " +user;
        return Response.status(201).entity(result).build();
    }

}
