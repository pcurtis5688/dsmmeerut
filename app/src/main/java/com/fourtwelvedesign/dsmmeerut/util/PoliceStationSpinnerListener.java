package com.fourtwelvedesign.dsmmeerut.util;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;

import com.fourtwelvedesign.dsmmeerut.R;
import com.fourtwelvedesign.dsmmeerut.model.PollingStation;

import java.util.List;

/**
 * Created by Paul Curtis on 1/26/2017.
 */

public class PoliceStationSpinnerListener implements AdapterView.OnItemSelectedListener {
    private ImageView psDetailsHexagonIv;
    private View psDetailsTableLayoutView;
    private TableRow psDetailsTableParentRow;
    private TableRow psDetailsTableLayoutRow;
    private TableLayout psPollingStationsTable;
    private String currentStationViewName;
    private List<PollingStation> currentSubPollingStationList;
    private Spinner stationSpinner;
    private Context spinnerContext;

    public PoliceStationSpinnerListener(Spinner stationSpinner,
                                        ImageView psDetailsHexagonIv,
                                        View psDetailsTableLayoutView,
                                        Context spinnerContext) {
        ////// ACCEPT AND STYLE THE SPINNER
        this.psDetailsHexagonIv = psDetailsHexagonIv;
        this.psDetailsTableLayoutView = psDetailsTableLayoutView;
        this.psDetailsTableParentRow = (TableRow) psDetailsTableLayoutView.getParent();
        this.stationSpinner = stationSpinner;
        this.spinnerContext = spinnerContext;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        setCurrentStationViewName(parent.getSelectedItem().toString());
        setPsDetailsHexagonImageAndDetailsTable(parent.getSelectedItem().toString());
    }

    public void setPsDetailsHexagonImageAndDetailsTable(String stationName) {
        this.psDetailsTableLayoutRow = new TableRow(this.spinnerContext);
        if (stationName.equalsIgnoreCase("select station")) {
            this.psDetailsHexagonIv.setImageResource(R.drawable.police_hat_hex);
        } else if (stationName.equalsIgnoreCase("bahsuma")) {
            this.psDetailsHexagonIv.setImageResource(R.drawable.bahsuma_hex_png);
        } else if (stationName.equalsIgnoreCase("bhavanpur")) {
            this.psDetailsHexagonIv.setImageResource(R.drawable.bhavanpur_png);
        } else if (stationName.equalsIgnoreCase("brahmpuri_hex")) {
            this.psDetailsHexagonIv.setImageResource(R.drawable.brahmpuri_hex);
        } else if (stationName.equalsIgnoreCase("civil line")) {
            this.psDetailsHexagonIv.setImageResource(R.drawable.civil_lines_hex);
        } else if (stationName.equalsIgnoreCase("daurala")) {
            this.psDetailsHexagonIv.setImageResource(R.drawable.daurala_hex);
        } else if (stationName.equalsIgnoreCase("delhi gate")) {
            this.psDetailsHexagonIv.setImageResource(R.drawable.dehli_gate_hex_png);
        } else if (stationName.equalsIgnoreCase("ganganagar")) {
            this.psDetailsHexagonIv.setImageResource(R.drawable.ganaganagar_hex);
        } else if (stationName.equalsIgnoreCase("hastinapur")) {
            this.psDetailsHexagonIv.setImageResource(R.drawable.hastinapur_hex);
        } else if (stationName.equalsIgnoreCase("incholi")) {
            this.psDetailsHexagonIv.setImageResource(R.drawable.incholi_hex);
        } else if (stationName.equalsIgnoreCase("jaani")) {
            this.psDetailsHexagonIv.setImageResource(R.drawable.jaani_hex);
        } else if (stationName.equalsIgnoreCase("kankerkhera")) {
            this.psDetailsHexagonIv.setImageResource(R.drawable.kankarkhera_hex);
        } else if (stationName.equalsIgnoreCase("kharkhoda")) {
            this.psDetailsHexagonIv.setImageResource(R.drawable.kharkhoda_hex);
        } else if (stationName.equalsIgnoreCase("kithore")) {
            this.psDetailsHexagonIv.setImageResource(R.drawable.kithore_hex);
        } else if (stationName.equalsIgnoreCase("kotwali")) {
            this.psDetailsHexagonIv.setImageResource(R.drawable.kotwali_hex);
        } else if (stationName.equalsIgnoreCase("lalkurti")) {
            this.psDetailsHexagonIv.setImageResource(R.drawable.lalkurti_hex);
        } else if (stationName.equalsIgnoreCase("lisadi gate")) {
            this.psDetailsHexagonIv.setImageResource(R.drawable.lisadi_gate_hex);
        } else if (stationName.equalsIgnoreCase("mawana")) {
            this.psDetailsHexagonIv.setImageResource(R.drawable.mawana_hex);
        } else if (stationName.equalsIgnoreCase("medical")) {
            this.psDetailsHexagonIv.setImageResource(R.drawable.medical_hex);
        } else if (stationName.equalsIgnoreCase("mundali")) {
            this.psDetailsHexagonIv.setImageResource(R.drawable.mundali_hex);
        } else if (stationName.equalsIgnoreCase("nauchandi")) {
            this.psDetailsHexagonIv.setImageResource(R.drawable.nauchandi_hex);
        } else if (stationName.equalsIgnoreCase("pallavpuram")) {
            this.psDetailsHexagonIv.setImageResource(R.drawable.pallavpuram_hex);
        } else if (stationName.equalsIgnoreCase("parikshitgarh")) {
            this.psDetailsHexagonIv.setImageResource(R.drawable.parikshitgarh_hex);
        } else if (stationName.equalsIgnoreCase("partapur")) {
            this.psDetailsHexagonIv.setImageResource(R.drawable.partapur_hex);
        } else if (stationName.equalsIgnoreCase("phalawda")) {
            this.psDetailsHexagonIv.setImageResource(R.drawable.phalawda_hex);
        } else if (stationName.equalsIgnoreCase("railway road")) {
            this.psDetailsHexagonIv.setImageResource(R.drawable.railway_road_hex);
            this.psDetailsTableParentRow.removeView(psDetailsTableLayoutView);
            this.psDetailsTableLayoutRow = (TableRow) View.inflate(this.spinnerContext, R.layout.railway_road_details_table, psDetailsTableParentRow);
            this.psPollingStationsTable = (TableLayout) this.psDetailsTableLayoutRow.findViewById(R.id.railway_road_polling_station_table);

        } else if (stationName.equalsIgnoreCase("rohta")) {
            this.psDetailsHexagonIv.setImageResource(R.drawable.rohta_hex);
        } else if (stationName.equalsIgnoreCase("sadar")) {
            this.psDetailsHexagonIv.setImageResource(R.drawable.sadar_hex);
        } else if (stationName.equalsIgnoreCase("sardhana")) {
            this.psDetailsHexagonIv.setImageResource(R.drawable.sardhana_hex);
        } else if (stationName.equalsIgnoreCase("sarurpur")) {
            this.psDetailsHexagonIv.setImageResource(R.drawable.sarurpur_hex);
        } else if (stationName.equalsIgnoreCase("T.P. nagar")) {
            this.psDetailsHexagonIv.setImageResource(R.drawable.tp_nagar_hex);
        }
    }

    public List<PollingStation> getCurrentStationPollLocations(String currentStationViewName){
        // do this if have time.
        return null;
    }

    public void setCurrentStationViewName(String currentStationViewName) {
        this.currentStationViewName = currentStationViewName;
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
