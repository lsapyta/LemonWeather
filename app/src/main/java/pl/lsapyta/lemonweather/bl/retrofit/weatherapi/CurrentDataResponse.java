package pl.lsapyta.lemonweather.bl.retrofit.weatherapi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

import pl.lsapyta.lemonweather.bl.retrofit.weatherapi.headers.Alerts;
import pl.lsapyta.lemonweather.bl.retrofit.weatherapi.headers.Current;
import pl.lsapyta.lemonweather.bl.retrofit.weatherapi.headers.Daily;
import pl.lsapyta.lemonweather.bl.retrofit.weatherapi.headers.Hourly;
import pl.lsapyta.lemonweather.bl.retrofit.weatherapi.headers.Minutely;

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

    @SerializedName("current")
    @Expose
    public Current current;

    @SerializedName("minutely")
    @Expose
    public List<Minutely> minutely;

    @SerializedName("hourly")
    @Expose
    public List<Hourly> hourly;

    @SerializedName("daily")
    @Expose
    public List<Daily> daily;

    @SerializedName("alerts")
    @Expose
    public List<Alerts> alerts;


    public CurrentDataResponse()
    {

    }

}
