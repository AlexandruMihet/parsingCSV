package com.whatevervalue.parsingcsv.ui.error_data_list;

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
import com.whatevervalue.parsingcsv.ui.home.HomeFragment;


public class Error_data_listFragment extends Fragment {

    private Error_data_listViewModel error_data_listViewModel;

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

        TextView id = (TextView) root.findViewById(R.id.txtID);
        id.setText(HomeFragment.userInput);
        return root;
    }
}
