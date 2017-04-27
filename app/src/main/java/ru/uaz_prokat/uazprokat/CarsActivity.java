package ru.uaz_prokat.uazprokat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

public class CarsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cars);

        RecyclerView rv = (RecyclerView)findViewById(R.id.activity_cars);

        RVAdapter adapterCars = new RVAdapter(Car.cars);
        rv.setAdapter(adapterCars);
    }
}
