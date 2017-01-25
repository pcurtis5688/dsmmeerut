package com.fourtwelvedesign.dsmmeerut.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paul Curtis on 1/25/2017.
 */

public class PoliceStation {
    private int ps_station_id;
    private String ps_station_name;
    private String ps_station_subtitle;

    public PoliceStation() {
        //EMPTY CONSTRUCTOR
    }

    public PoliceStation(int ps_station_id, String ps_station_name, String ps_station_subtitle) {
        this.ps_station_id = ps_station_id;
        this.ps_station_name = ps_station_name;
        this.ps_station_subtitle = ps_station_subtitle;
    }

    public static List<PollingStation> getPSPollingStations(int policeStationId) {
        List<PollingStation> psPollingStations = new ArrayList<>();


        return psPollingStations;
    }

    public int getPs_station_id() {
        return ps_station_id;
    }

    public void setPs_station_id(int ps_station_id) {
        this.ps_station_id = ps_station_id;
    }

    public String getPs_station_name() {
        return ps_station_name;
    }

    public void setPs_station_name(String ps_station_name) {
        this.ps_station_name = ps_station_name;
    }

    public String getPs_station_subtitle() {
        return ps_station_subtitle;
    }

    public void setPs_station_subtitle(String ps_station_subtitle) {
        this.ps_station_subtitle = ps_station_subtitle;
    }
}
