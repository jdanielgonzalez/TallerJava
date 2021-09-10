package co.com.sofka;

import Ejercicio1.Punto1;
import Ejercicio17.Lavadora;
import Ejercicio3.Punto3;
import Ejercicio4.Punto4;
import Ejercicio5.Punto5;
import Ejercicio6.Punto6;
import Ejercicio11.Punto11;
import Ejercicio14.Punto14;
import Ejercicio15.Punto15;
import Ejercicio16.Persona;
import Ejercicio17.Electrodomestico;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

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

                case "12":
                    System.out.println("ingreso al ejercicio 12");
                    break;

                case "13":
                    System.out.println("ingreso al ejercicio 13");
                    DateTimeFormatter fecha = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    System.out.println(fecha.format(LocalDateTime.now()));
                    break;

                case "14":
                    System.out.println("ingreso al ejercicio 14");
                    Punto14 punto14 = new Punto14();
                    break;

                case "15":
                    System.out.println("ingro al ejercicio 15");
                    Punto15 p15 = new Punto15();
                    break;

                case "16":
                    System.out.println("ingreso al ejercicio 16");
                    //solicito los datos
                    System.out.println("ingrese el nombre: ");
                    String nombre=entrada.nextLine();
                    System.out.println("ingrese la edad: ");
                    int edad=Integer.parseInt(entrada.nextLine());
                    System.out.println("ingrese su sexo (H o M): ");
                    String sexo=entrada.nextLine();
                    System.out.println("ingrese su peso en kg: ");
                    double peso = Double.parseDouble(entrada.nextLine());
                    System.out.println("ingrese su altura en centrimetros: ");
                    double altura = Double.parseDouble(entrada.nextLine());

                    //creo las tres personas
                    Persona persona1 = new Persona(nombre,edad,sexo, peso,altura);

                    Persona persona2 = new Persona(nombre,edad,sexo);
                    persona2.setPeso(55);
                    persona2.setAltura(190);

                    Persona defecto = new Persona();
                    defecto.setNombre("Defecto");
                    defecto.setEdad(40);
                    defecto.setSexo("H");
                    defecto.setPeso(70);
                    defecto.setAltura(170);

                    //creo una lista de la clase perosnas
                    ArrayList<Persona> lista = new ArrayList();
                    //agrego a las 3 personas a la lista
                    lista.add(persona1);
                    lista.add(persona2);
                    lista.add(defecto);

                    //muestro como la persona esta con su peso y si es mayor de edad
                    for(int i=0;i<3;i++)
                    {
                        if(lista.get(i).CalcularIMC()==-1)
                        {
                            System.out.println(lista.get(i).getNombre()+" esta por debajo de su peso ideal");
                        }

                        else if(lista.get(i).CalcularIMC()==0)
                        {
                            System.out.println(lista.get(i).getNombre()+" esta en su peso ideal");
                        }

                        else if(lista.get(i).CalcularIMC()==1)
                        {
                            System.out.println(lista.get(i).getNombre()+" esta con sobre peso");
                        }
                        if(lista.get(i).esMAyorDeEdad()==true)
                        {
                            System.out.println(lista.get(i).getNombre()+" es mayor de edad");
                        }

                        if(lista.get(i).esMAyorDeEdad()==false)
                        {
                            System.out.println(lista.get(i).getNombre()+" es menor de edad");
                        }
                        System.out.println("");
                    }
                    //muestro todos los datos de las personas
                    for(int i=0;i<3;i++)
                    {
                        System.out.println(lista.get(i).toString());
                    }
                    break;


                case "17":
                    System.out.println("ingreso al punto 17");
                    Electrodomestico lg1 = new Electrodomestico();
                    Electrodomestico lg2 = new Electrodomestico(150,20);
                    Electrodomestico lg3 = new Electrodomestico(125, "azul",'b',30);

                    Lavadora lava1 = new Lavadora(700,40);


                case "0":
                    System.out.println("Programa finalizado!");
                    op=1;
                    break;
            }
        }
    }
}
