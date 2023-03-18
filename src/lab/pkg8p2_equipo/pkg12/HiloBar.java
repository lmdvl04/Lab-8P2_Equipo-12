
package lab.pkg8p2_equipo.pkg12;

import javax.swing.JProgressBar;


public class HiloBar implements Runnable{
    private JProgressBar barra;
    private boolean estado;

    public HiloBar(JProgressBar barra) {
        this.barra = barra;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    @Override
    public String toString() {
        return "HiloBar{" + "barra=" + barra + '}';
    }
    
   

    @Override
    public void run() {
        while(true){
            barra.setValue(barra.getValue()+1);
                if(barra.getValue()==100){
                    estado = false;
                }  
        
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
    }


