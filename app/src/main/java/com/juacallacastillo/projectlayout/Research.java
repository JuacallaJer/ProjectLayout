package com.juacallacastillo.projectlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Research extends AppCompatActivity {
    Button btn_res;
    Button btn_bck5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research);
        btn_res=(Button) findViewById(R.id.btnres);
        btn_bck5=(Button) findViewById(R.id.btnbck5);
    }
    public void opentarc(View view){
        Intent intent19=new Intent(this, CampusTour.class);
        startActivity(intent19);
    }

    public void openbck5(View view) {
        Intent intent20 = new Intent(this, CampusTour.class);
        startActivity(intent20);
    }
}
