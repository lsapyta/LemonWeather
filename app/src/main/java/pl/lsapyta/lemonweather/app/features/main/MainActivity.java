package pl.lsapyta.lemonweather.app.features.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

import javax.inject.Inject;

import pl.lsapyta.lemonweather.app.LemonApplication;
import pl.lsapyta.lemonweather.bl.datastoreprovider.DataStoreProvider;
import pl.lsapyta.lemonweather.bl.datastoreprovider.DataStoreProvider.DataStoreKeys;
import pl.lsapyta.lemonweather.bl.retrofit.weatherapi.OpenWeatherApiInterface;
import pl.lsapyta.lemonweatherapp.R;

public class MainActivity extends AppCompatActivity {

    @Inject
    DataStoreProvider dataStoreProvider;

    @Inject
    OpenWeatherApiInterface weatherApi;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        ((LemonApplication) getApplication()).getAppComponent().inject(this);

        setContentView(R.layout.activity_main);

        TextView text = findViewById(R.id.test);
        if(text != null)
        {
            String value;
            value = dataStoreProvider.getStringValue(DataStoreKeys.TEST);
            if(dataStoreProvider.hasValue(value))
            {
                text.setText(value);
            }
            else
            {
                Random rand = new Random();
                int r = rand.nextInt(55) + 1;
                value = String.valueOf(r);
                dataStoreProvider.putStringValue(DataStoreKeys.TEST,value);
                text.setText(value);
            }
        }

    }
}