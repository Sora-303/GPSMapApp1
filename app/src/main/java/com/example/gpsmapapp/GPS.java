package com.example.gpsmapapp;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.squareup.picasso.Picasso;

public class GPS extends AppCompatActivity {

    //variables principales
    private FusedLocationProviderClient fusedLocationClient;
    private ImageView IMGmap;
    private Button BTNmap;
    private final String apiKey = "AIzaSyDNVYEYXYLu2D3Gorih_HKSYAuvhnJhY-0"; // Reemplaza con tu clave real

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gps);

        //inicializacion de los componentes
        IMGmap = findViewById(R.id.IMGmap);
        BTNmap = findViewById(R.id.BTNmap);
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this);


        //configuracion del boton
        BTNmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Verificacion de permisos
                if (ActivityCompat.checkSelfPermission(GPS.this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
                        ActivityCompat.checkSelfPermission(GPS.this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

                    ActivityCompat.requestPermissions(GPS.this,
                            new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION}, 1);
                    return;
                }

                //obtecion de ubicacion
                fusedLocationClient.getLastLocation()
                        .addOnSuccessListener(GPS.this, location -> {
                            if (location != null) {
                                Log.d("GPS", "Ubicación obtenida: " + location.getLatitude() + ", " + location.getLongitude());
                                mostrarMapa(location);
                            } else {
                                Log.e("GPS", "No se pudo obtener la ubicación.");
                            }
                        });
            }
        });
    }

    //metodo
    private void mostrarMapa(Location location) {
        double lat = location.getLatitude();
        double lng = location.getLongitude();
        String url = "https://maps.googleapis.com/maps/api/staticmap?center=" + lat + "," + lng +
                "&zoom=15&size=600x300&markers=color:red%7C" + lat + "," + lng +
                "&key=" + apiKey;

        Log.d("GPS", "URL del mapa: " + url); // Para verificar si la URL es válida
        Picasso.get().load(url).into(IMGmap);
    }
}
