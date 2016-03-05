package com.sls.materiallab;

import android.app.Activity;
import android.os.Bundle;

import com.sls.materiallab.fragments.SettingsFragment;

/**
 * Created by Sls on 27.05.2015.
 */
public class SettingsActivity extends Activity {
    public static final String KEY_PREF_MODE = "pref_key_mod";
    public static final String KEY_PREF_SCAN_CLOSE= "pref_key_scan_closeOn";
    public static final String KEY_PREF_GPS_SYSTEM= "pref_key_gps_system";
    public static final String KEY_PREF_GPS_COUNT_SAT= "pref_key_gps_count_sat";
    public static final String KEY_PREF_WIFI_MIN_LEVEL= "pref_key_wifi_min_signal";
    public static final String KEY_PREF_WIFI_AUTO_MIN_LEVEL= "pref_key_wifi_auto_min_signal";
    public static final String KEY_PREF_MAP_AVA_RADIUS= "pref_key_map_ava_radius";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_layout);

        // Display the fragment as the main content.
        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new SettingsFragment())
                .commit();
    }
}