package com.juacallacastillo.projectlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Library extends AppCompatActivity {
    Button btn_Lib;
    Button btn_bck2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        btn_Lib=(Button) findViewById(R.id.btnlib);
        btn_bck2=(Button) findViewById(R.id.btnbck2);
    }
    public void openback2(View view) {
        Intent intent12 = new Intent(this, CampusTour.class);
        startActivity(intent12);
    }
    public void openlib(View view) {
        Intent intent13 = new Intent(this, CampusTour.class);
        startActivity(intent13);
    }
}
