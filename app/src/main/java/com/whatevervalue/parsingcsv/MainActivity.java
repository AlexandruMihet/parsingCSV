package com.whatevervalue.parsingcsv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        readCarData();

    }
    private List<CarSample> carSamples = new ArrayList<>();
    //Based on info from: http://stackoverflow.com/a/19976110

    private void readCarData(){
        InputStream is = getResources().openRawResource(R.raw.data);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(is, Charset.forName("UTF-8"))
        );

        String line = "";
        try {
             //headers (titluri)
            //Step over headers
                reader.readLine();
            while ((line = reader.readLine()) != null) {
                Log.d("MyActivity", "Line" +line);
                //Split by ','
                String[] tokens = line.split(",");

                //Read the data
                CarSample sample = new CarSample();
                sample.setMarca(tokens[0]);//marca
                sample.setModel(tokens[1]);//model

                sample.setAn(Integer.parseInt(tokens[2])); //an
                sample.setMotorizare(tokens[3]);// motorizare

                carSamples.add(sample);

                //Log message debug
                Log.d("MyActivity", "Just created:" +sample);
            }
        }   catch (IOException e){
            Log.wtf("MiActivity", "Eror readind data file on line" + line, e);
            e.printStackTrace();
        }
    }

}
