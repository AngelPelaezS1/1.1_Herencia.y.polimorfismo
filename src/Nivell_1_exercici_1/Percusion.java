package Nivell_1_exercici_1;

public class Percusion extends Instrumento{
    public Percusion(String nombre, Integer precio) {
        super(nombre, precio);
    }

    void tocar() {
        System.out.println("Se esta tocando un instrumento de percusion.");
    }
}
