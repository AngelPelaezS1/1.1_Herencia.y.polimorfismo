package Nivell_1_exercici_1;

public class Viento extends Instrumento{
    public Viento(String nombre, Integer precio) {
        super(nombre, precio);
    }

    void tocar() { System.out.println("Se esta tocando un instrumento de viento.");
    }
}
