package com.example.lab12f7.earthquake;

import android.location.Location;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by lab12f7 on 1/16/2017.
 */

public class Quake {
    private String depth;
    private Date date;
    private String details;
    private Location location;
    private double magnitude;
    private String link;

    public Date getDate() { return date; }
    public String getDetails() { return details; }
    public Location getLocation() { return location; }
    public double getMagnitude() { return magnitude; }
    public String getLink() { return link; }

    public Quake(Date _d, String _det, Location _loc, double _mag, String _link, String depth) {
        date = _d;
        details = _det;
        location = _loc;
        magnitude = _mag;
        link = _link;
        this.depth = depth;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy, HH.mm", Locale.US);
        String dateString = sdf.format(date);
        return dateString + ": " + magnitude + " " + depth + "\n" + details;
    }
}
