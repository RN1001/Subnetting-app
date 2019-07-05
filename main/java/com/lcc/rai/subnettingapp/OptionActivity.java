package com.lcc.rai.subnettingapp;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.lcc.rai.subnettingapp.R;
import com.lcc.rai.subnettingapp.Views.Tutorials_and_Activities.ExerciseFragment;
import com.lcc.rai.subnettingapp.Views.Tutorials_and_Activities.TutorialFragment;

public class OptionActivity extends AppCompatActivity {
    private TextView mTextMessage;



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {



        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment = null;

            switch (item.getItemId()) {
                case R.id.navigation_home:
                    fragment = new TutorialFragment();
                    break;
                case R.id.navigation_dashboard:
                    fragment = new ExerciseFragment();
                    break;
            }
            return FragmentLoader(fragment);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);

        FragmentLoader(new TutorialFragment());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }


    public Boolean FragmentLoader(Fragment fragment) {

        if (fragment != null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.frameLayout, fragment);
            transaction.commit();
            return true;
        }
        Log.e("Fragment Error", "Could not load up Fragment");
        return false;
    }

}
