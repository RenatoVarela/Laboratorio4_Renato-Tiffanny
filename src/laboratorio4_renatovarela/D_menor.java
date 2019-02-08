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
public class D_menor  extends Delito{
    String nombre_policia;
    String Id_policia;
    int n_celda;

    public D_menor(String nombre_policia, String Id_policia, int n_celda, String descriptcion, String nombre_delito, String culpable, String sentencia, Date fecha_crimen, String pais) {
        super(descriptcion, nombre_delito, culpable, sentencia, fecha_crimen, pais);
        this.nombre_policia = nombre_policia;
        this.Id_policia = Id_policia;
        this.n_celda = n_celda;
    }

    public D_menor() {
    }
    
    

    public String getNombre_policia() {
        return nombre_policia;
    }

    public void setNombre_policia(String nombre_policia) {
        this.nombre_policia = nombre_policia;
    }

    public String getId_policia() {
        return Id_policia;
    }

    public void setId_policia(String Id_policia) {
        this.Id_policia = Id_policia;
    }

    public int getN_celda() {
        return n_celda;
    }

    public void setN_celda(int n_celda) {
        this.n_celda = n_celda;
    }

    @Override
    public String toString() {
        return "D_menor{" + "nombre_policia=" + nombre_policia + ", Id_policia=" + Id_policia + ", n_celda=" + n_celda + '}';
    }
    
   
    
   
    
    
    
}
