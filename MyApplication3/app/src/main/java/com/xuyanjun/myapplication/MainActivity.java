package com.xuyanjun.myapplication;

import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User user = null;
        getUserName(user);

        String s = getUserName(user).substring(10);

        IntDefTest iDTest = new IntDefTest();
        iDTest.setType(1);
        iDTest.setType(IntDefTest.NAVIGATION_MODE_LIST | IntDefTest.NAVIGATION_MODE_STANDARD);

        getSystemService("");

        setColor(0xFF000000);// R.color.colorAccent);
    }

    @Nullable
    public String getUserName(@NonNull User user) {
        return user.getName();
    }

    public void setColor(@ColorInt int color) {

    }
}
