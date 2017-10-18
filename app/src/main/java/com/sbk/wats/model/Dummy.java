package com.sbk.wats.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KimAx on 04/10/2017.
 */

public class Dummy {
    private static List<Service> listServices;

    static {
        listServices = new ArrayList<Service>();
        listServices.add( new Service(1, "Conseil et Orientation Académique", "", 2000) );
        listServices.add( new Service(2, "Conseil et Orientation d'Affaire", "",	3000));
        listServices.add( new Service(3, "Assistance Administrative et Financière", "", 2000));
        listServices.add( new Service(4, "Assistance Comptable et Juridique", "", 2000));
        listServices.add( new Service(5, "Assistance Voyage", "", 3000));
        listServices.add( new Service(6, "Consultation en Normes et Qualité", "", 10000));
        listServices.add( new Service(7, "IT Consultation", "", 2000));
    }

    public static List<Service> getListServices() {
        return listServices;
    }
}
