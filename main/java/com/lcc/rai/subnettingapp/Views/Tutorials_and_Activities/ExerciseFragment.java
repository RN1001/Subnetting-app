package com.lcc.rai.subnettingapp.Views.Tutorials_and_Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.lcc.rai.subnettingapp.R;
import com.lcc.rai.subnettingapp.Views.Exercises.BinToDec;
import com.lcc.rai.subnettingapp.Views.Exercises.BinaryAnding;
import com.lcc.rai.subnettingapp.Views.Exercises.ClassExercise;
import com.lcc.rai.subnettingapp.Views.Exercises.CustomSubnetExercise;
import com.lcc.rai.subnettingapp.Views.Exercises.DecToBin;
import com.lcc.rai.subnettingapp.Views.Exercises.IPv4Masks;

public class ExerciseFragment extends Fragment {

    Button ClassExbtn, maskBtn, binToDecBtn, decToBinBtn, andingBtn, customSubnetBtn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_exercises, null);

        ClassExbtn = view.findViewById(R.id.ClassExBtn);
        maskBtn = view.findViewById(R.id.MaskExBtn);
        binToDecBtn = view.findViewById(R.id.BinToDecBtn);
        decToBinBtn = view.findViewById(R.id.DecToBinBtn);
        andingBtn = view.findViewById(R.id.AndingBtn);
        customSubnetBtn = view.findViewById(R.id.CustomSubnetBtn);

        ClassExbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ClassExercise.class);
                startActivity(intent);
            }
        });

        maskBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), IPv4Masks.class);
                startActivity(intent);
            }
        });

        binToDecBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), BinToDec.class);
                startActivity(intent);
            }
        });

        decToBinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DecToBin.class);
                startActivity(intent);
            }
        });

        andingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), BinaryAnding.class);
                startActivity(intent);
            }
        });

        customSubnetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), CustomSubnetExercise.class);
                startActivity(intent);
            }
        });

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }



}
