package com.juacallacastillo.projectlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CampusTour extends AppCompatActivity {
    Button btn_Acad;
    Button btn_Admin;
    Button btn_Lib;
    Button btn_Med;
    Button btn_Rel;
    Button btn_Res;
    Button btn_Sports;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campus_tour);

        btn_Acad=(Button)findViewById(R.id.btnAcad);
        btn_Admin=(Button)findViewById(R.id.btnAdmin);
        btn_Lib=(Button)findViewById(R.id.btnlib);
        btn_Med=(Button)findViewById(R.id.btnmed);
        btn_Rel=(Button)findViewById(R.id.btnrel);
        btn_Res=(Button)findViewById(R.id.btnres);
        btn_Sports=(Button)findViewById(R.id.btnsports);

    }
    public void openAcads(View view){
        Intent intent3=new Intent(this, Academic.class);
        startActivity(intent3);
    }
    public void openAds(View view) {
        Intent intent4 = new Intent(this, Administrative.class);
        startActivity(intent4);
    }
    public void openlib(View view){
        Intent intent5=new Intent(this, Library.class);
        startActivity(intent5);
    }
    public void openmed(View view) {
        Intent intent6 = new Intent(this, Medical.class);
        startActivity(intent6);
    }
    public void openrel(View view){
        Intent intent7=new Intent(this, Religious.class);
        startActivity(intent7);
    }
    public void openres(View view) {
        Intent intent8 = new Intent(this, Research.class);
        startActivity(intent8);
    }
    public void opensports(View view){
        Intent intent9=new Intent(this, Sports.class);
        startActivity(intent9);
    }

    }

