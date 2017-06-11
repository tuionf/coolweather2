package com.example.tuionf.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tuionf on 2016/12/15.
 */

public class Alarms {
    @SerializedName("title")
    public String alarmsTitle;
    @SerializedName("stat")
    public String alarmsStat;
    @SerializedName("level")
    public String alarmsLevel;
    @SerializedName("txt")
    public String alarmsTxt;
    @SerializedName("type")
    public String alarmsType;

}
