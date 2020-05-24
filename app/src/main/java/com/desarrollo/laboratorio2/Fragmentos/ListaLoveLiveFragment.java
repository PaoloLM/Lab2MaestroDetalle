package com.desarrollo.laboratorio2.Fragmentos;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.desarrollo.laboratorio2.Adaptador.AdaptadorLoveLive;
import com.desarrollo.laboratorio2.Entidad.LoveLiveVo;
import com.desarrollo.laboratorio2.Interfaces.IComFragments;
import com.desarrollo.laboratorio2.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListaLoveLiveFragment extends Fragment {

    ArrayList<LoveLiveVo> ListaLoveLive;
    RecyclerView RecyclerLoveLive;
    Activity activity;
    IComFragments intfragment;

    public ListaLoveLiveFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.fragment_lista_love_live, container, false);

        ListaLoveLive = new ArrayList<>();

        RecyclerLoveLive = vista.findViewById(R.id.recyclerId);
        RecyclerLoveLive.setLayoutManager(new LinearLayoutManager(getContext()));

        LlenarListaLoveLive();

        AdaptadorLoveLive adapter = new AdaptadorLoveLive(ListaLoveLive);
        RecyclerLoveLive.setAdapter(adapter);

        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // ENVIAR LOS DATOS DEL F1 AL F2
                intfragment.enviarLoveLive(ListaLoveLive.get(RecyclerLoveLive.getChildAdapterPosition(view)));
            }
        });

        return vista;
    }

    private void LlenarListaLoveLive() {
        ListaLoveLive.add(new LoveLiveVo(getString(R.string.chika_title), getString(R.string.chika_descripcion), R.drawable.chika_takami_resize, getString(R.string.chika_info), R.drawable.chika_background, R.drawable.chika_i1, R.drawable.chika_i2, R.drawable.chika_i3));
        ListaLoveLive.add(new LoveLiveVo(getString(R.string.eli_title), getString(R.string.eli_descripcion), R.drawable.eli_ayase_resize, getString(R.string.eli_info), R.drawable.eli_background, R.drawable.eli_i1, R.drawable.eli_i2, R.drawable.eli_i1));
        ListaLoveLive.add(new LoveLiveVo(getString(R.string.kotori_title), getString(R.string.kotori_descripcion), R.drawable.kotori_minami_resize, getString(R.string.kotori_info), R.drawable.kotori_background, R.drawable.kotori_i1, R.drawable.kotori_i2, R.drawable.kotori_i3));
        ListaLoveLive.add(new LoveLiveVo(getString(R.string.maki_title), getString(R.string.maki_descripcion), R.drawable.maki_nishikino_resize, getString(R.string.maki_info), R.drawable.maki_background, R.drawable.maki_i1, R.drawable.maki_i2, R.drawable.maki_i3));
        ListaLoveLive.add(new LoveLiveVo(getString(R.string.nozomi_title), getString(R.string.nozomi_descripcion), R.drawable.nozomi_tojo_resize,getString(R.string.nozomi_info), R.drawable.nozomi_background, R.drawable.nozomi_i1, R.drawable.nozomi_i2, R.drawable.nozomi_i3));
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if(context instanceof Activity){
            this.activity= (Activity) context;
            intfragment= (IComFragments) this.activity;
        }
    }
}
