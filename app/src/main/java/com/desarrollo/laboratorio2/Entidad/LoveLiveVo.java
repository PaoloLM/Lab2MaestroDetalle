package com.desarrollo.laboratorio2.Entidad;

import java.io.Serializable;

public class LoveLiveVo implements Serializable {
    private String nombre;
    private String descripcion;
    private int imagen;
    private String informacion;
    private int imageninfo;
    private int imagen1;
    private int imagen2;
    private int imagen3;

    public LoveLiveVo() {

    }

    public LoveLiveVo(String nombre, String descripcion, int imagen, String informacion, int imageninfo, int imagen1, int imagen2, int imagen3) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.informacion = informacion;
        this.imageninfo = imageninfo;
        this.imagen1 = imagen1;
        this.imagen2 = imagen2;
        this.imagen3 = imagen3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public int getImageninfo() {
        return imageninfo;
    }

    public void setImageninfo(int imageninfo) {
        this.imageninfo = imageninfo;
    }

    public int getImagen1() {
        return imagen1;
    }

    public void setImagen1(int imagen1) {
        this.imagen1 = imagen1;
    }

    public int getImagen2() {
        return imagen2;
    }

    public void setImagen2(int imagen2) {
        this.imagen2 = imagen2;
    }

    public int getImagen3() {
        return imagen3;
    }

    public void setImagen3(int imagen3) {
        this.imagen3 = imagen3;
    }
}
