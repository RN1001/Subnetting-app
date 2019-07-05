package com.lcc.rai.subnettingapp.Views.Exercises;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import com.lcc.rai.subnettingapp.Viewmodel.ClassQuestion;
import com.lcc.rai.subnettingapp.Models.Octets;
import com.lcc.rai.subnettingapp.R;

public class ClassExercise extends AppCompatActivity {

    RadioButton RadioA, RadioB, RadioC;
    TextView ErrorView,textView;
    ClassQuestion classQuestion;
    boolean radioA, radioB, radioC;
    String answer = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_exercise);

        classQuestion = new ClassQuestion();

        String Question1 = getString(R.string.Question1, classQuestion.getAddress());
        classQuestion.setQuestion1(Question1);

        textView = findViewById(R.id.Question);
        textView.setText(classQuestion.getQuestion1());

        RadioA = findViewById(R.id.ClassACheck);
        RadioB = findViewById(R.id.ClassBCheck);
        RadioC = findViewById(R.id.ClassCCheck);

        ErrorView = findViewById(R.id.ErrorBox);

        // explicit onclick call
        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (RadioA.isChecked()) {
                    radioA = true;
                    radioB = false;
                    radioC = false;
                    answer = classQuestion.getAnswer(radioA, radioB, radioC);
                    ErrorView.setText(answer);
                } else if (RadioB.isChecked()) {
                    radioA = false;
                    radioB = true;
                    radioC = false;
                    answer = classQuestion.getAnswer(radioA, radioB, radioC);
                    ErrorView.setText(answer);
                } else if (RadioC.isChecked()) {
                    radioA = false;
                    radioB = false;
                    radioC = true;
                    answer = classQuestion.getAnswer(radioA, radioB, radioC);
                    ErrorView.setText(answer);
                }
            }
        });
    }

    public void reset(View view) {
        ResetActivity();
    }

    public void ResetActivity() {
        super.onRestart();
        Intent intent = new Intent(this, ClassExercise.class);
        startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION));
        finish();
    }


}
