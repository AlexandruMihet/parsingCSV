package com.whatevervalue.parsingcsv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Car> listaMasini = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InputStream is = getResources().openRawResource(R.raw.cars_info);
        ReadCars rc = new ReadCars(is);
        listaMasini=rc.readCarInfo();

        //Log message debug
        for(Car c:listaMasini)
            Log.d("MyActivity", "Just created:" +c);

        //EXEMPLU, preia date de la prima masina din lista si le afiseaza in GUI
        carInfo("car1");


    }

    //metoda care primeste id-ul masinii si afiseaza info despre acea masina
    private void carInfo(String car) {
        for(Car c: listaMasini)
            if(c.getCarID().equals(car)) {
                TextView marca = (TextView) findViewById(R.id.txtMarca);
                TextView model = (TextView) findViewById(R.id.txtModel);
                TextView an = (TextView) findViewById(R.id.txtAn);
                TextView motorizare = (TextView) findViewById(R.id.txtMotorizare);
                marca.setText(c.getMarca());
                model.setText(c.getModel());
                String a = String.valueOf(c.getAn());
                an.setText(a);
                motorizare.setText(c.getMotorizare());
            }
    }

}