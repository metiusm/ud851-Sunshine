package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    private TextView mTextViewWeather;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mTextViewWeather = (TextView) findViewById(R.id.tv_weather_data_detail);

        // TODO (2) Display the weather forecast that was passed from MainActivity
        String weatherData = getIntent().getStringExtra("weather");

        mTextViewWeather.setText(weatherData);
    }
}