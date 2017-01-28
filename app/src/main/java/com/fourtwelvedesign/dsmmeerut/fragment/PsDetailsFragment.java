package com.fourtwelvedesign.dsmmeerut.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fourtwelvedesign.dsmmeerut.R;

/**
 * Created by Paul Curtis on 1/26/2017.
 */

public class PsDetailsFragment extends Fragment {
    private View psDetailsView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        psDetailsView = inflater.inflate(R.layout.content_police_stations, container, false);
        return psDetailsView;
    }
}