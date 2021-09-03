package Ejercicio4;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Punto4
{
    public Punto4()
    {
        System.out.print("ingrese el precio de un producto: ");
    }

    public void calcularPrecio()
    {
        Scanner entrada = new Scanner(System.in);
        double precio;
        precio=Double.parseDouble(entrada.nextLine());
        precio = precio+precio*21/100;
        System.out.println("El precio total con el IVA incluido es: "+precio);

    }


}
