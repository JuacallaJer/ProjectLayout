package com.juacallacastillo.projectlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Medical extends AppCompatActivity {
    Button btn_med;
    Button btn_bck3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical);

        btn_med=(Button) findViewById(R.id.btnmed);
        btn_bck3=(Button) findViewById(R.id.btnbck3);

    }
    public void openhs(View view){
        Intent intent14=new Intent(this, CampusTour.class);
        startActivity(intent14);
    }
    public void openhos(View view) {
        Intent intent15 = new Intent(this, CampusTour.class);
        startActivity(intent15);
    }
    public void openbck3(View view) {
        Intent intent16 = new Intent(this, CampusTour.class);
        startActivity(intent16);
    }
}
