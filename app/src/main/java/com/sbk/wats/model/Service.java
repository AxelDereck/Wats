package com.sbk.wats.model;

/**
 * Created by KimAx on 04/10/2017.
 */

public class Service {
    private int id;
    private String nom;
    private String desc;
    private int montant;

    public Service() {}

    public Service(int id, String nom, String desc, int montant) {
        this.id = id;
        this.nom = nom;
        this.desc = desc;
        this.montant = montant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    @Override
    public String toString() {
        return getNom();
    }
}
