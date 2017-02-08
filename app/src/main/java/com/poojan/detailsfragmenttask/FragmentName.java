package com.poojan.detailsfragmenttask;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by VNurtureTechnologies on 07/02/17.
 */

public class FragmentName extends Fragment {

    FragmentSemester fragmentSemester = new FragmentSemester();



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_name,container,false);

        return view;
    }
}
