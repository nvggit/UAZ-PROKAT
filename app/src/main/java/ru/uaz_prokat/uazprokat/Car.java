package ru.uaz_prokat.uazprokat;

import android.widget.ImageView;

/**
 * Created by mrlex on 27.04.17.
 */

public class Car {
    String name;
    String desc;
    ImageView photo;

    final static Car[] cars = new Car[] {
            new Car("УАЗ Хантер", "УАЗ Хантер"),
            new Car("УАЗ Буханка", "УАЗ Буханка")
    };

    public Car (String name, String desc) {
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
