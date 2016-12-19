package edu.upc.dsa;


/**
 * Created by ivanm on 15/12/2016.
 */
public class Usuario extends DAO{

    public int idusuario;
    public String nombre;
    public String nick;
    public String password;
    public String email;
    public int batganadas;
    public int batjugadas;
    public int experiencia;


    public  Usuario(){
        super();
    }
    public Usuario(int idusuario, String nombre, String nick, String password, String email, int batganadas, int batjugadas, int experiencia) {

        this.idusuario = idusuario;
        this.nombre = nombre;
        this.nick = nick;
        this.password = password;
        this.email = email;
        this.batganadas = batganadas;
        this.batjugadas = batjugadas;
        this.experiencia = experiencia;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
}
