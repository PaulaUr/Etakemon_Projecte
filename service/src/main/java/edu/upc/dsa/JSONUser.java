package edu.upc.dsa;

import edu.upc.dsa.estructura.DAO;
import edu.upc.dsa.estructura.Usuario;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pauli on 29/11/2016.
 */

@Path("/user")
public class JSONUser extends DAO{

   protected List<Usuario> listUsuario;
    //List<Integer> lista = new ArrayList<>();
    List<String> lista = new ArrayList<>();
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

       // Usuario usuario = new Usuario();
        System.out.println("USER - LOGIN!!!!!");
        String mensaje= "Bienvenido: " +usuario.getNick();

    return "{\"mensaje\": \""+mensaje+"\" }";
    }

    @POST
    @Path("/register")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
 //   public String registro(@FormParam("idusuario") Integer idUsuario, @FormParam("nombre") String nombre,@FormParam("nick") String nick,
                        //   @FormParam("email") String email, @FormParam("password") String password,@FormParam("batganadas") Integer batganadas,
                          // @FormParam("batjugadas") Integer batjugadas, @FormParam("experiencia") Integer experiencia) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
    public String registro(Usuario registerUser) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        //String response="";
     //   if( String nombre== null || nick==null|| email ==null || password==null)
       //  throw new BadRequestException("todos los campos son obligatorios");

        //Usuario usuario = new Usuario(0,nombre,nick,password,email,0,0,0);
        //usuario.insert();
        Usuario usuario = new Usuario(registerUser.idUsuario,registerUser.nombre,registerUser.nick,registerUser.email,registerUser.password,0,0,0);
        usuario.insert();
        System.out.println("USER - REGiSTRO!!!!!");


       String mensaje = "Bienvenido: " + usuario.getNick() + " ya eres usuario de PlayEtakemon";
        return "{\"mensaje\": \""+mensaje+"\"}";
    }

    @GET
    @Path("/perfil/{nick}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Usuario> perfilUsuario(@PathParam("nick") String nick){
        listUsuario = new ArrayList<>();
        lista = select(nick);
        int i=0;
        while(i<listUsuario.size()) {
            Usuario usuario = new Usuario();
            String id= lista.get(i);
            String name = lista.get(i+1);
            //String nick = lista.get(i+2);
            String email = lista.get(i+3);
            String batganadas= lista.get(i+4);
            String batjugadas = lista.get(i+5);
            String experiencia = lista.get(i+6);
            usuario.setIdUsuario(Integer.valueOf(id));
            usuario.setNombre(name);
            usuario.setEmail(email);
            usuario.setBatganadas(Integer.parseInt(batganadas));
            usuario.setBatjugadas(Integer.parseInt(batjugadas));
            usuario.setExperiencia(Integer.parseInt(experiencia));
            listUsuario.add(usuario);
            i=i+7;
            String mensaje = "Bienvenido: " +listUsuario + " ya eres usuario de PlayEtakemon";
        }

        return listUsuario;
    }

}
