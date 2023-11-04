package pl.lsapyta.lemonweather.app.di.modules.weatherapi;

import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import pl.lsapyta.lemonweather.bl.retrofit.weatherapi.OpenWeatherApiInterface;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class WeatherApiModule {

    private final String mBaseUrl;
    public WeatherApiModule(String mBaseUrl)
    {
        this.mBaseUrl = mBaseUrl;
    }

    @Provides
    @Singleton
    public OpenWeatherApiInterface providesOpenWeatherApiInterface(Gson gson, OkHttpClient okHttpClient)
    {
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl(mBaseUrl)
                .client(okHttpClient)
                .build();
        return retrofit.create(OpenWeatherApiInterface.class);
    }
}
