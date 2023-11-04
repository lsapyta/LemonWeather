package pl.lsapyta.lemonweather.app.di;

import javax.inject.Singleton;

import dagger.Component;
import pl.lsapyta.lemonweather.app.di.modules.AppModule;
import pl.lsapyta.lemonweather.app.di.modules.DataStoreModule;
import pl.lsapyta.lemonweather.app.di.modules.NetworkModule;
import pl.lsapyta.lemonweather.app.di.modules.weatherapi.WeatherApiModule;
import pl.lsapyta.lemonweather.app.features.main.MainActivity;


@Singleton
@Component(modules = {
        AppModule.class,
        NetworkModule.class,
        WeatherApiModule.class,
        DataStoreModule.class,
})
public interface ApplicationComponent
{
    void inject(MainActivity mainActivity);
}
