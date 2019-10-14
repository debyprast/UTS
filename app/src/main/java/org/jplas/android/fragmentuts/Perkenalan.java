package org.jplas.android.fragmentuts;


import androidx.appcompat.app.AppCompatActivity;
import android.app.DatePickerDialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Perkenalan extends Fragment {


    EditText nama,panggilan,tmptLahir,alamat,hobi,pekerjaan;
    Spinner jkelamin;
    Button tglLahir, proses;
    TextView kalimat;
    private int mTahun,mBulan,mHari;

    public Perkenalan() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_perkenalan, container, false);
        nama = (EditText)findViewById(R.id.edit_nama);
        panggilan = (EditText)findViewById(R.id.edit_panggilan);
        tmptLahir = (EditText)findViewById(R.id.edit_tmptLahir);
        alamat = (EditText)findViewById(R.id.edit_alamat);
        hobi = (EditText)findViewById(R.id.edit_hobi);
        pekerjaan = (EditText)findViewById(R.id.edit_pekerjaan);

        jkelamin = (Spinner)findViewById(R.id.spn_jkelamin);
        tglLahir = (Button) findViewById(R.id.btn_tglLahir);
        proses = (Button) findViewById(R.id.btn_proses);
        kalimat = (TextView) findViewById(R.id.txt_kalimat);

        List<String> listKelamin = new ArrayList<String>();
        listKelamin.add("Laki-Laki");
        listKelamin.add("Perempuan");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,listKelamin);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        jkelamin.setAdapter(adapter);

        tglLahir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                mTahun = cal.get(Calendar.YEAR);
                mBulan = cal.get(Calendar.MONTH);
                mHari = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog mDateDialog = new DatePickerDialog(  MainActivity.this, new DatePickerDialog.OnDateSetListener(){
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth){
                        tglLahir.setText(String.valueOf(dayOfMonth)+"-"+String.valueOf(month+1)+"-"+String.valueOf(year));
                    }
                },mTahun,mBulan,mHari);
                mDateDialog.setTitle("Pilih Tanggal Lahir");
                mDateDialog.show();
            }

        });

        proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kalimat.setText("Hai nama ku adalah"+nama.getText().toString()+", Aku biasa dipanggil"+panggilan.getText().toString()+", Saya adalah "+jkelamin.getSelectedItem().toString()+", Saya lahir di "+tmptLahir.getText().toString()+
                        ", "+tglLahir.getText().toString()+ ", Alamat saya di "+ alamat.getText().toString()+", Hobi saya adalah "+hobi.getText().toString()+
                        ", Dan pekerjaan saya adalah "+pekerjaan.getText().toString()+", Senang berkenalan dengan anda..");
            }
        });
    }
}
