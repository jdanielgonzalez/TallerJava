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
        String b;
        double precio;
        b=entrada.nextLine();
        while (!isNumeric(b))
        {
            System.out.println("numero ingresado no valido!");
            System.out.print("ingrese el precio de un producto: ");
            b=entrada.nextLine();
            if(isNumeric(b))
            {
                precio=Integer.parseInt(b);
                if(precio<0)
                    System.out.println("Precio no valido!");
                    System.out.print("ingrese el precio de un producto: ");
                    b=entrada.nextLine();
            }
        }

        precio=Integer.parseInt(b);
        precio = precio+precio*21/100;
        System.out.println("El precio total con el IVA incluido es: "+precio);

    }

    public boolean isNumeric(String cadena)
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


}
