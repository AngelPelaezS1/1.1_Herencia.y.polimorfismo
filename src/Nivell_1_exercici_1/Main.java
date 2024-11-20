package Nivell_1_exercici_1;

public class Main {

    public static void main(String[] args) {

        Viento viento = new Viento("Flauta",600 );
        Cuerda cuerda = new Cuerda("Guitarra", 750);
        Percusion percusion = new Percusion("Tambor", 150);

        viento.tocar();
        cuerda.tocar();
        percusion.tocar();

    }
}
