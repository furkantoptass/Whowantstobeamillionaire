package com.example.whowantstobeamillionaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TimesupActivity extends AppCompatActivity {
    TextView txtuser,txtskor;
    Button btnrestart_tu;
    SoruCevap sc=new SoruCevap();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timesup);


        txtskor=findViewById(R.id.txtTU_skor);
        txtuser=findViewById(R.id.txtTU_user);
        btnrestart_tu=findViewById(R.id.btnrestart_TU);


        int sorusayisi=sc.sayac;
        txtskor.setText("Your time is over. Bad luck.\n "+String.valueOf(sc.Skor[sorusayisi-1]));

        Intent i=getIntent();
        String username=i.getStringExtra("User");
        txtuser.setText(username);


        btnrestart_tu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(TimesupActivity.this,GameActivity.class);
                sc.sayac=0;
                i.putExtra("User",txtuser.getText().toString());
                startActivity(i);
            }
        });








    }
}
