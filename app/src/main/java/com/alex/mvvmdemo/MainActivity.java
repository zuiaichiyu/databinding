package com.alex.mvvmdemo;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alex.mvvmdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    User user;
    ObservableUser observableUser;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        user = new User("Alex", "Miao");
        observableUser = new ObservableUser();

        binding.setUser(user);
        binding.setUser2(observableUser);
        observableUser.firstName.set("ddddddd");
        observableUser.lastName.set("cccccc");


        View update = findViewById(R.id.btn_update);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i % 2 == 0) {
                    user.setFirstName("haha");
                    user.setLastName("heihei");
                } else {
                    user.setFirstName("bbbbbb");
                    user.setLastName("aaaaaaa");
                }

                i++;
            }
        });

        View update2 = findViewById(R.id.btn_update2);
        update2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                observableUser.firstName.set("111111");
                observableUser.lastName.set("22222222");
            }
        });
    }
}
