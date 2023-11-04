package pl.lsapyta.lemonweather.app.di.modules;

import dagger.Module;
import dagger.Provides;
import pl.lsapyta.lemonweatherapp.BuildConfig;
import retrofit2.Retrofit;

@Module
public class WeatherApiModule {

    @Provides
    public Retrofit provideWeatherApi() {
        return new Retrofit.Builder()
                .baseUrl(BuildConfig.BASE_OPENWEATHER_URL)
                .build();
    }

}
