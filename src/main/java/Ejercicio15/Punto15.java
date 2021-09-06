package Ejercicio15;

import java.util.Scanner;

public class Punto15
{
    public Punto15()
    {
        Scanner entrada = new Scanner(System.in);
        this.menu();
        int op=0;
        do
        {
            System.out.print("seleccione una opcion: ");
            op=Integer.parseInt(entrada.nextLine());
            if(op<8 && op>0)
            {
                this.menu();
            }
            else if(op>8 || op<0){System.out.println("opcion incorrecta.");}
            else if(op==8){System.out.println("Saliendo!");}
        }
        while (op!=8);
    }
    public void menu()
    {
        System.out.println("****** GESTION CINEMATOGRÁFICA ********\n" +
                "1-NUEVO ACTOR\n" +
                "2-BUSCAR ACTOR\n" +
                "3-ELIMINAR ACTOR\n" +
                "4-MODIFICAR ACTOR\n" +
                "5-VER TODOS LOS ACTORES\n" +
                "6- VER PELICULAS DE LOS ACTORES\n" +
                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                "8-SALIR");
    }
}
