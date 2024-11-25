package Nivell_3_exercici_1.Main;

import Nivell_3_exercici_1.Moduls.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Redactor> redactores = new ArrayList<Redactor>();
        ArrayList<Noticia> noticias = new ArrayList<Noticia>();

        int opcion = 0;
        do {
            mostrarMenu();
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion) {
                case 1:
                    crearRedactor(redactores);
                    break;
                case 2:
                    eliminarRedactor(redactores);
                    break;
                case 3:
                    introducirNoticiaRedactor(redactores);
                    break;
                case 4:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Error");
            }

            System.out.println();
        } while (opcion != 4);

    }

    public static void mostrarMenu() {
        System.out.println("***Cargando menu***");
        System.out.println("1.Crear redactor");
        System.out.println("2.Eliminar redactor");
        System.out.println("3.Introducir noticia por redactor");
        System.out.println("4.Salir del programa");
        System.out.println("Elige una opcion");
    }


    public static Redactor buscarRedactor(String DNI, ArrayList<Redactor> redactores) {
        Redactor redactor = null;
        int i = 0;
        int size = redactores.size();
        while (i < size && redactor == null) {
            if (redactores.get(i).getDNI().equalsIgnoreCase(DNI)) {
                redactor = redactores.get(i);
            }
            i++;
        }
        return redactor;
    }

    public static void crearRedactor(ArrayList<Redactor> redactores) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce nombre de redactor");
        String nombre = teclado.nextLine();

        System.out.println("Introduce DNI");
        String DNI = teclado.nextLine();


        if (buscarRedactor(DNI, redactores) == null) {
            Redactor nuevoRedactor = new Redactor(nombre, DNI);
            redactores.add(nuevoRedactor);
            System.out.println("Redactor añadido con exito");
        } else {
            System.out.println("Este redactor ya existe");
        }
    }

    public static void eliminarRedactor(ArrayList<Redactor> redactores) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce DNI");
        String DNI = teclado.nextLine();

        Redactor redactorEncontrado = buscarRedactor(DNI, redactores);

        if (buscarRedactor(DNI, redactores) != null) {
            redactores.remove(redactorEncontrado);
        } else {
            System.out.println("El redactor no existe");
        }
    }

    public static void introducirNoticiaRedactor(ArrayList<Redactor> redactores) {
        ArrayList<Noticia> noticias = new ArrayList<Noticia>();
        Scanner teclado = new Scanner(System.in);

        int opcion = 0;

        System.out.println("Introducir DNI");
        String DNI = teclado.nextLine();

        if (buscarRedactor(DNI, redactores) != null) {
            System.out.println("Introduce el titular");
            String titular = teclado.nextLine();
            System.out.println("Introduce el texto");
            String texto = teclado.nextLine();

            System.out.println("Elige una opcion : 1.Futbol, 2.Basquet, 3.Tenis, 4.F1, 5.Motociclismo");
            opcion = teclado.nextInt();
            teclado.nextLine();


            switch (opcion) {
                case 1:
                    String competicion = teclado.nextLine();
                    System.out.println("Introduce el equipo");
                    String equipo = teclado.nextLine();
                    System.out.println("Introduce el jugador");
                    String jugador = teclado.nextLine();
                    NoticiaFutbol nuevaNoticiaFutbol = new NoticiaFutbol(titular, texto, 0, 0, competicion, equipo, jugador, noticias);
                    break;
                case 2:
                    System.out.println("Introduce la competicion");
                    String competicionBasquet = teclado.nextLine();
                    System.out.println("Introduce el equipo");
                    String equipoBasquet = teclado.nextLine();
                    NoticiaBasquet nuevaNoticiaBasquet = new NoticiaBasquet(titular, texto, 0, 0, competicionBasquet, equipoBasquet, noticias);
                    break;
                case 3:
                    System.out.println("Introduce el tenista");
                    String tenista = teclado.nextLine();
                    NoticiaTenis nuevaNoticiaTenis = new NoticiaTenis(titular, texto, 0, 0, tenista, noticias);
                    break;
                case 4:
                    System.out.println("Introduce la escuderia");
                    String escuderia = teclado.nextLine();
                    NoticiaF1 nuevaNoticiaf1 = new NoticiaF1(titular, texto, 0, 0, escuderia, noticias);
                    break;
                case 5:
                    System.out.println("Intrduce el equipo");
                    String equipoMotociclismo = teclado.nextLine();
                    NoticiaMotociclismo nuevaNoticiaMotociclismo = new NoticiaMotociclismo(titular, texto, 0, 0, noticias);
                    break;
            }
        }
    }

    public static void eliminarNoticia(ArrayList<Redactor> redactores) {
        ArrayList<Noticia> noticias = new ArrayList<Noticia>();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introducir DNI");
        String DNI = teclado.nextLine();

        Redactor redactorEncontrado = buscarRedactor(DNI, redactores);

        if(buscarRedactor(DNI, redactores) != null){
            System.out.println("Introduce el titular de la noticia");
        }



    }
}