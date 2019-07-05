package com.lcc.rai.subnettingapp.Views.Exercises;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.lcc.rai.subnettingapp.R;
import com.lcc.rai.subnettingapp.Viewmodel.CustomSubnetQuestion;

public class CustomSubnetExercise extends AppCompatActivity {

    Button submit;
    TextView question6Tv;
    EditText addressEt, defMaskEt, cusMaskEt, totSubnetEt, totHostEt, usableAddEt, bitsBorEt;
    CustomSubnetQuestion customSubnetQuestion;
    String AddressAnswer, defMaskAnswer, cusMaskAnswer, totSubnetAnswer, totHostAnswer, usableAnswer, bitsBorAnswer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_subnet_exercise);

        question6Tv = findViewById(R.id.Question6);
        addressEt = findViewById(R.id.AddressEtext);
        defMaskEt = findViewById(R.id.DefMaskEt);
        cusMaskEt = findViewById(R.id.cusMaskEt);
        totSubnetEt = findViewById(R.id.totSubnetEt);
        totHostEt = findViewById(R.id.totHostEt);
        usableAddEt = findViewById(R.id.usableAddEt);
        bitsBorEt = findViewById(R.id.bitsBorEt);

        customSubnetQuestion = new CustomSubnetQuestion();

        customSubnetQuestion.randomiseHosts();
        customSubnetQuestion.setCustomValues();

        String question6 = getString(R.string.Question6, customSubnetQuestion.getHosts(), customSubnetQuestion.generateAddress());
        customSubnetQuestion.setQuestion6(question6);
        question6Tv.setText(customSubnetQuestion.getQuestion6());

        submit = findViewById(R.id.Submit);

        // put individual put extras
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CustomSubnetExercise.this, customSubnetAnswers.class);
                int res = Integer.parseInt(usableAddEt.getText().toString());
                System.out.println("//////////////////////" + res);
                String x = usableAddEt.getText().toString();
                System.out.println("//////////////////" + x);
                AddressAnswer = customSubnetQuestion.classAnswer(addressEt.getText().toString());
                defMaskAnswer = customSubnetQuestion.defMaskAnswer(defMaskEt.getText().toString());
                cusMaskAnswer = customSubnetQuestion.cusMaskAnswer(cusMaskEt.getText().toString());
                totSubnetAnswer = customSubnetQuestion.calcTotalNumOfSubnets(Integer.parseInt(totSubnetEt.getText().toString()));
                totHostAnswer = customSubnetQuestion.calcTotalNumOfHosts(Integer.parseInt(totHostEt.getText().toString()));
                usableAnswer = customSubnetQuestion.calcUsableHosts(res);
                System.out.println("//////////////////" + usableAnswer);
                bitsBorAnswer = customSubnetQuestion.calcCustomBitsBorrowed(Integer.parseInt(bitsBorEt.getText().toString()));
                intent.putExtra("addressAnswer", AddressAnswer);
                intent.putExtra("defMaskAnswer", defMaskAnswer);
                intent.putExtra("cusMaskAnswer", cusMaskAnswer);
                intent.putExtra("totSubnetAnswer", totSubnetAnswer);
                intent.putExtra("totHostAnswer", totHostAnswer);
                intent.putExtra("UsableAnswer", usableAnswer);
                intent.putExtra("BitsBorAnswer", bitsBorAnswer);
                startActivity(intent);

            }
        });


    }

    public void reset(View view) {
        ResetActivity();
    }

    public void ResetActivity() {
        super.onRestart();
        Intent intent = new Intent(this, CustomSubnetExercise.class);
        startActivity(intent);
        finish();
    }

}
