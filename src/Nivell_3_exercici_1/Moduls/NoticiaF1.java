package Nivell_3_exercici_1.Moduls;

import java.util.ArrayList;

public class NoticiaF1 extends Noticia{

    private String escuderia;

    public NoticiaF1(String titular, String texto, int puntuacion, int precio, String esscuderia, ArrayList<Noticia> noticias) {
        super(titular, texto, puntuacion, precio);
        escuderia = esscuderia;
    }

    public String getEsscuderia() {
        return escuderia;
    }

    public void setEsscuderia(String esscuderia) {
        escuderia = esscuderia;
    }

    public float calcularPrecioNoticia(){
        float precio = 100;

        if(escuderia.equalsIgnoreCase("Ferrari") || escuderia.equalsIgnoreCase("Mercedes")){
            this.precio += 50;
        }
        return precio;
    }

    public float calcularPuntosNoticia(){
        float puntuacion = 4;

        if(escuderia.equalsIgnoreCase("Ferrari") || escuderia.equalsIgnoreCase("Mercedes")){
            this.puntuacion += 2;
        }
        return puntuacion;
    }

    @Override
    public String toString() {
        return "NoticiaF1{" +
                "escuderia='" + escuderia + '\'' +
                '}';
    }
}
