package com.juacallacastillo.projectlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sports extends AppCompatActivity {
    Button btn_sports;
    Button btn_bck6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);

        btn_sports=(Button) findViewById(R.id.btnsports);
        btn_bck6=(Button) findViewById(R.id.btnbck6);

    }
    public void opensports(View view){
        Intent intent21=new Intent(this, CampusTour.class);
        startActivity(intent21);
    }

    public void openbck6(View view) {
        Intent intent22 = new Intent(this, CampusTour.class);
        startActivity(intent22);
    }
}
