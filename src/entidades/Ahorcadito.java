
package entidades;
public class Ahorcadito {
    

    public Ahorcadito(int cantLetEnco, int cantJugMax, String pal) {
        this.cantLetEnco = cantLetEnco;
        this.cantJugMax = cantJugMax;
        this.pal = pal;
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

   

String palabraABuscar[] = new String[numPal];
String palabraEncontrada="";

    public String getPalabraEncontrada() {
        return palabraEncontrada;
    }

    public void setPalabraEncontrada(String palabraEncontrada) {
        this.palabraEncontrada = palabraEncontrada;
    }
    public Ahorcadito() {
    }
}
