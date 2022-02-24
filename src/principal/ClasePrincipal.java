package principal;

import entidades.Ahorcadito;
import java.io.InputStream;
import servicio.AhorcaditoServicio;
import java.util.Scanner;
import ventana.Visual;

public class ClasePrincipal {

    public static void main(String[] args) {

        AhorcaditoServicio as = new AhorcaditoServicio();
        Ahorcadito a = new Ahorcadito();
        juego(as, a);

    }

    public static void juego(AhorcaditoServicio as, Ahorcadito s) {
        Scanner leer = new Scanner(System.in);

        s = as.crearJuego();
        String l="";
        String [] palEncontrada= new String[s.getPal().length()];
        while(s.getCantJugMax()!=0) {
            

        System.out.println("INGRESE LA LETRA: ");
            l = leer.next();
            for (int i = 0; i < 10; i++) {
            System.out.println("");
        }
           s=as.buscar(l, s,palEncontrada);
            s=as.finJuego(s);
            if(s.getNumero()==1){
                System.out.println("SIN VIDAS FIN DEL JUEGO _ SOS UN PERDEDOR");
                break;
            }
            if(s.getNumero()==2){
                System.out.println("ACERTO A TODAS FIN DEL JUEGO _ SOS UN GANADOR");
                break;
            }
            s=as.intentos(s);

        }
    }

}
