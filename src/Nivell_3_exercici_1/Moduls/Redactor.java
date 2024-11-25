package Nivell_3_exercici_1.Moduls;

import java.util.ArrayList;

public class Redactor {

    private String nombre;
    private String DNI;
    private static float sueldo = 1500;
    private ArrayList<Noticia> noticias;

    public Redactor(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.noticias = noticias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Noticia> noticias() {
        return noticias;
    }

    public String getDNI() {
        return DNI;
    }

    public void addNoticia(NoticiaFutbol nuevaNoticiaFutbol){

    }

    @Override
    public String toString() {
        return "Redactor{" +
                "nombre='" + nombre + '\'' +
                ", DNI=" + DNI +
                ", sueldo=" + sueldo +
                ", noticias=" + noticias +
                '}';
    }
}
