package com.example.hooch.ewalletapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by hooch on 22/2/2018.
 */

public class Home_Fragment extends Fragment {
    FunctionListAdapter list_adapter;
    ListView function_lv;


    String[] function = new String[]{
        "Wallet Management", "Transfer/Payment", "Money Management","Virtual Card Storage","Transaction History"
    };
    int[] function_im = new int[]{
            R.mipmap.wallet,
            R.mipmap.transfer_payment,
            R.mipmap.management,
            R.mipmap.card,
            R.mipmap.history
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        list_adapter = new FunctionListAdapter((MenuActivity)getActivity(),function, function_im);
        function_lv = (ListView) view.findViewById(R.id.function_lv);

        function_lv.setAdapter(list_adapter);

        return view;

    }




}
