package com.fourtwelvedesign.dsmmeerut.fragment;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.fourtwelvedesign.dsmmeerut.R;
import com.fourtwelvedesign.dsmmeerut.view.PoliceStationDetailView;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link PoliceStationsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link PoliceStationsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PoliceStationsFragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public PoliceStationsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PoliceStationsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PoliceStationsFragment newInstance(String param1, String param2) {
        PoliceStationsFragment fragment = new PoliceStationsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // INFLATE THE VIEW
        View viewCreated = inflater.inflate(R.layout.fragment_police_stations, container, false);

        // ADD THE POLICE STATION NAMES VIA ARRAY
        final Spinner spinner = (Spinner) viewCreated.findViewById(R.id.police_station_name_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(viewCreated.getContext(),
                R.array.police_station_names, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        // GET A REFERENCE TO THE PANEL WE WILL CHANGE WITH SPINNER
        final View psContentView = viewCreated.findViewById(R.id.police_station_content_view);

        // CHANGE POLICE STATION LISTENER
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                handlePoliceStationChange(parent.getRootView(), position, spinner.getSelectedItem().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        // RETURN THE VIEW CREATED
        return viewCreated;
    }

    public void handlePoliceStationChange(View viewToChange, int position, String selectedStation) {
        View parentView = viewToChange.getRootView();
        if (selectedStation.equalsIgnoreCase("select station")) {
            // EITHER HAS JUST LOADED OR RETURNED TO FIRST,
        } else if (selectedStation.equalsIgnoreCase("bahsuma")) {
        } else if (selectedStation.equalsIgnoreCase("bhavanpur")) {
        } else if (selectedStation.equalsIgnoreCase("brahmpuri")) {
        } else if (selectedStation.equalsIgnoreCase("civil line")) {
        } else if (selectedStation.equalsIgnoreCase("daurala")) {
        } else if (selectedStation.equalsIgnoreCase("delhi gate")) {
        } else if (selectedStation.equalsIgnoreCase("ganganagar")) {
        } else if (selectedStation.equalsIgnoreCase("hastinapur")) {
        } else if (selectedStation.equalsIgnoreCase("incholi")) {
        } else if (selectedStation.equalsIgnoreCase("jaani")) {
        } else if (selectedStation.equalsIgnoreCase("kankerkhera")) {
        } else if (selectedStation.equalsIgnoreCase("kharkhoda")) {
        } else if (selectedStation.equalsIgnoreCase("kithore")) {
        } else if (selectedStation.equalsIgnoreCase("kotwali")) {
        } else if (selectedStation.equalsIgnoreCase("lalkurti")) {
        } else if (selectedStation.equalsIgnoreCase("lisadi gate")) {
        } else if (selectedStation.equalsIgnoreCase("mawana")) {
        } else if (selectedStation.equalsIgnoreCase("medical")) {
        } else if (selectedStation.equalsIgnoreCase("mundali")) {
        } else if (selectedStation.equalsIgnoreCase("nauchandi")) {
        } else if (selectedStation.equalsIgnoreCase("pallavpuram")) {
        } else if (selectedStation.equalsIgnoreCase("parikshitgarh")) {
        } else if (selectedStation.equalsIgnoreCase("partapur")) {
        } else if (selectedStation.equalsIgnoreCase("phalawda")) {
        } else if (selectedStation.equalsIgnoreCase("railway road")) {
            PoliceStationDetailView psDetailView = new PoliceStationDetailView(getContext(), null, selectedStation);
            parentView.setBackgroundColor(Color.BLACK);
        } else if (selectedStation.equalsIgnoreCase("rohta")) {
        } else if (selectedStation.equalsIgnoreCase("sadar")) {
        } else if (selectedStation.equalsIgnoreCase("sardhana")) {
        } else if (selectedStation.equalsIgnoreCase("sarurpur")) {
        } else if (selectedStation.equalsIgnoreCase("T.P. nagar")) {
        }
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
