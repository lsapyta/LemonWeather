package pl.lsapyta.lemonweather.app.di;

import dagger.Component;
import pl.lsapyta.lemonweather.app.di.modules.WeatherApiModule;
import pl.lsapyta.lemonweather.app.features.main.MainActivity;

@Component(modules = WeatherApiModule.class
)
public interface ApplicationComponent
{
    void inject(MainActivity mainActivity);
}
