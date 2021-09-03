package Ejercicio5;

public class Punto5 {

    int i=0;
    int c=0;
    boolean par=false;

    public Punto5()
    {
        while (i<100)
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

    }

}
