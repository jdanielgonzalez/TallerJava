package Ejercicio17;

import java.util.ArrayList;

public class Electrodomestico
{
    //constantes
     private static final double PRECIO_BASE = 100;
     private static final String COLOR_BASE = "blanco";
     private static final char COMSUMO_BASE = 'f';
     private static final double PESO_BASE = 5;
     //variables
     double precio;
     String color;
     char consumo;
     double peso;
     // string que contiene todos los colores

     String[] colores = {"rojo","negro","azul","gris"};

     String lista_consumos= "a b c d e";

    public Electrodomestico()
    {
        this.precio=PRECIO_BASE;
        this.color=COLOR_BASE;
        this.consumo=COMSUMO_BASE;
        this.peso=PESO_BASE;
    }

    public Electrodomestico(double precio, double peso)
    {
        this.precio=precio;
        this.color=COLOR_BASE;
        this.consumo=COMSUMO_BASE;
        this.peso=peso;
    }

    public Electrodomestico(double precio, String color, char consumo, double peso)
    {
        this.precio=precio;
        this.color=color;
        this.consumo=consumo;
        this.peso=peso;
        this.comprobarConsumoEnergetico(this.consumo);
        this.comprobarColor(this.color);
    }

    private void comprobarConsumoEnergetico(char letra)
    {
        this.consumo=letra;
        this.consumo=Character.toLowerCase(this.consumo);
        if( !this.lista_consumos.contains( Character.toString(this.consumo) ) )this.consumo='f';
    }

    private void comprobarColor(String color)
    {
        this.color=color;
        this.color=this.color.toLowerCase();
        boolean color_allow=true;
        int i=0;
        while (color_allow && i<colores.length)
        {
            if(this.color.equals(colores[i])) {
                color_allow = false;
            }
            i++;
        }
        if(color_allow==true)this.color="blanco";
    }

    public void precioFinal()
    {
        if(this.consumo=='a')this.precio+=100;
        if(this.consumo=='b')this.precio+=80;
        if(this.consumo=='c')this.precio+=60;
        if(this.consumo=='d')this.precio+=50;
        if(this.consumo=='e')this.precio+=30;
        if(this.consumo=='f')this.precio+=10;

        if(this.peso>=0 && this.peso<=19)this.precio+=10;
        if(this.peso>=20 && this.peso<=49)this.precio+=50 ;
        if(this.peso>=50 && this.peso<=79)this.precio+=80 ;
        if(this.peso>=80)this.precio+=100 ;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precio=" + precio +
                ", color='" + color + '\'' +
                ", consumo=" + consumo +
                ", peso=" + peso +
                '}';
    }

    public static double getPRECIO_BASE() {
        return PRECIO_BASE;
    }

    public static String getCOLOR_BASE() {
        return COLOR_BASE;
    }

    public static char getCOMSUMO_BASE() {
        return COMSUMO_BASE;
    }

    public static double getPESO_BASE() {
        return PESO_BASE;
    }

    public double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public char getConsumo() {
        return consumo;
    }

    public double getPeso() {
        return peso;
    }


}
