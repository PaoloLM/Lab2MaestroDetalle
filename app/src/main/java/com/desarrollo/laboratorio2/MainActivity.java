package com.desarrollo.laboratorio2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.ListFragment;

import android.net.Uri;
import android.os.Bundle;

import com.desarrollo.laboratorio2.Entidad.LoveLiveVo;
import com.desarrollo.laboratorio2.Fragmentos.DetalleLoveLiveFragment;
import com.desarrollo.laboratorio2.Fragmentos.ListaLoveLiveFragment;
import com.desarrollo.laboratorio2.Interfaces.IComFragments;

public class MainActivity extends AppCompatActivity implements IComFragments {

    ListaLoveLiveFragment ListaFragment;
    DetalleLoveLiveFragment DetalleFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (findViewById(R.id.contenedorFragment) != null){
            if (savedInstanceState != null){
                return;
            }

            ListaFragment = new ListaLoveLiveFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFragment, ListaFragment).commit();
        }
    }

    @Override
    public void enviarLoveLive(LoveLiveVo lovelive) {

        DetalleFragment= (DetalleLoveLiveFragment) this.getSupportFragmentManager().findFragmentById(R.id.fragmentoDetalle);

        if (DetalleFragment != null && findViewById(R.id.contenedorFragment) == null) {
            DetalleFragment.LlenarInformacion(lovelive);
        } else {
            DetalleFragment = new DetalleLoveLiveFragment();
            Bundle Frag2 = new Bundle();
            Frag2.putSerializable("objeto", lovelive);
            DetalleFragment.setArguments(Frag2);
            getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFragment, DetalleFragment).addToBackStack(null).commit();
        }
    }
}
