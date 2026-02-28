package com.example.bicara;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnHadir, btnIzin, btnSakit, btnAlpha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnHadir = findViewById(R.id.btnHadir);
        btnIzin = findViewById(R.id.btnIzin);
        btnSakit = findViewById(R.id.btnSakit);
        btnAlpha = findViewById(R.id.btnAlpha);

        btnHadir.setOnClickListener(v-> setActivate(btnHadir));

//        Interaktifitas untuk button Izin
        btnIzin.setOnClickListener(v->setActivate(btnIzin));
//        Interaktifitas untuk button sakit
        btnSakit.setOnClickListener(v->setActivate(btnSakit));

//        Interaktifitas untuk button Alpha
        btnAlpha.setOnClickListener(v->setActivate(btnAlpha));
    }

    private void setActivate(Button buttonSelected){
        resetAllButton();

        buttonSelected.setBackgroundColor(android.graphics.Color.parseColor("#1096f0"));
        buttonSelected.setTextColor(android.graphics.Color.parseColor("#ffffff"));
    }

    private void resetAllButton(){
        btnSakit.setTextColor(android.graphics.Color.parseColor("#ffffff"));
        btnSakit.setBackgroundColor(android.graphics.Color.parseColor("#76777a"));

        btnHadir.setTextColor(android.graphics.Color.parseColor("#ffffff"));
        btnHadir.setBackgroundColor(android.graphics.Color.parseColor("#76777a"));

        btnIzin.setTextColor(android.graphics.Color.parseColor("#ffffff"));
        btnIzin.setBackgroundColor(android.graphics.Color.parseColor("#76777a"));

        btnAlpha.setTextColor(android.graphics.Color.parseColor("#ffffff"));
        btnAlpha.setBackgroundColor(android.graphics.Color.parseColor("#76777a"));
    }

}