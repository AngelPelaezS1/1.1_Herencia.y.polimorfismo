package Nivell_1_exercici_1;

public class Cuerda extends Instrumento{
    public Cuerda(String nombre, Integer precio) {
        super(nombre, precio);
    }

    void tocar() {
        System.out.println("Se esta tocando un instrumento de cuerda");
    }
}

