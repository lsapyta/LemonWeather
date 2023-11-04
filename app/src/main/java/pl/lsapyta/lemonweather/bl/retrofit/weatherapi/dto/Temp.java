package pl.lsapyta.lemonweather.bl.retrofit.weatherapi.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Temp implements Serializable {

    @SerializedName("morn")
    @Expose
    public long morn;

    @SerializedName("day")
    @Expose
    public long day;

    @SerializedName("eve")
    @Expose
    public long eve;

    @SerializedName("night")
    @Expose
    public long night;

    @SerializedName("min")
    @Expose
    public long min;

    @SerializedName("max")
    @Expose
    public long max;

    public Temp() {}


}
