
package lab.pkg8p2_equipo.pkg12;

import java.util.ArrayList;


public class Universo {
    private String nombre;
    private ArrayList<SerVivo> listadepersonas = new ArrayList();

    public Universo() {
    }

    public Universo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<SerVivo> getListadepersonas() {
        return listadepersonas;
    }

    public void setListadepersonas(ArrayList<SerVivo> listadepersonas) {
        this.listadepersonas = listadepersonas;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
