package com.example.gpsmapapp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class DescargarImagen extends AppCompatActivity {

    //variables
    private ImageView mImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_descargar_imagen);

        //inicializacion de componentes
        mImageView = findViewById(R.id.IMGdes);

        //boton configurado
        findViewById(R.id.BTNdes).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                cargarImagenDesdeInternet();
            }
        });
    }

    //metodo
    public void cargarImagenDesdeInternet(){
        new Thread(new Runnable() {
            @Override
            public void run(){
                final Bitmap bitmap = loadImageFromNetwork("https://upload.wikimedia.org/wikipedia/commons/2/26/YellowLabradorLooking_new.jpg");
                mImageView.post(new Runnable() {
                    @Override
                    public void run() {
                        mImageView.setImageBitmap(bitmap);
                    }
                });
            }
        }).start();
    }

    //Metodo
    private Bitmap loadImageFromNetwork(String urlString) {
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoInput(true);
            connection.connect();
            InputStream input = connection.getInputStream();
            return BitmapFactory.decodeStream(input);
            //revicion de errores
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}

