package com.ex.phongtoda.songtrang;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Main2Activity extends AppCompatActivity {
    RadioButton RdNam, RdNu;
    RadioGroup RdGroup;
    Button btnDky;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RdNam = (RadioButton) findViewById(R.id.radioNam);
        RdNu = (RadioButton) findViewById(R.id.radioNu);
        RdGroup = (RadioGroup)findViewById(R.id.RadioGroup1) ;
        btnDky = (Button) findViewById(R.id.btnDangKy);
        btnDky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, CongratulateActivity.class);
                startActivity(intent);

            }
        });
        RdGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.radioNam:
                        break;
                    case R.id.radioNu:
                        break;
                }
            }
        });

    }


}




