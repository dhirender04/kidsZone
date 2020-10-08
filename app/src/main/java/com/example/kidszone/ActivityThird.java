package com.example.kidszone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class ActivityThird extends AppCompatActivity implements View.OnClickListener{
    private ImageButton imgMonkey,imgNest,imgOwl,imgPeacock,imgQueen,imgRat,imgShip,imgTiger;
    private TextView m,n,o,p,q,r,s,t;
    private TextView monkeySpell,nestSpell,owlSpell,peacockSpell,queenSpell,ratSpell,shipSpell,tigerSpell;
    private Button btnNext3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        //Image id's //
        imgMonkey=findViewById(R.id.imgMonkey);
        imgNest=findViewById(R.id.imgNest);
        imgOwl=findViewById(R.id.imgOwl);
        imgPeacock=findViewById(R.id.imgPeapock);
        imgQueen=findViewById(R.id.imgQueen);
        imgRat=findViewById(R.id.imgRat);
        imgShip=findViewById(R.id.imgShip);
        imgTiger=findViewById(R.id.imgTiger);


        //Single word id's//
        m=findViewById(R.id.txtM);
        n=findViewById(R.id.txtN);
        o=findViewById(R.id.txtO);
        p=findViewById(R.id.txtP);
        q=findViewById(R.id.txtQ);
        r=findViewById(R.id.txtR);
        s=findViewById(R.id.txtS);
        t=findViewById(R.id.txtT);

        //Image Spelling id's//
        monkeySpell=findViewById(R.id.monkeySpell);
        nestSpell=findViewById(R.id.nestSpell);
        owlSpell=findViewById(R.id.owlSpell);
        peacockSpell=findViewById(R.id.peacockSpell);
        queenSpell=findViewById(R.id.queenSpell);
        ratSpell=findViewById(R.id.ratSpell);
        shipSpell=findViewById(R.id.shipSpell);
       tigerSpell=findViewById(R.id.tigerSpell);

       //Button id's
        btnNext3=findViewById(R.id.nextLayout3);


        //Set On Click Listener//

        //Image setOnClickListener//
        imgMonkey.setOnClickListener(ActivityThird.this);
        imgNest.setOnClickListener(ActivityThird.this);
        imgOwl.setOnClickListener(ActivityThird.this);
        imgPeacock.setOnClickListener(ActivityThird.this);
        imgQueen.setOnClickListener(ActivityThird.this);
        imgRat.setOnClickListener(ActivityThird.this);
        imgShip.setOnClickListener(ActivityThird.this);
        imgTiger.setOnClickListener(ActivityThird.this);

        //Single Words setOnClickListener//
        m.setOnClickListener(ActivityThird.this);
        n.setOnClickListener(ActivityThird.this);
        o.setOnClickListener(ActivityThird.this);
        p.setOnClickListener(ActivityThird.this);
        q.setOnClickListener(ActivityThird.this);
        r.setOnClickListener(ActivityThird.this);
        s.setOnClickListener(ActivityThird.this);
        t.setOnClickListener(ActivityThird.this);

        //Spelling Words setOnClickListener//
        monkeySpell.setOnClickListener(ActivityThird.this);
        nestSpell.setOnClickListener(ActivityThird.this);
        owlSpell.setOnClickListener(ActivityThird.this);
        peacockSpell.setOnClickListener(ActivityThird.this);
        queenSpell.setOnClickListener(ActivityThird.this);
        ratSpell.setOnClickListener(ActivityThird.this);
        shipSpell.setOnClickListener(ActivityThird.this);
        tigerSpell.setOnClickListener(ActivityThird.this);

        //Button Set OnClickListener

        btnNext3.setOnClickListener(ActivityThird.this);





    }

    @Override
    public void onClick(View imgButton2) {

        switch (imgButton2.getId()){

            //Monkey//
            case R.id.imgMonkey:
                playSound(imgMonkey.getTag().toString());
                break;
            case R.id.txtM:
                playSound(m.getTag().toString());
                break;
            case R.id.monkeySpell:
                playSound(monkeySpell.getTag().toString());
                break;

                //Nest//
            case R.id.imgNest:
                playSound(imgNest.getTag().toString());
                break;
            case R.id.txtN:
                playSound(n.getTag().toString());
                break;
            case R.id.nestSpell:
                playSound(nestSpell.getTag().toString());
                break;


                //Owl//
            case R.id.imgOwl:
                playSound(imgOwl.getTag().toString());
                break;
            case R.id.txtO:
                playSound(o.getTag().toString());
                break;
            case R.id.owlSpell:
                playSound(owlSpell.getTag().toString());
                break;

                //Peacock//
            case R.id.imgPeapock:
                playSound(imgPeacock.getTag().toString());
                break;
            case R.id.txtP:
                playSound(p.getTag().toString());
                break;
            case R.id.peacockSpell:
                playSound(peacockSpell.getTag().toString());
                break;

                //Queen//
            case R.id.imgQueen:
                playSound(imgQueen.getTag().toString());
                break;
            case R.id.txtQ:
                playSound(q.getTag().toString());
                break;
            case R.id.queenSpell:
                playSound(queenSpell.getTag().toString());
                break;


                //Rat//
            case R.id.imgRat:
                playSound(imgRat.getTag().toString());
                break;
            case R.id.txtR:
                playSound(r.getTag().toString());
                break;
            case R.id.ratSpell:
                playSound(ratSpell.getTag().toString());
                break;

                //Ship//
            case R.id.imgShip:
                playSound(imgShip.getTag().toString());
                break;
            case R.id.txtS:
                playSound(s.getTag().toString());
                break;
            case R.id.shipSpell:
                playSound(shipSpell.getTag().toString());
                break;

                //Tiger//
            case R.id.imgTiger:
                playSound(imgTiger.getTag().toString());
                break;
            case R.id.txtT:
                playSound(t.getTag().toString());
                break;
            case R.id.tigerSpell:
                playSound(tigerSpell.getTag().toString());
                break;

            case R.id.nextLayout3:
                Intent intent= new Intent(ActivityThird.this,ForthActivity.class);
                startActivity(intent);
        }

    }

    public void playSound(String thingsName){
        MediaPlayer mediaPlayer=MediaPlayer.create(this,getResources().getIdentifier(thingsName,"raw",getPackageName()));
        mediaPlayer.start();
    }
}