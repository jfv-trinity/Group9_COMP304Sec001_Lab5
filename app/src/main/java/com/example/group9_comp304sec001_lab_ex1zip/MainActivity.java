package com.example.group9_comp304sec001_lab_ex1zip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    String activity;
    Button switchToChineseActivity,switchToFrenchActivity,switchToGreekActivity,switchToItalianActivity,switchToJapaneseActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void switchActivities_onClick(View v){
        Intent switchActivityIntent;
        switch (v.getId()){
            case R.id.switchToChineseActivity:
                switchActivityIntent = new Intent(this, ChineseActivity.class);
                startActivity(switchActivityIntent);
            case R.id.switchToFrenchActivity:
                switchActivityIntent = new Intent(this, ChineseActivity.class);
                startActivity(switchActivityIntent);
            case R.id.switchToGreekActivity:
                switchActivityIntent = new Intent(this, ChineseActivity.class);
                startActivity(switchActivityIntent);
            case R.id.switchToItalianActivity:
                switchActivityIntent = new Intent(this, ChineseActivity.class);
                startActivity(switchActivityIntent);
            case R.id.switchToJapaneseActivity:
                switchActivityIntent = new Intent(this, ChineseActivity.class);
                startActivity(switchActivityIntent);

        }
    }
}