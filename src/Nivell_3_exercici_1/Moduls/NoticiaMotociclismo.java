package Nivell_3_exercici_1.Moduls;

import java.util.ArrayList;

public class NoticiaMotociclismo extends Noticia{

    private String equipo;

    public NoticiaMotociclismo(String titular, String texto, int puntuacion, int precio, ArrayList<Noticia> equipo) {
        super(titular, texto, puntuacion, precio);
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public float calcularPrecioNoticia(){
        float precio = 100;

        if(equipo.equalsIgnoreCase("Honda") || equipo.equalsIgnoreCase("Yamaha")){
            this.precio += 50;
        }
        return precio;
    }

    public float calcularPuntosNoticia(){
        float puntuacion = 3;

        if(equipo.equalsIgnoreCase("Honda") || equipo.equalsIgnoreCase("Yamaha")){
            this.puntuacion += 3;
        }
        return puntuacion;

    }

    @Override
    public String toString() {
        return "NoticiaMotociclismo{" +
                "equipo='" + equipo + '\'' +
                '}';
    }
}
