package com.whatevervalue.parsingcsv.ui.car_live_data;



import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.whatevervalue.parsingcsv.R;
import com.whatevervalue.parsingcsv.ui.car_live_data.Car_live_dataViewModel;

public class Car_live_dataFragment extends Fragment {

    private Car_live_dataViewModel car_live_dataViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        car_live_dataViewModel =
                ViewModelProviders.of(this).get(Car_live_dataViewModel.class);
        View root = inflater.inflate(R.layout.fragment_car_live_data, container, false);
        /*final TextView textView = root.findViewById(R.id.textCarLiveData);
        car_live_dataViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        return root;
    }
}
