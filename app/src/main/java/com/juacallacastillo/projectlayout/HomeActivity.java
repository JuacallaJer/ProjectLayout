package com.juacallacastillo.projectlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button btn_Camp;
    Button btn_Eat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn_Camp=(Button)findViewById(R.id.btnCamp);
        btn_Eat=(Button)findViewById(R.id.btnEat);
    }
    public void openCampusTour(View view){
        Intent intent=new Intent(this, CampusTour.class);
        startActivity(intent);
    }
    public void openLetsEat(View view){
        Intent intent2=new Intent(this, CampusTour.class);
        startActivity(intent2);
    }
}
