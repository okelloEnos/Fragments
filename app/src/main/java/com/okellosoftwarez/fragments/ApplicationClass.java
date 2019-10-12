package com.okellosoftwarez.fragments;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application {

    public static ArrayList<carOwnership> people;

    @Override
    public void onCreate() {
        super.onCreate();

        people = new ArrayList<carOwnership>();

        people.add(new carOwnership("Okello Enos", "0718229563", "Mercedes","ER503"));
        people.add(new carOwnership("Aloice Oyoda", "0714566563", "Nissan","GH12"));
        people.add(new carOwnership("Wilfridah Smith", "071000000", "Volkswagen","POLO"));
        people.add(new carOwnership("Bijuma Jamal", "033489289", "Benz","LGNTO"));
    }
}
