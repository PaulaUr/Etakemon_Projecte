package edu.upc.eetac.dsa.etakemon_projecte.estructura;

/**
 * Created by pauli on 16/01/2017.
 */

public class Usuario {

    private String nick;
    private String nombre;
    private Integer idUsuario;
    private String contraseña;
    private String email;
    private  int batganadas;
    private int batjugadas;
    private int experiencia;


    public Usuario() {
        super();
    }

    public Usuario(String nick, String contraseña) {
        this.nick = nick;
        this.contraseña = contraseña;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getBatganadas() {
        return batganadas;
    }

    public void setBatganadas(int batganadas) {
        this.batganadas = batganadas;
    }

    public int getBatjugadas() {
        return batjugadas;
    }

    public void setBatjugadas(int batjugadas) {
        this.batjugadas = batjugadas;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }



    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
