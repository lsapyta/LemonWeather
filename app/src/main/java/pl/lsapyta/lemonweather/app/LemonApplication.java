package pl.lsapyta.lemonweather.app;

import android.app.Application;

import pl.lsapyta.lemonweather.app.di.ApplicationComponent;
import pl.lsapyta.lemonweather.app.di.DaggerApplicationComponent;

public class LemonApplication extends Application
{
    ApplicationComponent appComponent;
    @Override
    public void onCreate()
    {
        super.onCreate();
        appComponent = DaggerApplicationComponent.create();
    }

    public ApplicationComponent getAppComponent()
    {
        return appComponent;
    }

}
