package com.fourtwelvedesign.dsmmeerut.util;

import android.content.res.Resources;
import android.graphics.drawable.NinePatchDrawable;
import android.support.v7.widget.AppCompatImageView;

import com.fourtwelvedesign.dsmmeerut.R;
import com.fourtwelvedesign.dsmmeerut.model.PoliceStation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * Created by Paul Curtis on 1/25/2017.
 */

public class AppInitializer {
    public List<PoliceStation> initializePoliceStationData() {
        List<PoliceStation> policeStations = null;
        String csvFile = "/raw/police_stations_csv.csv";
        BufferedReader br = null;
        String line;
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] policeStationArray = line.split(",");
                PoliceStation policeStation = new PoliceStation();
                policeStation.setPs_station_id(Integer.parseInt(policeStationArray[0]));
                policeStation.setPs_station_name(policeStationArray[1]);
                policeStation.setPs_station_subtitle(policeStationArray[2]);
                policeStations.add(policeStation);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return policeStations;
    }

    public static void checkAppData() {
        // check if db exists
    }
}
