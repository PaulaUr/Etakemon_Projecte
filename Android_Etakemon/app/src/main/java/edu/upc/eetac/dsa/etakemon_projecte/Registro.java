package edu.upc.eetac.dsa.etakemon_projecte;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.loopj.android.http.TextHttpResponseHandler;

import cz.msebera.android.httpclient.Header;
import edu.upc.eetac.dsa.etakemon_projecte.apiClient.Api_Manager;
import edu.upc.eetac.dsa.etakemon_projecte.estructura.Usuario;

/**
 * Created by pauli on 16/01/2017.
 */

public class registro extends AppCompatActivity{

    private EditText Usuario,Password;
    private static final String TAG="Registro";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);

        Usuario = (EditText)findViewById(R.id.Usuario);
        Password = (EditText)findViewById(R.id.Password);
    }

    public void registro1(View view){

        final Usuario user = new Usuario();
        user.setNick(Usuario.getText().toString());
        user.setContraseña(Password.getText().toString());

      /*  Api_Manager.post(this, "user/registro/", Api_Manager.getObjectAsStringEntity(user), "application/json", new TextHttpResponseHandler() {
            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                Toast.makeText(registro.this, "Error de registro!", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, String responseString) {

                Toast.makeText(registro.this, "Ya eres usuario de PlayEtakemon" + user.getNombre(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(registro.this, Juego.class);
                startActivity(intent);
            }
        });*/

    }
}
