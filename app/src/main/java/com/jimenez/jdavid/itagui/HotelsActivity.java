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

public class HotelsActivity extends AppCompatActivity {

    private Spinner spinner_hotels;
    private TextView text1Hotels, text2Hotels, text3Hotels;
    private ImageView image1Hotels, image2Hotels, image3Hotels;
    private Button button_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        button_return=(Button)findViewById(R.id.button_return);

        text1Hotels = (TextView) findViewById(R.id.text1Hotels);
        text2Hotels = (TextView) findViewById(R.id.text2Hotels);
        text3Hotels = (TextView) findViewById(R.id.text3Hotels);

        image1Hotels = (ImageView) findViewById(R.id.image1Hotels);
        image2Hotels = (ImageView) findViewById(R.id.image2Hotels);
        image3Hotels = (ImageView) findViewById(R.id.image3Hotels);

        spinner_hotels = (Spinner) findViewById(R.id.spinner_hotels);

        spinner_hotels.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (spinner_hotels.getSelectedItem().toString().equals("Hotel Ruiseñor")) {
                    image1Hotels.setVisibility(View.VISIBLE);
                    text1Hotels.setVisibility(View.VISIBLE);
                    image2Hotels.setVisibility(View.GONE);
                    text2Hotels.setVisibility(View.GONE);
                    image3Hotels.setVisibility(View.GONE);
                    text3Hotels.setVisibility(View.GONE);
                }

                if (spinner_hotels.getSelectedItem().toString().equals("Hotel Alcaraván")) {
                    image1Hotels.setVisibility(View.GONE);
                    text1Hotels.setVisibility(View.GONE);
                    image2Hotels.setVisibility(View.VISIBLE);
                    text2Hotels.setVisibility(View.VISIBLE);
                    image3Hotels.setVisibility(View.GONE);
                    text3Hotels.setVisibility(View.GONE);
                }

                if (spinner_hotels.getSelectedItem().toString().equals("Hotel Central Plaza")) {
                    image1Hotels.setVisibility(View.GONE);
                    text1Hotels.setVisibility(View.GONE);
                    image2Hotels.setVisibility(View.GONE);
                    text2Hotels.setVisibility(View.GONE);
                    image3Hotels.setVisibility(View.VISIBLE);
                    text3Hotels.setVisibility(View.VISIBLE);
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
