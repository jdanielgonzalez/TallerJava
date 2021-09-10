package Ejercicio17;

public class Lavadora extends Electrodomestico{

    private static final double carga_base=5;
    double carga;
    public Lavadora()
    {
        precioFinal();
    }

    public Lavadora(double precio, double peso)
    {
        super(precio, peso);
        precioFinal();
    }

    public Lavadora(double precio, String color, char consumo, double peso, double carga)
    {
        super(precio, color, consumo, peso);
        this.carga=carga;
        precioFinal();
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public void precioFinal()
    {
        super.precioFinal();
        if(this.carga>30)
        {
            this.precio+=50;
        }
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "precio=" + precio +
                ", color='" + color + '\'' +
                ", consumo=" + consumo +
                ", peso=" + peso +
                ", carga=" + carga ;
    }
}
