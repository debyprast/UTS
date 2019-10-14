package org.jplas.android.fragmentuts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity implements View.OnClickListener{

    Button btn_kalkulator,btn_perkenalan;
    Kalkulator kalkulator;
    Perkenalan perkenalan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_kalkulator=(Button)findViewById(R.id.kalkulator);
        btn_perkenalan=(Button)findViewById(R.id.perkenalan);

        btn_kalkulator.setOnClickListener(this);
        btn_perkenalan.setOnClickListener(this);
    }

    public void mKalkulator() {
        FragmentTransaction fTrans=getSupportFragmentManager().beginTransaction();
        kalkulator = new Kalkulator();
        fTrans.replace(R.id.fragmentContainer,kalkulator);
        fTrans.commit();
    }



    public void mPerkenalan() {
//        Intent intent = new Intent(MainActivity.this, Perkenalan.class);
//        startActivity(intent);
        FragmentTransaction fTrans=getSupportFragmentManager().beginTransaction();
        perkenalan = new Perkenalan();
        fTrans.replace(R.id.fragmentContainer,perkenalan);
        fTrans.commit();
    }


    @Override
    public void onClick(View view) {
        if (view==btn_kalkulator)
            mKalkulator();
        if (view==btn_perkenalan)
            mPerkenalan();

    }

}
