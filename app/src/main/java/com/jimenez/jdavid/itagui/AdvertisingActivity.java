package com.jimenez.jdavid.itagui;

import android.app.Notification;
import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class AdvertisingActivity extends AppCompatActivity {






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advertising);




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.mAbout){
            //Toast.makeText(this, "Presionó configurar", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, AboutActivity.class);

            startActivityForResult(intent, 1234);
        }
        if (id==R.id.mBars){
            //Toast.makeText(this, "Presionó configurar", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, BarsActivity.class);

            startActivityForResult(intent, 1234);
        }
        if (id==R.id.mDemography){
            //Toast.makeText(this, "Presionó configurar", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, DemographyActivity.class);

            startActivityForResult(intent, 1234);
        }
        if (id==R.id.mHotels){
            //Toast.makeText(this, "Presionó configurar", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, HotelsActivity.class);

            startActivityForResult(intent, 1234);
        }
        if (id==R.id.mTourist){
            //Toast.makeText(this, "Presionó configurar", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, TouristActivity.class);

            startActivityForResult(intent, 1234);
        }
        return super.onOptionsItemSelected(item);


    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode==1234 && resultCode==RESULT_OK){

        }

        super.onActivityResult(requestCode, resultCode, data);

    }

}
