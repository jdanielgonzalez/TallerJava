package Ejercicio14;

import java.util.Scanner;

public class Punto14
{
    public Punto14()
    {
        int n;
        Scanner entrada = new Scanner(System.in);

        do
        {
            System.out.print("ingrese un numero: ");
            n = Integer.parseInt(entrada.nextLine());
            int c=0;
            if(n<1000 && n>=0)
            {
                for(int i = n; i<=1000; i=i+2)
                {
                    c=c+1;
                    System.out.print(i+" ");
                    if(c==30)
                    {
                        System.out.println("");
                        c=0;
                    }
                }
                System.out.println("");
            }
            if(n>=1000)
            {
                System.out.println("numero ingresado mayor a 1000");
            }
            if(n<0)
            {
                System.out.println("numero ingresado negativo");
            }
        }
        while(n<0 || n>1000);
    }
}
