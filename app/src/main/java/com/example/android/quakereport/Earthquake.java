package com.example.android.quakereport;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.Date;

/**
 * Created by brucewayne on 17/12/2017.
 */

public class Earthquake {


    private Double magnitude;
    private String location;
    private Long time;
    private String url;

    public Earthquake(Double magnitude, String location, Long time, String url) {
        this.magnitude = magnitude;
        this.location = location;
        this.time = time;
        this.url = url;
    }

    public Double getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public Long getTime() {
        return time;
    }

    public String getUrl() {
        return url;
    }
}
