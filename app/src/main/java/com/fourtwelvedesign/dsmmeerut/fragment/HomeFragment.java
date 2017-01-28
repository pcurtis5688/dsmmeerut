package com.fourtwelvedesign.dsmmeerut.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}

