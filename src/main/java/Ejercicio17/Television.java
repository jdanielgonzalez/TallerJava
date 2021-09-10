package Ejercicio17;

public class Television extends Electrodomestico{

    private static final double resolucion_base = 20;
    private static final boolean TDT_base= false;

    double resolucion;
    boolean TDT;
    public Television() {
        super();
        this.resolucion=resolucion_base;
        this.TDT=TDT_base;
        precioFinal();
    }

    public Television(double precio, double peso) {
        super(precio, peso);
        this.resolucion=resolucion_base;
        this.TDT=TDT_base;
        precioFinal();
    }

    public Television(double precio, String color, char consumo, double peso, double resolucion, boolean TDT)
    {
        super(precio, color,consumo,peso);
        this.resolucion=resolucion;
        this.TDT=TDT;
        precioFinal();
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if(this.resolucion>40){
            this.precio+=this.precio*(30/100);
        }
        if(this.TDT) {
            this.precio += 50;
        }
    }
}
