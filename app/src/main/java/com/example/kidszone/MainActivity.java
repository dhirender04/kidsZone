package com.example.kidszone;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.RecyclerView;

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
    private TextView a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgApple=findViewById(R.id.imgApple);
        imgBall=findViewById(R.id.imgBall);
        imgCat=findViewById(R.id.imgCat);
        imgDog=findViewById(R.id.imgDog);
        imgElephant=findViewById(R.id.imgElephant);
        imgFish=findViewById(R.id.imgFish);
        a=findViewById(R.id.txtA);
        nextButton=findViewById(R.id.nextLayout1);


        imgApple.setOnClickListener(MainActivity.this);
        imgBall.setOnClickListener(MainActivity.this);
        imgDog.setOnClickListener(MainActivity.this);
        imgElephant.setOnClickListener(MainActivity.this);
        imgFish.setOnClickListener(MainActivity.this);
        a.setOnClickListener(MainActivity.this);
        nextButton.setOnClickListener(MainActivity.this);




    }

    @Override
    public void onClick(View imgButton) {
        switch (imgButton.getId()){
            case R.id.imgApple:
            playSound(imgApple.getTag().toString());
            break;
            case R.id.txtA:
                playSound(a.getTag().toString());
                break;
            case R.id.imgBall:
                playSound(imgBall.getTag().toString());
                break;
            case R.id.imgCat:
                playSound(imgCat.getTag().toString());
                break;
            case R.id.imgDog:
                playSound(imgDog.getTag().toString());
                break;
            case R.id.imgElephant:
                playSound(imgElephant.getTag().toString());
            case R.id.imgFish:
                playSound(imgFish.getTag().toString());
                break;
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