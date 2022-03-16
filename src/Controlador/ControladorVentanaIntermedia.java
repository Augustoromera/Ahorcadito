
package Controlador;
import ventana.*;
public class ControladorVentanaIntermedia {
      public static VentanaIntermediaPVP ventana = new VentanaIntermediaPVP();
    public static void mostrarVentana(){
    ventana.setVisible(true);
    }
    public static void ocultarVentana(){
    ventana.setVisible(false);
    }
}
