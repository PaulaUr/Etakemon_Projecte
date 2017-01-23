package edu.upc.dsa;

import edu.upc.dsa.estructura.Lugares;
import edu.upc.dsa.estructura.Usuario;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.grizzly.http.server.StaticHttpHandler;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.sql.SQLException;

/**
 * Main class.
 */
public class Main {
    // Base URI the Grizzly HTTP server will listen on
     public static final String BASE_URI = "http://10.193.184.73:8080/myapp/";

/*
    private static String baseURI;
    //implementar este método para q cargue el conexto del fichero de configuracion
    public static String getBaseURI() {
        if(baseURI ==null){
            PropertyResourceBundle prb = (PropertyResourceBundle) ResourceBundle.getBundle("etakemon");
            baseURI = prb.getString("etakemon.context");
        }
        return baseURI;
    }*/
    /**
     * Starts Grizzly HTTP server exposing JAX-RS resources defined in this application.
     * @return Grizzly HTTP server.
     */
   public static HttpServer startServer() {
        // create a resource config that scans for JAX-RS resources and providers
        // in edu.upc.dsa package
        final ResourceConfig rc = new ResourceConfig().packages("edu.upc.dsa");

        // create and start a new instance of grizzly http server
        // exposing the Jersey application at BASE_URI
        return GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), rc);
    }


    /**
     * Main method.
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, SQLException {

      //  Usuario usuario = new Usuario("saretakemon","sara",0,0,0);
        //usuario.insert();
       // Lugares lugar = new Lugares();
        //lugar.selectLocalizacion();


        final HttpServer server = startServer();

     //   StaticHttpHandler staticHttpHandler = new StaticHttpHandler("./public/");
       // server.getServerConfiguration().addHttpHandler(staticHttpHandler, "/");

        System.out.println(String.format("Jersey app started with WADL available at "
                + "%sapplication.wadl\nHit enter to stop it...", BASE_URI));
        System.in.read();
        // server.stop();
        server.shutdownNow();

    }

    }


