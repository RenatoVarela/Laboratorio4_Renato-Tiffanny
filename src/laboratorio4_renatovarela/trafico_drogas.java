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
public class trafico_drogas extends D_Grave {
    String nombre_droga;
    
    int cantidad;

    public trafico_drogas(String nombre_droga, int cantidad, int puntuacion, String descriptcion, String nombre_delito, String culpable, String sentencia, Date fecha_crimen, String pais) {
        super(puntuacion, descriptcion, nombre_delito, culpable, sentencia, fecha_crimen, pais);
        this.nombre_droga = nombre_droga;
        this.cantidad = cantidad;
    }

    public trafico_drogas() {
    }

    public String getNombre_droga() {
        return nombre_droga;
    }

    public void setNombre_droga(String nombre_droga) {
        this.nombre_droga = nombre_droga;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return super.toString() +"\n7)nombre_droga=" + nombre_droga + "\n8)cantidad=" + cantidad;
    }
    
    
    
    
}
