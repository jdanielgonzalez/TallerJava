package Ejercicio11;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Punto11
{

    String t;
    Scanner entrada = new Scanner(System.in);

    public Punto11()
    {
        System.out.print("ingrese una frase:");
        t = entrada.nextLine();
        t = t.toLowerCase();
        System.out.println("la longitud es: "+t.length());
        int vocales[]={0,0,0,0,0};
        for(int i=0;i<t.length();i++)
        {
            if (t.charAt(i) == 'a') {vocales[0]=vocales[0]+1;}
            if (t.charAt(i) == 'e') {vocales[1]=vocales[1]+1;}
            if (t.charAt(i) == 'i') {vocales[2]=vocales[2]+1;}
            if (t.charAt(i) == 'o') {vocales[3]=vocales[3]+1;}
            if (t.charAt(i) == 'u') {vocales[4]=vocales[4]+1;}
        }
        System.out.println("el numero de vocales son:");
        System.out.println("a = "+vocales[0]);
        System.out.println("e = "+vocales[1]);
        System.out.println("i= "+vocales[2]);
        System.out.println("o = "+vocales[3]);
        System.out.println("u = "+vocales[4]);

    }
}
