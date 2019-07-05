package com.lcc.rai.subnettingapp.Views.Exercises;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.lcc.rai.subnettingapp.Viewmodel.ConversionQuestion;
import com.lcc.rai.subnettingapp.R;

public class DecToBin extends AppCompatActivity {

    ConversionQuestion conversionQuestion;
    TextView question4, feedback;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dec_to_bin);

        conversionQuestion = new ConversionQuestion();

        conversionQuestion.setQuestion4(getString(R.string.Question4, conversionQuestion.getBinarySequence()));
        question4 = findViewById(R.id.Question4);
        question4.setText(conversionQuestion.getQuestion4());

        editText = findViewById(R.id.AnswerBox);
        feedback = findViewById(R.id.FeedbackView);

        Button btn = findViewById(R.id.SubmitBtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    feedback.setText(conversionQuestion.CompareDecimal(editText.getText().toString()));
                } catch (Exception e){
                    System.err.println(e.getCause());
                }

            }
        });

    }

    public void reset(View view) {
        ResetActivity();
    }

    public void ResetActivity() {
        super.onRestart();
        Intent intent = new Intent(this, DecToBin.class);
        startActivity(intent);
        finish();
    }


}
