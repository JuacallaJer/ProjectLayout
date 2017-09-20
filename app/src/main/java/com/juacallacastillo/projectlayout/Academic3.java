package com.juacallacastillo.projectlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Academic3 extends AppCompatActivity {
    Button btn_Prev2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academic3);

        btn_Prev2=(Button) findViewById(R.id.btnprev2);
    }
    public void openPrev2(View view) {
        Intent intent9 = new Intent(this, Academic2nd.class);
        startActivity(intent9);
    }
}
