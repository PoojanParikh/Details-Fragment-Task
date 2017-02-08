package com.poojan.detailsfragmenttask;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by VNurtureTechnologies on 07/02/17.
 */

public class FragmentSemester extends Fragment {

    Button semesterButton;
    EditText semesterEditText;

    FragmentDetails fragmentDetails = new FragmentDetails();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_semester,container,false);

        semesterButton = (Button) view.findViewById(R.id.semester_button);
        semesterEditText = (EditText) view.findViewById(R.id.edit_text_semester);

       final String name = getArguments().getString("Name");

        semesterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String semester = semesterEditText.getText().toString();

                Bundle bundleSemester = new Bundle();
                bundleSemester.putString("Name",name);
                bundleSemester.putString("Semester",semester);
                fragmentDetails.setArguments(bundleSemester);

                FragmentManager fragmentManagerSemester = getFragmentManager();
                FragmentTransaction fragmentTransactionSemester = fragmentManagerSemester.beginTransaction();
                fragmentTransactionSemester.replace(R.id.main_layout,fragmentDetails);

                fragmentTransactionSemester.commit();
            }
        });

        return view;
    }
}
