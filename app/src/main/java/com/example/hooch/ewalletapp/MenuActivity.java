package com.example.hooch.ewalletapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    switchFragment(1);
                    return true;
                case R.id.navigation_qrcode:
                    switchFragment(2);
                    return true;
                case R.id.navigation_userprofile:
                    switchFragment(3);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.fragment_container, new Home_Fragment()).commit();
    }
    public void switchFragment(int a) {
//        FragmentManager manager = getSupportFragmentManager();
//        manager.beginTransaction().replace(R.id.your_fragment_layout_name, new Fragment1()).commit();
        if(a == 1){
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.fragment_container, new Home_Fragment()).commit();
        }else if (a == 2){

        }else if(a ==3){
            FragmentManager manager = getSupportFragmentManager();
           manager.beginTransaction().replace(R.id.fragment_container, new Profile_Fragment()).commit();
        }
    }

}
