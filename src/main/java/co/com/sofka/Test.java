package co.com.sofka;

import Ejercicio1.Punto1;
import Ejercicio3.Punto3;
import Ejercicio4.Punto4;
import Ejercicio5.Punto5;
import Ejercicio6.Punto6;
import Ejercicio11.Punto11;

import java.util.Locale;
import java.util.Scanner;

public class Test {
    //funcion para saber si se ingresa algo diferente a un numero.
    public static boolean isNumeric(String cadena)
    {
        boolean resultado;
        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }
        return resultado;
    }

    public static void main(String[] args)
    {
        //incializamos variables
        int op=0;
        int numero=0;
        Scanner entrada= new Scanner(System.in);
        String ejercicio = "";

        while(op==0)
        {
            System.out.print("Selecione un ejercicio por favor o 0 para salir: ");
            ejercicio = entrada.nextLine();
            while(isNumeric(ejercicio)==false)
            {
                System.out.println("no se ha ingresado un numero.");
                System.out.print("Selecione un ejercicio por favor: ");
                entrada= new Scanner(System.in);
                ejercicio = entrada.nextLine();
            }

            switch (ejercicio)
            {
                case "1":
                    System.out.println("ingreso al ejercicio 1");
                    Punto1 ejemplo= new Punto1(10,8);
                    ejemplo.compararNumeros();
                    break;

                case "2":
                    int a;
                    int b;
                    System.out.println("ingreso al ejercicio 2");
                    System.out.print("ingrese el primer numero:");
                    a=Integer.parseInt(entrada.nextLine());
                    System.out.print("ingrese el segundo numero:");
                    b=Integer.parseInt(entrada.nextLine());
                    Punto1 ejm= new Punto1();
                    ejm.compararNumeros(a,b);

                    break;
                case "3":
                    System.out.println("ingreso al ejercicio 3");
                    System.out.print("ingrese el radio: ");

                    double r;
                    double area;

                    r = Double.parseDouble(entrada.nextLine());
                    Punto3 circulo = new Punto3(r);
                    area=circulo.calcularArea();

                    System.out.println("el area de un circulo de radio: "+r+" es: "+area);
                    break;

                case "4":
                    System.out.println("ingreso al ejercicio 4");
                    Punto4 valor = new Punto4();
                    valor.calcularPrecio();
                    break;

                case "5":
                    System.out.println("ingreso al ejercicio 5");
                    Punto5 w = new Punto5();
                    break;

                case "6":
                    System.out.println("ingreso al ejercicio 6");
                    Punto6 f = new Punto6();
                    break;

                case "7":
                    System.out.println("ingreso al ejercicio 7");
                    double n;
                    do
                    {
                        System.out.print("ingrese un numero: ");
                        n = Double.parseDouble(entrada.nextLine());
                        if(n>=0){System.out.println("el numero ingresado es "+n);}
                    }
                    while (n<0);
                    break;

                case "8":
                    System.out.println("ingreso al ejercicio 8");
                    String semanalaboral="lunes martes miercoles jueves viernes";
                    String finsemana="sabado domingo";
                    System.out.print("ingrese un dia de la semana: ");
                    String dia;

                    do
                    {
                        dia = entrada.nextLine();
                        dia = dia.toLowerCase();
                        if (semanalaboral.contains(dia)) {
                            System.out.println("es una dia laboral");
                        }
                        if (finsemana.contains(dia)) {
                            System.out.println("no es un dia laboral");
                        }
                        if (!semanalaboral.contains(dia) && !finsemana.contains(dia))
                            {
                                System.out.println("no se ingreso un dia valido");
                                System.out.print("ingrese un dia de la semana: ");
                            }
                    }
                    while(!semanalaboral.contains(dia) && !finsemana.contains(dia));

                    break;

                case "9":
                    System.out.println("ingreso al ejercicio 9");
                    String texto = "La sonrisa sera la mejor arma contra la tristeza";
                    System.out.println(texto);
                    System.out.println("cambio de todas letras a por e");
                    texto=texto.replaceAll("a","e");
                    System.out.println(texto);

                    System.out.print("ingrese lo que quiera concatenar al texto anterior: ");
                    String t = entrada.nextLine();
                    texto=texto.concat(" ");
                    texto=texto.concat(t);
                    System.out.println(texto);

                    break;

                case "10":
                    System.out.println("ingreso al ejercicio 10");
                    System.out.print("ingrese un texto: ");
                    t = entrada.nextLine();
                    t=t.replaceAll(" ","");
                    System.out.println("texto sin espacios: "+t);
                    break;

                case "11":
                    System.out.println("ingreso al ejecicio 11");
                    Punto11 p11 =new Punto11();
                    break;


                case "0":
                    System.out.println("Programa finalizado!");
                    op=1;
                    break;
            }
        }
    }
}
