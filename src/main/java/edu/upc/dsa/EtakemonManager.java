package edu.upc.dsa;

import java.util.ArrayList;

/**
 * Created by pauli on 19/12/2016.
 */
public class EtakemonManager {
    List listUsuario; 

    public EtakemonManager() {
        listUsuario = new ArrayList<>();
        Usuario u1 = new Usuario();
        u1.setIdusuario(1);
        u1.setName("Antonio");
        u1.setPassword("contraseña");
        u1.setEmail("aoller@entel.upc.edu");
        u1.setNick("TekJson");
        u1.setBattle(2);
        u1.setBattleWon(1);
        listUsuario.add(u1);

        Usuario u2 = new Usuario();
        u2.setIdusuario(2);
        u2.setName("Juan");
        u2.setEmail("juan.lopez-rubio@upc.edu");
        u2.setNick("JekJson");
        u2.setBattle(4);
        u2.setBattleWon(2);
        listUsuario.add(u2);

    }


    public List<Usuario> getUsuarios() {
        return listUsuario;
    }

    public List<Evento> getGames(String idUser) {
        List<Evento> l = new ArrayList();
        l.add(new Event(1111,2222,0,2));
        l.add(new Event(1133311,2444222,0,1));

    }
}
