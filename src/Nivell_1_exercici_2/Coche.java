package Nivell_1_exercici_2;

public class Coche {

   private static final String Marca = "Mercedes";
   private static String Modelo = "AMG";
   private final int potencia;


    public Coche(int potencia) {
        this.potencia = potencia;

    }

    static void frenar() {
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
