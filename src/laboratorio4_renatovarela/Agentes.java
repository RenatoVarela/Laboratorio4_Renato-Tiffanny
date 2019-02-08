/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio4_renatovarela;

/**
 *
 * @author Asus Pc
 */
public class Agentes extends criminales implements Cometer_Delito {

    public Agentes(String nombre, String edad, String genero, String pais_reside, String encarcelado, String descripcion) {
        super(nombre, edad, genero, pais_reside, encarcelado, descripcion);
    }

    public Agentes() {
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void cometer_delito() {
        
    }
    
    
}
