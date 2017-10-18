package com.sbk.wats;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.sbk.wats.model.Dummy;
import com.sbk.wats.model.Service;

/**
 * Created by KimAx on 04/10/2017.
 */

public class ConsultFragment extends Fragment implements View.OnClickListener, AdapterView.OnItemSelectedListener {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.consultation_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        View btBack = getActivity().findViewById(R.id.action_back);
        btBack.setVisibility(View.VISIBLE);
        btBack.setOnClickListener(this);

        Spinner spinner = (Spinner) getActivity().findViewById(R.id.spinner_services);
        ArrayAdapter<Service> adapter = new ArrayAdapter<Service>(getActivity(),
                android.R.layout.simple_spinner_item, Dummy.getListServices());
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        getActivity().findViewById(R.id.send_consult).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.action_back:
                displayFragment(new HomeFragment());
                break;

            case R.id.send_consult:
                //TODO
                displayFragment(new HomeFragment());
        }
    }

    private void displayFragment(Fragment fragment) {
        getActivity().getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout, fragment)
                .commit();
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Service selectedService = (Service) ((Spinner) adapterView).getSelectedItem();
        TextView tvAmount = (TextView) getActivity().findViewById(R.id.text_amount);
        tvAmount.setText( getString(R.string.amount_text) + selectedService.getMontant() + " " + getString(R.string.currency_text) );
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
