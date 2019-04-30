package com.example.sunurestoapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class connect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect);

        Button btn1= findViewById(R.id.btnConnect);
        Button btn2= findViewById(R.id.btnSubscribe);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                Toast t1 = Toast.makeText(getApplicationContext(), "Cliqued", Toast.LENGTH_LONG);
                t1.show();
                Log.i("CONNECT", "Connect is clicked");
                Intent it1 = new Intent(Intent.ACTION_GTALK_SERVICE_CONNECTED);
                startActivity(it1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                Toast t2 = Toast.makeText(getApplicationContext(), "Cliqued", Toast.LENGTH_LONG);
                t2.show();
                Log.i("CONNECT", "Subscribe is clicked");
                String geoUri = String.format("geo:16.0674003,-16.4231534,18.05");
                Uri geo = Uri.parse(geoUri);
                Intent geoMap = new Intent(Intent.ACTION_VIEW,geo);
                Intent it2 = new Intent(Intent.ACTION_VIEW,geo);

                startActivity(it2);
            }
        });

    }
}
