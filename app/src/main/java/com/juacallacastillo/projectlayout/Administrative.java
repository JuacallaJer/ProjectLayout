package com.juacallacastillo.projectlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Administrative extends AppCompatActivity {

    Button btn_tyk;
    Button btn_bck;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrative);

        btn_tyk=(Button) findViewById(R.id.btntyk);
        btn_bck=(Button) findViewById(R.id.btnbck);
    }
    public void openTyk(View view)
    {
        Intent intent10 = new Intent(this, Academic2nd.class);
        startActivity(intent10);
    }
    public void openBack(View view)
    {
        Intent intent11 = new Intent(this, CampusTour.class);
        startActivity(intent11);
    }
}
