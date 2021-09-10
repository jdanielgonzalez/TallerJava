package Ejercicio17;

import Ejercicio16.Persona;

import java.util.ArrayList;
import java.util.List;


public class Ejecutable extends Electrodomestico
{
    private List<Electrodomestico> lista;

    public Ejecutable()
    {
        //creo los electrodomesticos
        Electrodomestico lg1 = new Electrodomestico();
        Electrodomestico lg2 = new Electrodomestico();
        Electrodomestico lg3 = new Electrodomestico(90,70);
        Electrodomestico lg4 = new Electrodomestico(150,"blanco",'a',25);

        //creo las lavadoras
        Lavadora lav1 =new Lavadora(300,"gris",'A',250,50);
        Lavadora lav2 =new Lavadora(500,15);
        Lavadora lav3 =new Lavadora();

        //cre la television
        Television tv1 = new Television();
        Television tv2 = new Television(100,10);
        Television tv3 = new Television(1000,"gris",'A',72,250,true);

        lista=new ArrayList<>();
        lista.add(lg1);
        lista.add(lg2);
        lista.add(lg3);
        lista.add(lg4);
        lista.add(lav1);
        lista.add(lav2);
        lista.add(lav3);
        lista.add(tv1);
        lista.add(tv2);
        lista.add(tv3);

        precioFinal();
    }


    public void precioFinal(){

        double total_tv=0;
        double total_lav= 0;
        double total_ele=0;

        int contador_tv=0;
        int contador_lav=0;
        int contador_ele=0;

        for (int i = 0;i<this.lista.size();i++){
            if(lista.get(i) instanceof Lavadora)
            {
                contador_lav+=1;
                total_lav+=lista.get(i).precio;
            }

            else if(lista.get(i) instanceof Television)
            {
                contador_tv += 1;
                total_tv += lista.get(i).precio;
            }

            else if(lista.get(i) instanceof Electrodomestico)
            {
                contador_ele += 1;
                total_ele += lista.get(i).precio;
            }
        }

        System.out.println("Se compraron: "+contador_ele+" Electrodomesticos: "+total_ele+"$");
        System.out.println("Se compraron "+contador_lav+" Lavadoras: "+total_lav+"$");
        System.out.println("Se compraron "+contador_tv+" Televisores por una suma de: "+total_tv+"$");
        double TOTAL= total_ele + total_lav+ total_tv;
        System.out.println("TOTAL: "+TOTAL+"$");
    }



}
