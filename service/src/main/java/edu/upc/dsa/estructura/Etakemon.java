package edu.upc.dsa.estructura;

/**
 * Created by ivanm on 15/12/2016.
 */
public class Etakemon extends DAO {

    public int idetakemon;
    public String nombre;
    public String descripcion;

    public Etakemon(){ //si lo creas vacio
        super();
    }

    public Etakemon(int idetakemon, String nombre, String descripcion) {
        super();
        this.idetakemon = idetakemon;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getIdetakemon() {
        return idetakemon;
    }

    public void setIdetakemon(int idetakemon) {
        this.idetakemon = idetakemon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
