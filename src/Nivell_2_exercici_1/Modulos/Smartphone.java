package Nivell_2_exercici_1.Modulos;

public class Smartphone extends Telefono implements Camara,Reloj {

    public Smartphone(String marca, String modelo) {
        super(marca, modelo);
    }

    public void fotografiar() {
        System.out.println("Se esta haciendo una foto");
    }

    public void alarma() {
        System.out.println("Esta sonando la alrma");

    }
}
