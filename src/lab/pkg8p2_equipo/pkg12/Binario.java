
package lab.pkg8p2_equipo.pkg12;

import javax.swing.JTable;


public class Binario{
    private JTable tabla;

    public Binario(JTable tabla) {
        this.tabla = tabla;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    @Override
    public String toString() {
        return "Binario{" + "tabla=" + tabla + '}';
    }
    public void cargarArchivo(){
        
    }
}
