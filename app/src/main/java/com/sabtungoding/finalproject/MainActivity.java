package com.sabtungoding.finalproject;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.view.View.OnClickListener;
import android.view.KeyEvent;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    private static final String isPlaying = "Media is Playing";
    private ImageButton play, stop, pause, next, prev;

    private MediaPlayer player;
    private Button ikhlas, adduha, aladiyat, alala, alkausar, almaun, alqoriyah, attakasur, attin;



    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stop=(ImageButton) this.findViewById(R.id.stop);
        stop.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                player.stop();
            }
        });

        play=(ImageButton) this.findViewById(R.id.play);
        play.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                player.start();
            }
        });

        pause=(ImageButton) this.findViewById(R.id.pause);
        pause.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                player.pause();
            }
        });




        // Get the button from the view
        ikhlas = (Button) this.findViewById(R.id.alikhlas);
        ikhlas.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(1);

            }
        });
        adduha = (Button) this.findViewById(R.id.adduha);
        adduha.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(2);

            }
        });

        aladiyat = (Button) this.findViewById(R.id.aladiyat);
        aladiyat.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(3);

            }
        });

        alala = (Button) this.findViewById(R.id.alala);
        alala.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(4);

            }
        });

        alkausar = (Button) this.findViewById(R.id.alkausar);
        alkausar.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(5);

            }
        });

        almaun = (Button) this.findViewById(R.id.almaun);
        almaun.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(6);

            }
        });

        alqoriyah = (Button) this.findViewById(R.id.alqoriyah);
        alqoriyah.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(7);

            }
        });

        attakasur = (Button) this.findViewById(R.id.attakasur);
        attakasur.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(8);

            }
        });

        attin= (Button) this.findViewById(R.id.attin);
        attin.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(9);

            }
        });


    }


    @Override
    public void onPause() {
        try{
            super.onPause();
            player.pause();
        }catch (Exception e){

        }
    }

    private void playSound(int arg){
        try{
            if (player.isPlaying()) {
                player.stop();
                player.release();
            }
        }catch(Exception e){
            Toast.makeText(this, " Masuk Exception", Toast.LENGTH_LONG).show();
        }
        if (arg == 1){

            Toast.makeText(this, isPlaying+" Surah Al-Ikhlas", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.alikhlas);

        }else if (arg==2){
            Toast.makeText(this, isPlaying+" Surah Ad-Duha", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.adduha);

        }else if (arg==3){
            Toast.makeText(this, isPlaying+" Surah Ad-Adiyat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.aladiyat);

        }else if (arg==4){
            Toast.makeText(this, isPlaying+" Surah Al-Ala", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.alala);

        }else if (arg==5){
            Toast.makeText(this, isPlaying+" Surah Al-Kausar", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.alkausar);

        }else if (arg==6){
            Toast.makeText(this, isPlaying+" Surah Al-Maun", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.almaun);

        }else if (arg==7){
            Toast.makeText(this, isPlaying+" Surah Al-Qoriyah", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.alqoriyah);

        }else if (arg==8){
            Toast.makeText(this, isPlaying+" Surah At-Takasur", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.attakasur);

        }else if (arg==9){
            Toast.makeText(this, isPlaying+" Surah At-Tin", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.attin);

        }
        player.setLooping(false); // Set looping
        player.start();
    }

}




