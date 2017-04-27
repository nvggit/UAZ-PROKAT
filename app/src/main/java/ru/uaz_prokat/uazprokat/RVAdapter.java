package ru.uaz_prokat.uazprokat;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mrlex on 27.04.17.
 */

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.CarViewHolder> {

    public static class CarViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView carName;
        TextView carDesc;
        ImageView carPhoto;

        CarViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.cv);
            carName = (TextView) itemView.findViewById(R.id.car_name);
            carDesc = (TextView) itemView.findViewById(R.id.car_desc);
            carPhoto = (ImageView) itemView.findViewById(R.id.car_photo);
        }
    }

    Car[] cars;
    RVAdapter(Car[] cars){
        this.cars = cars;
    }

    @Override
    public int getItemCount() {
        return cars.length;
    }

    @Override
    public CarViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.car, viewGroup, false);
        CarViewHolder pvh = new CarViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(CarViewHolder carViewHolder, int i) {
        carViewHolder.carName.setText(cars[i].name);
        carViewHolder.carDesc.setText(cars[i].desc);
        //personViewHolder.carPhoto.setImageResource(cars.get(i).photoId);
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
