package com.desarrollo.laboratorio2.Fragmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.desarrollo.laboratorio2.Entidad.LoveLiveVo;
import com.desarrollo.laboratorio2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetalleLoveLiveFragment extends Fragment {

    TextView textinfo;
    ImageView imagen;
    ImageView imagen1;
    ImageView imagen2;
    ImageView imagen3;

    public DetalleLoveLiveFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View vista = inflater.inflate(R.layout.fragment_detalle_love_live, container, false);

        textinfo = (TextView) vista.findViewById(R.id.informacion);
        imagen = (ImageView) vista.findViewById(R.id.imageninfo);
        imagen1 = (ImageView) vista.findViewById(R.id.imagen1);
        imagen2 = (ImageView) vista.findViewById(R.id.imagen2);
        imagen3 = (ImageView) vista.findViewById(R.id.imagen3);

        Bundle objLL = getArguments();
        LoveLiveVo misong = null;

        if (objLL != null) {
            misong= (LoveLiveVo) objLL.getSerializable("objeto");
            LlenarInformacion(misong);
        }
        return vista;
    }

    public void LlenarInformacion(LoveLiveVo misong) {
        imagen.setImageResource(misong.getImageninfo());
        textinfo.setText(misong.getInformacion());
        imagen1.setImageResource(misong.getImagen1());
        imagen2.setImageResource(misong.getImagen2());
        imagen3.setImageResource(misong.getImagen3());
    }
}
