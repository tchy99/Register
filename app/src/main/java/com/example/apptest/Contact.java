package com.example.apptest;

import android.widget.Spinner;

public class Contact {

    private String nom;
    private String prenom;
    private String sexe;
    private String typeContact;
    private String email;
    private String adresse;
    private String telephone;

    public Contact() {
    }

    public String getNom() {
        return nom;
    }

    public String setNom(String nom) {
        this.nom = nom;
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String setPrenom(String prenom) {
        this.prenom = prenom;
        return prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public String setSexe(String sexe) {
        this.sexe = sexe;
        return String.valueOf(sexe);
    }

    public String getTypeContact() {
        return typeContact;
    }

    public String setTypeContact(String typeContact) {
        this.typeContact = typeContact;
        return String.valueOf(typeContact);
    }

    public String getEmail() {
        return email;
    }

    public String setEmail(String email) {
        this.email = email;
        return email;
    }

    public String getAdresse() {
        return adresse;
    }

    public String setAdresse(String adresse) {
        this.adresse = adresse;
        return adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public String setTelephone(String telephone) {
        this.telephone = telephone;
        return telephone;
    }
}
