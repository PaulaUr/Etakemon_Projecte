package edu.upc.eetac.dsa.etakemon_projecte;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.loopj.android.http.*;

import cz.msebera.android.httpclient.Header;
import edu.upc.eetac.dsa.etakemon_projecte.apiClient.Api_Manager;
import edu.upc.eetac.dsa.etakemon_projecte.estructura.Usuario;


/**
 * Created by pauli on 16/01/2017.
 */

public class login extends AppCompatActivity {


    private EditText Usuario,Password;
    private static final String TAG="LOGIN";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Usuario =(EditText)findViewById(R.id.Usuario);
        Password =(EditText)findViewById(R.id.Password);
}

    public void jugar(View view){

        final Usuario user= new Usuario();
        user.setNick(Usuario.getText().toString());
        user.setContraseña(Password.getText().toString());
       // final String nick = usuario.getText().toString();
        //String contraseña =password.getText().toString();

//si se utiliza el emulador la IP:10.0.2.2
       //String BASE_URL = "http://10.0.2.2:8080/myapp/";

        Api_Manager.post(this, "user/login/", Api_Manager.getObjectAsStringEntity(user), "application/json", new TextHttpResponseHandler() {
            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                Toast.makeText(login.this, "Error de login!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, String responseString) {

                Toast.makeText(login.this, "Bienvenido " + user.getNick() + "!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(login.this, RecuperaRegistro.class);
                startActivity(intent);

                /*try {
                    JSONObject obj = new JSONObject(responseString);
                    if (obj.getBoolean("status")) {
                        Toast.makeText(login.this, "Bienvenido " + nick + "!", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(login.this, RecuperaRegistro.class);
                        startActivity(intent);

                    } else {
                        Toast.makeText(login.this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }*/

            }
        } );

          /*  @Override
            public void onSuccess(int statusCode, Header[] headers, String responseString) {

                try {
                    JSONObject obj = new JSONObject(responseString);
                    if (obj.getBoolean("status")) {
                        Toast.makeText(login.this, "Bienvenido " + nick + "!", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(login.this, RecuperaRegistro.class);
                        startActivity(intent);

                    } else {
                        Toast.makeText(login.this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }


            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                Toast.makeText(login.this, "Error de login!", Toast.LENGTH_SHORT).show();

            }*/



}



    public void recuperar(View view){
        Intent intent= new Intent(this, RecuperaRegistro.class);
        startActivity(intent);
    }
    public void registrar(View view){
        Intent intent1 = new Intent(this, RecuperaRegistro.class);
        startActivity(intent1);
    }


}
