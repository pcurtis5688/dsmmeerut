package com.fourtwelvedesign.dsmmeerut.util;

import android.view.View;
import android.widget.AdapterView;

/**
 * Created by Paul Curtis on 1/26/2017.
 */

public class PoliceStationSpinnerListener implements AdapterView.OnItemSelectedListener {
    private String currentStationViewName;

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        currentStationViewName = parent.getSelectedItem().toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public String getCurrentStationViewName() {
        return currentStationViewName;
    }

    public void setCurrentStationViewName(String currentStationViewName) {
        this.currentStationViewName = currentStationViewName;
    }
}
