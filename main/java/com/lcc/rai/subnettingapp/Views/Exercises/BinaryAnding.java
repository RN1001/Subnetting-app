package com.lcc.rai.subnettingapp.Views.Exercises;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.lcc.rai.subnettingapp.Viewmodel.AndingQuestion;
import com.lcc.rai.subnettingapp.R;

public class BinaryAnding extends AppCompatActivity {

    AndingQuestion and;
    TextView octettv, masktv, feedbacktv, q5;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary_anding);

        and = new AndingQuestion();
        and.RandomiseOctet();

        q5 = findViewById(R.id.Question5);
        octettv = findViewById(R.id.OctetTv);
        masktv = findViewById(R.id.MaskTv);
        editText = findViewById(R.id.answerEt);

        String Question5 = getString(R.string.Question5);
        and.setQuestion5(Question5);
        q5.setText(and.getQuestion5());


        int value = and.GetMask();
        String binValue = String.format("%8s", Integer.toBinaryString(value)).replace(" ", "0");

        String octetValues = getString(R.string.value, and.getOctet(), and.getBinaryOctet());
        String maskValues = getString(R.string.value, value, binValue);

        octettv.setText(octetValues);
        masktv.setText(maskValues);

        int result = and.CompareBits(and.getOctet(), value);
        final String answer = String.format("%8s",Integer.toBinaryString(result)).replace(" ", "0");

        Button btn= findViewById(R.id.SubmitBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String feedback = and.CompareAnswer(answer, editText.getText().toString());
                feedbacktv = findViewById(R.id.FeedbackTv);
                feedbacktv.setText(feedback);

            }
        });

    }

    public void reset(View view) {
        ResetActivity();
    }

    public void ResetActivity() {
        super.onRestart();
        Intent intent = new Intent(this, BinaryAnding.class);
        startActivity(intent);
        finish();
    }



}
