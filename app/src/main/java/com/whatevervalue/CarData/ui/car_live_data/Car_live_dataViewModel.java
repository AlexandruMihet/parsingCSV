package com.whatevervalue.CarData.ui.car_live_data;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Car_live_dataViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public Car_live_dataViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Car_live_data fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}