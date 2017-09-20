package com.juacallacastillo.projectlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Academic extends AppCompatActivity {
    Button btn_Alb;
    Button btn_Amv;
    Button btn_Beat;
    Button btn_Next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academic);

        btn_Alb=(Button)findViewById(R.id.btnalb);
        btn_Amv=(Button)findViewById(R.id.btnamv);
        btn_Beat=(Button)findViewById(R.id.btnbeat);
        btn_Next=(Button)findViewById(R.id.btnnext);
    }

    public void openAlbertus(View view){
        Intent intent3=new Intent(this, Albertus.class);
        startActivity(intent3);
    }
    public void openAMV(View view) {
        Intent intent4 = new Intent(this, AMV.class);
        startActivity(intent4);
    }
    public void openBeato(View view){
       // Intent intent5=new Intent(this, Library.class);
        //startActivity(intent5);
    }
    public void openNext(View view) {
        Intent intent6 = new Intent(this, Academic2nd.class);
        startActivity(intent6);
    }
}
