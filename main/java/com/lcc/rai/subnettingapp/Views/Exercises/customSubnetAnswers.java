package com.lcc.rai.subnettingapp.Views.Exercises;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.lcc.rai.subnettingapp.R;

public class customSubnetAnswers extends AppCompatActivity {

    TextView answerbox;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_subnet_answers);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        String addressAnswer = (String) b.get("addressAnswer");
        String defAnswer = (String) b.get("defMaskAnswer");
        String cusAnswer = (String) b.get("cusMaskAnswer");
        String totSubnets = (String) b.get("totSubnetAnswer");
        String totHosts = (String) b.get("totHostAnswer");
        String usableHosts = (String) b.get("UsableAnswer");
        String bitsBorrowed = (String) b.get("BitsBorAnswer");

        String answers = getString(R.string.Answers, addressAnswer, defAnswer, cusAnswer, totSubnets, totHosts, usableHosts, bitsBorrowed);

        answerbox = findViewById(R.id.textView3);
        answerbox.setText(answers);

    }
}
