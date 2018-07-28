package com.duvanez7.myupbutton;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

import java.util.ArrayList;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.imageViewHolder> {
    ArrayList<ImageReciver> imageReciverArray;
    Activity activity;




    //Constructor
    public ImageAdapter(ArrayList<ImageReciver> imageAdapterArray, Activity activity) {
        this.imageReciverArray = imageAdapterArray;
        this.activity = activity;

    }

    @NonNull

    @Override
    // infla y pasa al view holder
    public imageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, parent, false);

        return new imageViewHolder(v);
    }

    // asocia cada elemento de la listaImages con cada view
    @Override
    public void onBindViewHolder(@NonNull final imageViewHolder imageViewHolder, int position) {
        final ImageReciver imageReciver = imageReciverArray.get(position);
        imageViewHolder.imgFoto.setImageResource(imageReciver.getFoto());
        imageViewHolder.tvNombreCv.setText(imageReciver.getNombre());
      imageViewHolder.btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(activity, "aaaa", Toast.LENGTH_SHORT).show();
            }
        });



    }



    @Override
    public int getItemCount() {
        return imageReciverArray.size();
    }

    public static class imageViewHolder extends RecyclerView.ViewHolder {
        //declaramos views

        private ImageView imgFoto;
        private TextView tvNombreCv;
        private ImageButton btnLike;






        public imageViewHolder(View itemView) {
            super(itemView);


            imgFoto = itemView.findViewById(R.id.foto1);
            tvNombreCv = itemView.findViewById(R.id.tvNombre);
            btnLike = itemView.findViewById(R.id.btnLike);



        }

    }

}
