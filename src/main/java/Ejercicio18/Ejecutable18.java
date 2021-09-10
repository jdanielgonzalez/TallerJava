package Ejercicio18;

import javax.swing.*;

public class Ejecutable18
{
    private static void crearSerie(Serie[] serie){
        serie[0] = new Serie("Better Call Saul", 6, "Drama", "Vince Gilligan");
        serie[1] = new Serie("Bojack Horseman", 6, "Comedia", "Raphael Bob-Waksberg");
        serie[2] = new Serie("Rick Y Morty", 5, "Comedia", "Justin Roiland, Dan Harmon");
        serie[3] = new Serie("the walking dead", 11, "Terror","Frank Darabont");
        serie[4] = new Serie("the office", 9, "Comedia", "Greg Daniels");
    }
    private static void crearVideojuegos(Videojuegos[] videojuegos){
        videojuegos[0] = new Videojuegos("Brawl Stars", 100, "Disparos", "Supercell");
        videojuegos[1] = new Videojuegos("HALO", 22, "Disparos", "Microsoft");
        videojuegos[2] = new Videojuegos("Bioshock", 20, "Terror", "2K Games");
        videojuegos[3] = new Videojuegos("WOW", 300, "Fantasia", "Blizzard");
        videojuegos[4] = new Videojuegos("Spider-Man",80,"aVENTURA", "Insomniac Games");
    }

    private static void entregarSerie(Serie[] serie){
        serie[0].entregar();
        serie[3].entregar();
        serie[4].entregar();
    }

    private static void entregarvideojuegos(Videojuegos[] Videojuegos){
        Videojuegos[1].entregar();
        Videojuegos[4].entregar();
    }

    private static void contadorSerieEntregado(Serie[] serie){
        int numero_series = 0;
        for(Serie s : serie){
            if(s.isEntregado()){
                numero_series++;
                s.devolver();
            }
        }
        System.out.println("Hay " + numero_series + " serie entregadas");
    }

    private static void contadorSerieEntregado(Videojuegos[] videojuegos){
        int numero_videjojuegos = 0;

        for(Videojuegos game : videojuegos){
            if(game.isEntregado()){
                numero_videjojuegos++;
                game.devolver();
            }
        }
        System.out.println("Hay " + numero_videjojuegos + " videojuegos entregados");
    }

    private static void serie_temporada(Serie[] serie){
        Serie serie_temporada = new Serie("temporal", 0, "temporal", "temporal");

        for(int i = 0; i < serie.length; i++){
            if(serie[i].compareTo(serie_temporada)){
                serie_temporada = serie[i];
            }
        }
        System.out.println("La serie con mas horas estimadas es: ");
        System.out.println(serie_temporada);
    }

    private static void horas_videojuegos(Videojuegos[] videojuegos){
        Videojuegos horas_videojuegos = new Videojuegos("Temporal", 0);

        for(Videojuegos juego : videojuegos){
            if(juego.compareTo(horas_videojuegos)){
                horas_videojuegos = juego;
            }
        }
        System.out.println("El video juego con mas horas estimadas es: "+ horas_videojuegos);
    }

    public void Ejecutar() {

        Serie[] serie = new Serie[5];
        Videojuegos[] videojuegos = new Videojuegos[5];
        crearSerie(serie);
        crearVideojuegos(videojuegos);

        entregarSerie(serie);
        entregarvideojuegos(videojuegos);


        contadorSerieEntregado(serie);
        contadorSerieEntregado(videojuegos);
        serie_temporada(serie);
        horas_videojuegos(videojuegos);
    }
}
