package pl.lsapyta.lemonweather.bl.retrofit.weatherapi.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Snow implements Serializable {

    @SerializedName("1h")
    @Expose
    public Long perHour;

    public Snow(){}
}
