package com.example.nikolay.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ResultatActivity extends AppCompatActivity {

    private TextView txt_k1_1;
    private TextView txt_k1_2;
    private TextView txt_k1_3;
    private TextView txt_k1_4;
    private TextView txt_k1_z;

    private EditText k2_1;
    private EditText k2_2;
    private EditText k2_3;
    private EditText k2_4;
    private EditText k2_z;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat);

        txt_k1_1 = (TextView) findViewById(R.id.txt_k1_1);
        txt_k1_2 = (TextView) findViewById(R.id.txt_k1_2);
        txt_k1_3 = (TextView) findViewById(R.id.txt_k1_3);
        txt_k1_4 = (TextView) findViewById(R.id.txt_k1_4);
        txt_k1_z = (TextView) findViewById(R.id.txt_k1_z);

        k2_1 = (EditText) findViewById(R.id.k111t);
        k2_2 = (EditText) findViewById(R.id.k112t);
        k2_3 = (EditText) findViewById(R.id.k113t);
        k2_4 = (EditText) findViewById(R.id.k114t);
        k2_z = (EditText) findViewById(R.id.k1_zt);


        txt_k1_1.setText(getIntent().getStringExtra("k1"));
        txt_k1_2.setText(getIntent().getStringExtra("k2"));
        txt_k1_3.setText(getIntent().getStringExtra("k3"));
        txt_k1_4.setText(getIntent().getStringExtra("k4"));
        txt_k1_z.setText(getIntent().getStringExtra("kz"));

    }
    public void onClick_nazad1(View view) {
        Intent intent = new Intent(ResultatActivity.this, StartActivity.class);
        startActivity(intent);
    }

    public void sendData2(View view) {
        Intent intent = new Intent(this, MainActivity.class);

        intent.putExtra("k11", txt_k1_1.getText().toString());
        intent.putExtra("k12", txt_k1_2.getText().toString());
        intent.putExtra("k13", txt_k1_3.getText().toString());
        intent.putExtra("k14", txt_k1_4.getText().toString());
        intent.putExtra("k1z", txt_k1_z.getText().toString());

        intent.putExtra("k21", k2_1.getText().toString());
        intent.putExtra("k22", k2_2.getText().toString());
        intent.putExtra("k23", k2_3.getText().toString());
        intent.putExtra("k24", k2_4.getText().toString());
        intent.putExtra("k2z", k2_z.getText().toString());
        startActivity(intent);
    }

    public void onClick10t(View view) {
        TextView kppM412t = (TextView) findViewById(R.id.k111t);
        kppM412t.setText(3.49 + "");

        TextView kppM412_2t = (TextView) findViewById(R.id.k112t);
        kppM412_2t.setText(2.04 + "");

        TextView kppM412_3t = (TextView) findViewById(R.id.k113t);
        kppM412_3t.setText(1.33 + "");

        TextView kppM412_4t = (TextView) findViewById(R.id.k114t);
        kppM412_4t.setText(1.00 + "");

        TextView kppM412_zt = (TextView) findViewById(R.id.k1_zt);
        kppM412_zt.setText(4.71 + "");

        TextView vibor_1t = (TextView) findViewById(R.id.vibor_2_kpp2);
        vibor_1t.setText("Вторая КПП: м412");

    }

    public void onClick_vaz2101t(View view) {
        TextView kppM412t = (TextView) findViewById(R.id.k111t);
        kppM412t.setText(3.75 + "");

        TextView kppM412_2t = (TextView) findViewById(R.id.k112t);
        kppM412_2t.setText(2.30 + "");

        TextView kppM412_3t = (TextView) findViewById(R.id.k113t);
        kppM412_3t.setText(1.49 + "");

        TextView kppM412_4t = (TextView) findViewById(R.id.k114t);
        kppM412_4t.setText(1.00 + "");

        TextView kppM412_zt = (TextView) findViewById(R.id.k1_zt);
        kppM412_zt.setText(3.87 + "");

        TextView vibor_1t = (TextView) findViewById(R.id.vibor_2_kpp2);
        vibor_1t.setText("Вторая КПП: ВАЗ 2101");

    }

    public void onClick_gaz_51t(View view) {
        TextView kppM412t = (TextView) findViewById(R.id.k111t);
        kppM412t.setText(6.40 + "");

        TextView kppM412_2t = (TextView) findViewById(R.id.k112t);
        kppM412_2t.setText(3.09 + "");

        TextView kppM412_3t = (TextView) findViewById(R.id.k113t);
        kppM412_3t.setText(1.69 + "");

        TextView kppM412_4t = (TextView) findViewById(R.id.k114t);
        kppM412_4t.setText(1.00 + "");

        TextView kppM412_zt = (TextView) findViewById(R.id.k1_zt);
        kppM412_zt.setText(7.82 + "");

        TextView vibor_1t = (TextView) findViewById(R.id.vibor_2_kpp2);
        vibor_1t.setText("Вторая КПП: ГАЗ 51");

    }


    public void onClick_gaz_52_3t(View view) {
        TextView kppM412t = (TextView) findViewById(R.id.k111t);
        kppM412t.setText(6.48 + "");

        TextView kppM412_2t = (TextView) findViewById(R.id.k112t);
        kppM412_2t.setText(3.09 + "");

        TextView kppM412_3t = (TextView) findViewById(R.id.k113t);
        kppM412_3t.setText(1.71 + "");

        TextView kppM412_4t = (TextView) findViewById(R.id.k114t);
        kppM412_4t.setText(1.00 + "");

        TextView kppM412_zt = (TextView) findViewById(R.id.k1_zt);
        kppM412_zt.setText(7.90 + "");

        TextView vibor_1t = (TextView) findViewById(R.id.vibor_2_kpp2);
        vibor_1t.setText("Вторая КПП: ГАЗ 52-53");
    }

    public void onClick_volgat(View view) {
        TextView volga1t = (TextView) findViewById(R.id.k111t);
        volga1t.setText(3.50 + "");

        TextView volga2t = (TextView) findViewById(R.id.k112t);
        volga2t.setText(2.26 + "");

        TextView volga3t = (TextView) findViewById(R.id.k113t);
        volga3t.setText(1.45 + "");

        TextView volga4t = (TextView) findViewById(R.id.k114t);
        volga4t.setText(1.00 + "");

        TextView volga_zt = (TextView) findViewById(R.id.k1_zt);
        volga_zt.setText(3.54 + "");

        TextView vibor_1t = (TextView) findViewById(R.id.vibor_2_kpp2);
        vibor_1t.setText("Вторая КПП: Волга 2410");
    }

    public void onClick_vaz2108t(View view) {
        TextView volga11t = (TextView) findViewById(R.id.k111t);
        volga11t.setText(3.63 + "");

        TextView volga12t = (TextView) findViewById(R.id.k112t);
        volga12t.setText(1.95 + "");

        TextView volga13t = (TextView) findViewById(R.id.k113t);
        volga13t.setText(1.35 + "");

        TextView volga14t = (TextView) findViewById(R.id.k114t);
        volga14t.setText(0.94 + "");

        TextView volga_1zt = (TextView) findViewById(R.id.k1_zt);
        volga_1zt.setText(3.53 + "");

        TextView vibor_1t = (TextView) findViewById(R.id.vibor_2_kpp2);
        vibor_1t.setText("Вторая КПП: ВАЗ 2108");
    }

    public void onClick_vaz_okat(View view) {
        TextView volga111t = (TextView) findViewById(R.id.k111t);
        volga111t.setText(3.70 + "");

        TextView volga112t = (TextView) findViewById(R.id.k112t);
        volga112t.setText(2.06 + "");

        TextView volga113t = (TextView) findViewById(R.id.k113t);
        volga113t.setText(1.27 + "");

        TextView volga114t = (TextView) findViewById(R.id.k114t);
        volga114t.setText(0.90 + "");

        TextView volga_11zt = (TextView) findViewById(R.id.k1_zt);
        volga_11zt.setText(3.67 + "");

        TextView vibor_1t = (TextView) findViewById(R.id.vibor_2_kpp2);
        vibor_1t.setText("Вторая КПП: Ока");
    }

    public void onClick_uralt(View view) {
        TextView volga1111t = (TextView) findViewById(R.id.k111t);
        volga1111t.setText(3.60 + "");

        TextView volga1112t = (TextView) findViewById(R.id.k112t);
        volga1112t.setText(2.28 + "");

        TextView volga1113t = (TextView) findViewById(R.id.k113t);
        volga1113t.setText(1.56 + "");

        TextView volga1114t = (TextView) findViewById(R.id.k114t);
        volga1114t.setText(1.19 + "");

        TextView volga_111zt = (TextView) findViewById(R.id.k1_zt);
        volga_111zt.setText(4.20 + "");

        TextView vibor_1t = (TextView) findViewById(R.id.vibor_2_kpp2);
        vibor_1t.setText("Вторая КПП: Мото Урал");
    }

    public void onClick_uazt(View view) {
        TextView volga2111t = (TextView) findViewById(R.id.k111t);
        volga2111t.setText(3.78 + "");

        TextView volga2112t = (TextView) findViewById(R.id.k112t);
        volga2112t.setText(2.60 + "");

        TextView volga2113t = (TextView) findViewById(R.id.k113t);
        volga2113t.setText(1.55 + "");

        TextView volga2114t = (TextView) findViewById(R.id.k114t);
        volga2114t.setText(1.00 + "");

        TextView volga_211zt = (TextView) findViewById(R.id.k1_zt);
        volga_211zt.setText(4.12 + "");

        TextView vibor_1t = (TextView) findViewById(R.id.vibor_2_kpp2);
        vibor_1t.setText("Вторая КПП: УАЗ");
    }
    public void onClick_uaz_rkt(View view) {
        TextView volga21112t = (TextView) findViewById(R.id.k111t);
        volga21112t.setText(1.94 + "");

        TextView volga21122t = (TextView) findViewById(R.id.k112t);
        volga21122t.setText(1.0 + "");

        TextView volga21132t = (TextView) findViewById(R.id.k113t);
        volga21132t.setText(1.0 + "");

        TextView volga21142t = (TextView) findViewById(R.id.k114t);
        volga21142t.setText(1.0 + "");

        TextView volga_211z2t = (TextView) findViewById(R.id.k1_zt);
        volga_211z2t.setText(1.0 + "");

        TextView vibor_1t = (TextView) findViewById(R.id.vibor_2_kpp2);
        vibor_1t.setText("Вторая КПП: РК УАЗ");
    }
    public void onClick_niva_rkt(View view) {
        TextView volga121112t = (TextView) findViewById(R.id.k111);
        volga121112t.setText(2.13 + "");

        TextView volga121122t = (TextView) findViewById(R.id.k112t);
        volga121122t.setText(1.2 + "");

        TextView volga121132t = (TextView) findViewById(R.id.k113t);
        volga121132t.setText(1.0 + "");

        TextView volga121142t = (TextView) findViewById(R.id.k114t);
        volga121142t.setText(1.0 + "");

        TextView volga_1211z2t = (TextView) findViewById(R.id.k1_zt);
        volga_1211z2t.setText(1.0 + "");

        TextView vibor_1t = (TextView) findViewById(R.id.vibor_2_kpp2);
        vibor_1t.setText("Вторая КПП: РК Нива");
    }
    public void onClick_gaz69t(View view) {
        TextView volga1121112t = (TextView) findViewById(R.id.k111t);
        volga1121112t.setText(3.11 + "");

        TextView volga1121122t = (TextView) findViewById(R.id.k112t);
        volga1121122t.setText(1.8 + "");

        TextView volga1121132t = (TextView) findViewById(R.id.k113t);
        volga1121132t.setText(1.0 + "");

        TextView volga1121142t = (TextView) findViewById(R.id.k114t);
        volga1121142t.setText(1.0 + "");

        TextView volga_11211z2t = (TextView) findViewById(R.id.k1_zt);
        volga_11211z2t.setText(3.74 + "");

        TextView vibor_1t = (TextView) findViewById(R.id.vibor_2_kpp2);
        vibor_1t.setText("Вторая КПП: ГАЗ 69");
    }
}


