package pl.lsapyta.lemonweather.bl.retrofit.weatherapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface OpenWeatherApiInterface
{
    @GET("onecall?lat={lat}&lon={lon}&appId={api_key}")
    Call<CurrentDataResponse> getCurrentAndForecastData(
            @Path(value = "lat") long lat,
            @Path(value = "lon") long lon,
            @Path(value = "appId") String api_key);

}
