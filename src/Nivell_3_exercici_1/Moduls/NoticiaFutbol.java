package Nivell_3_exercici_1.Moduls;

import java.util.ArrayList;

public class NoticiaFutbol extends Noticia{

    private String competicion;
    private String equipo;
    private String jugador;

    public NoticiaFutbol(String titular, String texto, int puntuacion, int precio, String competicion, String equipo, String jugador, ArrayList<Noticia> noticias) {
        super(titular, texto, puntuacion, precio);
        this.competicion = competicion;
        this.equipo = equipo;
        this.jugador = jugador;
    }




    public String getCompeticion() {
        return competicion;
    }

    public void setCompeticion(String competicion) {
        this.competicion = competicion;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public float calcularPrecioNoticia() {
        float precio = 300;

        if(competicion.equalsIgnoreCase("Champions")){
            this.precio += 100;
        }
        if(equipo.equalsIgnoreCase("Barça") || equipo.equalsIgnoreCase("Madrid")){
            this.precio += 100;
        }
        if(jugador.equalsIgnoreCase("Benzema") || jugador.equalsIgnoreCase("Ferran Torres")){
            this.precio += 50;
        }else{
        }
        return precio;
    }

    public float calcularPuntosNoticia(){
        float puntuacion = 5;

        if (competicion.equalsIgnoreCase("Champions")){
            this.puntuacion += 3;
        }
        if(competicion.equalsIgnoreCase("Liga")){
            this.puntuacion += 2;
        }
        if(equipo.equalsIgnoreCase("Barça") || equipo.equalsIgnoreCase("Madrid")){
            this.puntuacion += 1;
        }
        if(jugador.equalsIgnoreCase("Benzema") || jugador.equalsIgnoreCase("Ferran Torres")){
            this.puntuacion += 1;
        }
        return puntuacion;
    }


    @Override
    public String toString() {
        return "NoticiaFutbol{" +
                "competicion='" + competicion + '\'' +
                ", equipo='" + equipo + '\'' +
                ", jugador='" + jugador + '\'' +
                '}';
    }
}
