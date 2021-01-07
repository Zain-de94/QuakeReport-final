package com.example.android.quakereport;

public class Earthquake {

    private Double mMagnitude;
    private String mLocation;
    private String mDate;
    private long mTimeInMillisecond;
    private String mUrl;


    public Earthquake(Double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMillisecond = timeInMilliseconds;
        mUrl = url;
    }

    public Double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMillisecond;
    }

    public String getUrl()
    {
        return  mUrl;
    }


}
