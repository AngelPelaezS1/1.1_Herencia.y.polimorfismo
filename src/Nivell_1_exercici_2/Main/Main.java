package Nivell_1_exercici_2.Main;

import Nivell_1_exercici_2.Clases.Coche;

public class Main {

    public static void main(String[] args) {

        Coche coche = new Coche("AMG",3000);

        System.out.println(coche) ;
        coche.acelerar();
        Coche.frenar();


    }
}
