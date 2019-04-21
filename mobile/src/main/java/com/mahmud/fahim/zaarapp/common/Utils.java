package com.mahmud.fahim.zaarapp.common;

import android.app.Activity;
import android.view.inputmethod.InputMethodManager;

/**
 * Created by fahim on 2017-08-28.
 */

public class Utils {

    public static void hideKeyboard(Activity activity){

        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);

    }


}
