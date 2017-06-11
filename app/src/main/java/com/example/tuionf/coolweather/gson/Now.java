package com.example.tuionf.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tuionf on 2016/12/15.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
