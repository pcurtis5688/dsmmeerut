package com.fourtwelvedesign.dsmmeerut.activity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewGroupCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.fourtwelvedesign.dsmmeerut.R;
import com.fourtwelvedesign.dsmmeerut.fragment.HomeFragment;
import com.fourtwelvedesign.dsmmeerut.fragment.PsDetailsFragment;

/**
 * Created by Paul Curtis on 1/25/2017.
 */

public class PoliceStationDetailsActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;
    private Bundle psDetailsActivityBundleInstance;
    private ViewGroup activityLinearLayout;
    private ViewGroup contentFrame;
    private ViewGroup frameToReplace;
    private FragmentManager fragmentManager;
    private HomeFragment homeFragment;
    private ViewGroup homeFragmentView;
    private PsDetailsFragment psDetailsFragment;
    private ViewGroup psDetailsFragmentView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ////// INFLATE THE VIEW TO BE ADJUSTED
        this.fragmentManager = getSupportFragmentManager();
        this.homeFragment = new HomeFragment();
        fragmentManager.beginTransaction().attach(homeFragment).commit();
        this.homeFragment.onCreateView(getLayoutInflater(), contentFrame, savedInstanceState);
        this.psDetailsFragment = new PsDetailsFragment();
        fragmentManager.beginTransaction().attach(psDetailsFragment).commit();
        this.psDetailsFragment.onCreateView(getLayoutInflater(), contentFrame, savedInstanceState);
        psDetailsFragmentView = (ViewGroup) psDetailsFragment.onCreateView(getLayoutInflater(), contentFrame, savedInstanceState);
        this.activityLinearLayout = (ViewGroup) getLayoutInflater().inflate(R.layout.activity_police_stations, (ViewGroup) findViewById(R.id.activity_linear_layout), true);
        this.activityLinearLayout.addView(homeFragment.onCreateView(getLayoutInflater(), (ViewGroup) findViewById(R.id.activity_linear_layout), savedInstanceState));
        setContentView(R.layout.activity_police_stations);
        this.contentFrame = (ViewGroup) findViewById(R.id.layout_below_toolbar);
        this.psDetailsActivityBundleInstance = savedInstanceState;
        fragmentManager.beginTransaction().add(homeFragment, "homeFragment").commit();
        this.contentFrame = (ViewGroup) findViewById(R.id.app_bar_ps_linear);
        this.frameToReplace = (ViewGroup) contentFrame.findViewById(R.id.layout_below_toolbar);

        ////// ADD THE TOOLBAR TO THE ACTIVITY LAYOUT
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.navigation_drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        toggle.syncState();

        ////// ADD THE NAVIGATION DRAWER
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        this.drawer = (DrawerLayout) findViewById(R.id.navigation_drawer_layout);
        this.drawer.setBackgroundColor(getResources().getColor(R.color.layout_gray));
        fragmentManager.beginTransaction().replace(frameToReplace.getId(), homeFragment).commit();

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.navigation_drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_police_stations_drawer, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        // GET VIEW GROUP TO REPLACE
        if (id == R.id.nav_home_item) {
            fragmentManager.beginTransaction().replace(frameToReplace.getId(), homeFragment).commit();
        } else if (id == R.id.nav_police_stations) {
            fragmentManager.beginTransaction().replace(frameToReplace.getId(), psDetailsFragment).commit();

        } else if (id == R.id.nav_plans) {
            // Handle the plans action0
        } else if (id == R.id.nav_force_multi) {
            // Handle the force multi acti
        } else if (id == R.id.nav_capf_arrangement) {
            // Handle the capf arrangement action
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();

    }
}