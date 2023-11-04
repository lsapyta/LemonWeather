package pl.lsapyta.lemonweather.app;

import android.app.Application;

import pl.lsapyta.lemonweather.app.di.ApplicationComponent;
import pl.lsapyta.lemonweather.app.di.DaggerApplicationComponent;
import pl.lsapyta.lemonweather.app.di.modules.AppModule;
import pl.lsapyta.lemonweather.app.di.modules.DataStoreModule;
import pl.lsapyta.lemonweather.app.di.modules.weatherapi.WeatherApiModule;
import pl.lsapyta.lemonweatherapp.BuildConfig;

public class LemonApplication extends Application
{
    private ApplicationComponent appComponent;
    @Override
    public void onCreate()
    {
        super.onCreate();
        appComponent = DaggerApplicationComponent.builder()
                .appModule(new AppModule(this))
                .dataStoreModule(new DataStoreModule(BuildConfig.BASE_DATASTORE_NAME))
                .weatherApiModule(new WeatherApiModule(BuildConfig.BASE_OPENWEATHER_URL))
                .build();
    }

    public ApplicationComponent getAppComponent()
    {
        return appComponent;
    }

}
