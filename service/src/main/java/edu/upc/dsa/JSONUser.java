package edu.upc.dsa;

import edu.upc.dsa.estructura.DAO;
import edu.upc.dsa.estructura.Usuario;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by pauli on 29/11/2016.
 */

@Path("/user")
public class JSONUser extends DAO {

   public List<Usuario> listUsuario;
    public List<Integer> listPerfil;
/*
    public JSONUser() {
       listUsuario = new ArrayList<>();
        Usuario u1 = new Usuario();
        u1.setIdUsuario(1);
        u1.setNombre("Antonio");
        u1.setPassword("contraseña");
        u1.setEmail("aoller@entel.upc.edu");
        u1.setNick("TekJson");
        u1.setBatjugadas(2);
        u1.setBatganadas(1);
        listUsuario.add(u1);

        Usuario u2 = new Usuario();
        u2.setIdUsuario(2);
        u2.setNombre("Juan");
        u2.setEmail("juan.lopez-rubio@upc.edu");
        u2.setNick("JekJson");
        u2.setBatjugadas(4);
        u2.setBatganadas(2);
        listUsuario.add(u2);
    }

    @GET
    @Path("/{idUser}/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getidUser(@PathParam("idUser") Integer idUser,@PathParam("name") String name){

        return (listUsuario.get(idUser).getNick()+":" + listUsuario.get(idUser).getPassword());
    }*/

    @POST
    @Path("/login")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    //public String login(@PathParam("nick") String nick, @PathParam("password") String password){
     public String login(Usuario usuario){

        String mensaje= "Bienvenido: " +usuario.getNick();
    return mensaje;
    }


    @GET
    @Path("/perfil/{idUsuario}")
    @Produces(MediaType.APPLICATION_JSON)
    public Usuario perfilUsuario(@PathParam("idUsuario") Integer idUsuario){

        listPerfil = select(idUsuario);

        Usuario usuario = new Usuario();


        return usuario;
    }

}
