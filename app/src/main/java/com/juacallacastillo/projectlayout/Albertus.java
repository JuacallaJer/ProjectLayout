package com.juacallacastillo.projectlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Albertus extends AppCompatActivity {
    Button back7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_albertus);

        back7= (Button) findViewById(R.id.bck7);
    }

    public void back2u(View view){
        Intent intent23=new Intent(this, Academic.class);
        startActivity(intent23);

    }
}
