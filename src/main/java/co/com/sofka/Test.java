package co.com.sofka;

import Ejercicio1.Punto1;
import Ejercicio3.Punto3;
import Ejercicio5.Punto5;

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
                    System.out.print("ingrese el precio de un producto: ");

                    double precio;
                    precio=Double.parseDouble(entrada.nextLine());

                    precio = precio+precio*21/100;
                    System.out.println("El precio total con el IVA incluido es: "+precio);

                    break;

                case "5":
                    System.out.println("ingreso al ejercicio 5");
                    Punto5 w = new Punto5();

                    break;

                case "6":
                    System.out.println("ingreso al ejercicio 6");
                    int c=0;
                    int i=0;
                    boolean par=false;

                    for (i = 0; i<100; i++)
                    {
                        i=i+1;
                        if(i%2!=0 && !par)
                        {
                            if(i==1){System.out.println("Impares: ");}
                            c=c+1;
                            System.out.print(i+" ");
                            if(c==10){System.out.println("");c=0;}
                            if(i==99){par=true;i=0;}
                        }

                        if(par==true && i%2==0)
                        {
                            if(i==0){System.out.println("Pares: ");}
                            c=c+1;
                            System.out.print(i+" ");
                            if(c==10){System.out.println("");c=0;}
                        }
                    }
                    break;

                case "0":
                    System.out.println("Programa finalizado!");
                    op=1;
                    break;
            }
        }
    }
}
