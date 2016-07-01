package com.example.nikolay.calculator;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends Activity implements View.OnClickListener {

    TextView etNum1;
    TextView etNum2;
    TextView etNum3;
    TextView etNum4;
    TextView etNum5;
    TextView etNum6;
    TextView etNum7;
    TextView etNum8;
    TextView etNum9;
    TextView etNum10;
    TextView etNum11;
    TextView etNum12;
    TextView etNum13;
    TextView etNum14;
    TextView etNum15;

    private TextView txt_k1_1;
    private TextView txt_k1_2;
    private TextView txt_k1_3;
    private TextView txt_k1_4;
    private TextView txt_k1_z;

    private TextView k2_1;
    private TextView k2_2;
    private TextView k2_3;
    private TextView k2_4;
    private TextView k2_z;

    Button btnMult;

    TextView tvResult1;
    TextView tvResult2;
    TextView tvResult3;
    TextView tvResult4;
    TextView tvResult5;
    TextView tvResult6;
    TextView tvResult7;
    TextView tvResult8;
    TextView tvResult9;
    TextView tvResult10;
    TextView tvResult11;
    TextView tvResult12;
    TextView tvResult13;
    TextView tvResult14;
    TextView tvResult15;
    TextView tvResult16;
    TextView tvResult17;
    TextView tvResult18;
    TextView tvResult19;
    TextView tvResult20;
    TextView tvResult21;
    TextView tvResult22;
    TextView tvResult23;
    TextView tvResult24;

    SeekBar seekbar;
    SeekBar seekbar2;
    SeekBar seekbar3;
    SeekBar seekbar4;
    SeekBar seekbar5;

    TextView textview;
    TextView textview2;
    TextView textview3;
    TextView textview4;
    TextView textview5;


    String oper = "";

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);



        txt_k1_1 = (TextView) findViewById(R.id.kpp1_1);
        txt_k1_2 = (TextView) findViewById(R.id.kpp1_2);
        txt_k1_3 = (TextView) findViewById(R.id.kpp1_3);
        txt_k1_4 = (TextView) findViewById(R.id.kpp1_4);
        txt_k1_z = (TextView) findViewById(R.id.kpp_zad1);

        k2_1 = (TextView) findViewById(R.id.kpp2_1);
        k2_2 = (TextView) findViewById(R.id.kpp2_2);
        k2_3 = (TextView) findViewById(R.id.kpp2_3);
        k2_4 = (TextView) findViewById(R.id.kpp2_4);
        k2_z = (TextView) findViewById(R.id.kpp_zad2);

        txt_k1_1.setText(getIntent().getStringExtra("k11"));
        txt_k1_2.setText(getIntent().getStringExtra("k12"));
        txt_k1_3.setText(getIntent().getStringExtra("k13"));
        txt_k1_4.setText(getIntent().getStringExtra("k14"));
        txt_k1_z.setText(getIntent().getStringExtra("k1z"));

        k2_1.setText(getIntent().getStringExtra("k21"));
        k2_2.setText(getIntent().getStringExtra("k22"));
        k2_3.setText(getIntent().getStringExtra("k23"));
        k2_4.setText(getIntent().getStringExtra("k24"));
        k2_z.setText(getIntent().getStringExtra("k2z"));


        seekbar = (SeekBar) findViewById(R.id.seekBar1);
        textview = (TextView) findViewById(R.id.reduktor1);

        seekbar2 = (SeekBar) findViewById(R.id.seekBar2);
        textview2 = (TextView) findViewById(R.id.reduktor2);

        seekbar3 = (SeekBar) findViewById(R.id.seekBar3);
        textview3 = (TextView) findViewById(R.id.diametr);

        seekbar4 = (SeekBar) findViewById(R.id.seekBar4);
        textview4 = (TextView) findViewById(R.id.z_most);

        seekbar5 = (SeekBar) findViewById(R.id.seekBar5);
        textview5 = (TextView) findViewById(R.id.oboroti);


        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override


            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                float weight = (5.0f - 1.0f) / (float) seekBar.getMax();
                float value = 1.0f + seekBar.getProgress() * weight;
                textview.setText(String.format(Locale.US,"%.2f", value));


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        seekbar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                float weight = (5.0f - 1.0f) / (float) seekBar.getMax();
                float value = 1.0f + seekBar.getProgress() * weight;
                textview2.setText(String.format(Locale.US,"%.2f", value));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        seekbar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                float weight = (120f - 34f) / (float) seekBar.getMax();
                float value = 34f + seekBar.getProgress() * weight;
                textview3.setText(String.format(Locale.US,"%.0f", value));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        seekbar4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                float weight = (8.15f - 3.0f) / (float) seekBar.getMax();
                float value = 3.0f + seekBar.getProgress() * weight;
                textview4.setText(String.format(Locale.US,"%.2f", value));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        seekbar5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                float weight = (4000f - 800f) / (float) seekBar.getMax();
                float value = 800f + seekBar.getProgress() * weight;
                textview5.setText(String.format(Locale.US,"%.0f", value));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        // находим элементы
        // находим элементы
        etNum1 = (TextView) findViewById(R.id.reduktor1);///////////
        etNum2 = (TextView) findViewById(R.id.reduktor2);/////////////

        etNum3 = (TextView) findViewById(R.id.kpp1_1);/////////////////
        etNum4 = (TextView) findViewById(R.id.kpp1_2);
        etNum5 = (TextView) findViewById(R.id.kpp1_3);
        etNum6 = (TextView) findViewById(R.id.kpp1_4);
        etNum7 = (TextView) findViewById(R.id.kpp2_1);////////////////
        etNum8 = (TextView) findViewById(R.id.kpp2_2);
        etNum9 = (TextView) findViewById(R.id.kpp2_3);
        etNum10 = (TextView) findViewById(R.id.kpp2_4);
        etNum11 = (TextView) findViewById(R.id.kpp_zad1);
        etNum12 = (TextView) findViewById(R.id.kpp_zad2);
        etNum13 = (TextView) findViewById(R.id.diametr);
        etNum14 = (TextView) findViewById(R.id.oboroti);
        etNum15 = (TextView) findViewById(R.id.z_most);////////////

        btnMult = (Button) findViewById(R.id.btnMult);

        tvResult1 = (TextView) findViewById(R.id.tvResult1);
        tvResult2 = (TextView) findViewById(R.id.tvResult2);
        tvResult3 = (TextView) findViewById(R.id.tvResult3);
        tvResult4 = (TextView) findViewById(R.id.tvResult4);
        tvResult5 = (TextView) findViewById(R.id.tvResult5);
        tvResult6 = (TextView) findViewById(R.id.tvResult6);
        tvResult7 = (TextView) findViewById(R.id.tvResult7);
        tvResult8 = (TextView) findViewById(R.id.tvResult8);
        tvResult9 = (TextView) findViewById(R.id.tvResult9);
        tvResult10 = (TextView) findViewById(R.id.tvResult10);
        tvResult11 = (TextView) findViewById(R.id.tvResult11);
        tvResult12 = (TextView) findViewById(R.id.tvResult12);
        tvResult13 = (TextView) findViewById(R.id.tvResult13);
        tvResult14 = (TextView) findViewById(R.id.tvResult14);
        tvResult15 = (TextView) findViewById(R.id.tvResult15);
        tvResult16 = (TextView) findViewById(R.id.tvResult16);

        tvResult17 = (TextView) findViewById(R.id.tvResult17);
        tvResult18 = (TextView) findViewById(R.id.tvResult18);
        tvResult19 = (TextView) findViewById(R.id.tvResult19);
        tvResult20 = (TextView) findViewById(R.id.tvResult20);
        tvResult21 = (TextView) findViewById(R.id.tvResult21);
        tvResult22 = (TextView) findViewById(R.id.tvResult22);
        tvResult23 = (TextView) findViewById(R.id.tvResult23);
        tvResult24 = (TextView) findViewById(R.id.tvResult24);


        // прописываем обработчик

        btnMult.setOnClickListener(this);
    }


    public void onClick2(View view) {
        TextView helloTextView = (TextView) findViewById(R.id.kpp1_1);

        helloTextView.setText(3 + "");

        TextView helloTextView2 = (TextView) findViewById(R.id.kpp1_2);

        helloTextView2.setText(4 + "");

    }

    public void goToStartActivity(View v) {
        Intent intent = new Intent(this, StartActivity.class);///this - это активити
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        float num1 = 0;
        float num2 = 0;
        float num3 = 0;
        float num4 = 0;
        float num5 = 0;
        float num6 = 0;
        float num7 = 0;
        float num8 = 0;
        float num9 = 0;
        float num10 = 0;
        float num11 = 0;
        float num12 = 0;
        float num13 = 0;
        float num14 = 0;
        float num15 = 0;

        float result1 = 0;
        float result2 = 0;
        float result3 = 0;
        float result4 = 0;
        float result5 = 0;
        float result6 = 0;
        float result7 = 0;
        float result8 = 0;
        float result9 = 0;
        float result10 = 0;
        float result11 = 0;
        float result12 = 0;
        float result13 = 0;
        float result14 = 0;
        float result15 = 0;
        float result16 = 0;

        float result17 = 0;
        float result18 = 0;
        float result19 = 0;
        float result20 = 0;
        float result21 = 0;
        float result22 = 0;
        float result23 = 0;
        float result24 = 0;

        // Проверяем поля на пустоту
        if (TextUtils.isEmpty(etNum1.getText().toString())
                || TextUtils.isEmpty(etNum2.getText().toString())
                || TextUtils.isEmpty(etNum3.getText().toString())
                || TextUtils.isEmpty(etNum4.getText().toString())
                || TextUtils.isEmpty(etNum5.getText().toString())
                || TextUtils.isEmpty(etNum6.getText().toString())
                || TextUtils.isEmpty(etNum7.getText().toString())
                || TextUtils.isEmpty(etNum8.getText().toString())
                || TextUtils.isEmpty(etNum9.getText().toString())
                || TextUtils.isEmpty(etNum10.getText().toString())
                || TextUtils.isEmpty(etNum11.getText().toString())
                || TextUtils.isEmpty(etNum12.getText().toString())
                || TextUtils.isEmpty(etNum13.getText().toString())
                || TextUtils.isEmpty(etNum14.getText().toString())
                || TextUtils.isEmpty(etNum15.getText().toString())

                ) {
            return;
        }

        // читаем EditText и заполняем переменные числами
        num1 = Float.parseFloat(etNum1.getText().toString());
        num2 = Float.parseFloat(etNum2.getText().toString());
        num3 = Float.parseFloat(etNum3.getText().toString());
        num4 = Float.parseFloat(etNum4.getText().toString());
        num5 = Float.parseFloat(etNum5.getText().toString());
        num6 = Float.parseFloat(etNum6.getText().toString());
        num7 = Float.parseFloat(etNum7.getText().toString());
        num8 = Float.parseFloat(etNum8.getText().toString());
        num9 = Float.parseFloat(etNum9.getText().toString());
        num10 = Float.parseFloat(etNum10.getText().toString());
        num11 = Float.parseFloat(etNum11.getText().toString());
        num12 = Float.parseFloat(etNum12.getText().toString());
        num13 = Float.parseFloat(etNum13.getText().toString());
        num14 = Float.parseFloat(etNum14.getText().toString());
        num15 = Float.parseFloat(etNum15.getText().toString());

        // определяем нажатую кнопку и выполняем соответствующую операцию
        // в oper пишем операцию, потом будем использовать в выводе

        switch (v.getId()) {

            case R.id.btnMult:
                oper = "*";

                result1 = (float) (((((num14 / (num1 * num2 * num3 * num7 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result2 = (float) (((((num14 / (num1 * num2 * num3 * num8 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result3 = (float) (((((num14 / (num1 * num2 * num3 * num9 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result4 = (float) (((((num14 / (num1 * num2 * num3 * num10 * num15)) * 3.14) * num13) / 100) * 60) / 1000;

                result5 = (float) (((((num14 / (num1 * num2 * num4 * num7 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result6 = (float) (((((num14 / (num1 * num2 * num4 * num8 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result7 = (float) (((((num14 / (num1 * num2 * num4 * num9 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result8 = (float) (((((num14 / (num1 * num2 * num4 * num10 * num15)) * 3.14) * num13) / 100) * 60) / 1000;

                result9 = (float) (((((num14 / (num1 * num2 * num5 * num7 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result10 = (float) (((((num14 / (num1 * num2 * num5 * num8 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result11 = (float) (((((num14 / (num1 * num2 * num5 * num9 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result12 = (float) (((((num14 / (num1 * num2 * num5 * num10 * num15)) * 3.14) * num13) / 100) * 60) / 1000;

                result13 = (float) (((((num14 / (num1 * num2 * num6 * num7 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result14 = (float) (((((num14 / (num1 * num2 * num6 * num8 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result15 = (float) (((((num14 / (num1 * num2 * num6 * num9 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result16 = (float) (((((num14 / (num1 * num2 * num6 * num10 * num15)) * 3.14) * num13) / 100) * 60) / 1000;

                result17 = (float) (((((num14 / (num1 * num2 * num11 * num7 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result18 = (float) (((((num14 / (num1 * num2 * num11 * num8 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result19 = (float) (((((num14 / (num1 * num2 * num11 * num9 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result20 = (float) (((((num14 / (num1 * num2 * num11 * num10 * num15)) * 3.14) * num13) / 100) * 60) / 1000;

                result21 = (float) (((((num14 / (num1 * num2 * num12 * num3 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result22 = (float) (((((num14 / (num1 * num2 * num12 * num4 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result23 = (float) (((((num14 / (num1 * num2 * num12 * num5 * num15)) * 3.14) * num13) / 100) * 60) / 1000;
                result24 = (float) (((((num14 / (num1 * num2 * num12 * num6 * num15)) * 3.14) * num13) / 100) * 60) / 1000;


                break;

            default:
                break;
        }

        // формируем строку вывода
        //tvResult.setText(num1 + " " + oper + " " + num2 + oper+num3+oper+num4+" = " + result);

        tvResult1.setText("(1-1)" + String.format("%.1f", result1));
        tvResult2.setText("(1-2)" + String.format("%.1f", result2));
        tvResult3.setText("(1-3)" + String.format("%.1f", result3));
        tvResult4.setText("(1-4)" + String.format("%.1f", result4));
        tvResult5.setText("(2-1)" + String.format("%.1f", result5));
        tvResult6.setText("(2-2)" + String.format("%.1f", result6));
        tvResult7.setText("(2-3)" + String.format("%.1f", result7));
        tvResult8.setText("(2-4)" + String.format("%.1f", result8));
        tvResult9.setText("(3-1)" + String.format("%.1f", result9));
        tvResult10.setText("(3-2)" + String.format("%.1f", result10));
        tvResult11.setText("(3-3)" + String.format("%.1f", result11));
        tvResult12.setText("(3-4)" + String.format("%.1f", result12));
        tvResult13.setText("(4-1)" + String.format("%.1f", result13));
        tvResult14.setText("(4-2)" + String.format("%.1f", result14));
        tvResult15.setText("(4-3)" + String.format("%.1f", result15));
        tvResult16.setText("(4-4)" + String.format("%.1f", result16));
        tvResult17.setText("(з1-1)" + String.format("%.1f", result17));
        tvResult18.setText("(з1-2)" + String.format("%.1f", result18));
        tvResult19.setText("(з1-3)" + String.format("%.1f", result19));
        tvResult20.setText("(з1-4)" + String.format("%.1f", result20));
        tvResult21.setText("(з2-1)" + String.format("%.1f", result21));
        tvResult22.setText("(з2-2)" + String.format("%.1f", result22));
        tvResult23.setText("(з2-3)" + String.format("%.1f", result23));
        tvResult24.setText("(з2-4)" + String.format("%.1f", result24));
    }

}
