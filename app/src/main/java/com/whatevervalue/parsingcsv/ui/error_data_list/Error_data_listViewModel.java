package com.whatevervalue.parsingcsv.ui.error_data_list;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Error_data_listViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public Error_data_listViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Error_live_data fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}