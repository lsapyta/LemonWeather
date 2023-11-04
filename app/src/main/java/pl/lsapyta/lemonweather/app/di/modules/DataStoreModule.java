package pl.lsapyta.lemonweather.app.di.modules;

import android.app.Application;

import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.rxjava2.RxPreferenceDataStoreBuilder;
import androidx.datastore.rxjava2.RxDataStore;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import pl.lsapyta.lemonweather.bl.dataprovider.DataStoreProvider;

@Module
public class DataStoreModule
{
    private final String tagStoreName;
    public DataStoreModule(String tagStoreName)
    {
        this.tagStoreName = tagStoreName;
    }

    @Provides
    @Singleton
    DataStoreProvider providerDataStoreProvider(Application application)
    {
        RxDataStore<Preferences> dataStoreRx = new RxPreferenceDataStoreBuilder(application, tagStoreName).build();
        return new DataStoreProvider(dataStoreRx);
    }

}
