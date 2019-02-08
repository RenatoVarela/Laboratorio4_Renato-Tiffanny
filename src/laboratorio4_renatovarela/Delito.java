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
public class Delito {
    String descriptcion;
    String nombre_delito;
    String culpable;
    String sentencia;
    Date fecha_crimen;
    String pais;

    public Delito(String descriptcion, String nombre_delito, String culpable, String sentencia, Date fecha_crimen, String pais) {
        this.descriptcion = descriptcion;
        this.nombre_delito = nombre_delito;
        this.culpable = culpable;
        this.sentencia = sentencia;
        this.fecha_crimen = fecha_crimen;
        this.pais = pais;
    }

    public Delito() {
    }
    
    

    public String getDescriptcion() {
        return descriptcion;
    }

    public void setDescriptcion(String descriptcion) {
        this.descriptcion = descriptcion;
    }

    public String getNombre_delito() {
        return nombre_delito;
    }

    public void setNombre_delito(String nombre_delito) {
        this.nombre_delito = nombre_delito;
    }

    public String getCulpable() {
        return culpable;
    }

    public void setCulpable(String culpable) {
        this.culpable = culpable;
    }

    public String getSentencia() {
        return sentencia;
    }

    public void setSentencia(String sentencia) {
        this.sentencia = sentencia;
    }

    public Date getFecha_crimen() {
        return fecha_crimen;
    }

    public void setFecha_crimen(Date fecha_crimen) {
        this.fecha_crimen = fecha_crimen;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Delito{" + "descriptcion=" + descriptcion + ", nombre_delito=" + nombre_delito + ", culpable=" + culpable + ", sentencia=" + sentencia + ", fecha_crimen=" + fecha_crimen + ", pais=" + pais + '}';
    }
    
    
    
    
            
            
    
}
