package com.example.whatsapp.Adaptadores;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.whatsapp.Contacto;
import com.example.whatsapp.R;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AdaptadorLlamadas extends ArrayAdapter<Contacto> {
    private Context context ;
    private ArrayList<Contacto> arrayContacto;

    public AdaptadorLlamadas(@NonNull Context context, ArrayList<Contacto> resource) {
        super(context, R.layout.layout_list_llamadas, resource);
        this.context = context;
        this.arrayContacto = resource;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.layout_list_llamadas, null);

        Contacto contacto = arrayContacto.get(position);

        ImageView imageView = item.findViewById(R.id.imageView);
        imageView.setImageResource(contacto.getImageResource());

        TextView tvNombre = item.findViewById(R.id.tvNombre);
        tvNombre.setText(contacto.getNombre());

        TextView tvEstado = item.findViewById(R.id.tvEstado);
        tvEstado.setText(contacto.getEstado());

        ImageView imageView2 = item.findViewById(R.id.imageView2);
        imageView.setImageResource(contacto.getImageResource());


        item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });

        return item;
    }
}