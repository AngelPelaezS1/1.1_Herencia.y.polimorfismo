package Nivell_1_exercici_1.Clases;

public class Cuerda extends Instrumento {
    public Cuerda(String nombre, Integer precio) {
        super(nombre, precio);
    }

    public void tocar() {
        System.out.println("Se esta tocando un instrumento de cuerda");
    }
}

