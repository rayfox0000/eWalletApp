package com.example.hooch.ewalletapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.squareup.picasso.Picasso;

/**
 * Created by hooch on 23/2/2018.
 */

public class FunctionListAdapter extends BaseAdapter {
    String [] result;
    Context context;
    int [] imageId;
    private static LayoutInflater inflater=null;

    public FunctionListAdapter(MenuActivity menuActivity, String[] functionList, int[] functionIm) {
// TODO Auto-generated constructor stub
        result=functionList;
        context=menuActivity;
        imageId=functionIm;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
// TODO Auto-generated method stub
        return result.length;
    }

    @Override
    public Object getItem(int position) {
// TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
// TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {
        TextView function_tv;
        ImageView function_im;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
// TODO Auto-generated method stub
        Holder holder=new Holder();
        View view;
        view = inflater.inflate(R.layout.layout_function_list_item, null);

        holder.function_tv=(TextView) view.findViewById(R.id.function_name);
        holder.function_im =(ImageView) view.findViewById(R.id.function_im);

        holder.function_tv.setText(result[position]);
        Picasso.with(context).load(imageId[position]).into(holder.function_im);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                Toast.makeText(context, "You Clicked " + result[position], Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }

}
