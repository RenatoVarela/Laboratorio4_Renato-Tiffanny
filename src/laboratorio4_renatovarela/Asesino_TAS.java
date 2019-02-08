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
public class Asesino_TAS extends Agentes   {
    String nombre_victim;
    String arma;

    public Asesino_TAS(String nombre_victim, String arma, String nombre, String edad, String genero, String pais_reside, String encarcelado, String descripcion) {
        super(nombre, edad, genero, pais_reside, encarcelado, descripcion);
        this.nombre_victim = nombre_victim;
        this.arma = arma;
    }

    public Asesino_TAS() {
    }

    public String getNombre_victim() {
        return nombre_victim;
    }

    public void setNombre_victim(String nombre_victim) {
        this.nombre_victim = nombre_victim;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Tipo de Agente: Asesino\n" + super.toString() +"\n7)nombre de la victima" + nombre_victim + "\n8)Arma Utilizada" + arma + '}';
    }

    @Override
    public void cometer_delito() {
        System.out.println("-----------------------------------------------");
        System.out.println("El objetivo " + nombre_victim + " ha sido asesinado con exito" + " el arma usada ha sido " + arma);
    }
    
    
    
}
