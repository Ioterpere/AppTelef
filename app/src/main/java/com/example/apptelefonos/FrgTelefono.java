package com.example.apptelefonos;


import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FrgTelefono extends android.app.Fragment {

    long codFrgTelefono;
    int numTelef;
    public long getCodFrgTelefono() { return codFrgTelefono; }
    public int getNumTelef() { return numTelef; }

    private static SQLiteDatabase db;
    public static void setDatabase(SQLiteDatabase database) {db=database; }

    TextView tvTelf,tvUsuario,tvEstado;
    Spinner spAgenda;
    EditText etMensages;
    ImageButton btnEncneder,btnLlamar,btnMensage;

    public interface OnTelfListener {
        public void apagado();
        public void encendido();
        public void llamar();
        public void enviarMensaje(String mensaje);
    }

    OnTelfListener onTelfListener;

    public void setOnTelfListener(int codTelf,int numTelef, OnTelfListener onTelfListener) {
        this.codFrgTelefono=codTelf;
        this.onTelfListener=onTelfListener;

        tvTelf.setText("Telf:" + numTelef);
    }

    private void actualizarAgenda() {
        //spAgenda.setAdapter(new AdaptadorListaProductos(getActivity(), getListaProductos()));
    }



    public FrgTelefono() { }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_frg_telefono, container, false);
        return view;
    }

}
