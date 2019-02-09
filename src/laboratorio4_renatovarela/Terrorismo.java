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
public class Terrorismo extends D_Grave {
    String nombre_artefacto;
    int num_victimas;

    public Terrorismo(String nombre_artefacto, int num_victimas, int puntuacion, String descriptcion, String nombre_delito, String culpable, String sentencia, Date fecha_crimen, String pais) {
        super(puntuacion, descriptcion, nombre_delito, culpable, sentencia, fecha_crimen, pais);
        this.nombre_artefacto = nombre_artefacto;
        this.num_victimas = num_victimas;
    }

    public Terrorismo() {
    }

    public String getNombre_artefacto() {
        return nombre_artefacto;
    }

    public void setNombre_artefacto(String nombre_artefacto) {
        this.nombre_artefacto = nombre_artefacto;
    }

    public int getNum_victimas() {
        return num_victimas;
    }

    public void setNum_victimas(int num_victimas) {
        this.num_victimas = num_victimas;
    }

    @Override
    public String toString() {
        return super.toString() +"\n8)nombre_artefacto=" + nombre_artefacto + "\n9)num_victimas=" + num_victimas;
    }
    
    
    
    
    
}
