package gestion;

import java.util.ArrayList;

public class Zoologico {
    //atributos
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zona = new ArrayList<Zona>();

    public Zoologico() {
        this(null,null);
    }

    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Zona> getZona() {
        return zona;
    }

    public void setZona(ArrayList<Zona> zona) {
        this.zona = zona;
    }

    public void agregarZonas(Zona zona){
        this.zona.add(zona);
    }
    public int cantidadTotalAnimales(){
        int total = 0;
        for(Zona zona : this.zona){
            total += zona.cantidadAnimales();
        }
        return total;
    }
}
