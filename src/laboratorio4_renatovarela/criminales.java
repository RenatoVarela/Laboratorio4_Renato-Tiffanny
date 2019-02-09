/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio4_renatovarela;

import java.util.ArrayList;

/**
 *
 * @author Asus Pc
 */
public class criminales {
    private String nombre;
    private String edad;
    private String genero;
    private String pais_reside;
    private String encarcelado;
    private String descripcion;
    ArrayList<Delito> delito = new ArrayList() ;

    public criminales(String nombre, String edad, String genero, String pais_reside, String encarcelado, String descripcion) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.pais_reside = pais_reside;
        this.encarcelado = encarcelado;
        this.descripcion = descripcion;
    }
    

    public criminales() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPais_reside() {
        return pais_reside;
    }

    public void setPais_reside(String pais_reside) {
        this.pais_reside = pais_reside;
    }

    public String getEncarcelado() {
        return encarcelado;
    }

    public void setEncarcelado(String encarcelado) {
        this.encarcelado = encarcelado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Delito> getDelito() {
        return delito;
    }

    public void setDelito(ArrayList<Delito> delito) {
        this.delito = delito;
    }

   /* @Override
    public String toString() {
        return "criminales{" + "nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", pais_reside=" + pais_reside + ", encarcelado=" + encarcelado + ", descripcion=" + descripcion ;
    }*/
    
    

    @Override
    public String toString() {
        return "Criminal: " + "\n1)nombre del crimina: " + nombre + ", \n2)Edad del Criminal: " + edad + "\n3)genero del criminal: " + genero + "\n4)pais de residencia " + pais_reside + "\n5)encarcelado: " + encarcelado + "\n6)descripcion:" + descripcion + "\nDelitos si tiene:" + delito;
    }
    
    
    
    
}
