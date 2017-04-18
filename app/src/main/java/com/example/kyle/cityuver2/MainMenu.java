package com.example.kyle.cityuver2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;



public class MainMenu extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;
            switch (item.getItemId()) {
                case R.id.navigation_appointment:
                    mTextMessage.setText(R.string.title_appointment);
                    selectedFragment = Appointment.newInstant();
                    break;

                case R.id.navigation_mediHistory:
                    mTextMessage.setText(R.string.title_mediHistory);
                    selectedFragment = MediHistory.newInstant();
                    break;

                case R.id.navigation_news:
                    mTextMessage.setText(R.string.title_news);
                    selectedFragment = News.newInstant();
                    break;

                case R.id.navigation_aboutUs:
                    mTextMessage.setText(R.string.title_aboutUs);
                    selectedFragment = AboutUs.newInstant();
                    break;
            }
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.mainFrag,selectedFragment);
            transaction.commit();
            return true;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.mainFrag,Appointment.newInstant());
        transaction.commit();

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
