package pl.lsapyta.lemonweather.bl.dataprovider;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringDef;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.rxjava2.RxDataStore;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

import io.reactivex.Single;

public class DataStoreProvider
{
    @StringDef(value = {
            DataStoreKeys.TEST
    })
    @Retention(RetentionPolicy.SOURCE)
    public @interface DataStoreKeys
    {
        String TEST = "TEST";
    }


    public static final String EMPTY_VALUE = "null";

    RxDataStore<Preferences> dataStoreRx;

    Preferences pref_error = new Preferences() {
        @Override
        public <T> boolean contains(@NonNull Key<T> key) {
            return false;
        }

        @Nullable
        @Override
        public <T> T get(@NonNull Key<T> key) {
            return null;
        }

        @NonNull
        @Override
        public Map<Key<?>, Object> asMap() {
            return null;
        }
    };

    public DataStoreProvider(RxDataStore<Preferences> dataStoreRx)
    {
        this.dataStoreRx = dataStoreRx;
    }

    public boolean putStringValue(@DataStoreKeys String Key, String value)
    {
        boolean returnvalue;
        Preferences.Key<String> PREF_KEY = PreferencesKeys.stringKey(Key);
        Single<Preferences> updateResult =  dataStoreRx.updateDataAsync(prefsIn ->
        {
            MutablePreferences mutablePreferences = prefsIn.toMutablePreferences();
            mutablePreferences.set(PREF_KEY, value);
            return Single.just(mutablePreferences);
        }).onErrorReturnItem(pref_error);
        returnvalue = updateResult.blockingGet() != pref_error;
        return returnvalue;
    }

    public String getStringValue(@DataStoreKeys String Key) {
        Preferences.Key<String> PREF_KEY = PreferencesKeys.stringKey(Key);
        Single<String> value = dataStoreRx.data().firstOrError().map(prefs -> prefs.get(PREF_KEY)).onErrorReturnItem(EMPTY_VALUE);
        return value.blockingGet();
    }

    public boolean isNullOrEmpty(String value)
    {
        return value == null || value.equals(EMPTY_VALUE);
    }

    public boolean hasValue(String value)
    {
        return !isNullOrEmpty(value);
    }

}
