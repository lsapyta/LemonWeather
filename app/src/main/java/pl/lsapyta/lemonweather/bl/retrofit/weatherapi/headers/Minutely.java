package pl.lsapyta.lemonweather.bl.retrofit.weatherapi.headers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Minutely implements Serializable {

    @SerializedName("dt")
    @Expose
    public long dt;

    @SerializedName("precipitation")
    @Expose
    public long precipitation; //mm/h

    public Minutely(){}
}
