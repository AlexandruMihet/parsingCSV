package com.whatevervalue.parsingcsv;

import android.util.Log;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReadInfo {


    CarSample car1 = new CarSample() ;
    static void  read(CarSample object) {
        try {
            FileReader fr = new FileReader("app/res/raw/data.csv");
            BufferedReader reader = new BufferedReader(fr);
            String line;

            line = reader.readLine();
            Log.d("MyActivity", "Just created:" +line);


        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }












   /* public List read() {
        List resultList = new ArrayList();

        try {
            String csvLine;
            while ((csvLine = reader.readLine()) != null) {
                String[] row = csvLine.split(",");
                resultList.add(row);
            }
        } catch (IOException ex) {
            throw new RuntimeException("Error in reading CSV file: " + ex);
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                throw new RuntimeException("Error while closing input stream: " + e);
            }
        }
        return resultList;


    }*/


}
