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
public class Hurto extends D_menor {
    String objeto;
    double valor;

    public Hurto(String objeto, double valor, String nombre_policia, String Id_policia, int n_celda, String descriptcion, String nombre_delito, String culpable, String sentencia, Date fecha_crimen, String pais) {
        super(nombre_policia, Id_policia, n_celda, descriptcion, nombre_delito, culpable, sentencia, fecha_crimen, pais);
        this.objeto = objeto;
        this.valor = valor;
    }

    public Hurto() {
    }

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Hurto{" + super.toString() +"objeto=" + objeto + ", valor=" + valor + '}';
    }
    
    
    
    
    
    
}
