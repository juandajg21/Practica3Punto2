package com.jimenez.jdavid.itagui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DemographyActivity extends AppCompatActivity {

    private Button button_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demography);

        button_return=(Button)findViewById(R.id.button_return);

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
