package Nivell_2_exercici_1.Modulos;

public class Telefono {

    private String marca;
    private String modelo;

    public Telefono(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void llamar(String numeroTelefono){
        System.out.println("Estas llamando al " +numeroTelefono);
    }
    }
