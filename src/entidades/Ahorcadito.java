
package entidades;
import java.util.ArrayList;
public class Ahorcadito {
    

    public Ahorcadito(int cantLetEnco, int cantJugMax, String pal) {
        this.cantLetEnco = cantLetEnco;
        this.cantJugMax = cantJugMax;
        this.pal = pal;
    }
    ArrayList<String>palABuscar;
    

    @Override
    public String toString() {
        return "Ahorcadito{" + "palABuscar=" + palABuscar + ", cantLetEnco=" + cantLetEnco + ", cantJugMax=" + cantJugMax + ", numPal=" + numPal + ", numero=" + numero + ", inicios=" + inicios + ", pal=" + pal + ", palabraABuscar=" + palabraABuscar + ", palabraEncontrada=" + palabraEncontrada + '}';
    }

    public void setPalABuscar(String palABuscar) {
        this.palABuscar.add(palABuscar);
    }

    public ArrayList<String> getPalABuscar() {
        return palABuscar;
    }
     public void getPalABuscarEnString() {
        for (String string : this.palABuscar) {
        }
    }
    int cantLetEnco;
    int cantJugMax;
    int numPal;
    int numero=0;
    int inicios=0;

    public int getInicios() {
        return inicios;
    }

    public void setInicios(int inicios) {
        this.inicios = inicios;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    String pal;
    

    public void setPalabraABuscar(String[] palabraABuscar) {
        this.palabraABuscar = palabraABuscar;
    }
    /**
     * Funcion para mostrar la palabra a buscar desde el vector donde se guarda la misma (son distintas)
     */
    public void getPalabraABuscar() {
        for (int i = 0; i < this.palabraABuscar.length; i++) {
            System.out.println(this.palabraABuscar[i]);
        }
    }

    public int getCantLetEnco() {
        return cantLetEnco;
    }

    public void setCantLetEnco(int cantLetEnco) {
        this.cantLetEnco = cantLetEnco;
    }

    public int getCantJugMax() {
        return cantJugMax;
    }

    public void setCantJugMax(int cantJugMax) {
        this.cantJugMax = cantJugMax;
    }

    public String getPal() {
        return pal;
    }

    public void setPal(String pal) {
        this.pal = pal;
        this.numPal=pal.length();
        
    }

   
/*
    Se dimensiona el vector de tamaño numPal que a su vez tiene el tamaño de la palabra
    */
String palabraABuscar[] = new String[numPal];
String palabraEncontrada="";

    public String getPalabraEncontrada() {
        return palabraEncontrada;
    }

    public void setPalabraEncontrada(String palabraEncontrada) {
        this.palabraEncontrada = palabraEncontrada;
    }
    public Ahorcadito() {
        this.palABuscar=new ArrayList();
    }
}
