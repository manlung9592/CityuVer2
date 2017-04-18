package com.example.kyle.cityuver2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class MediHistory extends Fragment {


    public MediHistory() {
        // Required empty public constructor
    }

    public static Fragment newInstant() {
        MediHistory myFragment = new MediHistory();
        return myFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_medi_history, container, false);
    }

}
