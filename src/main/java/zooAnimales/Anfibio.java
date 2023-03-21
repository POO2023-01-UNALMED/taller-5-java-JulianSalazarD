package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {

    private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio(){
        this(null,0,null,null,null,false);
    }

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        listado.add(this);
    }

    public static int cantidadAnfibios(){
        return listado.size();
    }

    public static ArrayList<Anfibio> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Anfibio> listado) {
        Anfibio.listado = listado;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    public String  movimiento(){
        return "saltar";
    }

    public static Anfibio crearRana(String nombre, int edad, String genero){
        Anfibio anfibio = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
        ranas ++;
        return anfibio;
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero){
        Anfibio anfibio = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
        salamandras ++;
        return anfibio;
    }

}
