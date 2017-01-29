package com.fourtwelvedesign.dsmmeerut.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TableLayout;

import com.fourtwelvedesign.dsmmeerut.R;
import com.fourtwelvedesign.dsmmeerut.model.PollingStation;
import com.fourtwelvedesign.dsmmeerut.util.PoliceStationSpinnerListener;

import java.util.List;

/**
 * Created by Paul Curtis on 1/26/2017.
 */

public class PsDetailsFragment extends Fragment {
    private View psDetailsView;
    private ImageView psDetailsHexagonIv;
    private Spinner psDetailsSpinner;
    private ArrayAdapter<String> spinnerAdapter;
    private PoliceStationSpinnerListener spinnerListener;
    private View psDetailsTableLayoutView;

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
        this.psDetailsHexagonIv = (ImageView) view.findViewById(R.id.police_stations_hexagon_iv);
        this.psDetailsTableLayoutView = view.findViewById(R.id.ps_details_table_layout_view);
        setPoliceStationDropdownItems(view, savedInstanceState);
    }

    public void setPoliceStationDropdownItems(View view, @Nullable Bundle savedInstanceState) {
        ////// GET SPINNER AND POPULATE
        this.psDetailsSpinner = (Spinner) view.findViewById(R.id.police_station_name_spinner);
        this.spinnerAdapter = new ArrayAdapter<>(getActivity().getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, getResources().getStringArray(R.array.police_station_names));
        this.psDetailsSpinner.setAdapter(spinnerAdapter);
        ////// ADD THE LISTENER FOR THE SPINNER
        this.spinnerListener = new PoliceStationSpinnerListener(this.psDetailsSpinner, this.psDetailsHexagonIv, this.psDetailsTableLayoutView, view.getContext());
        this.psDetailsSpinner.setOnItemSelectedListener(spinnerListener);
    }
}