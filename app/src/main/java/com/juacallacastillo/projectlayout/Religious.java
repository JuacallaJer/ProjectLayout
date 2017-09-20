package com.juacallacastillo.projectlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Religious extends AppCompatActivity {
    Button btn_rel;
    Button btn_bck4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_religious);

        btn_rel=(Button) findViewById(R.id.btnrel);
        btn_bck4=(Button) findViewById(R.id.btnbck4);

    }
    public void opensan(View view){
        Intent intent17=new Intent(this, CampusTour.class);
        startActivity(intent17);
    }

    public void openbck4(View view) {
        Intent intent18 = new Intent(this, CampusTour.class);
        startActivity(intent18);
    }
}
