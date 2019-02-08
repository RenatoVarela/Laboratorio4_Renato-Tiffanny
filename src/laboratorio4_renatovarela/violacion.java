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
public class violacion extends D_Grave {
    int edad_victima;

    public violacion(int edad_victima, int puntuacion, String descriptcion, String nombre_delito, String culpable, String sentencia, Date fecha_crimen, String pais) {
        super(puntuacion, descriptcion, nombre_delito, culpable, sentencia, fecha_crimen, pais);
        this.edad_victima = edad_victima;
    }

    public violacion() {
    }

    public int getEdad_victima() {
        return edad_victima;
    }

    public void setEdad_victima(int edad_victima) {
        this.edad_victima = edad_victima;
    }

    @Override
    public String toString() {
        return "violacion{" + "edad_victima=" + edad_victima + '}';
    }
    
    
    
}
