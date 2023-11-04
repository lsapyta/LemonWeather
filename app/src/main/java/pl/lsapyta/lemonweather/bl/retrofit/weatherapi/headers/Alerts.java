package pl.lsapyta.lemonweather.bl.retrofit.weatherapi.headers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Alerts implements Serializable
{
    @SerializedName("sender_name")
    @Expose
    public String sender_name;

    @SerializedName("event")
    @Expose
    public String event;

    @SerializedName("start")
    @Expose
    public long start;

    @SerializedName("end")
    @Expose
    public long end;

    @SerializedName("description")
    @Expose
    public long description;

    @SerializedName("tags")
    @Expose
    public String[] tags;

    public Alerts() {}
}
