package pl.lsapyta.lemonweather.app.di.modules;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class WeatherApiModule {

    private final String baseUrl;
    public WeatherApiModule(String url)
    {
        baseUrl = url;
    }

    @Provides
    public Retrofit provideWeatherApi() {
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .build();
    }

}
