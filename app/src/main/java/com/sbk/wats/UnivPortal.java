package com.sbk.wats;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by KimAx on 04/10/2017.
 */

public class UnivPortal extends Fragment implements View.OnClickListener {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.univ_portal_fragment, container, false);
        //return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button button = (Button) getActivity().findViewById(R.id.portal_1);
        button.setOnClickListener(this);
        button = (Button) getActivity().findViewById(R.id.portal_2);
        button.setOnClickListener(this);
        button = (Button) getActivity().findViewById(R.id.portal_3);
        button.setOnClickListener(this);
        button = (Button) getActivity().findViewById(R.id.portal_4);
        button.setOnClickListener(this);
        button = (Button) getActivity().findViewById(R.id.portal_5);
        button.setOnClickListener(this);
        button = (Button) getActivity().findViewById(R.id.portal_back);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //TODO
        switch (view.getId()) {
            case R.id.portal_1:
                break;

            case R.id.portal_2:
                Snackbar.make(view, "Fonctionnalité non disponible pour le moment", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                break;

            case R.id.portal_3:
                Snackbar.make(view, "Fonctionnalité non disponible pour le moment", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                break;

            case R.id.portal_4:
                Snackbar.make(view, "Fonctionnalité non disponible pour le moment", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                break;


            case R.id.portal_5:
                Snackbar.make(view, "Fonctionnalité non disponible pour le moment", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                break;

            case R.id.portal_back:
                getActivity().getSupportFragmentManager().popBackStack();
        }
    }


    private void displayFragment(Fragment fragment) {
        getActivity().getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout, fragment)
                .commit();
    }
}
