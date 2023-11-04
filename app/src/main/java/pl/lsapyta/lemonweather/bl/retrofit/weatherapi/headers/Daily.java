package pl.lsapyta.lemonweather.bl.retrofit.weatherapi.headers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import pl.lsapyta.lemonweather.bl.retrofit.weatherapi.dto.FeelsLike;
import pl.lsapyta.lemonweather.bl.retrofit.weatherapi.dto.Rain;
import pl.lsapyta.lemonweather.bl.retrofit.weatherapi.dto.Snow;
import pl.lsapyta.lemonweather.bl.retrofit.weatherapi.dto.Temp;
import pl.lsapyta.lemonweather.bl.retrofit.weatherapi.dto.Weather;

public class Daily implements Serializable
{
    @SerializedName("dt")
    @Expose
    public long dt;

    @SerializedName("sunrise")
    @Expose
    public long sunrise;

    @SerializedName("sunset")
    @Expose
    public long sunset;

    @SerializedName("moonrise")
    @Expose
    public long moonrise;

    @SerializedName("moonset")
    @Expose
    public long moonset;

    @SerializedName("moon_phase")
    @Expose
    public double moon_phase; //0 - .25 , .5 , .75 , 1

    @SerializedName("summary")
    @Expose
    public String summary;

    @SerializedName("temp")
    @Expose
    public Temp temp; //units

    @SerializedName("feels_like")
    @Expose
    public FeelsLike feels_like; //units

    @SerializedName("pressure")
    @Expose
    public long pressure; // hPa

    @SerializedName("humidity")
    @Expose
    public long humidity; //%

    @SerializedName("dew_point")
    @Expose
    public long dew_point; // units

    @SerializedName("clouds")
    @Expose
    public long clouds; //%

    @SerializedName("uvi")
    @Expose
    public long uv; //uv index

    @SerializedName("visibility")
    @Expose
    public long visibility; //meter max 10km

    @SerializedName("wind_speed")
    @Expose
    public long wind_speed; //units

    @SerializedName("wind_gust")
    @Expose
    public Long wind_gust;

    @SerializedName("wind_deg")
    @Expose
    public Long wind_deg;

    @SerializedName("rain")
    @Expose
    public Rain rain;

    @SerializedName("snow")
    @Expose
    public Snow snow;

    @SerializedName("weather")
    @Expose
    public Weather weather;
}
