package com.techmania.weatherapp.util.networkutil;

public interface NetworkStatusListener {

    void onNetworkAvailable();
    void onNetworkLost();

}
