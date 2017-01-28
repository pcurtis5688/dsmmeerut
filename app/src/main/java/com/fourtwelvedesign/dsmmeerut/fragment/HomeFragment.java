package com.fourtwelvedesign.dsmmeerut.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewGroupCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.fourtwelvedesign.dsmmeerut.R;

/**
 * Created by Paul Curtis on 1/26/2017.
 */

    public class HomeFragment extends Fragment {
    private View homeFragmentView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        homeFragmentView = inflater.inflate(R.layout.content_main, container, false);
        return homeFragmentView;
    }

    public View getHomeFragmentView() {
        return homeFragmentView;
    }
}

