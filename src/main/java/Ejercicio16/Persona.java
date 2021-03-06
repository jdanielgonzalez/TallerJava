package Ejercicio16;

public class Persona {

    private String nombre;
    private int edad;
    private String DNI;
    private static final String sexo_base="H";
    private String sexo;
    private double peso;
    private double altura;

    public Persona()
    {
        String nombre= "";
        int edad=0;
        this.DNI=this.generaDNI();
        this.sexo=sexo_base;
        double peso=0;
        double altura=0;
    }

    public Persona(String nombre,int edad,String sexo)
    {
        this.nombre=nombre;
        this.edad =edad;
        this.sexo=sexo;
        this.DNI=this.generaDNI();
        this.peso=0;
        this.altura=0;
    }

    public Persona(String nombre,int edad,String sexo,double peso, double altura)
    {
        this.nombre=nombre;
        this.edad =edad;
        this.sexo=sexo;
        this.DNI=this.generaDNI();
        this.peso=peso;
        this.altura=altura;
    }

    public double CalcularIMC()
    {
        int i=0;
        double imc=0;
        imc=this.peso/((this.altura/100)*(this.altura/100));

        if(imc<20)i=-1;

        else if(imc<= 25 && imc>=20)i=0;

        else if(imc>25)i=1;

        return i;
    }

    public boolean esMAyorDeEdad()
    {
        boolean isMayor=false;
        if(this.edad>=18) isMayor=true;
        else if(this.edad<18)isMayor=false;

        return isMayor;
    }

    @Override
    public String toString() {
        return
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", sexo='" + sexo + '\'' +
                ", peso=" + peso +
                ", altura=" + altura ;
    }

    public String generaDNI()
    {
        int number = (int)(100000000 * Math.random());
        int numero_letra= number % 23;
        String letras= "TRWAGMYFPDXBNJZSQVHLCKE";
        char letra = letras.charAt(numero_letra);
        this.DNI= Integer.toString(number).concat(Character.toString(letra));
        return this.DNI;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDNI() {
        return DNI;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
}
