package Nivell_3_exercici_1.Moduls;

import java.util.ArrayList;

public class NoticiaBasquet extends Noticia{

    private String competicion;
    private String equipo;

    public NoticiaBasquet(String titular, String texto, int puntuacion, int precio, String competicion, String club, ArrayList<Noticia> noticias) {
        super(titular, texto, puntuacion, precio);
        this.competicion = competicion;
        this.equipo = club;
    }

    public String getCompeticion() {
        return competicion;
    }

    public void setCompeticion(String competicion) {
        this.competicion = competicion;
    }

    public String getClub() {
        return equipo;
    }

    public void setClub(String club) {
        this.equipo = club;
    }

    public float calcularPrecioNoticia(){
        float precio = 250;

        if(competicion.equalsIgnoreCase("Euroliga")){
            this.precio += 75;
        }
        if(equipo.equalsIgnoreCase("Barça") || equipo.equalsIgnoreCase("Madrid")){
            this.precio += 75;
        }
        return precio;
    }

    public float calcularPuntosNoticia(){
        float puntuacion = 4;

        if(competicion.equalsIgnoreCase("Euroliga")){
            this.puntuacion += 3;
        }
        if(competicion.equalsIgnoreCase("ACB")){
            this.puntuacion += 2;
        }
        if(equipo.equalsIgnoreCase("Barça") || equipo.equalsIgnoreCase("Madrid")){
            this.puntuacion += 1;
        }
        return puntuacion;
    }

    @Override
    public String toString() {
        return "NoticiaBasquet{" +
                "competicion='" + competicion + '\'' +
                ", equipo='" + equipo + '\'' +
                '}';
    }
}
