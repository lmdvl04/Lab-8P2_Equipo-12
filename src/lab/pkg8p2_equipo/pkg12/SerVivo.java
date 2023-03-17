
package lab.pkg8p2_equipo.pkg12;


public class SerVivo {
     private String nombre;
    private int id;
    private int poder;
    private String anio;
    private Universo universe;
    private String raza;

    public SerVivo() {
    }

    public SerVivo(String nombre, int id, int poder, String anio, Universo universe, String raza) {
        this.nombre = nombre;
        this.id = id;
        this.poder = poder;
        this.anio = anio;
        this.universe = universe;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public Universo getUniverse() {
        return universe;
    }

    public void setUniverse(Universo universe) {
        this.universe = universe;
    }

    public String isRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return ""+id;
    }
}
