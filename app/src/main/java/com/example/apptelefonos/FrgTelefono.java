package com.example.apptelefonos;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class FrgTelefono extends android.app.Fragment {

    long codFrgTelefono;
    String usuario;


    public FrgTelefono() { }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_frg_telefono, container, false);
        return view;
    }

}
