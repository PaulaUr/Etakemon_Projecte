package edu.upc.dsa;

import java.util.List;

/**
 * Created by pauli on 29/11/2016.
 */
public class User {

    private int idUser;
    private String name;
    private String nick;
    private String password;
    private String email;
    private int battleWon;
    private int battle;
    private int experience;
  //  public List<User> listUser;


    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getBattleWon() {
        return battleWon;
    }

    public void setBattleWon(int battleWon) {
        this.battleWon = battleWon;
    }

    public int getBattle() {
        return battle;
    }

    public void setBattle(int battle) {
        this.battle = battle;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
