package pl.lsapyta.lemonweather.bl.retrofit.weatherapi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class CurrentDataResponse implements Serializable
{
    @SerializedName("lat")
    @Expose
    public long latitude;

    @SerializedName("lon")
    @Expose
    public long longitude;

    @SerializedName("timezone")
    @Expose
    public String timezone_name;

    @SerializedName("timezone_offset")
    @Expose
    public long timezone_offset;


    public CurrentDataResponse()
    {

    }

}
