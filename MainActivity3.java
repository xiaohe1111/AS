package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        score = (TextView) findViewById(R.id.score);
    }
    public void btnClick1(View btn){
        showScore(1);
    }
    public void btnClick2(View btn){
        showScore(2);
    }
    public void btnClick3(View btn){
        showScore(3);
    }
    public void btnReset(View btn){
        score.setText("0");
    }
    private void showScore(int inc){
        Log.i("show","inc="+inc);
        String oldscore = (String)score.getText();
        score.setText(""+Integer.parseInt(oldscore));
    }
}