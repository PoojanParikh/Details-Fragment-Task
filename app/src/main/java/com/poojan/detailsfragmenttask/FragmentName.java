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

public class FragmentName extends Fragment {

    FragmentSemester fragmentSemester = new FragmentSemester();

    Button nameButton;
    EditText nameEditText;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_name,container,false);

        nameButton = (Button) view.findViewById(R.id.name_button);
        nameEditText = (EditText) view.findViewById(R.id.edit_text_name);

        nameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameEditText.getText().toString();

                Bundle bundleName = new Bundle();
                bundleName.putString("Name",name);
                fragmentSemester.setArguments(bundleName);

                FragmentManager fragmentManagerName = getFragmentManager();
                FragmentTransaction fragmentTransactionName = fragmentManagerName.beginTransaction();
                fragmentTransactionName.replace(R.id.main_layout,fragmentSemester);
                nameEditText.setText("");
                fragmentTransactionName.addToBackStack("");
                fragmentTransactionName.commit();
            }
        });

        return view;
    }
}
