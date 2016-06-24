package com.example.nikolay.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class StartActivity extends AppCompatActivity {

    private EditText k1_1;
    private EditText k1_2;
    private EditText k1_3;
    private EditText k1_4;
    private EditText k1_z;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        k1_1 = (EditText) findViewById(R.id.k111);
        k1_2 = (EditText) findViewById(R.id.k112);
        k1_3 = (EditText) findViewById(R.id.k113);
        k1_4 = (EditText) findViewById(R.id.k114);
        k1_z = (EditText) findViewById(R.id.k1_z);
    }

    public void sendData(View view) {
        Intent intent = new Intent(this, ResultatActivity.class);

        intent.putExtra("k1", k1_1.getText().toString());
        intent.putExtra("k2", k1_2.getText().toString());
        intent.putExtra("k3", k1_3.getText().toString());
        intent.putExtra("k4", k1_4.getText().toString());
        intent.putExtra("kz", k1_z.getText().toString());
        startActivity(intent);
    }


    public void onClick10(View view) {
        TextView kppM412 = (TextView) findViewById(R.id.k111);
        kppM412.setText(3.49 + "");

        TextView kppM412_2 = (TextView) findViewById(R.id.k112);
        kppM412_2.setText(2.04 + "");

        TextView kppM412_3 = (TextView) findViewById(R.id.k113);
        kppM412_3.setText(1.33 + "");

        TextView kppM412_4 = (TextView) findViewById(R.id.k114);
        kppM412_4.setText(1.00 + "");

        TextView kppM412_z = (TextView) findViewById(R.id.k1_z);
        kppM412_z.setText(4.71 + "");

        TextView vibor_1 = (TextView) findViewById(R.id.vibor_2_kpp);
        vibor_1.setText("Первая КПП: м412");

    }

    public void onClick_vaz2101(View view) {
        TextView kppM412 = (TextView) findViewById(R.id.k111);
        kppM412.setText(3.75 + "");

        TextView kppM412_2 = (TextView) findViewById(R.id.k112);
        kppM412_2.setText(2.30 + "");

        TextView kppM412_3 = (TextView) findViewById(R.id.k113);
        kppM412_3.setText(1.49 + "");

        TextView kppM412_4 = (TextView) findViewById(R.id.k114);
        kppM412_4.setText(1.00 + "");

        TextView kppM412_z = (TextView) findViewById(R.id.k1_z);
        kppM412_z.setText(3.87 + "");

        TextView vibor_1 = (TextView) findViewById(R.id.vibor_2_kpp);
        vibor_1.setText("Первая КПП: ВАЗ 2101");

    }

    public void onClick_gaz_51(View view) {
        TextView kppM412 = (TextView) findViewById(R.id.k111);
        kppM412.setText(6.40 + "");

        TextView kppM412_2 = (TextView) findViewById(R.id.k112);
        kppM412_2.setText(3.09 + "");

        TextView kppM412_3 = (TextView) findViewById(R.id.k113);
        kppM412_3.setText(1.69 + "");

        TextView kppM412_4 = (TextView) findViewById(R.id.k114);
        kppM412_4.setText(1.00 + "");

        TextView kppM412_z = (TextView) findViewById(R.id.k1_z);
        kppM412_z.setText(7.82 + "");

        TextView vibor_1 = (TextView) findViewById(R.id.vibor_2_kpp);
        vibor_1.setText("Первая КПП: ГАЗ 51");

    }


    public void onClick_gaz_52_3(View view) {
        TextView kppM412 = (TextView) findViewById(R.id.k111);
        kppM412.setText(6.48 + "");

        TextView kppM412_2 = (TextView) findViewById(R.id.k112);
        kppM412_2.setText(3.09 + "");

        TextView kppM412_3 = (TextView) findViewById(R.id.k113);
        kppM412_3.setText(1.71 + "");

        TextView kppM412_4 = (TextView) findViewById(R.id.k114);
        kppM412_4.setText(1.00 + "");

        TextView kppM412_z = (TextView) findViewById(R.id.k1_z);
        kppM412_z.setText(7.90 + "");

        TextView vibor_1 = (TextView) findViewById(R.id.vibor_2_kpp);
        vibor_1.setText("Первая КПП: ГАЗ 52-53");
    }

    public void onClick_volga(View view) {
        TextView volga1t = (TextView) findViewById(R.id.k111);
        volga1t.setText(3.50 + "");

        TextView volga2t = (TextView) findViewById(R.id.k112);
        volga2t.setText(2.26 + "");

        TextView volga3 = (TextView) findViewById(R.id.k113);
        volga3.setText(1.45 + "");

        TextView volga4 = (TextView) findViewById(R.id.k114);
        volga4.setText(1.00 + "");

        TextView volga_z = (TextView) findViewById(R.id.k1_z);
        volga_z.setText(3.54 + "");

        TextView vibor_1 = (TextView) findViewById(R.id.vibor_2_kpp);
        vibor_1.setText("Первая КПП: Волга 2410");
    }

    public void onClick_vaz2108(View view) {
        TextView volga11 = (TextView) findViewById(R.id.k111);
        volga11.setText(3.63 + "");

        TextView volga12 = (TextView) findViewById(R.id.k112);
        volga12.setText(1.95 + "");

        TextView volga13 = (TextView) findViewById(R.id.k113);
        volga13.setText(1.35 + "");

        TextView volga14 = (TextView) findViewById(R.id.k114);
        volga14.setText(0.94 + "");

        TextView volga_1z = (TextView) findViewById(R.id.k1_z);
        volga_1z.setText(3.53 + "");

        TextView vibor_1 = (TextView) findViewById(R.id.vibor_2_kpp);
        vibor_1.setText("Первая КПП: ВАЗ 2108");
    }

    public void onClick_vaz_oka(View view) {
        TextView volga111 = (TextView) findViewById(R.id.k111);
        volga111.setText(3.70 + "");

        TextView volga112 = (TextView) findViewById(R.id.k112);
        volga112.setText(2.06 + "");

        TextView volga113 = (TextView) findViewById(R.id.k113);
        volga113.setText(1.27 + "");

        TextView volga114 = (TextView) findViewById(R.id.k114);
        volga114.setText(0.90 + "");

        TextView volga_11z = (TextView) findViewById(R.id.k1_z);
        volga_11z.setText(3.67 + "");

        TextView vibor_1 = (TextView) findViewById(R.id.vibor_2_kpp);
        vibor_1.setText("Первая КПП: Ока");
    }

    public void onClick_ural(View view) {
        TextView volga1111 = (TextView) findViewById(R.id.k111);
        volga1111.setText(3.60 + "");

        TextView volga1112 = (TextView) findViewById(R.id.k112);
        volga1112.setText(2.28 + "");

        TextView volga1113 = (TextView) findViewById(R.id.k113);
        volga1113.setText(1.56 + "");

        TextView volga1114 = (TextView) findViewById(R.id.k114);
        volga1114.setText(1.19 + "");

        TextView volga_111z = (TextView) findViewById(R.id.k1_z);
        volga_111z.setText(4.20 + "");

        TextView vibor_1 = (TextView) findViewById(R.id.vibor_2_kpp);
        vibor_1.setText("Первая КПП: Мото Урал");
    }

    public void onClick_uaz(View view) {
        TextView volga2111 = (TextView) findViewById(R.id.k111);
        volga2111.setText(3.78 + "");

        TextView volga2112 = (TextView) findViewById(R.id.k112);
        volga2112.setText(2.60 + "");

        TextView volga2113 = (TextView) findViewById(R.id.k113);
        volga2113.setText(1.55 + "");

        TextView volga2114 = (TextView) findViewById(R.id.k114);
        volga2114.setText(1.00 + "");

        TextView volga_211z = (TextView) findViewById(R.id.k1_z);
        volga_211z.setText(4.12 + "");

        TextView vibor_1 = (TextView) findViewById(R.id.vibor_2_kpp);
        vibor_1.setText("Первая КПП: УАЗ");
    }
    public void onClick_uaz_rk(View view) {
        TextView volga21112 = (TextView) findViewById(R.id.k111);
        volga21112.setText(1.94 + "");

        TextView volga21122 = (TextView) findViewById(R.id.k112);
        volga21122.setText(1.0 + "");

        TextView volga21132 = (TextView) findViewById(R.id.k113);
        volga21132.setText(1.0 + "");

        TextView volga21142 = (TextView) findViewById(R.id.k114);
        volga21142.setText(1.0 + "");

        TextView volga_211z2 = (TextView) findViewById(R.id.k1_z);
        volga_211z2.setText(1.0 + "");

        TextView vibor_1 = (TextView) findViewById(R.id.vibor_2_kpp);
        vibor_1.setText("Первая КПП: РК УАЗ");
    }
    public void onClick_niva_rk(View view) {
        TextView volga121112 = (TextView) findViewById(R.id.k111);
        volga121112.setText(2.13 + "");

        TextView volga121122 = (TextView) findViewById(R.id.k112);
        volga121122.setText(1.2 + "");

        TextView volga121132 = (TextView) findViewById(R.id.k113);
        volga121132.setText(1.0 + "");

        TextView volga121142 = (TextView) findViewById(R.id.k114);
        volga121142.setText(1.0 + "");

        TextView volga_1211z2 = (TextView) findViewById(R.id.k1_z);
        volga_1211z2.setText(1.0 + "");

        TextView vibor_1 = (TextView) findViewById(R.id.vibor_2_kpp);
        vibor_1.setText("Первая КПП: РК Нива");
    }
    public void onClick_gaz69(View view) {
        TextView volga1121112 = (TextView) findViewById(R.id.k111);
        volga1121112.setText(3.11 + "");

        TextView volga1121122 = (TextView) findViewById(R.id.k112);
        volga1121122.setText(1.8 + "");

        TextView volga1121132 = (TextView) findViewById(R.id.k113);
        volga1121132.setText(1.0 + "");

        TextView volga1121142 = (TextView) findViewById(R.id.k114);
        volga1121142.setText(1.0 + "");

        TextView volga_11211z2 = (TextView) findViewById(R.id.k1_z);
        volga_11211z2.setText(3.74 + "");

        TextView vibor_1 = (TextView) findViewById(R.id.vibor_2_kpp);
        vibor_1.setText("Первая КПП: ГАЗ 69");
    }
}

