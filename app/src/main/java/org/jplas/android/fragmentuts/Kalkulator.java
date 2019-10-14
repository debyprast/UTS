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

    private EditText inputText;
    private EditText angka_pertama,angka_kedua,hasil;
    private Button tambah,kurang,kali,bagi;
    private int a,b;

    public Kalkulator(View view) {
        String a = inputText.getText().toString();
        inputText.setText(a);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        final View hasil = inflater.inflate(R.layout.fragment_kalkulator,container,false);
        return hasil;

        angka_pertama = (EditText) angka_pertama.findViewById(R.id.angka_pertama);
        angka_pertama.setText(Integer.valueOf(a));
        angka_kedua = (EditText) angka_kedua.findViewById(R.id.angka_kedua);
        angka_kedua.setText(Integer.valueOf(b));

        tambah = (Button) tambah.findViewById(R.id.btn_tambah);
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.valueOf(angka_pertama.getText().toString());
                b = Integer.valueOf(angka_kedua.getText().toString());

                hasil.(fungtion_tambah(a,b));
            }
        });


        kurang = (Button) kurang.findViewById(R.id.btn_kurang);
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.valueOf(angka_pertama.getText().toString());
                b = Integer.valueOf(angka_kedua.getText().toString());

                hasil.s(fungtion_kurang(a,b));
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

