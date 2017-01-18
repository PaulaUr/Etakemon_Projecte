package edu.upc.eetac.dsa.etakemon_projecte;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by pauli on 17/01/2017.
 */

public class Juego extends FragmentActivity implements OnMapReadyCallback {


    private GoogleMap mMap;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.juego);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) { //metodo para administrar el objeto GooglMap
        mMap = googleMap;

// Add a marker in Sydney and move the camera
        LatLng castelldefels = new LatLng(41, 1);
        mMap.addMarker(new MarkerOptions().position(castelldefels).title("Marker in EETAC-Castelldefels"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(castelldefels));
    }
}
