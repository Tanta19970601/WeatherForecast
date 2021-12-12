package ru.tauson.weatherforecast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView temperature;
    TextView weather;
    Spinner day_of_week;
    ImageView image_weather;
    RecyclerView list_weather_day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        temperature = findViewById(R.id.temperature);
        weather = findViewById(R.id.weather);
        day_of_week = findViewById(R.id.day_of_week);
        image_weather = findViewById(R.id.image_weather);
        list_weather_day = findViewById(R.id.list_weather_day);


    }
}