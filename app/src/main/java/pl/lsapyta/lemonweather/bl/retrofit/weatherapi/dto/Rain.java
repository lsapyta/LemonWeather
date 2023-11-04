package pl.lsapyta.lemonweather.bl.retrofit.weatherapi.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Rain implements Serializable
{

    @SerializedName("1h")
    @Expose
    public Long perHour;

    public Rain(){}
}
