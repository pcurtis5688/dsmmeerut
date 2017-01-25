package com.fourtwelvedesign.dsmmeerut.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

import com.fourtwelvedesign.dsmmeerut.R;

/**
 * Created by Paul Curtis on 1/25/2017.
 */

public class PoliceStationDetailView extends View {
    public PoliceStationDetailView(Context context, AttributeSet attrs) {
        super(context, attrs);


    }

    public PoliceStationDetailView(Context context, AttributeSet attrs, String stationName) {
        super(context, attrs);
        setPoliceStationData(stationName);
    }

    public void setPoliceStationData(String policeStationName) {
        ImageView policeStationHexagon = (ImageView) this.findViewById(R.id.police_Station_hexagon);
        if (policeStationName.equalsIgnoreCase("railway road")) {
            String yes = "yes";
        }
    }
}
