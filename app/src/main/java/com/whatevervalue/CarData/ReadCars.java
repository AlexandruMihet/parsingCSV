package com.whatevervalue.CarData;

import com.whatevervalue.CarData.Car;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReadCars {

    InputStream is;
    public ReadCars(InputStream is) {
        this.is=is;
    }
    public List<Car> readCarInfo(){

        List<Car> lista = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        try {
            String csvLine;
            reader.readLine();//consuma header
            while ((csvLine = reader.readLine()) != null) {
                String[] linie=csvLine.split(",");
                Car temp = new Car();
                //CAR_ID,MARK,MODEL,CAR_YEAR,ENGINE_POWER,AUTOMATIC,FUEL_TYPE
                temp.setCarID(linie[0]);//marca
                temp.setMarca(linie[1]);//model
                temp.setModel(linie[2]);
                temp.setAn(Integer.parseInt(linie[3]));
                temp.setMotorizare(linie[4]);
                temp.setAutomatic(linie[5]);
                temp.setFuel(linie[6]);
                temp.setKm(Integer.parseInt(linie[7]));

                lista.add(temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    return lista;
    }
}
