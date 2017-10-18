package com.sbk.wats.model;

import java.util.Date;

/**
 * Created by KimAx on 29/09/2017.
 */

public class Inscription {
    private int id;
    private String noms;
    private String prenoms;
    private char sexe;
    private Date date_nais;
    private String lieu_nais;
    private String nationalite;
    private String type_piece;
    private String no_cni_passport;
    private String poids;
    private String taille;
    private String ville_res;
    private String quartier;
    private String phone;
    private String email;

    public Inscription() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoms() {
        return noms;
    }

    public void setNoms(String noms) {
        this.noms = noms;
    }

    public String getPrenoms() {
        return prenoms;
    }

    public void setPrenoms(String prenoms) {
        this.prenoms = prenoms;
    }

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public Date getDate_nais() {
        return date_nais;
    }

    public void setDate_nais(Date date_nais) {
        this.date_nais = date_nais;
    }

    public String getLieu_nais() {
        return lieu_nais;
    }

    public void setLieu_nais(String lieu_nais) {
        this.lieu_nais = lieu_nais;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getType_piece() {
        return type_piece;
    }

    public void setType_piece(String type_piece) {
        this.type_piece = type_piece;
    }

    public String getNo_cni_passport() {
        return no_cni_passport;
    }

    public void setNo_cni_passport(String no_cni_passport) {
        this.no_cni_passport = no_cni_passport;
    }

    public String getPoids() {
        return poids;
    }

    public void setPoids(String poids) {
        this.poids = poids;
    }

    public String getTaille() {
        return taille;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }

    public String getVille_res() {
        return ville_res;
    }

    public void setVille_res(String ville_res) {
        this.ville_res = ville_res;
    }

    public String getQuartier() {
        return quartier;
    }

    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
