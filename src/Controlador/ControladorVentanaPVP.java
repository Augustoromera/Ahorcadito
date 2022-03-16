
package Controlador;

import java.util.Scanner;
import servicio.*;
import ventana.*;
import entidades.*;
import java.util.ArrayList;
import entidades.*;

public class ControladorVentanaPVP {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
   static AhorcaditoServicio servicio = new AhorcaditoServicio();
   static Ahorcadito AhorcaditoJuego=new Ahorcadito();;


   
    

     public static VentanaPVP ventana = new VentanaPVP();



    
    public static void mostrarVentana(Ahorcadito AhorcaditoJuego){
      ControladorVentanaPVP.AhorcaditoJuego=AhorcaditoJuego;
      AhorcaditoJuego=servicio.crearJuego(AhorcaditoJuego.getPal(), AhorcaditoJuego.getCantJugMax());
    ventana.setVisible(true);
    ventana.setJuegaso(AhorcaditoJuego);
    AhorcaditoJuego=servicio.buscar("", AhorcaditoJuego, AhorcaditoJuego .getPalABuscar(),ControladorVentanaPVP.ventana);
    AhorcaditoJuego.setCantJugMax(AhorcaditoJuego.getCantJugMax()+1);
    }
    public static void ocultarVentana(){
    ventana.setVisible(false);
    }
    public static Ahorcadito adivinarUnaLetra(String letra, Ahorcadito juegazzo){
    AhorcaditoJuego=servicio.buscar(letra, juegazzo, juegazzo.getPalABuscar(),ControladorVentanaPVP.ventana);
    AhorcaditoJuego=servicio.intentos(juegazzo,ControladorVentanaPVP.ventana);
    AhorcaditoJuego=servicio.finJuego(juegazzo,ControladorVentanaPVP.ventana);
    if(AhorcaditoJuego.getNumero()!=0){
    ventana.comprobacion(juegazzo);
    }
       return AhorcaditoJuego;
    }
    public static void enventoBoton1IngresarPista(){
        //AhorcaditoJuego=servicio.buscar(ControladorVentanaPVP.AhorcaditoJuego.getPalABuscar(), AhorcaditoJuego, palEncontrada);
    }
}
