package servicio;

import entidades.Ahorcadito;
import java.util.Scanner;
import java.util.ArrayList;
import ventana.VentanaPVP;
public class AhorcaditoServicio {

    Ahorcadito objetoAhorcadito = new Ahorcadito();
/*
    Funcion que crea el juego 
    donde se guardara la palabra a buscar en un vector 
    ademas la palabra a buscar tambien en un string
    y la cantidad de jugadas maximas
    */
    public Ahorcadito crearJuego(String pal,int vidasMax) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Ahorcadito e = new Ahorcadito();

        for (int i = 0; i < 10; i++) {
            System.out.println("");
        }
        e.setPal(pal);
        String[] palabraABuscar = new String[pal.length()];
        for (int i = 0; i < pal.length(); i++) {
            palabraABuscar[i] = pal.substring(i, i + 1);
            e.setPalABuscar(palabraABuscar[i]);
        }
        e.setPalabraABuscar(palabraABuscar);
        e.setCantJugMax(vidasMax);

        return e;
    }

    public AhorcaditoServicio() {
    }
/**
 * No indica la longitud de la palabra a buscar pero de momento es codigo basura ya que no se la utiliza 
 * @param e 
 */
    public void longitud(Ahorcadito e) {
        System.out.println("La longitud de la palabra es de :" + e.getPal().length() + " letras");
    }

/**
 * Lo que devuelve es el objeto e de tipo ahorcadito sii se acerto pondra la o las letras en el vector
 * sino restara intentos
 * tambien pone la primera y la ultima letra como ayuda restando las letras por encontrar y sumando las letras encontradas
 * Nos indica si la letra fue encontrada en tal caso el numero de veces y cuantas letras faltan por encontrar
 * Recibe l como la letra ingresada para jugar
 * e seria el objeto que contiene los datos de tipo ahorcadito
 * contiene el vector que posee la palabra que uno va encontrando mas las palabras que faltan reemplazadas como guion bajo
 * @param l
 * @param e
     * @param palEncontradaa
 * @return 
 */
    public Ahorcadito buscar(String l, Ahorcadito e, ArrayList<String> palEncontradaa,VentanaPVP ventana) {
        System.out.println("hola");
        String pal="";
        int cant = 0;
        pal = e.getPal();
        String palabraABuscar[] = new String[pal.length()];
         String palEncontrada[] = new String[pal.length()];
        for (int i = 0; i < pal.length(); i++) {
           palEncontrada[i]=palEncontradaa.get(i);
        }
        if (e.getInicios() == 0) {
            for (int i = 0; i < pal.length(); i++) {
               
                if (i == 0) {
                    palEncontrada[0] = e.getPal().substring(0, 1).toUpperCase();
                } else if(i==pal.length()-1){
                
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
        }
        e.setCantLetEnco(e.getCantLetEnco() + cant);
        if (cant == 0) {
            ventana.setCartelUno("La letra no fue encontrada");
            e.setCantJugMax(e.getCantJugMax() - 1);
        } else {
            ventana.setCartelUno("La letra fue encontrada " + cant + " veces");
        }
        ventana.setCartelDos("Le faltan " + (e.getPal().length() - e.getCantLetEnco()) + " por encontrar");
        
        System.out.println("");
        String palEcontradaEnString="";
        for (int i = 0; i < e.getPal().length(); i++) {
            System.out.print(palEncontrada[i]);
            palEcontradaEnString=palEcontradaEnString.concat(palEncontrada[i]);

        }
        ventana.setjLineaGuion(palEcontradaEnString.toUpperCase());
        System.out.println("");
        e.setInicios(1);
        palEncontradaa.removeAll(palEncontradaa);
        for (int i = 0; i < pal.length(); i++) {
          e.setPalABuscar(palEncontrada[i]);
        }
        return e;
    }
/**
 * Funcion que calcula los intentos o vidas que le queda al jugador
 * @param e
 * @return 
 */
    public Ahorcadito intentos(Ahorcadito e,VentanaPVP ventana) {
        ventana.setIntentosYSiGanoONO("Sus intentos restantes son: " + e.getCantJugMax());

        return e;
    }
/**
 * funcion que determina si el juego termina 
 * Ya sea por que los intentos lleguen a 0 o por que la cantidad de letras encontrada sea igual a las letras a encontrar
 * @param e
 * @return 
 */
    public Ahorcadito finJuego(Ahorcadito e,VentanaPVP ventana) {
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
