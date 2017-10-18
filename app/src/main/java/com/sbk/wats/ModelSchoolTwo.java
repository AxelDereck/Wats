package com.sbk.wats;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;

import com.sbk.wats.model.Inscription;
import com.sbk.wats.model.Manager;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by KimAx on 29/09/2017.
 */

public class ModelSchoolTwo extends Fragment {

    public static String getPageTitle() {
        return "Infos Perso.";
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        Manager.initInscription();
        return inflater.inflate(R.layout.modelschool_two, container, false);
    }

    @Override
    public void onPause() {
        updateInscription();
        super.onPause();
    }

    @Override
    public void onStop() {
        updateInscription();
        super.onStop();
    }

    @Override
    public void onResume() {
        super.onResume();

        Inscription data = Manager.getCurInscription();

        if(null == data) {
            EditText fieldNoms = (EditText) getActivity().findViewById(R.id.field_noms);
            fieldNoms.setText(data.getNoms());
            EditText fieldPrenoms = (EditText) getActivity().findViewById(R.id.field_prenoms);
            fieldPrenoms.setText(data.getPrenoms());
            if ('F' == data.getSexe()) {
                RadioButton fieldSexe = (RadioButton) getActivity().findViewById(R.id.sexe_female);
                fieldSexe.setChecked(true);
            } else {
                RadioButton fieldSexe = (RadioButton) getActivity().findViewById(R.id.sexe_male);
                fieldSexe.setChecked(true);
            }

            DatePicker fieldDate = (DatePicker) getActivity().findViewById(R.id.field_date_nais);
            fieldDate.init(
                    data.getDate_nais().getYear(),
                    data.getDate_nais().getMonth(),
                    data.getDate_nais().getDay(),
                    null
            );
            EditText fieldLieuNais = (EditText) getActivity().findViewById(R.id.field_lieu_nais);
            fieldLieuNais.setText(data.getLieu_nais());
        }
    }

    private void updateInscription() {
        Inscription data = Manager.getCurInscription();

        EditText fieldNoms = (EditText) getActivity().findViewById(R.id.field_noms);
        data.setNoms(fieldNoms.getText().toString());
        EditText fieldPrenoms = (EditText) getActivity().findViewById(R.id.field_prenoms);
        data.setPrenoms(fieldPrenoms.getText().toString());
        RadioButton fieldSexe = (RadioButton) getActivity().findViewById(R.id.sexe_female);
        data.setSexe( fieldSexe.isChecked() ? 'F' : 'M' );
        DatePicker fieldDate = (DatePicker) getActivity().findViewById(R.id.field_date_nais);
        Calendar cal = Calendar.getInstance();
        cal.set(fieldDate.getYear(), fieldDate.getMonth(), fieldDate.getDayOfMonth());
        Date resDate = cal.getTime();
        data.setDate_nais( resDate );
        EditText fieldLieuNais = (EditText) getActivity().findViewById(R.id.field_lieu_nais);
        data.setLieu_nais(fieldLieuNais.getText().toString());

        Manager.updateCurInscription(data);
    }
}
