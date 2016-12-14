package edu.upc.dsa;

/**
 * Created by pauli on 29/11/2016.
 */
public class Usuario extends DAO {

    public int idusuario;
  public String name;
  public String nick;
  public String password;
 public String email;
  public int battleWon;
  public int battle;
  public int experience;

    public Usuario() {
    }

    public Usuario(int idusuario, String name, String nick, String password, String email, int battleWon, int battle, int experience) {
        this.idusuario = idusuario;
        this.name = name;
        this.nick = nick;
        this.password = password;
        this.email = email;
        this.battleWon = battleWon;
        this.battle = battle;
        this.experience = experience;
    }

   //  public List<Usuario> listUsuario;


    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
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
