package Ejercicio1;

public class Punto1 {

    int num1;
    int num2;

    public Punto1() {
        num1=0;
        num2=0;
    }

    public Punto1(int n1, int n2) {
        num1=n1;
        num2=n2;
    }

    public void compararNumeros()
    {
        if(this.num1>this.num2) {System.out.println(this.num1+" es mayor que "+this.num2);}
        if(this.num1<this.num2) {System.out.println(this.num2+" es mayor que "+this.num1);}
        if(this.num1==this.num2){System.out.println(this.num1+" es igual que "+this.num2);}
    }

    public void compararNumeros(int n1,int n2)
    {
        this.num1=n1;
        this.num2=n2;
        if(this.num1>this.num2) {System.out.println(this.num1+" es mayor que "+this.num2);}
        if(this.num1<this.num2) {System.out.println(this.num2+" es mayor que "+this.num1);}
        if(this.num1==this.num2){System.out.println(this.num1+" es igual que "+this.num2);}
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
