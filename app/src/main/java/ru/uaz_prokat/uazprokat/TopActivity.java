package ru.uaz_prokat.uazprokat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top);

        String[] names = new String[Service.services.length];
        for (int i = 0; i < names.length; i++) {
            names[i] = Service.services[i].getValue("name");
        }

        ListView listView = (ListView)findViewById(R.id.listServices);
        ArrayAdapter<String> adapterServices = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
        listView.setAdapter(adapterServices);
    }
}
