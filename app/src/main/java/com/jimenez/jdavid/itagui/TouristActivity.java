package com.jimenez.jdavid.itagui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class TouristActivity extends AppCompatActivity {

    private Spinner spinner_tourist;
    private TextView text1Tourist, text2Tourist, text3Tourist;
    private ImageView image1Tourist, image2Tourist, image3Tourist;
    private Button button_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourist);

        button_return=(Button)findViewById(R.id.button_return);

        text1Tourist = (TextView) findViewById(R.id.text1Tourist);
        text2Tourist = (TextView) findViewById(R.id.text2Tourist);
        text3Tourist = (TextView) findViewById(R.id.text3Tourist);

        image1Tourist = (ImageView) findViewById(R.id.image1Tourist);
        image2Tourist = (ImageView) findViewById(R.id.image2Tourist);
        image3Tourist = (ImageView) findViewById(R.id.image3Tourist);

        spinner_tourist = (Spinner) findViewById(R.id.spinner_tourist);

        spinner_tourist.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (spinner_tourist.getSelectedItem().toString().equals("La Montaña Que Piensa")) {
                    image1Tourist.setVisibility(View.VISIBLE);
                    text1Tourist.setVisibility(View.VISIBLE);
                    image2Tourist.setVisibility(View.GONE);
                    text2Tourist.setVisibility(View.GONE);
                    image3Tourist.setVisibility(View.GONE);
                    text3Tourist.setVisibility(View.GONE);
                }

                if (spinner_tourist.getSelectedItem().toString().equals("Acuaparque Ditaires")) {
                    image1Tourist.setVisibility(View.GONE);
                    text1Tourist.setVisibility(View.GONE);
                    image2Tourist.setVisibility(View.VISIBLE);
                    text2Tourist.setVisibility(View.VISIBLE);
                    image3Tourist.setVisibility(View.GONE);
                    text3Tourist.setVisibility(View.GONE);
                }

                if (spinner_tourist.getSelectedItem().toString().equals("Centro de la Moda")) {
                    image1Tourist.setVisibility(View.GONE);
                    text1Tourist.setVisibility(View.GONE);
                    image2Tourist.setVisibility(View.GONE);
                    text2Tourist.setVisibility(View.GONE);
                    image3Tourist.setVisibility(View.VISIBLE);
                    text3Tourist.setVisibility(View.VISIBLE);
                }

                return;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        button_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                setResult(RESULT_OK, intent);
                finish();
            }

        });

    }
}
