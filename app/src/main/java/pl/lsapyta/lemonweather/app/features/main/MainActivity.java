package pl.lsapyta.lemonweather.app.features.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import pl.lsapyta.lemonweather.app.LemonApplication;
import pl.lsapyta.lemonweatherapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((LemonApplication) getApplication()).getAppComponent().inject(this);
        setContentView(R.layout.activity_main);
    }
}