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
public class Vandalismo extends D_menor {
    String edificacion;
    int pisos;
    
    String nom_dueno;

    public Vandalismo(String edificacion, int pisos, String nom_dueno, String nombre_policia, String Id_policia, int n_celda, String descriptcion, String nombre_delito, String culpable, String sentencia, Date fecha_crimen, String pais) {
        super(nombre_policia, Id_policia, n_celda, descriptcion, nombre_delito, culpable, sentencia, fecha_crimen, pais);
        this.edificacion = edificacion;
        this.pisos = pisos;
        this.nom_dueno = nom_dueno;
    }

    public Vandalismo() {
    }

    public String getEdificacion() {
        return edificacion;
    }

    public void setEdificacion(String edificacion) {
        this.edificacion = edificacion;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public String getNom_dueno() {
        return nom_dueno;
    }

    public void setNom_dueno(String nom_dueno) {
        this.nom_dueno = nom_dueno;
    }

    @Override
    public String toString() {
        return "Vandalismo{" +super.toString() +  "edificacion=" + edificacion + ", pisos=" + pisos + ", nom_dueno=" + nom_dueno + '}';
    }
    
    
    
}
