package com.fourtwelvedesign.dsmmeerut.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatSpinner;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import com.fourtwelvedesign.dsmmeerut.R;

/**
 * Created by Paul Curtis on 1/25/2017.
 */

public class PoliceStationDetailView extends View {
    private Context stationDetailsContext;
    private String currentStationName;
    private Spinner stationSpinner;
    private AdapterView.OnItemSelectedListener stationSpinnerListener;

    public PoliceStationDetailView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.stationDetailsContext = context;
        this.currentStationName = "none selected";

    }

    public void setPsDetailsPage(String stationName) {
        if (stationName.equalsIgnoreCase("select station")) {
            // EITHER HAS JUST LOADED OR RETURNED TO FIRST,
        } else if (stationName.equalsIgnoreCase("bahsuma")) {
        } else if (stationName.equalsIgnoreCase("bhavanpur")) {
        } else if (stationName.equalsIgnoreCase("brahmpuri")) {
        } else if (stationName.equalsIgnoreCase("civil line")) {
        } else if (stationName.equalsIgnoreCase("daurala")) {
        } else if (stationName.equalsIgnoreCase("delhi gate")) {
        } else if (stationName.equalsIgnoreCase("ganganagar")) {
        } else if (stationName.equalsIgnoreCase("hastinapur")) {
        } else if (stationName.equalsIgnoreCase("incholi")) {
        } else if (stationName.equalsIgnoreCase("jaani")) {
        } else if (stationName.equalsIgnoreCase("kankerkhera")) {
        } else if (stationName.equalsIgnoreCase("kharkhoda")) {
        } else if (stationName.equalsIgnoreCase("kithore")) {
        } else if (stationName.equalsIgnoreCase("kotwali")) {
        } else if (stationName.equalsIgnoreCase("lalkurti")) {
        } else if (stationName.equalsIgnoreCase("lisadi gate")) {
        } else if (stationName.equalsIgnoreCase("mawana")) {
        } else if (stationName.equalsIgnoreCase("medical")) {
        } else if (stationName.equalsIgnoreCase("mundali")) {
        } else if (stationName.equalsIgnoreCase("nauchandi")) {
        } else if (stationName.equalsIgnoreCase("pallavpuram")) {
        } else if (stationName.equalsIgnoreCase("parikshitgarh")) {
        } else if (stationName.equalsIgnoreCase("partapur")) {
        } else if (stationName.equalsIgnoreCase("phalawda")) {
        } else if (stationName.equalsIgnoreCase("railway road")) {
            currentStationName = stationName;
           ImageView imgView = (ImageView) this.findViewById(R.id.police_station_hexagon_imgView);
            imgView.setImageResource(R.drawable.police_station_hexagon);
        } else if (stationName.equalsIgnoreCase("rohta")) {
        } else if (stationName.equalsIgnoreCase("sadar")) {
        } else if (stationName.equalsIgnoreCase("sardhana")) {
        } else if (stationName.equalsIgnoreCase("sarurpur")) {
        } else if (stationName.equalsIgnoreCase("T.P. nagar")) {
        }
    }

    public void initializePoliceStationSpinner() {
        stationSpinner = (Spinner) findViewById(R.id.police_station_name_spinner);
        stationSpinnerListener = new PoliceStationSpinnerListener(this);
        stationSpinner.setOnItemSelectedListener(stationSpinnerListener);
        // ADD THE POLICE STATION NAMES VIA ARRAY AND SET POLICE STATION LISTENER
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getContext(),
                R.array.police_station_names, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        stationSpinner.setAdapter(adapter);
        stationSpinner.setOnItemSelectedListener(stationSpinnerListener);
    }
}

class PoliceStationSpinnerListener implements AdapterView.OnItemSelectedListener {
    private String currentStationViewName;
    private PoliceStationDetailView psDetailView;

    public PoliceStationSpinnerListener(PoliceStationDetailView detailsViewPane) {
        this.psDetailView = null;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        currentStationViewName = parent.getSelectedItem().toString();
        psDetailView.setPsDetailsPage(currentStationViewName);
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

    public PoliceStationDetailView getDetailsViewPane() {
        return this.psDetailView;
    }

    public void setDetailsViewPane(PoliceStationDetailView detailsViewPane) {
        this.psDetailView = detailsViewPane;
    }
}
