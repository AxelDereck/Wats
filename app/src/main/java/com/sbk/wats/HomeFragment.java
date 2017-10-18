package com.sbk.wats;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by KimAx on 29/09/2017.
 */

public class HomeFragment extends Fragment implements View.OnClickListener {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return  inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button item = (Button) getActivity().findViewById(R.id.item_modelschool);
        item.setOnClickListener(this);
        item = (Button) getActivity().findViewById(R.id.item_univ);
        item.setOnClickListener(this);
        item = (Button) getActivity().findViewById(R.id.item_consult);
        item.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch( view.getId() ) {
            case R.id.item_modelschool:
                launchActivity(ModelSchoolActivity.class);
                break;

            case R.id.item_univ:
                displayFragment(new UnivPortal());
                break;

            case R.id.item_consult:
                displayFragment(new ConsultFragment());
                break;

            default:
                System.out.println("§§§§§§§§    CLIC TRAITE    §§§§§§§§§");
                Toast.makeText(getActivity(), "Fonctionnalité indisponible pour le moment", Toast.LENGTH_LONG)
                        .show();
        }
    }

    private void launchActivity(Class activityClass) {
        Intent intent = new Intent(getActivity(), activityClass);
        startActivity(intent);
    }

    private void displayFragment(Fragment fragment) {
        getActivity().getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout, fragment)
                .commit();
    }
}
