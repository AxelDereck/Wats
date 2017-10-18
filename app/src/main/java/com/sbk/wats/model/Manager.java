package com.sbk.wats.model;

/**
 * Created by KimAx on 29/09/2017.
 */

public class Manager {
    private static Inscription curInscription;
    private static User curUser = new User();

    public static void resetUser() {
        curUser = new User();
    }

    public static void setCurUserPhone(String phone) {
        curUser.setPhone(phone);
    }

    public static void setCurUserPassword(String password) {
        curUser.setPassword(password);
    }

    public static void initInscription() {
        curInscription = new Inscription();
    }

    public static Inscription getCurInscription() {
        return curInscription;
    }

    public static void updateCurInscription(Inscription inscription) {
        curInscription = inscription;
    }
}
