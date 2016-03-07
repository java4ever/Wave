package com.xuyanjun.myapplication;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.BinderThread;
import android.support.annotation.CheckResult;
import android.support.annotation.ColorInt;
import android.support.annotation.FloatRange;
import android.support.annotation.IntRange;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.Size;
import android.support.annotation.WorkerThread;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Keep
    private int keep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // nullness
        User user = null;
        getUserName(user);

        String s = getUserName(user).substring(10);

        // typedef
        IntDefTest iDTest = new IntDefTest();
        iDTest.setType(1);
        iDTest.setType(IntDefTest.NAVIGATION_MODE_LIST | IntDefTest.NAVIGATION_MODE_STANDARD);

        getSystemService("");

        // color int
        setColor(0xFF000000);// R.color.colorAccent);

        // thread
        View v;
        getStringAsync("");
        AsyncTask task;

        // value constraints
        char[] string = new char[0];
        charAt(string);
        double[] location = new double[3];
        getPoi(location);

        // return results
        remove(1);

    }

    @Nullable
    public String getUserName(@NonNull User user) {
        return user.getName();
    }

    public void setColor(@ColorInt int color) {

    }

    @WorkerThread
    public void getStringAsync(String url) {
        // ...
    }

    public void setAlpha(@FloatRange(from = 0.0, to = 1.0) float alpha) {


    }

    public void setAlpha(@IntRange(from = 0, to = 255) int alpha) {

    }

    public void charAt(@Size(min = 1) char[] string) {

    }

    public void getPoi(@Size(2) double[] location) {

    }

    @CheckResult
    public boolean remove(int index) {
        return true;
    }

}