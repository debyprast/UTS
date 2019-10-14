package org.jplas.android.fragmentuts;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class Kalkulator extends Fragment {

    View view;
    private EditText angka_pertama,angka_kedua,hasil;
    private Button tambah,kurang,kali,bagi;
    private int a,b;

    public Kalkulator() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        final View hasil = inflater.inflate(R.layout.fragment_kalkulator,container,false);
        return hasil;

        angka_pertama = (EditText) angka_pertama.findViewById(R.id.angka_pertama);
        return angka_pertama;
        angka_kedua = (EditText) angka_kedua.findViewById(R.id.angka_kedua);
        return angka_kedua;

        tambah = (Button) tambah.findViewById(R.id.btn_tambah);
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.valueOf(angka_pertama.getText().toString());
                b = Integer.valueOf(angka_kedua.getText().toString());

                hasil.setText(fungtion_tambah(a,b));
            }
        });


        kurang = (Button) kurang.findViewById(R.id.btn_kurang);
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.valueOf(angka_pertama.getText().toString());
                b = Integer.valueOf(angka_kedua.getText().toString());

                hasil.setText(fungtion_kurang(a,b));
            }
        });

        kali = (Button) kali.findViewById(R.id.btn_kali);
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.valueOf(angka_pertama.getText().toString());
                b = Integer.valueOf(angka_kedua.getText().toString());

                hasil.setText(fungtion_kali(a,b));
            }
        });

        bagi = (Button) bagi.findViewById(R.id.btn_bagi);
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.valueOf(angka_pertama.getText().toString());
                b = Integer.valueOf(angka_kedua.getText().toString());

                hasil.setText(fungtion_bagi(a,b));
            }
        });

    }

    String fungtion_tambah(int angka1, int angka2){
        int hasil_kalkulasi =angka1 + angka2;
        return String.valueOf(hasil_kalkulasi);
    }

    String fungtion_kurang(int angka1, int angka2){
        int hasil_kalkulasi =angka1 - angka2;
        return String.valueOf(hasil_kalkulasi);
    }

    String fungtion_kali(int angka1, int angka2){
        int hasil_kalkulasi =angka1 * angka2;
        return String.valueOf(hasil_kalkulasi);
    }

    String fungtion_bagi(int angka1, int angka2){
        int hasil_kalkulasi =angka1 / angka2;
        return String.valueOf(hasil_kalkulasi);
    }
}

