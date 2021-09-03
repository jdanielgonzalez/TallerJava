package Ejercicio3;
import java.lang.Math;

public class Punto3 {

    double radio;
    double area;

    public Punto3() {
        this.radio = 1;
    }

    public Punto3(double r) {
        this.radio = r;
    }

    public double calcularArea()
    {
        area = Math.PI*Math.pow(radio,2);
        return area;

    }

}
