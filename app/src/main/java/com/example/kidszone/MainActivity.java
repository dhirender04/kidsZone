package com.example.kidszone;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.time.chrono.MinguoChronology;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton imgApple,imgBall,imgCat,imgDog,imgElephant,imgFish;
    private Button nextButton;
    private TextView a,b,c,d,e,f;
    private TextView appleSpell,ballSpell,catSpell,dogSpell,elephantSpell,fishSpell;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Image sound id's//
        imgApple=findViewById(R.id.imgApple);
        imgBall=findViewById(R.id.imgBall);
        imgCat=findViewById(R.id.imgCat);
        imgDog=findViewById(R.id.imgDog);
        imgElephant=findViewById(R.id.imgElephant);
        imgFish=findViewById(R.id.imgFish);

        //Single sound id's//
        a=findViewById(R.id.txtA);
        b=findViewById(R.id.txtB);
        c=findViewById(R.id.txtC);
        d=findViewById(R.id.txtD);
        e=findViewById(R.id.txtE);
        f=findViewById(R.id.txtF);

        //Spelling sound id's//
        appleSpell=findViewById(R.id.appleSpell);
        ballSpell=findViewById(R.id.ballSpell);
        catSpell=findViewById(R.id.catSpell);
        dogSpell=findViewById(R.id.dogSpell);
        elephantSpell=findViewById(R.id.elephantSpell);
        fishSpell=findViewById(R.id.fishSpell);


        nextButton=findViewById(R.id.nextLayout1);

            //Set OnClickListener //


        //Image Set OnClickListener //
        imgApple.setOnClickListener(MainActivity.this);
        imgBall.setOnClickListener(MainActivity.this);
        imgCat.setOnClickListener(MainActivity.this);
        imgDog.setOnClickListener(MainActivity.this);
        imgElephant.setOnClickListener(MainActivity.this);
        imgFish.setOnClickListener(MainActivity.this);

        //Single word Set OnClickListener//
        a.setOnClickListener(MainActivity.this);
        b.setOnClickListener(MainActivity.this);
        c.setOnClickListener(MainActivity.this);
        d.setOnClickListener(MainActivity.this);
        e.setOnClickListener(MainActivity.this);
        f.setOnClickListener(MainActivity.this);

        //Spelling Sound Set OnClickListener//
        appleSpell.setOnClickListener(MainActivity.this);
        ballSpell.setOnClickListener(MainActivity.this);
        catSpell.setOnClickListener(MainActivity.this);
        dogSpell.setOnClickListener(MainActivity.this);
        elephantSpell.setOnClickListener(MainActivity.this);
        fishSpell.setOnClickListener(MainActivity.this);


        nextButton.setOnClickListener(MainActivity.this);




    }

    @Override
    public void onClick(View imgButton) {
        switch (imgButton.getId()){

            //Apple//
            case R.id.imgApple:
            playSound(imgApple.getTag().toString());
            break;
            case R.id.txtA:
                playSound(a.getTag().toString());
                break;
            case R.id.appleSpell:
                playSound(appleSpell.getTag().toString());
                break;

                //Ball//
            case R.id.imgBall:
                playSound(imgBall.getTag().toString());
                break;
            case R.id.txtB:
                playSound(b.getTag().toString());
                break;
            case R.id.ballSpell:
                playSound(ballSpell.getTag().toString());
                break;

                //Cat//
            case R.id.imgCat:
                playSound(imgCat.getTag().toString());
                break;
            case R.id.txtC:
                playSound(c.getTag().toString());
                break;
            case R.id.catSpell:
                playSound(catSpell.getTag().toString());
                break;

                //Dog//
            case R.id.imgDog:
                playSound(imgDog.getTag().toString());
                break;
            case R.id.txtD:
                playSound(d.getTag().toString());
                break;
            case R.id.dogSpell:
                playSound(dogSpell.getTag().toString());
                break;

                //Elephant//
            case R.id.imgElephant:
                playSound(imgElephant.getTag().toString());
            case R.id.txtE:
                playSound(e.getTag().toString());
                break;
            case R.id.elephantSpell:
                playSound(elephantSpell.getTag().toString());
                break;

                //Fish//
            case R.id.imgFish:
                playSound(imgFish.getTag().toString());
                break;
            case R.id.txtF:
                playSound(f.getTag().toString());
                break;
            case R.id.fishSpell:
                playSound(fishSpell.getTag().toString());
                break;



                //Next Activity Button//
            case R.id.nextLayout1:
                Intent intent=new Intent(MainActivity.this,activitysecond.class);
                startActivity(intent);
        }

    }
    public void playSound(String thingName){
        MediaPlayer mediaPlayer=MediaPlayer.create(this,getResources().getIdentifier(thingName,"raw",getPackageName()));
        mediaPlayer.start();
    }
}