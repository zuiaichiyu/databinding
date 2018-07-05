package com.alex.mvvmdemo;

import android.databinding.ObservableField;

public class ObservableUser {

    public final ObservableField<String> firstName = new ObservableField<>();
    public final ObservableField<String> lastName = new ObservableField<>();

}
