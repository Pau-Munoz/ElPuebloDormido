import java.util.ArrayList;

abstract class Ciudadano implements Batalla {
    protected String nombre;
    protected int poblacion;
    private int CONTADOR = 1;

    public Ciudadano() {
        this.nombre = "Ciudadano" + CONTADOR;
        this.poblacion = CONTADOR;
        CONTADOR ++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public void censar(ArrayList<Ciudadano>ciudadanos){

    }

    public void poblacionesTotales(ArrayList<Ciudadano>ciudadanos){

    }

    public void morir(ArrayList<Ciudadano>ciudadanos){

    }
}
