package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    EditText rmb;
    TextView show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        rmb = (EditText)findViewById(R.id.rmb);
        show = (TextView)findViewById(R.id.show);

    }
    public void onClick(View btn){
        Log.d("TAG",  "click:");
        float r = 0.0f;
        switch (btn.getId()){
            case R.id.dollar:
                r = 1110f;
            case R.id.euro:
                r = 1222f;
            case R.id.wcn:
                r = 333f;
        }
        String str = rmb.getText().toString();
        Log.i("TAG",  "click:str="+str);
        if(str==null||str.length()==0){
            Toast.makeText(this,"请输入金额",Toast.LENGTH_SHORT).show();
        }else{
            show.setText("1234.444");
        }
    }
}