package com.juacallacastillo.projectlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Academic2nd extends AppCompatActivity {

    Button btn_Prev;
    Button btn_Next2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academic2nd);

        btn_Prev=(Button) findViewById(R.id.btnprev);
        btn_Next2=(Button) findViewById(R.id.btnNext2);
    }
    public void openNext2(View view) {
        Intent intent7 = new Intent(this, Academic3.class);
        startActivity(intent7);

    }
    public void openPrev(View view) {
        Intent intent8 = new Intent(this, Academic.class);
        startActivity(intent8);
    }
}
