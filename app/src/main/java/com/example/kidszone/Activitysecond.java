package com.example.kidszone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Activitysecond extends AppCompatActivity implements View.OnClickListener {
    private ImageButton imgGoat,imgHorse,imgIceCream,imgJoker,imgKite,imgLion;
    private TextView g,h,i,j,k,l;
    private TextView goatSpell,horseSpell,iceCreamSpell,jokerSpell,kiteSpell,lionSpell;
    private Button nextLayout2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitysecond);

        nextLayout2=findViewById(R.id.nextLayout2);

        //Image sound id's //
        imgGoat=findViewById(R.id.imgGoat);
        imgHorse=findViewById(R.id.imgHorse);
        imgIceCream=findViewById(R.id.imgIceCream);
        imgJoker=findViewById(R.id.imgJoker);
        imgKite=findViewById(R.id.imgKite);
        imgLion=findViewById(R.id.imgLion);

        //Single Spelling id's//
        g=findViewById(R.id.txtG);
        h=findViewById(R.id.txtH);
        i=findViewById(R.id.txtI);
        j=findViewById(R.id.txtJ);
        k=findViewById(R.id.txtK);
        l=findViewById(R.id.txtL);

        //Spelling sound id's//
        goatSpell=findViewById(R.id.goatSpell);
        horseSpell=findViewById(R.id.horseSpell);
        iceCreamSpell=findViewById(R.id.iceCreamSpell);
        jokerSpell=findViewById(R.id.jokerSpell);
        kiteSpell=findViewById(R.id.kiteSpell);
        lionSpell=findViewById(R.id.lionSpell);


        //Set On Click Listeners//

        //Image sound Set onclickListeners//

        imgGoat.setOnClickListener(Activitysecond.this);
        imgHorse.setOnClickListener(Activitysecond.this);
        imgIceCream.setOnClickListener(Activitysecond.this);
        imgJoker.setOnClickListener(Activitysecond.this);
        imgKite.setOnClickListener(Activitysecond.this);
        imgLion.setOnClickListener(Activitysecond.this);

        //Single words sound Set OnClickListeners//
        g.setOnClickListener(Activitysecond.this);
        h.setOnClickListener(Activitysecond.this);
        i.setOnClickListener(Activitysecond.this);
        j.setOnClickListener(Activitysecond.this);
        k.setOnClickListener(Activitysecond.this);
        l.setOnClickListener(Activitysecond.this);

        //Spelling Sound Set OnClickListeners//
        goatSpell.setOnClickListener(Activitysecond.this);
        horseSpell.setOnClickListener(Activitysecond.this);
        iceCreamSpell.setOnClickListener(Activitysecond.this);
        jokerSpell.setOnClickListener(Activitysecond.this);
        kiteSpell.setOnClickListener(Activitysecond.this);
        lionSpell.setOnClickListener(Activitysecond.this);


        nextLayout2.setOnClickListener(Activitysecond.this);





    }

    @Override
    public void onClick(View imgButton1) {

        switch (imgButton1.getId()){

            //Goat//
            case R.id.imgGoat:
                playSound(imgGoat.getTag().toString());
                break;
            case R.id.txtG:
                playSound(g.getTag().toString());
                break;
            case R.id.goatSpell:
                playSound(goatSpell.getTag().toString());
                break;

                //Horse//
            case R.id.imgHorse:
                playSound(imgHorse.getTag().toString());
                break;
            case R.id.txtH:
                playSound(h.getTag().toString());
            case R.id.horseSpell:
                playSound(horseSpell.getTag().toString());
                break;

                //Ice Cream//
            case R.id.imgIceCream:
                playSound(imgIceCream.getTag().toString());
                break;
            case R.id.txtI:
                playSound(i.getTag().toString());
                break;
            case R.id.iceCreamSpell:
                playSound(iceCreamSpell.getTag().toString());
                break;

                //Joker//
            case R.id.imgJoker:
                playSound(imgJoker.getTag().toString());
                break;
            case R.id.txtJ:
                playSound(j.getTag().toString());
                break;
            case R.id.jokerSpell:
                playSound(jokerSpell.getTag().toString());
                break;

                //kite//
            case R.id.imgKite:
                playSound(imgKite.getTag().toString());
                break;
            case R.id.txtK:
                playSound(k.getTag().toString());
                break;
            case R.id.kiteSpell:
                playSound(kiteSpell.getTag().toString());
                break;

                //Lion//
            case R.id.imgLion:
                playSound(imgLion.getTag().toString());
                break;
            case R.id.txtL:
                playSound(l.getTag().toString());
                break;
            case R.id.lionSpell:
                playSound(lionSpell.getTag().toString());
                break;

            case R.id.nextLayout2:
                Intent intent=new Intent(Activitysecond.this,ActivityThird.class);
                startActivity(intent);


        }

    }
    public void playSound(String thingsSound){
        MediaPlayer mediaPlayer=MediaPlayer.create(this,getResources().getIdentifier(thingsSound,"raw",getPackageName()));
        mediaPlayer.start();

    }
}