package Nivell_3_exercici_1.Moduls;

import java.util.ArrayList;

public class NoticiaTenis extends Noticia{


    private String tenista;

    public NoticiaTenis(String titular, String texto, int puntuacion, int precio, String tenista, ArrayList<Noticia> noticias) {
        super(titular, texto, puntuacion, precio);
        this.tenista = tenista;
    }

    public String getTenista() {
        return tenista;
    }

    public void setTenista(String tenista) {
        this.tenista = tenista;
    }

    public float calcularPrecioNoticia(){
        float precio = 150;

        if(tenista.equalsIgnoreCase("Federer") || tenista.equalsIgnoreCase("Nadal") || tenista.equalsIgnoreCase("Djokovic")){
            this.precio += 100;
        }

        return precio;
    }

    public float calcularPuntosNoticia(){
        float puntuacion = 4;

        if(tenista.equalsIgnoreCase("Federer") || tenista.equalsIgnoreCase("Nadal") || tenista.equalsIgnoreCase("Djokovic")){
            this.puntuacion += 3;
        }
        return puntuacion;

    }


    @Override
    public String toString() {
        return "NoticiaTenis{" +
                ", tenista='" + tenista + '\'' +
                '}';
    }
}
