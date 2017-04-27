package ru.uaz_prokat.uazprokat;

import android.widget.ImageView;

/**
 * Created by mrlex on 27.04.17.
 */

public class Service {
    private String name;
    private String desc;

    final static Service[] services = new Service[] {
            new Service("Аренда с водтелем", "Аренда автомобиля с водителем"),
            new Service("Аренда без водителя", "Аренда автомобиля без водителя")
    };

    public Service(String name, String desc){
        this.name = name;
        this.desc = desc;
    }

    public String getValue(String n){
        String s = "";
        switch (n){
            case ("name") : s = this.name;
            case ("desc") : s = this.desc;
        }
        return s;
    }
}
