package com.whatevervalue.parsingcsv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReadLiveData {
    InputStream is;
    public ReadLiveData(InputStream is){this.is=is; }
    public List<LiveData> readCarLiveData() {


        List<LiveData> lista = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        try {
            String csvLine;
            reader.readLine();
            while ((csvLine = reader.readLine()) != null) {
                String[] linie = csvLine.split(",");
                LiveData temp = new LiveData();

                temp.setBarometric_pressure(Integer.parseInt(linie[1]));
                temp.setEngine_coolant_temp(Integer.parseInt(linie[2]));
                temp.setFuel_level(linie[3]);
                temp.setEngine_load(linie[4]);
                temp.setAmbient_air_temp(linie[5]);
                temp.setEngine_rpm(Integer.parseInt(linie[6]));
                temp.setIntake_manifold_pressure(Integer.parseInt(linie[7]));
                temp.setMaf(linie[8]);
                temp.setAir_intake_temp(Integer.parseInt(linie[10]));
                temp.setFuel_pressure(linie[11]);
                temp.setSpeed(Integer.parseInt(linie[12]));
                temp.setEngine_runtime(linie[15]);
                temp.setThrottle_pos(linie[16]);
                temp.setDtc_number(linie[17]);
                temp.setTrouble_codes(linie[18]);
                temp.setTiming_advance(linie[19]);
                temp.setEquiv_ratio(linie[20]);
                temp.setMinute(Integer.parseInt(linie[21]));
                temp.setHour(Integer.parseInt(linie[22]));
                temp.setDay(Integer.parseInt(linie[23]));
                temp.setMonth(Integer.parseInt(linie[24]));
                temp.setYear(Integer.parseInt(linie[25]));

                lista.add(temp);


            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }  finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return lista;
    }
}

