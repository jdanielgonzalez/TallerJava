package Ejercicio18;

public class Serie implements Entregable{

    private static final int TEMPORADA_BASE = 3;
    private static final boolean ENTREGADO_BASE = false;
    private String titulo;
    private int numero_temporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    public Serie(String titulo, int numero_temporadas, String genero, String creator){
        this(titulo, creator);
        this.numero_temporadas = numero_temporadas;
        this.genero = genero;
    }

    public Serie(String titulo, String creador){
        this();
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(){
        this.titulo = "";
        this.numero_temporadas = TEMPORADA_BASE;
        this.entregado = ENTREGADO_BASE;
        this.genero = "";
        this.creador = "";
    }

    public int getNumero_Temporadas() {
        return numero_temporadas;
    }

    public void setNumero_Temporadas(int numero_temporadas) {
        this.numero_temporadas = numero_temporadas;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Nombre de la serie: '" + titulo + '\'' +
                "\n Número de temporadas: " + numero_temporadas +
                "\n Entregado: " + entregado +
                "\n Genero='" + genero + '\'' +
                "\n Creador='" + creador + '\'';
    }

    @Override
    public void entregar(){
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
        boolean valueReturn;
        if(this.getNumero_Temporadas() > ((Serie)a).getNumero_Temporadas()){
            valueReturn = true;
        }
        else{
            valueReturn = false;
        }
        return valueReturn;
    }
}
