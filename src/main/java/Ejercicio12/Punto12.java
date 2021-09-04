package Ejercicio12;

import java.util.ArrayList;
import java.util.Scanner;

public class Punto12
{
    public Punto12()
    {
        String palabra1;
        String palabra2;
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese la primera palabra: ");
        palabra1=entrada.nextLine();
        System.out.print("ingrese la segunda palabra: ");
        palabra2=entrada.nextLine();
        ArrayList diferencias= new ArrayList();

        int n=0;
        if(palabra1.length()>=palabra2.length()){n=palabra1.length();}
        if(palabra1.length()<palabra2.length()){n=palabra2.length();}

        if(palabra1==palabra2){System.out.println("las palabras son iguales");}

        if(palabra1!=palabra2)
        {
            System.out.println("las palabras son diferentes");
            if(palabra1.length()!=palabra2.length())
            {
                System.out.println("difieren en sus longitudes");
                for(int i=0;i<n;i++)
                {
                    if (palabra1.charAt(i) != palabra2.charAt(i))
                    {
                        System.out.println("en la letra numero: "+(i+1)+" las letas son "+palabra1.charAt(i)+"-"+palabra2.charAt(i));
                    }
                }
            }

            if(palabra1.length()==palabra2.length())
            {
                for(int i=0;i<palabra2.length();i++)
                {
                    if (palabra1.charAt(i) != palabra2.charAt(i))
                    {
                        System.out.println("en la letra numero: "+(i+1)+" las letas son "+palabra1.charAt(i)+"-"+palabra2.charAt(i));
                    }
                }
            }
        }
    }
}
