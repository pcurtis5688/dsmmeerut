package com.fourtwelvedesign.dsmmeerut.model;

/**
 * Created by Paul Curtis on 1/25/2017.
 */

public class PollingStation {
    private int POLLING_STATION_ID;
    private String POLLING_STATION_NAME;
    private String PARENT_POLICE_STATION;
    private double LATITUDE;
    private double LONGITUDE;
    private int NO_VOTERS;

    public int getPOLLING_STATION_ID() {
        return POLLING_STATION_ID;
    }

    public void setPOLLING_STATION_ID(int POLLING_STATION_ID) {
        this.POLLING_STATION_ID = POLLING_STATION_ID;
    }

    public String getPOLLING_STATION_NAME() {
        return POLLING_STATION_NAME;
    }

    public void setPOLLING_STATION_NAME(String POLLING_STATION_NAME) {
        this.POLLING_STATION_NAME = POLLING_STATION_NAME;
    }

    public String getPARENT_POLICE_STATION() {
        return PARENT_POLICE_STATION;
    }

    public void setPARENT_POLICE_STATION(String PARENT_POLICE_STATION) {
        this.PARENT_POLICE_STATION = PARENT_POLICE_STATION;
    }

    public double getLATITUDE() {
        return LATITUDE;
    }

    public void setLATITUDE(double LATITUDE) {
        this.LATITUDE = LATITUDE;
    }

    public double getLONGITUDE() {
        return LONGITUDE;
    }

    public void setLONGITUDE(double LONGITUDE) {
        this.LONGITUDE = LONGITUDE;
    }

    public int getNO_VOTERS() {
        return NO_VOTERS;
    }

    public void setNO_VOTERS(int NO_VOTERS) {
        this.NO_VOTERS = NO_VOTERS;
    }
}
