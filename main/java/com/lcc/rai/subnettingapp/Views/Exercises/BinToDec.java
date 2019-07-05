package com.lcc.rai.subnettingapp.Views.Exercises;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.lcc.rai.subnettingapp.Viewmodel.ConversionQuestion;
import com.lcc.rai.subnettingapp.R;

public class BinToDec extends AppCompatActivity {

    ConversionQuestion conversionQuestion;
    TextView question3, feedback;
    EditText editText;
    String answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bin_to_dec);

        conversionQuestion = new ConversionQuestion();

        editText = findViewById(R.id.AnswerET);
        feedback = findViewById(R.id.FeedbackView);
        question3 = findViewById(R.id.Question3);

        conversionQuestion.setQuestion3(getString(R.string.Question3, conversionQuestion.getDecimalNum()));
        question3.setText(conversionQuestion.getQuestion3());

        Button btn = findViewById(R.id.SubmitBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               feedback.setText(conversionQuestion.CompareBinary(editText.getText().toString()));
            }
        });

    }

    public void reset(View view) {
        ResetActivity();
    }

    public void ResetActivity() {
        super.onRestart();
        Intent intent = new Intent(this, BinToDec.class);
        startActivity(intent);
        finish();
    }


}
