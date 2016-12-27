package edu.upc.dsa;

import edu.upc.dsa.entity.Usuario;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by pauli on 29/11/2016.
 */

@Path("/user")
public class JSONUser {

    public List<Usuario> listUsuario;

  /*  public JSONUser() {
       listUsuario = new ArrayList<>();
        Usuario u1 = new Usuario();
        u1.setIdusuario(1);
        u1.setName("Antonio");
        u1.setPassword("contraseña");
        u1.setEmail("aoller@entel.upc.edu");
        u1.setNick("TekJson");
        u1.setBattle(2);
        u1.setBattleWon(1);
        listUsuario.add(u1);

        Usuario u2 = new Usuario();
        u2.setIdusuario(2);
        u2.setName("Juan");
        u2.setEmail("juan.lopez-rubio@upc.edu");
        u2.setNick("JekJson");
        u2.setBattle(4);
        u2.setBattleWon(2);
        listUsuario.add(u2);
    }*/

    @GET
    @Path("/{idUser}/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getidUser(@PathParam("idUser") Integer idUser,@PathParam("name") String name){

        return (listUsuario.get(idUser).getNick()+":" + listUsuario.get(idUser).getPassword());
    }

    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public Usuario getUserInJSON(){


      Usuario usuario = new Usuario();
        usuario.setNick("JekJson");


        return usuario;
    }

    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createUserInJSON(Usuario usuario){

        String result = "Usuario guaradado: " + usuario;
        return Response.status(201).entity(result).build();
    }

}
