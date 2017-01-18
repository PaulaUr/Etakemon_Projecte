package edu.upc.eetac.dsa.etakemon_projecte;

import android.content.Intent;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;
import com.loopj.android.http.*;

import cz.msebera.android.httpclient.Header;
import edu.upc.eetac.dsa.etakemon_projecte.apiClient.Api_Manager;
import edu.upc.eetac.dsa.etakemon_projecte.estructura.Usuario;

import static android.R.attr.password;


/**
 * Created by pauli on 16/01/2017.
 */

public class login extends AppCompatActivity {


    private EditText Usuario,Password;
    private static final String TAG="LOGIN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Usuario =(EditText)findViewById(R.id.Usuario);
        Password =(EditText)findViewById(R.id.Password);
}

    public void jugar(View view){

        final Usuario user= new Usuario();
        user.setNick(Usuario.getText().toString());
        user.setContraseña(Password.getText().toString());
        // String nick = Usuario.getText().toString();
        //String contraseña =Password.getText().toString();

//si se utiliza el emulador la IP:10.0.2.2
       //String BASE_URL = "http://10.0.2.2:8080/myapp/";

        Api_Manager.post(this, "user/login/",Api_Manager.getObjectAsStringEntity(user), "application/json", new TextHttpResponseHandler() {
            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                Toast.makeText(login.this, "Error de login!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, String responseString) {
                Log.i(TAG, "Success logging in: " + responseString);
               //convert JSON to Java object-deserializando JSON a un objeto propio
                final Gson gson = new Gson();

                final String jsonInString = "{'Nick': ''} + {'contraseña': ''}";
                final Usuario user = gson.fromJson(jsonInString, Usuario.class);
                //  Toast.makeText(login.this, "Bienvenido " + user.getNick() + "!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(login.this, Juego.class);
                startActivity(intent);
            }
        } );

          /*  @Override
            public void onSuccess(int statusCode, Header[] headers, String responseString) {

                try {
                    JSONObject obj = new JSONObject(responseString);
                    if (obj.getBoolean("status")) {
                        Toast.makeText(login.this, "Bienvenido " + nick + "!", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(login.this, registro.class);
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
    public void registrar(View view){


        Intent intent1 = new Intent(this, registro.class);
        startActivity(intent1);
    }
    public void recuperar(View view){
        Intent intent= new Intent(this, registro.class);
        startActivity(intent);
    }



}
