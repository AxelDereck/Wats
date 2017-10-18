package com.sbk.wats;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sbk.wats.model.Manager;

/**
 * Created by KimAx on 29/09/2017.
 */

public class ModelSchoolThree extends Fragment {

    public static String getPageTitle() {
        return "Autres infos";
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        Manager.initInscription();
        return inflater.inflate(R.layout.modelschool_three, container, false);
    }
}
