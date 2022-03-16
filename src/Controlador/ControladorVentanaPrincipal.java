
package Controlador;
import ventana.*;
public class ControladorVentanaPrincipal {
    public static VentanaPrincipal ventana = new VentanaPrincipal();
    
    public static void mostrarVentana(){
    ventana.setVisible(true);
    }
    public static void ocultarVentana(){
    ventana.setVisible(false);
    }
    
   
}
