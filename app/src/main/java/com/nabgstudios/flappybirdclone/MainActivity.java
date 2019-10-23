package com.nabgstudios.flappybirdclone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton imageButtonPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppConstants.initialization(this.getApplicationContext());

        imageButtonPlay = findViewById(R.id.imageButtonPlay);
        imageButtonPlay.setOnClickListener(this);
    }

    public void startGame(){
//        Log.i("ImageButton", "startGame: clicked");
        Intent intent = new Intent(this,GameActivity.class);
        startActivity(intent);
    }
    @Override
    public void onClick(View view) {
        startGame();
    }
}
