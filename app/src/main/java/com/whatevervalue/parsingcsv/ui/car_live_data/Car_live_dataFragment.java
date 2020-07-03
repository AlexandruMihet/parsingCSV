package com.whatevervalue.parsingcsv.ui.car_live_data;



import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.whatevervalue.parsingcsv.Car;
import com.whatevervalue.parsingcsv.LiveData;
import com.whatevervalue.parsingcsv.Meniu;
import com.whatevervalue.parsingcsv.R;
import com.whatevervalue.parsingcsv.ReadCars;
import com.whatevervalue.parsingcsv.ReadLiveData;
import com.whatevervalue.parsingcsv.ui.car_live_data.Car_live_dataViewModel;
import com.whatevervalue.parsingcsv.ui.home.HomeFragment;

import org.w3c.dom.Text;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Car_live_dataFragment extends Fragment {

    private Car_live_dataViewModel car_live_dataViewModel;
    private List<LiveData> listaCarLiveData = new ArrayList<>();



    private TextView barometric_pressure;
    private TextView engine_coolant;
    private TextView fuel_level;
    private TextView engine_load;
    private TextView ambient_air_temp;
    private TextView engine_rpm;
    private TextView intake_manifold_pressure;
    private TextView maf;
    private TextView air_intake_temp;
    private TextView fuel_pressure;
    private TextView speed;
    private TextView engine_runtime;
    private TextView throttle_pos;
    private TextView dtc_number;
    private TextView trouble_codes;
    private TextView timing_advance;
    private TextView equiv_ratio;
    private TextView minute;
    private TextView hour;
    private TextView day;
    private TextView month;
    private TextView year;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        car_live_dataViewModel =
                ViewModelProviders.of(this).get(Car_live_dataViewModel.class);
        final View root = inflater.inflate(R.layout.fragment_car_live_data, container, false);
        //TextView id = (TextView) root.findViewById(R.id.txtID);
        /*final TextView textView = root.findViewById(R.id.textCarLiveData);
        car_live_dataViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/

            switch(HomeFragment.getUserInput()) {
                case "carID1":
                    InputStream is = getResources().openRawResource(R.raw.car1_data);
                    ReadLiveData rld = new ReadLiveData(is);
                    listaCarLiveData = rld.readCarLiveData();
                    break;

                case "carID2":
                    InputStream is1 = getResources().openRawResource(R.raw.car6_data);
                    ReadLiveData rld1 = new ReadLiveData(is1);
                    listaCarLiveData = rld1.readCarLiveData();
                    break;

                default:
                    break;
            }

            /*InputStream is = getResources().openRawResource(R.raw.car1_data);
            ReadLiveData rld = new ReadLiveData(is);
            listaCarLiveData = rld.readCarLiveData();*/

            //Thread.sleep(1000);




        for (LiveData lv : listaCarLiveData)
            Log.d("MyActivity" , "Just created:" + lv);

        //EXEMPLU, preia date de la prima masina din lista si le afiseaza in GUI
        try {
            liveDataInfo(HomeFragment.getUserInput(), root);
            ((Meniu)getActivity()).displayOneSecond();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }




        return root;
    }


    public void liveDataInfo(String car, View root) throws InterruptedException {
        for (LiveData l : listaCarLiveData){

            TextView id = (TextView) root.findViewById(R.id.txtID);
            TextView barometric_pressure = (TextView) root.findViewById(R.id.txtBarometric);
            TextView engine_coolant = (TextView) root.findViewById(R.id.txtEngineCoolant);
            TextView fuel_level = (TextView) root.findViewById(R.id.txtFuelLevel);
            TextView engine_load = (TextView) root.findViewById(R.id.txtEngineLoad);
            TextView ambient_air_temp = (TextView) root.findViewById(R.id.txtAmbientAirTemp);
            TextView engine_rpm = (TextView) root.findViewById(R.id.txtEngineRpm);
            TextView intake_manifold_pressure = (TextView) root.findViewById(R.id.txtIntakeManifold);
            TextView maf = (TextView) root.findViewById(R.id.txtMaf);
            TextView air_intake_temp = (TextView) root.findViewById(R.id.txtAirIntakeTemp);
            TextView fuel_pressure = (TextView) root.findViewById(R.id.txtFuelPressure);
            TextView speed = (TextView) root.findViewById(R.id.txtSpeed);
            TextView engine_runtime = (TextView) root.findViewById(R.id.txtEngineRuntime);
            TextView throttle_pos = (TextView) root.findViewById(R.id.txtThrottle);
            TextView dtc_number = (TextView) root.findViewById(R.id.txtDtcNumber);
            TextView trouble_codes = (TextView) root.findViewById(R.id.txtTroubleCodes);
            TextView timing_advance = (TextView) root.findViewById(R.id.txtTimingAdvance);
            TextView equiv_ratio = (TextView) root.findViewById(R.id.txtEquivRatio);
            TextView minute = (TextView) root.findViewById(R.id.txtMinute);
            TextView hour = (TextView) root.findViewById(R.id.txtHour);
            TextView day = (TextView) root.findViewById(R.id.txtDay);
            TextView month = (TextView) root.findViewById(R.id.txtMonth);
            TextView year = (TextView) root.findViewById(R.id.txtYear);



            id.setText(HomeFragment.getUserInput());

            String b = String.valueOf(l.getBarometric_pressure());
            barometric_pressure.setText(b);
            String e = String.valueOf(l.getEngine_coolant_temp());
            engine_coolant.setText(e);
            fuel_level.setText(l.getFuel_level());
            engine_load.setText(l.getEngine_load());
            ambient_air_temp.setText(l.getAmbient_air_temp());
            String er = String.valueOf(l.getEngine_rpm());
            engine_rpm.setText(er);
            String imp = String.valueOf(l.getIntake_manifold_pressure());
            intake_manifold_pressure.setText(imp);
            maf.setText(l.getMaf());
            String ait = String.valueOf(l.getAir_intake_temp());
            air_intake_temp.setText(ait);
            fuel_pressure.setText(l.getFuel_pressure());
            String s = String.valueOf(l.getSpeed());
            speed.setText(s);
            engine_runtime.setText(l.getEngine_runtime());
            throttle_pos.setText(l.getThrottle_pos());
            dtc_number.setText(l.getDtc_number());
            trouble_codes.setText(l.getTrouble_codes());
            timing_advance.setText(l.getTiming_advance());
            equiv_ratio.setText(l.getEquiv_ratio());
            String m = String.valueOf(l.getMinute());
            minute.setText(m);
            String h = String.valueOf(l.getHour());
            hour.setText(h);
            String d = String.valueOf(l.getDay());
            day.setText(d);
            String mo = String.valueOf(l.getMonth());
            month.setText(mo);
            String y = String.valueOf(l.getYear());
            year.setText(y);



            /*id.setText(c.getCarID());
            marca.setText(c.getMarca());
            model.setText(c.getModel());
            String m = String.valueOf(l.getMinute());
            minute.setText(m);
            motorizare.setText(c.getMotorizare());
            automatic.setText(c.getAutomatic());
            fuel.setText(c.getFuel());*/
            }
    }
}
