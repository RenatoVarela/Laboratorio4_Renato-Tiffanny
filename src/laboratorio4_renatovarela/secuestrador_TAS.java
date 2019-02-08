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
public class secuestrador_TAS extends Agentes {
    String nombre_victima;
    double rescate;

    public secuestrador_TAS(String nombre_victima, double rescate, String nombre, String edad, String genero, String pais_reside, String encarcelado, String descripcion) {
        super(nombre, edad, genero, pais_reside, encarcelado, descripcion);
        this.nombre_victima = nombre_victima;
        this.rescate = rescate;
    }

    public secuestrador_TAS() {
    }
    
    

    public String getNombre_victima() {
        return nombre_victima;
    }

    public void setNombre_victima(String nombre_victima) {
        this.nombre_victima = nombre_victima;
    }

    public double getRescate() {
        return rescate;
    }

    public void setRescate(double rescate) {
        this.rescate = rescate;
    }

    @Override
    public String toString() {
        return "Tipo de Agente: Secuestrador \n" + super.toString() +"\n7)nombre de la victima " + nombre_victima + "\n8)rescate: " + rescate;
    }

    @Override
    public void cometer_delito() {
        System.out.println("El objetivo " + nombre_victima+ " ha sido secuestrado con exito" + " el pago por su rescate sera " + rescate);
    }
    
    
    
}
