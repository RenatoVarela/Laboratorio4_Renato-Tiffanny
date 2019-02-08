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
public class asesinato extends D_Grave  {
    String nombre_Arma;
    int num_cuerpos;

    public asesinato(String nombre_Arma, int num_cuerpos, int puntuacion, String descriptcion, String nombre_delito, String culpable, String sentencia, Date fecha_crimen, String pais) {
        super(puntuacion, descriptcion, nombre_delito, culpable, sentencia, fecha_crimen, pais);
        this.nombre_Arma = nombre_Arma;
        this.num_cuerpos = num_cuerpos;
    }

    public asesinato() {
    }

    public String getNombre_Arma() {
        return nombre_Arma;
    }

    public void setNombre_Arma(String nombre_Arma) {
        this.nombre_Arma = nombre_Arma;
    }

    public int getNum_cuerpos() {
        return num_cuerpos;
    }

    public void setNum_cuerpos(int num_cuerpos) {
        this.num_cuerpos = num_cuerpos;
    }

    @Override
    public String toString() {
        return "asesinato{" + "nombre_Arma=" + nombre_Arma + ", num_cuerpos=" + num_cuerpos + '}';
    }
    
    
    
}
