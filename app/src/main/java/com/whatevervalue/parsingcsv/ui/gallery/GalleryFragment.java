package com.whatevervalue.parsingcsv.ui.gallery;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.whatevervalue.parsingcsv.Car;
import com.whatevervalue.parsingcsv.R;
import com.whatevervalue.parsingcsv.ReadCars;
import com.whatevervalue.parsingcsv.ui.home.HomeFragment;

import org.w3c.dom.Text;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class GalleryFragment extends Fragment{


    private GalleryViewModel galleryViewModel;
    private List<Car> listaMasini = new ArrayList<>();
    private TextView id;
    private TextView marca;
    private TextView model;
    private TextView an;
    private TextView motorizare;
    private TextView automatic;
    private TextView fuel;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        //final TextView textView = root.findViewById(R.id.txtMarca);
       /* TextView marca = (TextView) root.findViewById(R.id.txtMarca);
        TextView model = (TextView) root.findViewById(R.id.txtModel);
        TextView an = (TextView) root.findViewById(R.id.txtAn);
        TextView motorizare = (TextView) root.findViewById(R.id.txtMotorizare);*/
        /*galleryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/


        InputStream is = getResources().openRawResource(R.raw.cars_info);
        ReadCars rc = new ReadCars(is);
        listaMasini = rc.readCarInfo();

        //Log message debug
        for (Car c : listaMasini)
            Log.d("MyActivity", "Just created:" + c);

        //EXEMPLU, preia date de la prima masina din lista si le afiseaza in GUI
        carInfo(HomeFragment.userInput, root);


        //metoda care primeste id-ul masinii si afiseaza info despre acea masina



        return root;


    }

    public void carInfo(String car, View root) {
        for (Car c : listaMasini)
            if (c.getCarID().equals(car)) {
                TextView id = (TextView) root.findViewById(R.id.txtID);
                TextView marca = (TextView) root.findViewById(R.id.txtMarca);
                TextView model = (TextView) root.findViewById(R.id.txtModel);
                TextView an = (TextView) root.findViewById(R.id.txtAn);
                TextView motorizare = (TextView) root.findViewById(R.id.txtPutere);
                TextView automatic = (TextView) root.findViewById(R.id.txtSchimbator);
                TextView fuel = (TextView) root.findViewById(R.id.txtMotorizare);
                id.setText(c.getCarID());
                marca.setText(c.getMarca());
                model.setText(c.getModel());
                String a = String.valueOf(c.getAn());
                an.setText(a);
                motorizare.setText(c.getMotorizare());
                automatic.setText(c.getAutomatic());
                fuel.setText(c.getFuel());

            }
    }


    }

