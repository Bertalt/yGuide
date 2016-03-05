package com.sls.materiallab;

import android.content.Context;
import android.content.Intent;

import com.sls.materiallab.services.ServiceForLocation;

/**
 * Created by bertalt on 05.03.16.
 */
public class GpsWorker implements Runnable {

    Context mCtx;
    public GpsWorker(Context context){
        mCtx = context;
    }
    @Override
    public void run() {
        mCtx.startService(new Intent(mCtx, ServiceForLocation.class).putExtra("Accuracy", true));
    }
}
