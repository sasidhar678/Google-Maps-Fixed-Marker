package com.example.balasasidharkola.mapsdemo;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.ClusterItem;

/**
 * Created by BALA SASiDHAR KOLA on 02-Aug-15.
 */
public class Person implements ClusterItem {

    public final String name;
    public final int profilePhoto;
    private final LatLng mPosition;

    public Person(LatLng position, String name, int pictureResource) {
        this.name = name;
        profilePhoto = pictureResource;
        mPosition = position;
    }

    @Override
    public LatLng getPosition() {
        return mPosition;
    }
}
