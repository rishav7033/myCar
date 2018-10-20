package com.rishav.car;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Location extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;



        // Add a marker in Sydney and move the camera
        LatLng CU = new LatLng(30.7698, 76.5756);
        mMap.addMarker(new MarkerOptions().position(CU).title("Block 1"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CU));


        LatLng AU = new LatLng(30.7714, 76.5663);
        mMap.addMarker(new MarkerOptions().position(AU).title("Block 14"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(AU));

        LatLng b6 = new LatLng(30.767682, 76.576094);
        mMap.addMarker(new MarkerOptions().position(b6).title("Block 6"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(AU));


        LatLng b9 = new LatLng(30.771627, 76.578257);
        mMap.addMarker(new MarkerOptions().position(b9).title("Block 9"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(AU));
      //  mMap.setMapType(mMap.MAP_TYPE_NORMAL);



    }
}
