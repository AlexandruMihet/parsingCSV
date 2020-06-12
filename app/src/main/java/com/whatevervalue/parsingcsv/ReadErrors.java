package com.whatevervalue.parsingcsv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReadErrors {
    InputStream is;
    public ReadErrors(InputStream is) {
        this.is=is;
    }
    public List<Errors> readErrorInfo(){

        List<Errors> lista = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        try {
            String csvLine;
            reader.readLine();//consuma header
            while ((csvLine = reader.readLine()) != null) {
            //csvLine=reader.readLine();
            String[] linie=csvLine.split(",");
                Errors temp = new Errors();

                temp.setCarID(linie[0]);
                temp.setError1(linie[1]);
                temp.setError2(linie[2]);
                temp.setError3(linie[3]);
                temp.setError4(linie[4]);
                temp.setError5(linie[5]);


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
