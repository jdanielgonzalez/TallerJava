package Ejercicio17;

import Ejercicio16.Persona;

import java.util.ArrayList;
import java.util.List;


public class Ejecutable extends Electrodomestico
{
    private List<Electrodomestico> lista;
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



}
