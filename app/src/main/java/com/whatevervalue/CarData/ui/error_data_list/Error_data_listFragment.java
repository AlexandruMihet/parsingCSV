package com.whatevervalue.CarData.ui.error_data_list;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.whatevervalue.CarData.Errors;
import com.whatevervalue.parsingcsv.R;
import com.whatevervalue.CarData.ReadErrors;
import com.whatevervalue.CarData.ui.home.HomeFragment;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


public class Error_data_listFragment extends Fragment {

    private Error_data_listViewModel error_data_listViewModel;
    private List<Errors> listaErrors = new ArrayList<>();
    private ScrollView scrollView;
    private TextView id;
    private TextView error1;
    private TextView error2;
    private TextView error3;
    private TextView error4;
    private TextView error5;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        error_data_listViewModel =
                ViewModelProviders.of(this).get(Error_data_listViewModel.class);
        View root = inflater.inflate(R.layout.fragment_error_data_list, container, false);
        /*final TextView textView = root.findViewById(R.id.textErrorDataList);
        error_data_listViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/

        InputStream is = getResources().openRawResource(R.raw.error_data);
        ReadErrors re = new ReadErrors(is);
        listaErrors = re.readErrorInfo();

        error1 = root.findViewById(R.id.txtError1);
        error2 = root.findViewById(R.id.txtError2);
        error3 = root.findViewById(R.id.txtError3);
        error4 = root.findViewById(R.id.txtError4);
        error5 = root.findViewById(R.id.txtError5);
        scrollView = root.findViewById(R.id.scrollView);

        //Log message debug
        for (Errors e : listaErrors)
            Log.d("MyActivity", "Just created:" + e);

        //EXEMPLU, preia date de la prima masina din lista si le afiseaza in GUI
        ErrorsData(HomeFragment.getUserInput(), root);

        error1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                new AlertDialog.Builder(getActivity())
                        .setIcon(android.R.drawable.ic_delete)
                        .setTitle("Are you sure ?")
                        .setMessage("Do you want to delete this error?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                   v.setVisibility(View.GONE);
                            }
                        })
                        .setNegativeButton("No", null)
                        .show();


            }
        });

        error2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                new AlertDialog.Builder(getActivity())
                        .setIcon(android.R.drawable.ic_delete)
                        .setTitle("Are you sure ?")
                        .setMessage("Do you want to delete this error?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                v.setVisibility(View.GONE);
                            }
                        })
                        .setNegativeButton("No", null)
                        .show();


            }
        });

        error3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                new AlertDialog.Builder(getActivity())
                        .setIcon(android.R.drawable.ic_delete)
                        .setTitle("Are you sure ?")
                        .setMessage("Do you want to delete this error?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                v.setVisibility(View.GONE);
                            }
                        })
                        .setNegativeButton("No", null)
                        .show();


            }
        });

        error4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                new AlertDialog.Builder(getActivity())
                        .setIcon(android.R.drawable.ic_delete)
                        .setTitle("Are you sure ?")
                        .setMessage("Do you want to delete this error?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                v.setVisibility(View.GONE);
                            }
                        })
                        .setNegativeButton("No", null)
                        .show();


            }
        });

        error5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                new AlertDialog.Builder(getActivity())
                        .setIcon(android.R.drawable.ic_delete)
                        .setTitle("Are you sure ?")
                        .setMessage("Do you want to delete this error?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                v.setVisibility(View.GONE);
                            }
                        })
                        .setNegativeButton("No", null)
                        .show();


            }
        });
        //metoda care primeste id-ul masinii si afiseaza info despre acea masina



        return root;


    }

    public void ErrorsData(String car, View root) {
        for (Errors e : listaErrors)
            if (e.getCarID().equals(car)) {
                TextView id = (TextView) root.findViewById(R.id.txtID);
                TextView error1 = (TextView) root.findViewById(R.id.txtError1);
                TextView error2 = (TextView) root.findViewById(R.id.txtError2);
                TextView error3= (TextView) root.findViewById(R.id.txtError3);
                TextView error4 = (TextView) root.findViewById(R.id.txtError4);
                TextView error5 = (TextView) root.findViewById(R.id.txtError5);

                id.setText(e.getCarID());
                error1.setText(e.getError1());
                error2.setText(e.getError2());
                error3.setText(e.getError3());
                error4.setText(e.getError4());
                error5.setText(e.getError5());

            }
    }

}
