package com.juacallacastillo.projectlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AMV extends AppCompatActivity {
    Button back8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_amv);

        back8= (Button) findViewById(R.id.bck8);
    }
    public void back2u(View view){
        Intent intent24=new Intent(this, Academic.class);
        startActivity(intent24);

    }
}
