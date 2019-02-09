/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio4_renatovarela;

import java.util.Date;

/**
 *
 * @author Asus Pc
 */
public class secuestro extends D_Grave {
    double t_retenido;
    boolean rescatado;

    public secuestro(double t_retenido, boolean rescatado, int puntuacion, String descriptcion, String nombre_delito, String culpable, String sentencia, Date fecha_crimen, String pais) {
        super(puntuacion, descriptcion, nombre_delito, culpable, sentencia, fecha_crimen, pais);
        this.t_retenido = t_retenido;
        this.rescatado = rescatado;
    }

    public secuestro() {
    }

    public double getT_retenido() {
        return t_retenido;
    }

    public void setT_retenido(double t_retenido) {
        this.t_retenido = t_retenido;
    }

    public boolean isRescatado() {
        return rescatado;
    }

    public void setRescatado(boolean rescatado) {
        this.rescatado = rescatado;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n7)t_retenido=" + t_retenido + "\n8)rescatado=" + rescatado;
    }
    
    
    
    
    
    
    
}
