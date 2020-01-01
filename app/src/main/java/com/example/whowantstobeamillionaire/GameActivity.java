package com.example.whowantstobeamillionaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.Random;

import java.util.Timer;
import java.util.TimerTask;

public class GameActivity extends AppCompatActivity {

    ProgressBar pb;
    int counter=100;
    Button btn1,btn2,btn3,btn4;
    TextView txtuser,txtsoru,txtskor;


    public Timer t=new Timer();

    SoruCevap sc=new SoruCevap();
    int rast= sc.rastgelesayi();

    Random rnd=new Random();
    int secilen=rnd.nextInt(4);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game1);

        prog();//progressbar calişması için....

        //TANIMLAMA İŞLEMLERİ****


        pb=findViewById(R.id.progressBar);
        txtsoru=findViewById(R.id.txtsoru);

        btn1=findViewById(R.id.btnY1);
        btn2=findViewById(R.id.btnY2);
        btn3=findViewById(R.id.btnY3);
        btn4=findViewById(R.id.idbtnD_2);

        txtuser=findViewById(R.id.txtuser);
        txtskor=findViewById(R.id.txtskor);

        DogruSecme();//Dogru Cevabı Rastgele Butona atmak için..


        //RASTGELE SORU ALMAK İÇİN****

        txtsoru.setText(sc.SoruGetir(rast));

        //Login ekranından gelen username i çekme işlemi...

        Intent j=getIntent();
        String username=j.getStringExtra("User");
        txtuser.setText(username);

        //SKOR İÇİN SORU SAYİSİ VE DİZİDEN SKOR MİKATARINI YAZDIRMA

       int sorusayisi=sc.sayac;
        txtskor.setText(String.valueOf( sc.Skor[sorusayisi]));

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                t.cancel();

                if(secilen==0)
                {
                    btn1.setBackgroundColor(Color.GREEN);
                    bekletDogru();
                }
                else
                {
                    bekletYanlıs();
                }

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                t.cancel();

                if(secilen==1)
                {
                    btn2.setBackgroundColor(Color.GREEN);
                    bekletDogru();
                }
                else
                {
                    bekletYanlıs();
                }

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                t.cancel();
                if(secilen==2)
                {
                    btn3.setBackgroundColor(Color.GREEN);
                    bekletDogru();
                }
                else
                {
                    bekletYanlıs();
                }



            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //Progresi Durdurmak İçin**
                t.cancel();
                if(secilen==3)
                {
                    btn4.setBackgroundColor(Color.GREEN);
                    bekletDogru();
                }
                else
                {
                    bekletYanlıs();
                }

            }
        });

    }


    public void prog()
    {
        TimerTask tt=new TimerTask() {
            @Override
            public void run() {
                counter--;
                pb.setProgress(counter);
                if (counter==0)
                {
                    t.cancel();
                    //activity geçişi:
                    Intent i=new Intent(GameActivity.this,TimesupActivity.class);
                    i.putExtra("User",txtuser.getText().toString());

                    startActivity(i);
                }
            }
        };
        t.schedule(tt,0,100);
    }

    public void bekletDogru()
    {


        //Butonların Tıklanmasını Kapatmak İçin
        btn1.setClickable(false);
        btn2.setClickable(false);
        btn3.setClickable(false);
        btn4.setClickable(false);

        counter=40;

        final Timer tDogru=new Timer();

        TimerTask tt=new TimerTask() {
            @Override
            public void run() {
                counter--;
                pb.setProgress(counter);
                if (counter==0)
                {
                    if(sc.sayac==15)
                    {
                        //1 Milyonluk soruyu bildikten sonra ne yapacak program?..

                        Intent i=new Intent(GameActivity.this,TheEndActivity.class);
                        String Username=txtuser.getText().toString();
                        i.putExtra("Username",Username);
                        startActivity(i);

                    }
                    else {
                        tDogru.cancel();
                        //activity geçişi:
                        Intent i = new Intent(GameActivity.this, GameActivity.class);
                        i.putExtra("User", txtuser.getText().toString());
                        startActivity(i);
                    }
                }
            }
        };
        tDogru.schedule(tt,0,40);
    }
    public void bekletYanlıs()
    {


        if(secilen==0)
        {
            btn1.setBackgroundColor(Color.GREEN);
            btn2.setBackgroundColor(Color.RED);
            btn3.setBackgroundColor(Color.RED);
            btn4.setBackgroundColor(Color.RED);



        }
        if(secilen==1)
        {
            btn2.setBackgroundColor(Color.GREEN);
            btn1.setBackgroundColor(Color.RED);
            btn3.setBackgroundColor(Color.RED);
            btn4.setBackgroundColor(Color.RED);

        }
        if(secilen==2)
        {
            btn3.setBackgroundColor(Color.GREEN);
            btn2.setBackgroundColor(Color.RED);
            btn1.setBackgroundColor(Color.RED);
            btn4.setBackgroundColor(Color.RED);
        }
        if(secilen==3)
        {
            btn4.setBackgroundColor(Color.GREEN);
            btn2.setBackgroundColor(Color.RED);
            btn3.setBackgroundColor(Color.RED);
            btn1.setBackgroundColor(Color.RED);
        }

        //Butonların Tıklanmasını Kapatmak İçin
        btn1.setClickable(false);
        btn2.setClickable(false);
        btn3.setClickable(false);
        btn4.setClickable(false);

        counter=50;


        final Timer tYanlis=new Timer();

        TimerTask tt=new TimerTask() {
            @Override
            public void run() {
                counter--;
                pb.setProgress(counter);
                if (counter==0)
                {
                    tYanlis.cancel();
                    //activity geçişi:
                    Intent i=new Intent(GameActivity.this,TheEndActivity.class);
                    String Username=txtuser.getText().toString();
                    i.putExtra("Username",Username);
                    startActivity(i);
                }
            }
        };
        tYanlis.schedule(tt,0,50);
    }

    public void DogruSecme()
    {
        int fonksiyon= rast*3;

        if(secilen==0)
        {
            btn1.setText(sc.CevapGetir(rast));
            btn2.setText(sc.Y_cevaplar[fonksiyon]);
            btn3.setText(sc.Y_cevaplar[fonksiyon+1]);
            btn4.setText(sc.Y_cevaplar[fonksiyon+2]);

        }
        if(secilen==1)
        {

            btn2.setText(sc.CevapGetir(rast));
            btn1.setText(sc.Y_cevaplar[fonksiyon]);
            btn3.setText(sc.Y_cevaplar[fonksiyon+1]);
            btn4.setText(sc.Y_cevaplar[fonksiyon+2]);

        }
        if(secilen==2)
        {
            btn3.setText(sc.CevapGetir(rast));
            btn1.setText(sc.Y_cevaplar[fonksiyon]);
            btn2.setText(sc.Y_cevaplar[fonksiyon+1]);
            btn4.setText(sc.Y_cevaplar[fonksiyon+2]);


        }
        if(secilen==3)
        {
            btn4.setText(sc.CevapGetir(rast));
            btn1.setText(sc.Y_cevaplar[fonksiyon]);
            btn3.setText(sc.Y_cevaplar[fonksiyon+1]);
            btn2.setText(sc.Y_cevaplar[fonksiyon+2]);

        }


    }


}
