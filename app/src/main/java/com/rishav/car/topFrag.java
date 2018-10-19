package com.rishav.car;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class topFrag extends Fragment {

    static FrameLayout frameLayout;
    public topFrag(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate( R.layout.frag_top, container, false );
        frameLayout = view.findViewById( R.id.TOPFRAGGER );

        return view;
    }
}
