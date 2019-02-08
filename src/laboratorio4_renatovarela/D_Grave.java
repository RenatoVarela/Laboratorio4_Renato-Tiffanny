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
public class D_Grave extends Delito {
    int puntuacion;

    public D_Grave(int puntuacion, String descriptcion, String nombre_delito, String culpable, String sentencia, Date fecha_crimen, String pais) {
        super(descriptcion, nombre_delito, culpable, sentencia, fecha_crimen, pais);
        this.puntuacion = puntuacion;
    }

    public D_Grave() {
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "D_Grave{" + super.toString() +"puntuacion=" + puntuacion + '}';
    }
    
    
    
}
