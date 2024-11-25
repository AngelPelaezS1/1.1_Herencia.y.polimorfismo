package Nivell_1_exercici_2.Clases;

public class Coche {

   private static final String marca = "Mercedes";
   private static String modelo;
   private final int potencia;


    public Coche(String modelo, int potencia) {
        this.potencia = potencia;
        this.modelo = modelo;


    }

    public static void frenar() {
        System.out.println("El vehiculo esta frenando");
    }

    public void acelerar(){
        System.out.println("El vehiculo esta acelerando");
    }

    @Override
    public String toString() {
        return "Coche{" +
                "potencia=" + potencia +
                '}';
    }
}
