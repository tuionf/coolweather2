package com.example.tuionf.coolweather.gson;

/**
 * Created by tuionf on 2016/12/15.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
