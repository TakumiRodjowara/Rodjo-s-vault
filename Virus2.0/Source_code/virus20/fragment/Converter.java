package com.example.virus20.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.virus20.R;

import java.text.DecimalFormat;

public class Converter extends Fragment {

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_converter, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view,  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button btn = view.findViewById(R.id.convert4);
        Button btn2 = view.findViewById(R.id.reset);
        btn.setOnClickListener(new View.OnClickListener() {


            EditText hrk = (EditText) view.findViewById(R.id.HRK8);
            EditText eur = (EditText) view.findViewById(R.id.EUR8);
            TextView hrk_out = view.findViewById(R.id.HRK9);
            TextView eur_out = view.findViewById(R.id.EUR9);

            @Override
            public void onClick(View view) {

                       try{
                           float eur_conv;
                           float hrk_conv;
                           float eur_inp = Float.parseFloat(eur.getText().toString());
                           float hrk_inp = Float.parseFloat(hrk.getText().toString());
                           DecimalFormat currency = new DecimalFormat(".##");


                           if(hrk_inp == 69 && eur_inp == 420){
                               Toast.makeText(getContext(), "We’re no strangers to love\n", Toast.LENGTH_LONG).show();
                           }

                           hrk_conv = (float) (eur_inp*7.53450);
                           hrk_out.setText(currency.format(hrk_conv) + "");
                           eur_conv = (float) (hrk_inp/7.53450);
                           eur_out.setText(currency.format(eur_conv) + "");
                       }catch (Exception e){
                           Toast.makeText(getContext(), "No input. Cannot set number", Toast.LENGTH_LONG).show();
                       }

                    }
        });

        btn2.setOnClickListener(new View.OnClickListener() {

            EditText hrk = (EditText) view.findViewById(R.id.HRK8);
            EditText eur = (EditText) view.findViewById(R.id.EUR8);
            TextView hrk_out = view.findViewById(R.id.HRK9);
            TextView eur_out = view.findViewById(R.id.EUR9);

            @Override
            public void onClick(View view) {

                try{
                    float eur_conv;
                    float hrk_conv;
                    float eur_inp = Float.parseFloat(eur.getText().toString());
                    float hrk_inp = Float.parseFloat(hrk.getText().toString());

                    hrk_out.setText(0 + "");
                    eur_out.setText(0 + "");
                    hrk.setText(0 + "");
                    eur.setText(0 + "");
                }catch(Exception e){
                    Toast.makeText(getContext(), "No input. Cannot set number", Toast.LENGTH_LONG).show();
                }

            }
        });
    }



}