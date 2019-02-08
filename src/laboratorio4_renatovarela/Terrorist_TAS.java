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
public class Terrorist_TAS extends Agentes {
    String pais_ataque;
    String ciudad;
    String metodo;

    public Terrorist_TAS(String pais_ataque, String ciudad, String metodo, String nombre, String edad, String genero, String pais_reside, String encarcelado, String descripcion) {
        super(nombre, edad, genero, pais_reside, encarcelado, descripcion);
        this.pais_ataque = pais_ataque;
        this.ciudad = ciudad;
        this.metodo = metodo;
    }

    public Terrorist_TAS() {
    }

    public String getPais_ataque() {
        return pais_ataque;
    }

    public void setPais_ataque(String pais_ataque) {
        this.pais_ataque = pais_ataque;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    @Override
    public String toString() {
        return "Tipo de Agente: Terrorista \n" +super.toString() + " \n7)pais del ataque: " + pais_ataque + "8) Ciudad del ataque: " + ciudad + "\n9)Metodo usado" + metodo + '}';
    }

     
    @Override
    
  
    public void cometer_delito() {
        
        System.out.println("---------------------------------------------");
        System.out.println("El terrorista ha atacado la ciudad de " + ciudad + " en " + pais_ataque + "\nEl metodo usado ha sido " + metodo);
        
    }
    
    
    
    
}
