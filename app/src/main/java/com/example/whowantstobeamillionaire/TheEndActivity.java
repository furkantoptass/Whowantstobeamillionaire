package com.example.whowantstobeamillionaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TheEndActivity extends AppCompatActivity {
    TextView txtuser,txtskor;
    Button btnrestart;

    SoruCevap sc=new SoruCevap();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_end);

        txtskor=findViewById(R.id.txtskor_the);
        txtuser=findViewById(R.id.txtuser_the);
        btnrestart=findViewById(R.id.btnrestart);

        int sorusayisi=sc.sayac;
        if(sorusayisi==15)
        {
            txtskor.setText("CONGRATULATIONS ! You are MILLIONAIRE. \n"+String.valueOf(sc.Skor[sorusayisi]));
        }
        else
            {
                txtskor.setText("CONGRATULATIONS !\n You WON! \n "+String.valueOf( sc.Skor[sorusayisi-1]));
        }

        Intent i=getIntent();
        String username=i.getStringExtra("Username");
        txtuser.setText(username);

        btnrestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(TheEndActivity.this,GameActivity.class);
                i.putExtra("User",txtuser.getText().toString());
                sc.sayac=0;
                startActivity(i);

            }
        });


    }
}
