package pl.lsapyta.lemonweather.bl.retrofit.weatherapi.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Weather implements Serializable {


    @SerializedName("id")
    @Expose
    public Integer id;

    @SerializedName("main")
    @Expose
    public String main; //rain,snow;

    @SerializedName("description")
    @Expose
    public String description;

    @SerializedName("icon")
    @Expose
    public String iconId;

    public Weather(){}
}
