package com.jimenez.jdavid.itagui;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class BarsActivity extends AppCompatActivity {

    private Spinner spinner_bars;
    private TextView text1Bars, text2Bars, text3Bars;
    private ImageView image1Bars, image2Bars, image3Bars;
    private Button button_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bars);

        button_return = (Button)findViewById(R.id.button_return);

        text1Bars = (TextView) findViewById(R.id.text1Bars);
        text2Bars = (TextView) findViewById(R.id.text2Bars);
        text3Bars = (TextView) findViewById(R.id.text3Bars);

        image1Bars = (ImageView) findViewById(R.id.image1Bars);
        image2Bars = (ImageView) findViewById(R.id.image2Bars);
        image3Bars = (ImageView) findViewById(R.id.image3Bars);

        spinner_bars = (Spinner) findViewById(R.id.spinner_bars);

        spinner_bars.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (spinner_bars.getSelectedItem().toString().equals("Fonda Bar La Malagueña")) {
                    image1Bars.setVisibility(View.VISIBLE);
                    text1Bars.setVisibility(View.VISIBLE);
                    image2Bars.setVisibility(View.GONE);
                    text2Bars.setVisibility(View.GONE);
                    image3Bars.setVisibility(View.GONE);
                    text3Bars.setVisibility(View.GONE);
                }

                if (spinner_bars.getSelectedItem().toString().equals("Dulce Jesús Mio")) {
                    image1Bars.setVisibility(View.GONE);
                    text1Bars.setVisibility(View.GONE);
                    image2Bars.setVisibility(View.VISIBLE);
                    text2Bars.setVisibility(View.VISIBLE);
                    image3Bars.setVisibility(View.GONE);
                    text3Bars.setVisibility(View.GONE);
                }

                if (spinner_bars.getSelectedItem().toString().equals("Fonda Bitagüí")) {
                    image1Bars.setVisibility(View.GONE);
                    text1Bars.setVisibility(View.GONE);
                    image2Bars.setVisibility(View.GONE);
                    text2Bars.setVisibility(View.GONE);
                    image3Bars.setVisibility(View.VISIBLE);
                    text3Bars.setVisibility(View.VISIBLE);
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
