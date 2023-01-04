package com.app.mylibrarytest;

import android.content.Context;
import android.widget.Toast;

public class ShowToast {
    public void showToast(Context context, String msg) {
        Toast.makeText(context, "This is toast " + msg, Toast.LENGTH_SHORT).show();
        Toast.makeText(context, "This is toast is " + msg, Toast.LENGTH_LONG).show();
    }
}
