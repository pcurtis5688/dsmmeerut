package com.fourtwelvedesign.dsmmeerut.activity;

import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.fourtwelvedesign.dsmmeerut.R;
import com.fourtwelvedesign.dsmmeerut.view.PoliceStationDetailView;

/**
 * Created by Paul Curtis on 1/25/2017.
 */

public class PoliceStationDetailsActivity extends AppCompatActivity {
    private PoliceStationDetailView policeStationDetailViewPane;
    private ImageView policeStationHexagonImgView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        policeStationDetailViewPane = new PoliceStationDetailView(getApplicationContext(), null);
        policeStationDetailViewPane.initializePoliceStationSpinner();
        policeStationHexagonImgView = (ImageView) policeStationDetailViewPane.findViewById(policeStationDetailViewPane.getId());
        policeStationHexagonImgView.setImageResource(R.drawable.police_station_hexagon);
        setContentView(policeStationDetailViewPane);

    }


}
