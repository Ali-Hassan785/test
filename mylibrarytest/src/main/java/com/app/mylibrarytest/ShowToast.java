package com.app.mylibrarytest;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class ShowToast {
    private AdView mAdView;

    public ShowToast(Context context) {
        MobileAds.initialize(context);
    }

    public void showToast(Context context, String msg) {
        Toast.makeText(context, "This is toast sdf " + msg, Toast.LENGTH_SHORT).show();
        Toast.makeText(context, "This is toast is " + msg, Toast.LENGTH_LONG).show();
    }

    void loadBanner(LinearLayout linearLayou, String s) {
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }


}
