package servicio;

import entidades.Ahorcadito;
import java.util.Scanner;

public class AhorcaditoServicio {

    Ahorcadito objetoAhorcadito = new Ahorcadito();

    public Ahorcadito crearJuego() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Ahorcadito e = new Ahorcadito();
        String pal;
        System.out.println("INGRESE LA PALABRA PARA JUGAR:");

        pal = leer.next();
        for (int i = 0; i < 10; i++) {
            System.out.println("");
        }
        e.setPal(pal);
        String[] palabraABuscar = new String[pal.length()];
        for (int i = 0; i < pal.length(); i++) {
            palabraABuscar[i] = pal.substring(i, i + 1);
        }
        e.setPalabraABuscar(palabraABuscar);
        System.out.println("INGRESE LA CANTIDAD DE JUGADAS MAXIMAS (VIDAS):");
        e.setCantJugMax(leer.nextInt());

        return e;
    }

    public AhorcaditoServicio() {
    }

    public void longitud(Ahorcadito e) {
        System.out.println("La longitud de la palabra es de :" + e.getPal().length() + " letras");
    }
//    Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
//letra ingresada es parte de la palabra o no. También informará si la letra estaba o no

    public Ahorcadito buscar(String l, Ahorcadito e, String[] palEncontrada) {
        String pal;
        int cant = 0;

        pal = e.getPal();
        String palabraABuscar[] = new String[pal.length()];
        if (e.getInicios() == 0) {
            for (int i = 0; i < pal.length(); i++) {
               
                if (i == 0) {
                    palEncontrada[0] = e.getPal().substring(0, 1).toUpperCase();
                } else if(i==pal.length()-1){
                palEncontrada[pal.length()-1]=e.getPal().substring(pal.length()-1, pal.length()).toUpperCase();
                }else{palEncontrada[i]="";}
               
            }
            e.setCantLetEnco(e.getCantLetEnco()+2);
        }
        
        
        for (int i = 0; i < pal.length(); i++) {

            palabraABuscar[i] = pal.substring(i, i + 1);
        }
        for (int i = 1; i < pal.length()-1; i++) {
            if (palabraABuscar[i].equalsIgnoreCase(l)) {
                cant = cant + 1;
                palEncontrada[i] = " " + l.toUpperCase() + " ";

            } else if (palEncontrada[i].equalsIgnoreCase(" _ ") || palEncontrada[i].equalsIgnoreCase("")) {
                palEncontrada[i] = " _ ";
            }
//            e.setPalabraEncontrada(e.getPalabraEncontrada().concat(palEncontrada[i]));
        }
        e.setCantLetEnco(e.getCantLetEnco() + cant);
        if (cant == 0) {
            System.out.println("La letra no fue encontrada");
            e.setCantJugMax(e.getCantJugMax() - 1);
        } else {
            System.out.println("La letra fue encontrada " + cant + " veces");
        }
        System.out.println("Le faltan " + (e.getPal().length() - e.getCantLetEnco()) + " por encontrar");
//        System.out.println(e.getPalabraEncontrada());
        System.out.println("");
        for (int i = 0; i < e.getPal().length(); i++) {
            System.out.print(palEncontrada[i]);

        }
        System.out.println("");
        e.setInicios(1);
        return e;
    }

    public Ahorcadito intentos(Ahorcadito e) {
        System.out.println("Sus intentos restantes son: " + e.getCantJugMax());

        return e;
    }

    public Ahorcadito finJuego(Ahorcadito e) {
        int numero = 0;
        if ((e.getCantJugMax() <= 0)) {
            numero = 1;
        } else if ((e.getCantLetEnco() >= (e.getPal().length()))) {
            numero = 2;
        }
        e.setNumero(numero);
        return e;
    }
    

}
