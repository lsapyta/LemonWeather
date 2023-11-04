package pl.lsapyta.lemonweather.bl.retrofit.weatherapi.headers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

import pl.lsapyta.lemonweather.bl.retrofit.weatherapi.dto.Rain;
import pl.lsapyta.lemonweather.bl.retrofit.weatherapi.dto.Snow;
import pl.lsapyta.lemonweather.bl.retrofit.weatherapi.dto.Weather;

public class Current implements Serializable {

    @SerializedName("dt")
    @Expose
    public long dt;

    @SerializedName("sunrise")
    @Expose
    public long sunrise;

    @SerializedName("sunset")
    @Expose
    public long sunset;

    @SerializedName("temp")
    @Expose
    public long temp; //units

    @SerializedName("feels_like")
    @Expose
    public long feels_like; //units

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
    public List<Weather> weather;


    public Current() {}
}
