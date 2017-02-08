package com.poojan.detailsfragmenttask;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by VNurtureTechnologies on 07/02/17.
 */

public class FragmentDetails extends Fragment {

    Button detailButton;

    TextView textViewName,textViewSemester;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_details,container,false);

        textViewName = (TextView) view.findViewById(R.id.text_name);
        textViewSemester = (TextView) view.findViewById(R.id.text_semester);

        textViewName.setText(getArguments().getString("Name"));
        textViewSemester.setText(getArguments().getString("Semester"));

        detailButton = (Button) view.findViewById(R.id.detail_button);

        detailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().popBackStack();
            }
        });

        return view;
    }
}
