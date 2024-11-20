package Nivell_1_exercici_1.Clases;

public abstract class Instrumento {

    private String nombre;
    private Integer precio;

    public Instrumento(String nombre, Integer precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    abstract void tocar();


    public String toString() {
        return "Instrumento{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    static{
        System.out.println("Acceso de miembro estatico");

    }
}
