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
public class Prostitucion extends D_menor {
    
    String nom_solicitante;

    public Prostitucion(String nom_solicitante, String nombre_policia, String Id_policia, int n_celda, String descriptcion, String nombre_delito, String culpable, String sentencia, Date fecha_crimen, String pais) {
        super(nombre_policia, Id_policia, n_celda, descriptcion, nombre_delito, culpable, sentencia, fecha_crimen, pais);
        this.nom_solicitante = nom_solicitante;
    }

    public Prostitucion() {
    }
    
    

    public String getNom_solicitante() {
        return nom_solicitante;
        
    }

    public void setNom_solicitante(String nom_solicitante) {
        this.nom_solicitante = nom_solicitante;
    }
    

    @Override
    public String toString() {
        return "Prostitucion{" + "nom_solicitante=" + nom_solicitante + '}';
    }
    
    
    
}
