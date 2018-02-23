package com.example.hooch.ewalletapp;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by hooch on 15/2/2018.
 */

public class Profile_Fragment extends Fragment {

    private String fname;
    private String lname;
    private String pName;
    private String phoneNumber;

    public Profile_Fragment(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_test, container, false);
        View photoHeader = view.findViewById(R.id.photoHeader);

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            photoHeader.setTranslationZ(6);
            photoHeader.invalidate();
        }

        return view;
    }
}
