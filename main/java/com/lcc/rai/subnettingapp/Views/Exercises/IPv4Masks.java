package com.lcc.rai.subnettingapp.Views.Exercises;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.lcc.rai.subnettingapp.Models.Masks;
import com.lcc.rai.subnettingapp.R;
import com.lcc.rai.subnettingapp.Viewmodel.MaskQuestion;

import java.util.Random;

public class IPv4Masks extends AppCompatActivity {

    TextView textView, feedback;
    RadioButton rd1, rd2, rd3, rd4, rd5, rd6, rd7;
    MaskQuestion maskQuestion;
    // from 1 - 6  in order: { 0, 128, 192, 224, 240, 248, 252 }
    boolean radio1, radio2, radio3, radio4, radio5, radio6, radio7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipv4_masks);

        maskQuestion = new MaskQuestion();

        textView = findViewById(R.id.Question2);
        feedback = findViewById(R.id.FeedbackTbox);

        rd1 = findViewById(R.id.RDValue0);
        rd2 = findViewById(R.id.RDValue128);
        rd3 = findViewById(R.id.RDValue192);
        rd4 = findViewById(R.id.RDValue224);
        rd5 = findViewById(R.id.RDValue240);
        rd6 = findViewById(R.id.RDValue248);
        rd7 = findViewById(R.id.RDValue252);

        final int borrowedBits = maskQuestion.maskBits();

        String maskIndex = maskQuestion.randomisedMask();
        String Question2 = getString(R.string.Question2, maskIndex, borrowedBits);
        maskQuestion.setQuestion2(Question2);
        textView.setText(maskQuestion.getQuestion2());

        Button btn = findViewById(R.id.SubmitBtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rd1.isChecked()) {
                    radio1 = true;
                    radio2 = false;
                    radio3 = false;
                    radio4 = false;
                    radio5 = false;
                    radio6 = false;
                    radio7 = false;
                    feedback.setText(maskQuestion.CalcMask(borrowedBits, radio1, radio2, radio3, radio4, radio5, radio6, radio7));
                } else if (rd2.isChecked()){
                    radio1 = false;
                    radio2 = true;
                    radio3 = false;
                    radio4 = false;
                    radio5 = false;
                    radio6 = false;
                    radio7 = false;
                    feedback.setText(maskQuestion.CalcMask(borrowedBits, radio1, radio2, radio3, radio4, radio5, radio6, radio7));
                } else if (rd3.isChecked()){
                    radio1 = false;
                    radio2 = false;
                    radio3 = true;
                    radio4 = false;
                    radio5 = false;
                    radio6 = false;
                    radio7 = false;
                    feedback.setText(maskQuestion.CalcMask(borrowedBits, radio1, radio2, radio3, radio4, radio5, radio6, radio7));
                } else if (rd4.isChecked()){
                    radio1 = false;
                    radio2 = false;
                    radio3 = false;
                    radio4 = true;
                    radio5 = false;
                    radio6 = false;
                    radio7 = false;
                    feedback.setText(maskQuestion.CalcMask(borrowedBits, radio1, radio2, radio3, radio4, radio5, radio6, radio7));
                } else if (rd5.isChecked()){
                    radio1 = false;
                    radio2 = false;
                    radio3 = false;
                    radio4 = false;
                    radio5 = true;
                    radio6 = false;
                    radio7 = false;
                    feedback.setText(maskQuestion.CalcMask(borrowedBits, radio1, radio2, radio3, radio4, radio5, radio6, radio7));
                } else if (rd6.isChecked()){
                    radio1 = false;
                    radio2 = false;
                    radio3 = false;
                    radio4 = false;
                    radio5 = false;
                    radio6 = true;
                    radio7 = false;
                    feedback.setText(maskQuestion.CalcMask(borrowedBits, radio1, radio2, radio3, radio4, radio5, radio6, radio7));
                } else if (rd7.isChecked()){
                    radio1 = false;
                    radio2 = false;
                    radio3 = false;
                    radio4 = false;
                    radio5 = false;
                    radio6 = false;
                    radio7 = true;
                    feedback.setText(maskQuestion.CalcMask(borrowedBits, radio1, radio2, radio3, radio4, radio5, radio6, radio7));
                }

            }
        });
    }

    public void reset(View view) {
        ResetActivity();
    }

    public void ResetActivity() {
        super.onRestart();
        Intent intent = new Intent(this, IPv4Masks.class);
        startActivity(intent);
        finish();
    }

}
