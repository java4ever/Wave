package com.xuyanjun.myapplication;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by xuyanjun on 2016/3/4.
 */
public class IntDefTest {

    @IntDef(flag = true, value = {NAVIGATION_MODE_LIST, NAVIGATION_MODE_TABS, NAVIGATION_MODE_STANDARD})
    @Retention(RetentionPolicy.SOURCE)
    public @interface NavigationMode {}

    public static final int NAVIGATION_MODE_STANDARD = 1;
    public static final int NAVIGATION_MODE_LIST = 2;
    public static final int NAVIGATION_MODE_TABS = 4;

    private int mType;

    public void setType(@NavigationMode int type) {
        this.mType = type;
    }

}
