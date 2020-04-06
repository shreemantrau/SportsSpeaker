package com.example.sportsspeaker;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageButton boxing;
    private ImageButton karate;
    private ImageButton taekwondo;
    private ImageButton judo;
    private ImageButton kickboxing;
    private ImageButton aikido;

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boxing=findViewById(R.id.btnBoxing);
        karate=findViewById(R.id.btnKarate);
        taekwondo=findViewById(R.id.btnTaekwondo);
        judo=findViewById(R.id.btnJudo);
        kickboxing=findViewById(R.id.btnKickBoxing);
        aikido=findViewById(R.id.btnAikido);

        boxing.setOnClickListener(this);
        kickboxing.setOnClickListener(this);
        taekwondo.setOnClickListener(this);
        judo.setOnClickListener(this);
        aikido.setOnClickListener(this);
        karate.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
       //Either way to get sound on click 1) mediaPlayer in each case 2)Calling method for media player in each case!
        switch (v.getId()){
            case R.id.btnBoxing:
//                mediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.boxing);
//                mediaPlayer.start();
                  soundGenerator(boxing.getTag().toString());
                break;
            case R.id.btnAikido:
//                mediaPlayer=MediaPlayer.create(this,R.raw.aikido);
//                mediaPlayer.start();
                soundGenerator(aikido.getTag().toString());
                break;
            case R.id.btnJudo:
//                mediaPlayer=MediaPlayer.create(this,R.raw.judo);
//                mediaPlayer.start();
                soundGenerator(judo.getTag().toString());
                break;
            case R.id.btnKickBoxing:
//                mediaPlayer=MediaPlayer.create(this,R.raw.kickboxing);
//                mediaPlayer.start();
                soundGenerator(kickboxing.getTag().toString());
                break;
            case R.id.btnKarate:
//                mediaPlayer=MediaPlayer.create(this,R.raw.karate);
//                mediaPlayer.start();
                soundGenerator(karate.getTag().toString());
                break;
            case R.id.btnTaekwondo:
//                mediaPlayer=MediaPlayer.create(this,R.raw.taekwondo);
//                mediaPlayer.start();
                soundGenerator(taekwondo.getTag().toString());
                break;
        }
    }

    public void soundGenerator(String name){
      mediaPlayer =MediaPlayer.create(this,
              getResources().getIdentifier(name,"raw",getPackageName()));
      mediaPlayer.start();
    }
}
