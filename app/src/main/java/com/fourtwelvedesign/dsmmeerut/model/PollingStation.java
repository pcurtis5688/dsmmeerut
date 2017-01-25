package com.fourtwelvedesign.dsmmeerut.model;

/**
 * Created by Paul Curtis on 1/25/2017.
 */

public class PollingStation {
    private int pollingStationId;
    private String pollingStationName;
    private String parentPoliceStationId;
    private double pollingStationLatitude;
    private double pollingStationLongitude;
    private int pollingStationNoVoters;

    public int getPollingStationId() {
        return pollingStationId;
    }

    public void setPollingStationId(int pollingStationId) {
        this.pollingStationId = pollingStationId;
    }

    public String getPollingStationName() {
        return pollingStationName;
    }

    public void setPollingStationName(String pollingStationName) {
        this.pollingStationName = pollingStationName;
    }

    public String getParentPoliceStationId() {
        return parentPoliceStationId;
    }

    public void setParentPoliceStationId(String parentPoliceStationId) {
        this.parentPoliceStationId = parentPoliceStationId;
    }

    public double getPollingStationLatitude() {
        return pollingStationLatitude;
    }

    public void setPollingStationLatitude(double pollingStationLatitude) {
        this.pollingStationLatitude = pollingStationLatitude;
    }

    public double getPollingStationLongitude() {
        return pollingStationLongitude;
    }

    public void setPollingStationLongitude(double pollingStationLongitude) {
        this.pollingStationLongitude = pollingStationLongitude;
    }

    public int getPollingStationNoVoters() {
        return pollingStationNoVoters;
    }

    public void setPollingStationNoVoters(int pollingStationNoVoters) {
        this.pollingStationNoVoters = pollingStationNoVoters;
    }
}
