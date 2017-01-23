package edu.upc.dsa;

import edu.upc.dsa.estructura.DAO;
import edu.upc.dsa.estructura.Lugares;

import javax.json.JsonReader;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("juego")
public class Juego extends DAO {
    private EtakemonManager etkManager;
    protected List<Lugares> etakLocalización;
    List<String> listEtak = new ArrayList<>();

   // public Juego() {
      //  etkManager = new EtakemonManagerBBDD();
    //}

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @Path("/location")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Lugares> localizaciones() {
        etakLocalización = new ArrayList<>();
        listEtak = selectLocalizacion();
        int i = 0;

        while (i < listEtak.size()) {
            Lugares etakolugar = new Lugares();

            String id = listEtak.get(i);
            String name = listEtak.get(i+1);
            String lat = listEtak.get(i+2);
            String lon = listEtak.get(i+3);
            etakolugar.setIdlugares(id);
            etakolugar.setNombre(name);
            etakolugar.setLatitud(lat);
            etakolugar.setLongitud(lon);
             etakLocalización.add(etakolugar);
            i= i+4;
            System.out.println("lista: " + etakLocalización);
                        //    List<Evento> eventos =etkManager.getGames(idUser);
        }
        return etakLocalización;
    }
    @Path("exception")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String throwIt() throws Exception {
        throw new Exception("My Exception");
    }

}
