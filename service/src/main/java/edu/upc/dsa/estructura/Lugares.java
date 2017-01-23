package edu.upc.dsa.estructura;

/**
 * Created by ivanm on 15/12/2016.
 */
public class Lugares extends DAO {

    public String idlugares;
    public String nombre;
    public String latitud;
    public String longitud;

    public Lugares() {
        super();
    }


    public Lugares(String idlugares, String nombre, String latitud, String longitud) {
        this.idlugares = idlugares;
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public String getIdlugares() {
        return idlugares;
    }

    public void setIdlugares(String idlugares) {
        this.idlugares = idlugares;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }
}