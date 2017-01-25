package com.fourtwelvedesign.dsmmeerut.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.fourtwelvedesign.dsmmeerut.model.PoliceStation;
import com.fourtwelvedesign.dsmmeerut.model.PollingStation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paul Curtis on 1/24/2017.
 */

public class DBHandler extends SQLiteOpenHelper {
    // Database Name & Version
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "dsmdb";

    // POLICE STATION table name & Table Columns names
    private static final String TABLE_POLICE_STATIONS = "police_stations";
    private static final String PS_KEY_ID = "ps_id";
    private static final String PS_NAME = "ps_name";
    private static final String PS_SUBTITLE = "ps_subtitle";

    // POLLING STATION table name & columns
    private static final String TABLE_POLLING_STATION = "polling_stations";
    private static final String KEY_POLLING_STATION_ID = "id_polling_station";
    private static final String POLLSTN_NAME = "polling_station_name";
    private static final String POLLSTN_PARENT_PS_ID = "parent_police_station_id";
    private static final String POLLSTN_LATITUDE = "station_latitude";
    private static final String POLLSTN_LONGITUDE = "station_longitude";
    private static final String POLLSTN_NO_VOTERS = "station_no_voters";

    public DBHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE_POLICE_STATIONS = "";
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed and recreate
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_POLICE_STATIONS);
        onCreate(db);
    }

    // GET POLICE STATION
    public PoliceStation getPoliceStation(int id) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABLE_POLICE_STATIONS, new String[]{PS_KEY_ID,
                        PS_NAME, PS_SUBTITLE}, PS_KEY_ID + " =?",
                new String[]{String.valueOf(id)}, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();

        PoliceStation station = new PoliceStation(Integer.parseInt(cursor.getString(0)),
                cursor.getString(1), cursor.getString(2));
        return station;
    }

    // GET ALL POLICE STATIONS
    public List<PoliceStation> getAllPoliceStations() {
        List<PoliceStation> stationList = new ArrayList<PoliceStation>();
        String selectAllQuery = "SELECT * FROM" + TABLE_POLICE_STATIONS;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectAllQuery, null);

        if (cursor.moveToFirst()) {
            do {
                PoliceStation station = new PoliceStation();
                station.setPs_station_id(Integer.parseInt(cursor.getString(0)));
                station.setPs_station_name(cursor.getString(1));
                station.setPs_station_subtitle(cursor.getString(2));
                stationList.add(station);
            } while (cursor.moveToNext());
        }
        return stationList;
    }

    // GET ALL POLLING STATIONS FOR A PARTICULAR POLICE STATION
    public List<PollingStation> getPollingStationsByPSId(int policeStationId) {
        List<PollingStation> pollingStations = new ArrayList<PollingStation>();
        String selectAllQuery = "SELECT * FROM" + TABLE_POLLING_STATION +
                "WHERE parent_police_station_id = " + policeStationId;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectAllQuery, null);

        if (cursor.moveToFirst()) {
            do {
                PollingStation pollingStation = new PollingStation();
                pollingStation.setParentPoliceStationId(cursor.getString(0));
                pollingStation.setPollingStationName(cursor.getString(1));
                pollingStation.setParentPoliceStationId(cursor.getString(2));
                pollingStation.setPollingStationLatitude(cursor.getDouble(3));
                pollingStation.setPollingStationLongitude(cursor.getDouble(4));
                pollingStation.setPollingStationNoVoters(cursor.getInt(5));
                pollingStations.add(pollingStation);
            } while (cursor.moveToNext());
        }
        return pollingStations;
    }

    // UPDATE A POLICE STATION
    public int updateStation(PoliceStation station) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(PS_KEY_ID, station.getPs_station_id());
        values.put(PS_NAME, station.getPs_station_name());
        values.put(PS_SUBTITLE, station.getPs_station_subtitle());
        return db.update(TABLE_POLICE_STATIONS, values, PS_KEY_ID + " =?",
                new String[]{String.valueOf(station.getPs_station_id())});
    }
}
