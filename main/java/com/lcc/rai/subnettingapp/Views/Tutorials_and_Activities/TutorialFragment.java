package com.lcc.rai.subnettingapp.Views.Tutorials_and_Activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.lcc.rai.subnettingapp.R;

public class TutorialFragment extends Fragment {

    Button ipv4tutorial, masktutoral, binToDecTutorial, decToBinTutorial;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_tutorials, null);

        ipv4tutorial = view.findViewById(R.id.IPv4Class);
        masktutoral = view.findViewById(R.id.IPv4Masks);
        binToDecTutorial = view.findViewById(R.id.BinToDec);
        decToBinTutorial = view.findViewById(R.id.DecToBin);

        ipv4tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                featureNotImplemented(v);
            }
        });

        masktutoral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                featureNotImplemented(v);
            }
        });

        binToDecTutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                featureNotImplemented(v);
            }
        });

        decToBinTutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                featureNotImplemented(v);
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

    public void featureNotImplemented(View v) {
        Toast.makeText(getContext(), "Feature not implemented yet.", Toast.LENGTH_LONG).show();
    }


}
