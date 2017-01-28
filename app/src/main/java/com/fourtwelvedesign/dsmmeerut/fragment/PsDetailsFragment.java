package com.fourtwelvedesign.dsmmeerut.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.fourtwelvedesign.dsmmeerut.R;
import com.fourtwelvedesign.dsmmeerut.util.PoliceStationSpinnerListener;

/**
 * Created by Paul Curtis on 1/26/2017.
 */

public class PsDetailsFragment extends Fragment {
    private View psDetailsView;
    private Spinner psDetailsSpinner;
    private ArrayAdapter<String> spinnerAdapter;
    private PoliceStationSpinnerListener spinnerListener;

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        psDetailsView = inflater.inflate(R.layout.content_police_stations, container, false);
        return psDetailsView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setPoliceStationDropdownItems(view, savedInstanceState);
    }

    public void setPoliceStationDropdownItems(View view, @Nullable Bundle savedInstanceState) {
        ////// GET SPINNER AND POPULATE
        this.psDetailsSpinner = (Spinner) view.findViewById(R.id.police_station_name_spinner);
        this.spinnerAdapter = new ArrayAdapter<>(getActivity().getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, getResources().getStringArray(R.array.police_station_names));
        this.psDetailsSpinner.setAdapter(spinnerAdapter);
        ////// ADD THE LISTENER FOR THE SPINNER
        this.spinnerListener = new PoliceStationSpinnerListener();
        this.psDetailsSpinner.setBackgroundColor(getResources().getColor(R.color.black));
        this.psDetailsSpinner.setOnItemSelectedListener(spinnerListener);
    }
}