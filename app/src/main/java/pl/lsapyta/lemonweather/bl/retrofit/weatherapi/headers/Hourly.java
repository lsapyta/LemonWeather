package pl.lsapyta.lemonweather.bl.retrofit.weatherapi.headers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import pl.lsapyta.lemonweather.bl.retrofit.weatherapi.dto.Rain;
import pl.lsapyta.lemonweather.bl.retrofit.weatherapi.dto.Snow;
import pl.lsapyta.lemonweather.bl.retrofit.weatherapi.dto.Weather;

public class Hourly implements Serializable {

    @SerializedName("dt")
    @Expose
    public long dt;

    @SerializedName("temp")
    @Expose
    public long temp;

    @SerializedName("feels_like")
    @Expose
    public long feels_like;

    @SerializedName("pressure")
    @Expose
    public long pressure;

    @SerializedName("humidity")
    @Expose
    public long humidity;

    @SerializedName("dew_point")
    @Expose
    public long dew_point;

    @SerializedName("uvi")
    @Expose
    public long uvi;

    @SerializedName("clouds")
    @Expose
    public long clouds;

    @SerializedName("visibility")
    @Expose
    public long visibility;

    @SerializedName("wind_speed")
    @Expose
    public long wind_speed;

    @SerializedName("wind_gust")
    @Expose
    public long wind_gust;

    @SerializedName("wind_deg")
    @Expose
    public long wind_deg;

    @SerializedName("pop")
    @Expose
    public int pop; //0-100

    @SerializedName("rain")
    @Expose
    public Rain rain;

    @SerializedName("snow")
    @Expose
    public Snow snow;

    @SerializedName("weather")
    @Expose
    public Weather weather;

    public Hourly() {}
}
