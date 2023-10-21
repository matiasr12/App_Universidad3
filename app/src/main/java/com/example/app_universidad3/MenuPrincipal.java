package com.example.app_universidad3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MenuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        TabLayout tl = (TabLayout) findViewById(R.id.tablayout);
        tl.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                switch (position){

                    case 0:
                        Inicio i = new Inicio();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, i).commit();
                        //Toast.makeText(getApplicationContext(), "Inicio", Toast.LENGTH_SHORT).show();
                        break;

                    case 1:
                        Promediar p = new Promediar();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, p).commit();
                        //Toast.makeText(getApplicationContext(), "Promediar", Toast.LENGTH_SHORT).show();
                        break;

                    case 2:
                        Reconocer r = new Reconocer();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, r).commit();
                        //Toast.makeText(getApplicationContext(), "Reconocer", Toast.LENGTH_SHORT).show();
                        break;

                    case 3:
                        Salir s = new Salir();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, s).commit();
                        //Toast.makeText(getApplicationContext(), "Salir", Toast.LENGTH_SHORT).show();
                        break;
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}