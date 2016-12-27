package edu.upc.dsa.entity;

import edu.upc.dsa.dao.funcionesDAO;

/**
 * Created by ivanm on 15/12/2016.
 */
public class Lugares extends funcionesDAO {

    public int idlugares;
    public String nombre;
    public int latitud;
    public int longitud;

    public Lugares(){
        super();
    }

    public Lugares(int idlugares, String nombre, int latitud, int longitud) {
        this.idlugares = idlugares;
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public int getIdlugares() {
        return idlugares;
    }

    public void setIdlugares(int idlugares) {
        this.idlugares = idlugares;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLatitud() {
        return latitud;
    }

    public void setLatitud(int latitud) {
        this.latitud = latitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}
