package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal{

    private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil (){
        this(null,0,null,null,null,0);
    }

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        listado.add(this);
    }

    public static ArrayList<Reptil> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Reptil> listado) {
        Reptil.listado = listado;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getLargoCola() {
        return largoCola;
    }

    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }

    public static int cantidadReptiles(){
        return listado.size();
    }

    public String movimiento(){
        return "reptar";
    }

    public static Reptil crearIguana(String nombre, int edad, String genero){
        Reptil reptil = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
        iguanas ++;
        return reptil;
    }

    public static Reptil crearSerpiente(String nombre, int edad, String genero){
        Reptil reptil = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
        serpientes ++;
        return reptil;
    }




}
