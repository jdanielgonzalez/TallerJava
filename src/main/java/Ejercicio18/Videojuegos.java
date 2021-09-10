package Ejercicio18;

public class Videojuegos implements Entregable
{

    private static final int HORAS_BASE = 10;
    private static final boolean ENTREGADO_BASE = false;
    private String titulo;
    private int horas_estimas;
    private boolean entregado;
    private String genero;
    private String compania;


    public Videojuegos(String titulo, int hours, String genero, String compania){
        this(titulo, hours);
        this.genero = genero;
        this.compania = compania;
    }

    public Videojuegos(String titulo, int hours){
        this();
        this.titulo = titulo;
        this.horas_estimas = hours;
    }

    public Videojuegos(){
        this.titulo = "";
        this.horas_estimas = HORAS_BASE;
        this.entregado = ENTREGADO_BASE;
        this.genero = "";
        this.compania = "";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHoras_estimas() {
        return horas_estimas;
    }

    public void setHoras_estimas(int horas_estimas) {
        this.horas_estimas = horas_estimas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return " Titulo del video juego: '" + titulo + '\'' +
                "\n Horas Estimadas: " + horas_estimas +
                "\n Entregado: " + entregado +
                "\n Genero: '" + genero + '\'' +
                ",\n Compañia: '" + compania + '\'';
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }
    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return entregado;
    }

    @Override
    public boolean compareTo(Object a) {
        boolean returnValue;

        if(this.horas_estimas > ((Videojuegos)a).horas_estimas){
            returnValue = true;
        }else{
            returnValue = false;
        }
        return returnValue;
    }
}
