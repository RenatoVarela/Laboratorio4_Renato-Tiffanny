/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio4_renatovarela;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Renato Y Tiffanny
 */
public class Laboratorio4_Renatovarela {

    static Scanner r = new Scanner(System.in);
   static ArrayList<criminales> cri = new ArrayList();
   static ArrayList<Agentes> tas = new ArrayList();
   static ArrayList<Delito> del = new ArrayList();
    public static void main(String[] args) {
        
        menu();
       
    }

    private static void menu() {
        int opcion;
        boolean salir = false;
        
        while(salir == false){
        
        System.out.println("Ingrese uno de los siguientes \n1)Delitos  \n2)Criminales \n3)TAS \n4)Salir ");
        opcion = r.nextInt();
        
        switch(opcion){
            
            case 1:
                delito();
                break;
                
            case 2:
                criminales();
                break;
                
                
            case 3:
                 tas();
                break;
           
                
                
            case 4:
                salir = true;
                
                break;
                
          
            
            
        }
        }
    }

    /*private static void delito() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    private static void criminales() {
        int opcion;
        System.out.println("Ingrese \n1)Agregar Criminales \n2)Modificar Criminales  \n3)Eliminar Criminales \n4)Listar criminales \n5)Asignar");
        opcion = r.nextInt();
        
        switch(opcion){
            case 1:
                Agregar_c();
                break;
                
                
            case 2:
                
                Modificar_c();
                
                break;
                
                
            case 3:
                Eliminar_c();
                
                break;
                
                
            case 4:
                Lista_c();
                break;
                
                
            case 5:
                Asignar_c();
                break;
            
            
        }
           
    }

    private static void Agregar_c() {
    String nombre;
    String edad;
    String genero;
    String pais_reside;
    String encarcelado;
    String descripcion;
        
        System.out.println("Ingrese el nombre del criminal");
        nombre = r.next();
        
        System.out.println("Ingresar edad del criminal");
        edad = r.next();
        
        System.out.println("Ingresa el genero del criminal");
        genero = r.next();
        
        System.out.println("INgrese el pais en el que reside el criminal");
        pais_reside = r.next();
        
        System.out.println("Esta encarcelado? ingrese: \n1)SI ESTA ENCARCELADO \n2)NO ESTA ENCARCELADO");
        encarcelado = r.next();
        while(!encarcelado.equals("1") && !encarcelado.equals("2")){
            System.out.println("VUELVA A INGRESAR LA OPCION");
            System.out.println("Esta encarcelado? ingrese: \n1)SI ESTA ENCARCELADO \n2)NO ESTA ENCARCELADO");
        encarcelado = r.next();
        }
        
        if (encarcelado.equals("1")) {
            encarcelado = "SI ESTA ENCARCELADO";
        }else{
            encarcelado = "NO ESTA ENCARCELADO";
        }
        
        
        System.out.println("Ingrese la descripcion del criminal");
        descripcion = r.next();
        
        
        cri.add(new criminales(nombre,edad,genero,pais_reside,encarcelado,descripcion));
        
    }

    private static void Modificar_c() {
        int posicion;
        int atributo;
          String nombre;
    String edad;
    String genero;
    String pais_reside;
    String encarcelado;
    String descripcion;
        System.out.println("Ingrese la posicion del criminal que desea eliminar ");
        posicion = r.nextInt();
        
        System.out.println("Ingrese el atributo que desea modificar ");
        atributo = r.nextInt();
    
        
        
        switch(atributo){
            
            case 1:
        
        System.out.println("Ingrese el nombre del criminal");
        nombre = r.next();
        
        cri.get(posicion).setNombre(nombre);
        
        break;
        
        
            case 2:
        System.out.println("Ingresar edad del criminal");
        edad = r.next();
        
        cri.get(posicion).setEdad(edad);
        
        break;
        
        
            case 3:
        
        System.out.println("Ingresa el genero del criminal");
        genero = r.next();
        
        cri.get(posicion).setGenero(genero);
        
        break;
        
            case 4:
        
        System.out.println("INgrese el pais en el que reside el criminal");
        pais_reside = r.next();
        
        cri.get(posicion).setPais_reside(pais_reside);
        
        break;
        
            case 5:
        System.out.println("Esta encarcelado? ingrese: \n1)SI ESTA ENCARCELADO \n2)NO ESTA ENCARCELADO");
        encarcelado = r.next();
        
        cri.get(posicion).setEncarcelado(encarcelado);
        break;
        
                
               
            case 6:
        System.out.println("Ingrese la descripcion del criminal");
        descripcion = r.next();
        
        cri.get(posicion).setDescripcion(descripcion);
        break;
                
        }
        
       
        
    }

    private static void Eliminar_c() {
        int posicion;
        System.out.println("Ingrese la poscion del criminal que desea eliminar");
        posicion = r.nextInt();
        
        cri.remove(posicion);
        
    }

    private static void Lista_c() {
        
        for (int i = 0; i < cri.size(); i++) {
            System.out.println("\nPosicion del criminal: " +cri.indexOf(cri.get(i)) + "\n--------------------------------------"+cri.get(i));
            
        }
        
    }

    private static void Asignar_c() {
        int posicion;
        int posicion2;

        System.out.println("Ingrese la posicion del criminal al que se le asignara el crimen");
        posicion = r.nextInt();
        
        System.out.println("Ingrese la posicion del crimen que cometio");
        posicion2 =r.nextInt();
        
        
        cri.get(posicion).getDelito().add(del.get(posicion));

    }
    
    
    
    
    
    
    
    
    
  
    private static void tas() {
        int opcion;
        System.out.println("Ingrese \n1)Agregar un Agente del Tas \n2)Modificar un Agente del Tas  \n3)Eliminar un Agente del Tas \n4)Listar Agentes del TAS \n5)Cometer Delito");
        opcion = r.nextInt();
        
        switch(opcion){
            case 1:
                Agregar_tas();
                break;
                
                
            case 2:
                
                Modificar_tas();
                
                break;
                
                
            case 3:
                Eliminar_tas();
                
                break;
                
                
            case 4:
                Lista_tas();
                break;
                
                
            case 5:
                cometer_delito();
                break;
               
            
            
        }
        
        
    }

    private static void Agregar_tas() {
        String nombre;
        String edad;
        String genero;
        String pais_reside;
        String encarcelado;
        String descripcion;
        
        int opcion;
    
        System.out.println("Ingrese el tipo de agente que desea contrar \n1)Terrorista \n2)Asesino \n3)Secuestrador");
        opcion = r.nextInt();
        
        
        System.out.println("Ingrese el nombre del criminal");
        nombre = r.next();
        
        System.out.println("Ingresar edad del criminal");
        edad = r.next();
        
        System.out.println("Ingresa el genero del criminal");
        genero = r.next();
        
        System.out.println("INgrese el pais en el que reside el criminal");
        pais_reside = r.next();
  
        System.out.println("Ingrese la descripcion del criminal");
        r.nextLine();
        descripcion = r.nextLine();
        
        
        switch (opcion) {

            case 1:
                String pais_ataque;
                String ciudad;
                String metodo;
                
                System.out.println("Ingrese el pais del ataque");
                pais_ataque = r.next();
                
                System.out.println("Ingrese la ciudad del ataque");
                ciudad = r.next();
                
                System.out.println("Ingrese el metodo de ataque");
                r.nextLine();
                metodo = r.nextLine();
                
                

                tas.add(new Terrorist_TAS(pais_ataque, ciudad , metodo , nombre , edad , genero , pais_reside , "NO PUEDE SER ENCARCELADO" , descripcion));
                break;

            case 2:
               

                String nombre_victim;
                String arma;
                
                System.out.println("Ingrese el nombre de la victima ");
                nombre_victim = r.nextLine();
                
                System.out.println("Ingrese el arma Asesina");
                arma = r.next();
                
                

                tas.add(new Asesino_TAS(nombre_victim, arma , nombre , edad , genero , pais_reside , "NO PUEDE SER ENCARCELADO" , descripcion));

                break;

            case 3:

                String nombre_victima;
                double rescate;
                System.out.println("Ingresar el nombre de la victima a secuestrar");
                nombre_victima = r.next();
                
                System.out.println("Ingrese el cobro por el rescate :)");
                rescate = r.nextDouble();
                
                
                tas.add(new secuestrador_TAS(nombre_victima, rescate,  nombre , edad , genero , pais_reside , "NO PUEDE SER ENCARCELADO" , descripcion));
                break;

        }

    }

    private static void Modificar_tas() {
        String nombre;
        String edad;
        String genero;
        String pais_reside;
        String encarcelado;
        String descripcion;

        //Para el terrorista
        String pais_ataque;
        String ciudad;
        String metodo;

        //
        //Para el asesino
        String nombre_victim;
        String arma;

        //
        // Para el Secuestrador
        String nombre_victima;
        double rescate;

        //
        int posicion;
        int atributo;
        String tipo;

        System.out.println("Ingrese la posicion del Agente del Tas que desea modificar");
        posicion = r.nextInt();

        tipo = tas.get(posicion).getClass().getSimpleName();

        switch (tipo) {

            case "Terrorist_TAS":

                System.out.println("Ingrese el atributo que desea modificar");
                atributo = r.nextInt();

                switch (atributo) {

                    case 1:

                        System.out.println("Ingrese el nombre del criminal");
                        nombre = r.next();
                        
                        ((Terrorist_TAS)tas.get(posicion)).setNombre(nombre);

                        break;

                    case 2:
                        
                        
                        System.out.println("Ingresar edad del criminal");
                        edad = r.next();
                        
                        ((Terrorist_TAS)tas.get(posicion)).setEdad(edad);
                        
                        break;

                    case 3:

                        System.out.println("Ingresa el genero del criminal");
                        genero = r.next();
                        
                        ((Terrorist_TAS)tas.get(posicion)).setGenero(genero);

                        break;

                    case 4:

                        System.out.println("INgrese el pais en el que reside el criminal");
                        pais_reside = r.next();
                        
                        ((Terrorist_TAS)tas.get(posicion)).setPais_reside(pais_reside);

                        break;

                    case 5:

                        System.out.println("Ingrese la descripcion del criminal");
                        descripcion = r.next();
                        
                        ((Terrorist_TAS)tas.get(posicion)).setDescripcion(descripcion);

                        break;

                    case 6:

                        System.out.println("Ingrese el pais del ataque");
                        pais_ataque = r.next();
                        
                        ((Terrorist_TAS)tas.get(posicion)).setPais_ataque(pais_ataque);

                        break;

                    case 7:

                        System.out.println("Ingrese la ciudad del ataque");
                        ciudad = r.next();
                        
                        ((Terrorist_TAS)tas.get(posicion)).setCiudad(ciudad);

                        break;

                    case 8:

                        System.out.println("Ingrese el metodo de ataque");
                        r.nextLine();
                        metodo = r.nextLine();
                        ((Terrorist_TAS)tas.get(posicion)).setMetodo(metodo);

                        break;

                }

                break;

            case "Asesino_TAS":
                System.out.println("Ingrese el atributo que desea modificar");
                atributo = r.nextInt();

                switch (atributo) {

                    case 1:

                        System.out.println("Ingrese el nombre del criminal");
                        nombre = r.next();
                        ((Asesino_TAS)tas.get(posicion)).setNombre(nombre);

                        break;

                    case 2:
                        System.out.println("Ingresar edad del criminal");
                        edad = r.next();
                        ((Asesino_TAS)tas.get(posicion)).setEdad(edad);
                        break;

                    case 3:

                        System.out.println("Ingresa el genero del criminal");
                        genero = r.next();
                        ((Asesino_TAS)tas.get(posicion)).setGenero(genero);

                        break;

                    case 4:

                        System.out.println("INgrese el pais en el que reside el criminal");
                        pais_reside = r.next();
                        ((Asesino_TAS)tas.get(posicion)).setPais_reside(pais_reside);

                        break;

                    case 5:

                        System.out.println("Ingrese la descripcion del criminal");
                        descripcion = r.next();
                        ((Asesino_TAS)tas.get(posicion)).setDescripcion(descripcion);

                        break;

                    case 6:
                        System.out.println("Ingrese el nombre de la victima ");
                        nombre_victim = r.nextLine();
                        ((Asesino_TAS)tas.get(posicion)).setNombre_victim(nombre_victim);

                        break;

                    case 7:

                        System.out.println("Ingrese el arma Asesina");
                        arma = r.next();
                        ((Asesino_TAS)tas.get(posicion)).setArma(arma);
                        break;
                }

                break;

            case "secuestrador_TAS":
                System.out.println("Ingrese el atributo que desea modificar");
                atributo = r.nextInt();

                switch (atributo) {

                    case 1:

                        System.out.println("Ingrese el nombre del criminal");
                        nombre = r.next();
                        ((secuestrador_TAS)tas.get(posicion)).setNombre(nombre);

                        break;

                    case 2:
                        System.out.println("Ingresar edad del criminal");
                        edad = r.next();
                        ((secuestrador_TAS)tas.get(posicion)).setEdad(edad);
                        break;

                    case 3:

                        System.out.println("Ingresa el genero del criminal");
                        genero = r.next();
                        ((secuestrador_TAS)tas.get(posicion)).setGenero(genero);

                        break;

                    case 4:

                        System.out.println("INgrese el pais en el que reside el criminal");
                        pais_reside = r.next();
                        ((secuestrador_TAS)tas.get(posicion)).setPais_reside(pais_reside);

                        break;

                    case 5:

                        System.out.println("Ingrese la descripcion del criminal");
                        descripcion = r.next();
                        ((secuestrador_TAS)tas.get(posicion)).setDescripcion(descripcion);

                        break;

                    case 6:
                        System.out.println("Ingresar el nombre de la victima a secuestrar");
                        nombre_victima = r.next();
                        ((secuestrador_TAS)tas.get(posicion)).setNombre_victima(nombre_victima);
                        break;

                    case 7:

                        System.out.println("Ingrese el cobro por el rescate :)");
                        rescate = r.nextDouble();
                        ((secuestrador_TAS)tas.get(posicion)).setRescate(rescate);

                        break;

                }

                break;

        }

    }

    private static void Eliminar_tas() {
        int posicion;
        System.out.println("Ingrese la posicion del agente del TAS que desea Eliminar");
        posicion = r.nextInt();
        
        tas.remove(posicion);
     
    }

    private static void Lista_tas() {
        
        for (int i = 0; i < tas.size(); i++) {
            System.out.println("\nPosicion del criminal: " +tas.indexOf(tas.get(i)) + "\n--------------------------------------"+ "" +tas.get(i)+"\n");
        }
       
    }

    
    
   
    
    


    private static void cometer_delito() {
        
        try {
            //Aqui se llama al metodo polimorfico , hecho con una interfaz
            //la interfaz se implementa en la clase agente
            
            int posicion;
            System.out.println("--------------------------------------------------");
            System.out.println("Ingrese la posicion del Agente que desea que cometa el Crimen wuajajaja ");
            posicion = r.nextInt();
            
            
            validad(tas.get(posicion).getDelito());
            tas.get(posicion).getDelito().add(new Delito());
            tas.get(posicion).cometer_delito();
        } catch (MiExcepcion ex) {
            System.out.println(ex.getMessage());
        }
       
        
        
    }
    
    
       static void validad(ArrayList<Delito> x) throws MiExcepcion{
           if (!x.isEmpty()) {
               System.out.println("EL DELITO YA FUE REALIZDO: \nRecuerde:");
           }
   
    }
    
    
   
       
       
  
    
    public static void delito() {
        int opcion;
        System.out.println("1. Agregar\n 2.Modificar\n 3.Eliminar\n 4.Listar");
        opcion = r.nextInt();
        
        switch(opcion){
            case 1:
                a_delito();
                break;
                
                
            case 2:
                m_delito();
                break;
                        
                        
            case 3:
                e_delito();
                break;
                
            case 4:
                l_delito();
                break;
                
                
            
        }
        
        
        
    }
    
    

    public static void a_delito() {
        String nom_dueno, edificacion, nombre_arma, nombre_artefacto, nombre_droga, nom_solicitante, objeto, descripcion, nombre_delito, culpable = null, sentencia = null, pais;
        int culp, sent, t, tipo, pisos, cantidad, num_victimas, num_cuerpos, edad_victima;
        Date fecha_crimen;
        String n_policia, id_policia;
        int n_celda, punt, dv;
        double valor, t_retenido;
        boolean rescatado = false;
        System.out.println("Descripcion: ");
        r.nextLine();
        descripcion = r.nextLine();
        try {
            texto(descripcion);
        } catch (MiExcepcion ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Nombre del delito: ");
        nombre_delito = r.nextLine();
        try {
            texto(nombre_delito);
        } catch (MiExcepcion ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Culpable [1.Si, 2.No]: ");
        culp = r.nextInt();
        try {
            num(culp);
        } catch (MiExcepcion ex) {
            System.out.println(ex.getMessage());
        }
        while (culp < 1 || culp > 2) {
            System.out.println("Culpable [1.Si, 2.No]: ");
            culp = r.nextInt();
            try {
                num(culp);
            } catch (MiExcepcion ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (culp == 1) {
            culpable = "Si";
        }
        if (culp == 2) {
            culpable = "No";
        }
        if (culp == 1) {
            System.out.println("Sentencia [1.Tiempo, 2.Pena de muerte]: ");
            sent = r.nextInt();
            try {
                num(sent);
            } catch (MiExcepcion ex) {
                System.out.println(ex.getMessage());
            }
            while (sent < 1 || sent > 2) {
                System.out.println("Sentencia [1.Tiempo, 2.Pena de muerte]: ");
                sent = r.nextInt();
                try {
                    num(sent);
                } catch (MiExcepcion ex) {
                    System.out.println(ex.getMessage());
                }
            }
            if (sent == 1) {
                System.out.println("Ingrese el tiempo: ");
                sentencia = r.next();
            }
            if (sent == 2) {
                sentencia = "Pena de muerte";
            }

        }
        //System.out.println("Fecha del crimen: ");
        fecha_crimen = new Date();
        System.out.println("Pais: ");
        pais = r.next();
        try {
            texto(pais);
        } catch (MiExcepcion ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Que tipo de delito es? [1.Menor, 2.Grave]: ");
        t = r.nextInt();
        try {
            num(t);
        } catch (MiExcepcion ex) {
            System.out.println(ex.getMessage());
        }
        while (t < 1 || t > 2) {
            System.out.println("Que tipo de delito es? [1.Menor, 2.Grave]: ");
            t = r.nextInt();
            try {
                num(t);
            } catch (MiExcepcion ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (t == 1) {
            System.out.println("Nombre de policia: ");
            n_policia = r.next();
            try {
                texto(n_policia);
            } catch (MiExcepcion ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println("ID policia: ");
            id_policia = r.next();
            try {
                texto(id_policia);
            } catch (MiExcepcion ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println("Numero de celda: ");
            n_celda = r.nextInt();
            try {
                num(n_celda);
            } catch (MiExcepcion ex) {
                System.out.println(ex.getMessage());
            }

            System.out.println("1.Vandalismo\n2.Hurto\n3.Prostitucion");
            tipo = r.nextInt();
            try {
                num(tipo);
            } catch (MiExcepcion ex) {
                System.out.println(ex.getMessage());
            }
            while (tipo < 1 || tipo > 4) {
                System.out.println("1.Vandalismo\n2.Hurto\n3.Prostitucion");
                tipo = r.nextInt();
                try {
                    num(tipo);
                } catch (MiExcepcion ex) {
                    System.out.println(ex.getMessage());
                }
                switch (tipo) {
                    case 1:
                        System.out.println("Edificacion: ");
                        edificacion = r.next();
                        try {
                            texto(edificacion);
                        } catch (MiExcepcion ex) {
                            System.out.println(ex.getMessage());
                        }
                        System.out.println("Pisos: ");
                        pisos = r.nextInt();
                        try {
                            num(pisos);
                        } catch (MiExcepcion ex) {
                            System.out.println(ex.getMessage());
                        }
                        System.out.println("Nombre del dueno: ");
                        nom_dueno = r.next();
                        try {
                            texto(nom_dueno);
                        } catch (MiExcepcion ex) {
                            System.out.println(ex.getMessage());
                        }
                        del.add(new Vandalismo(edificacion, pisos, nom_dueno, n_policia, id_policia, n_celda, descripcion, nombre_delito, culpable, sentencia, fecha_crimen, pais));
                        break;

                    case 2:
                        System.out.println("Objeto: ");
                        objeto = r.next();
                        try {
                            texto(objeto);
                        } catch (MiExcepcion ex) {
                            System.out.println(ex.getMessage());
                        }
                        System.out.println("Valor: ");
                        valor = r.nextDouble();
                        try {
                            dec(valor);
                        } catch (MiExcepcion ex) {
                            System.out.println(ex.getMessage());
                        }
                        del.add(new Hurto(objeto, valor, n_policia, id_policia, n_celda, descripcion, nombre_delito, culpable, sentencia, fecha_crimen, pais));
                        break;

                    case 3:
                        System.out.println("Nombre del solicitante:");
                        nom_solicitante = r.next();
                        try {
                            texto(nom_solicitante);
                        } catch (MiExcepcion ex) {
                            System.out.println(ex.getMessage());
                        }
                        del.add(new Prostitucion(nom_solicitante, n_policia, id_policia, n_celda, descripcion, nombre_delito, culpable, sentencia, fecha_crimen, pais));
                        break;

                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
            }
        }
        if (t == 2) {
            System.out.println("Puntuacion (1-5): ");
            punt = r.nextInt();
            try {
                num(punt);
            } catch (MiExcepcion ex) {
                System.out.println(ex.getMessage());
            }
            while (punt < 1 || punt > 5) {
                System.out.println("Puntuacion (1-5): ");
                punt = r.nextInt();
                try {
                    num(punt);
                } catch (MiExcepcion ex) {
                    System.out.println(ex.getMessage());
                }
            }
            System.out.println("1) Trafico de drogas\n2.Terrorismo\n3.Asesinato\n4.Violacion\n5.Secuestro");
            tipo = r.nextInt();
            try {
                num(tipo);
            } catch (MiExcepcion ex) {
                System.out.println(ex.getMessage());
            }
            while (tipo < 1 || tipo > 5) {
                System.out.println("1.Trafico de drogas \n2.Terrorismo\n3.Asesinato\n4.Violacion\n5.Secuestro");
                tipo = r.nextInt();
                try {
                    num(tipo);
                } catch (MiExcepcion ex) {
                    System.out.println(ex.getMessage());
                }
            }
            switch (tipo) {

                case 1:
                    System.out.println("Nombre de la droga: ");
                    nombre_droga = r.next();
                    try {
                        num(punt);
                    } catch (MiExcepcion ex) {
                        System.out.println(ex.getMessage());
                    }
                    System.out.println("Cantidad: ");
                    cantidad = r.nextInt();
                    try {
                        num(cantidad);
                    } catch (MiExcepcion ex) {
                        System.out.println(ex.getMessage());
                    }
                    del.add(new trafico_drogas(nombre_droga, cantidad, punt, descripcion, nombre_delito, culpable, sentencia, fecha_crimen, pais));
                    break;

                case 2:
                    System.out.println("Nombre del artefacto:");
                    nombre_artefacto = r.next();
                    try {
                        texto(nombre_artefacto);
                    } catch (MiExcepcion ex) {
                        System.out.println(ex.getMessage());
                    }
                    System.out.println("Numero de victimas: ");
                    num_victimas = r.nextInt();
                    try {
                        num(num_victimas);
                    } catch (MiExcepcion ex) {
                        System.out.println(ex.getMessage());
                    }
                    del.add(new Terrorismo(nombre_artefacto, num_victimas, punt, descripcion, nombre_delito, culpable, sentencia, fecha_crimen, pais));
                    break;

                case 3:
                    System.out.println("Nombre del arma: ");
                    nombre_arma = r.next();
                    try {
                        texto(nombre_arma);
                    } catch (MiExcepcion ex) {
                        System.out.println(ex.getMessage());
                    }
                    System.out.println("Numero de cuerpos: ");
                    num_cuerpos = r.nextInt();
                    try {
                        num(num_cuerpos);
                    } catch (MiExcepcion ex) {
                        System.out.println(ex.getMessage());
                    }
                    del.add(new asesinato(nombre_arma, num_cuerpos, punt, descripcion, nombre_delito, culpable, sentencia, fecha_crimen, pais));
                    break;

                case 4:
                    System.out.println("Edad de la victima: ");
                    edad_victima = r.nextInt();
                    try {
                        num(edad_victima);
                    } catch (MiExcepcion ex) {
                        System.out.println(ex.getMessage());
                    }
                    del.add(new violacion(edad_victima, punt, descripcion, nombre_delito, culpable, sentencia, fecha_crimen, pais));
                    break;

                case 5:
                    System.out.println("Tiempo retenido: ");
                    t_retenido = r.nextDouble();
                    try {
                        dec(t_retenido);
                    } catch (MiExcepcion ex) {
                        System.out.println(ex.getMessage());
                    }
                    System.out.println("Devuelto vivo [1.Si, 2.No]: ");
                    dv = r.nextInt();
                    try {
                        num(dv);
                    } catch (MiExcepcion ex) {
                        System.out.println(ex.getMessage());
                    }
                    while (dv < 1 || dv > 2) {
                        System.out.println("Devuelto vivo [1.Si, 2.No]: ");
                        dv = r.nextInt();
                        try {
                            num(dv);
                        } catch (MiExcepcion ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                    if (dv == 1) {
                        rescatado = true;
                    }
                    if (dv == 2) {
                        rescatado = false;
                    }
                    del.add(new secuestro(t_retenido, rescatado, punt, descripcion, nombre_delito, culpable, sentencia, fecha_crimen, pais));
                    break;

            }
        }

    }

    public static void m_delito() {
        String nom_dueno, edificacion, nombre_arma, nombre_artefacto, nombre_droga, nom_solicitante, objeto, descripcion, nombre_delito, culpable = null, sentencia = null, pais;
        int culp, sent, t, tipo, pisos, cantidad, num_victimas, num_cuerpos, edad_victima;
        Date fecha_crimen;
        String n_policia, id_policia, d = "";
        int n_celda, punt, dv, pos, opc;
        double valor, t_retenido;
        boolean rescatado = false;
        for (int i = 0; i < del.size(); i++) {
            d += i + " = " + del.get(i);
        }
        System.out.println("Delitos\n" + d);
        System.out.println("Ingrese la posicion del delito a modificar: ");
        pos = r.nextInt();
        try {
            num(pos);
        } catch (MiExcepcion ex) {
            System.out.println(ex.getMessage());
        }
        while (pos < 0 || pos > del.size()) {
            System.out.println("Ingrese la posicion del delito a modificar: ");
            pos = r.nextInt();
            try {
                num(pos);
            } catch (MiExcepcion ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println("Que desea modificar?\n1.Descripcion\n2.Nombre del delito\n3.Culpable\n4.Sentencia\n5.Fecha del crimen\n6.Pais\n7.Extra");
        opc = r.nextInt();
        try {
            num(opc);
        } catch (MiExcepcion ex) {
            System.out.println(ex.getMessage());
        }
        switch (opc) {
            case 1:
                System.out.println("Descripcion: ");
                r.nextLine();
                descripcion = r.nextLine();
                try {
                    texto(descripcion);
                } catch (MiExcepcion ex) {
                    System.out.println(ex.getMessage());
                }
                del.get(pos).setDescriptcion(descripcion);
                break;

            case 2:
                System.out.println("Nombre del delito: ");
                r.nextLine();
                nombre_delito = r.nextLine();
                try {
                    texto(nombre_delito);
                } catch (MiExcepcion ex) {
                    System.out.println(ex.getMessage());
                }
                del.get(pos).setNombre_delito(nombre_delito);

                break;

            case 3:
                System.out.println("Culpable [1.Si, 2.No]: ");
                culp = r.nextInt();
                try {
                    num(culp);
                } catch (MiExcepcion ex) {
                    System.out.println(ex.getMessage());
                }
                while (culp < 1 || culp > 2) {
                    System.out.println("Culpable [1.Si, 2.No]: ");
                    culp = r.nextInt();
                    try {
                        num(culp);
                    } catch (MiExcepcion ex) {
                        System.out.println(ex.getMessage());
                    }
                }
                if (culp == 1) {
                    culpable = "Si";
                }
                if (culp == 2) {
                    culpable = "No";
                }
                del.get(pos).setCulpable(culpable);
                break;

            case 4:
                if (del.get(pos).getCulpable().equals("Si")) {
                    System.out.println("Sentencia [1.Tiempo, 2.Pena de muerte]: ");
                    sent = r.nextInt();
                    try {
                        num(sent);
                    } catch (MiExcepcion ex) {
                        System.out.println(ex.getMessage());
                    }
                    if (sent == 1) {
                        System.out.println("Ingrese el tiempo: ");
                        sentencia = r.next();
                    }
                    if (sent == 2) {
                        sentencia = "Pena de muerte";
                    }
                }
                del.get(pos).setSentencia(sentencia);
                break;

            case 5:

                System.out.println("Fecha del crimen: ");
                fecha_crimen = new Date();
                del.get(pos).setFecha_crimen(fecha_crimen);
                break;

            case 6:
                System.out.println("Pais: ");
                pais = r.next();
                try {
                    texto(pais);
                } catch (MiExcepcion ex) {
                    System.out.println(ex.getMessage());
                }
                del.get(pos).setPais(pais);

                break;

            case 7:
                if (del.get(pos) instanceof D_menor) {
                    int dm, opci;
                    String tipos;
                    System.out.println("Modificar\n1.Nombre del policia\n2.Id policia\n3.Numero de celda\n4.Otro");
                    dm = r.nextInt();
                    switch (dm) {

                        case 1:
                            System.out.println("Nombre de policia: ");
                            n_policia = r.next();
                            try {
                                texto(n_policia);
                            } catch (MiExcepcion ex) {
                                System.out.println(ex.getMessage());
                            }
                            ((D_menor) del.get(pos)).setNombre_policia(n_policia);
                            break;

                        case 2:
                            System.out.println("ID policia: ");
                            id_policia = r.next();
                            try {
                                texto(id_policia);
                            } catch (MiExcepcion ex) {
                                System.out.println(ex.getMessage());
                            }
                            ((D_menor) del.get(pos)).setId_policia(id_policia);

                            break;

                        case 3:
                            System.out.println("Numero de celda: ");
                            n_celda = r.nextInt();
                            try {
                                num(n_celda);
                            } catch (MiExcepcion ex) {
                                System.out.println(ex.getMessage());
                            }
                            ((D_menor) del.get(pos)).setN_celda(n_celda);
                            break;

                        case 4:

                            tipos = del.get(pos).getClass().getSimpleName();
                            switch (tipos) {
                                case "Hurto":
                                    System.out.println(" 1.Objeto\n 2.Valor: ");
                                    opci = r.nextInt();
                                    try {
                                        num(opci);
                                    } catch (MiExcepcion ex) {
                                        System.out.println(ex.getMessage());
                                    }
                                    switch (opci) {
                                        case 1:
                                            System.out.println("Objeto: ");
                                            objeto = r.next();
                                            try {
                                                texto(objeto);
                                            } catch (MiExcepcion ex) {
                                                System.out.println(ex.getMessage());
                                            }
                                            ((Hurto) del.get(pos)).setObjeto(objeto);
                                            break;
                                        case 2:
                                            System.out.println("Valor: ");
                                            valor = r.nextDouble();
                                            try {
                                                dec(valor);
                                            } catch (MiExcepcion ex) {
                                                System.out.println(ex.getMessage());
                                            }
                                            ((Hurto) del.get(pos)).setValor(valor);
                                            break;
                                        default:
                                            System.out.println("Opcion no valida");
                                            break;
                                    }
                                    break;

                                case "Vandalismo":
                                    System.out.println("1.Edificacion\n2.Pisos\n3.Nombre del dueno: ");
                                    opci = r.nextInt();
                                    try {
                                        num(opci);
                                    } catch (MiExcepcion ex) {
                                        System.out.println(ex.getMessage());
                                    }
                                    switch (opci) {
                                        case 1:
                                            System.out.println("Edificacion: ");
                                            edificacion = r.next();
                                            try {
                                                texto(edificacion);
                                            } catch (MiExcepcion ex) {
                                                System.out.println(ex.getMessage());
                                            }
                                            ((Vandalismo) del.get(pos)).setEdificacion(edificacion);
                                            break;

                                        case 2:
                                            System.out.println("Pisos: ");
                                            pisos = r.nextInt();
                                            try {
                                                num(pisos);
                                            } catch (MiExcepcion ex) {
                                                System.out.println(ex.getMessage());
                                            }
                                            ((Vandalismo) del.get(pos)).setPisos(pisos);
                                            break;

                                        case 3:

                                            System.out.println("Nombre del dueno: ");
                                            nom_dueno = r.next();
                                            try {
                                                texto(nom_dueno);
                                            } catch (MiExcepcion ex) {
                                                System.out.println(ex.getMessage());
                                            }
                                            ((Vandalismo) del.get(pos)).setNom_dueno(nom_dueno);
                                            break;

                                        default:
                                            System.out.println("Opcion no valida");
                                            break;
                                    }
                                    break;

                                case "Prostitucion":
                                    System.out.println(" 1.Nombre del solicitante: ");
                                    opci = r.nextInt();
                                    try {
                                        num(opci);
                                    } catch (MiExcepcion ex) {
                                        System.out.println(ex.getMessage());
                                    }
                                    switch (opci) {
                                        case 1:
                                            System.out.println("Nombre del solicitante:");
                                            nom_solicitante = r.next();
                                            try {
                                                texto(nom_solicitante);
                                            } catch (MiExcepcion ex) {
                                                System.out.println(ex.getMessage());
                                            }
                                            ((Prostitucion) del.get(pos)).setNom_solicitante(nom_solicitante);
                                            break;

                                        default:
                                            System.out.println("Opcion no valida");
                                            break;
                                    }
                                    break;

                            }//cierra case 4
                            break;

                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }

                }

                if (del.get(pos) instanceof D_Grave) {
                    int dm, opci;
                    String tipos;
                    System.out.println("Modificar\n1.Puntuacion\n2.Otro");
                    dm = r.nextInt();
                    try {
                        num(dm);
                    } catch (MiExcepcion ex) {
                        System.out.println(ex.getMessage());
                    }

                    switch (dm) {

                        case 1:
                            System.out.println("Puntuacion (1-5): ");
                            punt = r.nextInt();
                            try {
                                num(punt);
                            } catch (MiExcepcion ex) {
                                System.out.println(ex.getMessage());
                            }
                            while (punt < 1 || punt > 5) {
                                System.out.println("Puntuacion (1-5): ");
                                punt = r.nextInt();
                                try {
                                    num(punt);
                                } catch (MiExcepcion ex) {
                                    System.out.println(ex.getMessage());
                                }
                            }
                            ((D_Grave) del.get(pos)).setPuntuacion(punt);
                            break;

                        case 2:
                            tipos = del.get(pos).getClass().getSimpleName();
                            switch (tipos) {
                                case "trafico_drogas":
                                    System.out.println(" 1.Nombre de la droga\n 2.Cantidad: ");
                                    opci = r.nextInt();
                                    try {
                                        num(opci);
                                    } catch (MiExcepcion ex) {
                                        System.out.println(ex.getMessage());
                                    }
                                    switch (opci) {
                                        case 1:
                                            System.out.println("Nombre de la droga: ");
                                            nombre_droga = r.next();
                                            try {
                                                texto(nombre_droga);
                                            } catch (MiExcepcion ex) {
                                                System.out.println(ex.getMessage());
                                            }
                                            ((trafico_drogas) del.get(pos)).setNombre_droga(nombre_droga);
                                            break;
                                        case 2:
                                            System.out.println("Cantidad: ");
                                            cantidad = r.nextInt();
                                            try {
                                                num(cantidad);
                                            } catch (MiExcepcion ex) {
                                                System.out.println(ex.getMessage());
                                            }
                                            ((trafico_drogas) del.get(pos)).setCantidad(cantidad);
                                            break;
                                        default:
                                            System.out.println("Opcion no valida");
                                            break;
                                    }
                                    break;

                                case "asesinato":
                                    System.out.println(" 1.Nombre del arma\n 2.Numero de cuerpos: ");
                                    opci = r.nextInt();
                                    try {
                                        num(opci);
                                    } catch (MiExcepcion ex) {
                                        System.out.println(ex.getMessage());
                                    }
                                    switch (opci) {
                                        case 1:
                                            System.out.println("Nombre del arma: ");
                                            nombre_arma = r.next();
                                            try {
                                                texto(nombre_arma);
                                            } catch (MiExcepcion ex) {
                                                System.out.println(ex.getMessage());
                                            }
                                            ((asesinato) del.get(pos)).setNombre_Arma(nombre_arma);
                                            break;

                                        case 2:
                                            System.out.println("Numero de cuerpos: ");
                                            num_cuerpos = r.nextInt();
                                            try {
                                                num(num_cuerpos);
                                            } catch (MiExcepcion ex) {
                                                System.out.println(ex.getMessage());
                                            }
                                            ((asesinato) del.get(pos)).setNum_cuerpos(num_cuerpos);
                                            break;

                                        default:
                                            System.out.println("Opcion no valida");
                                            break;
                                    }
                                    break;

                                case "Terrorismo":
                                    System.out.println(" 1.Nombre del artefacto\n 2.Numero de victimas: ");
                                    opci = r.nextInt();
                                    switch (opci) {
                                        case 1:
                                            System.out.println("Nombre del artefacto:");
                                            nombre_artefacto = r.next();
                                            try {
                                                texto(nombre_artefacto);
                                            } catch (MiExcepcion ex) {
                                                System.out.println(ex.getMessage());
                                            }
                                            ((Terrorismo) del.get(pos)).setNombre_artefacto(nombre_artefacto);
                                            break;

                                        case 2:
                                            System.out.println("Numero de victimas: ");
                                            num_victimas = r.nextInt();
                                            try {
                                                num(num_victimas);
                                            } catch (MiExcepcion ex) {
                                                System.out.println(ex.getMessage());
                                            }
                                            ((Terrorismo) del.get(pos)).setNum_victimas(num_victimas);
                                            break;

                                        default:
                                            System.out.println("Opcion no valida");
                                            break;
                                    }
                                    break;

                                case "violacion":
                                    System.out.println(" 1.Edad de la victima: ");
                                    opci = r.nextInt();
                                    switch (opci) {
                                        case 1:
                                            System.out.println("Edad de la victima: ");
                                            edad_victima = r.nextInt();
                                            try {
                                                num(edad_victima);
                                            } catch (MiExcepcion ex) {
                                                System.out.println(ex.getMessage());
                                            }
                                            ((violacion) del.get(pos)).setEdad_victima(edad_victima);
                                            break;

                                        default:
                                            System.out.println("Opcion no valida");
                                            break;
                                    }
                                    break;

                                case "secuestro":
                                    System.out.println(" 1.Tiempo retenido\n 2.Devuelto vivo: ");
                                    opci = r.nextInt();
                                    try {
                                        num(opci);
                                    } catch (MiExcepcion ex) {
                                        System.out.println(ex.getMessage());
                                    }
                                    switch (opci) {
                                        case 1:
                                            System.out.println("Tiempo retenido: ");
                                            t_retenido = r.nextDouble();
                                            try {
                                                dec(t_retenido);
                                            } catch (MiExcepcion ex) {
                                                System.out.println(ex.getMessage());
                                            }
                                            ((secuestro) del.get(pos)).setT_retenido(t_retenido);
                                            break;

                                        case 2:
                                            System.out.println("Devuelto vivo [1.Si, 2.No]: ");
                                            dv = r.nextInt();
                                            try {
                                                num(dv);
                                            } catch (MiExcepcion ex) {
                                                System.out.println(ex.getMessage());
                                            }
                                            while (dv < 1 || dv > 2) {
                                                System.out.println("Devuelto vivo [1.Si, 2.No]: ");
                                                dv = r.nextInt();
                                            }
                                            if (dv == 1) {
                                                rescatado = true;
                                            }
                                            if (dv == 2) {
                                                rescatado = false;
                                            }
                                            ((secuestro) del.get(pos)).setRescatado(rescatado);
                                            break;

                                        default:
                                            System.out.println("Opcion no valida");
                                            break;
                                    }
                                    break;

                            }//cierra case 4
                            break;

                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }

                }
                break;

            default:
                System.out.println("Opcion no valida");
                break;
        }

    }

    public static void e_delito() {
        String d = "";
        int pos, des;
        for (int i = 0; i < del.size(); i++) {
            d += i + " = " + del.get(i);
        }
        System.out.println(d);
        System.out.println("Que posicion desea eliminar?: ");
        pos = r.nextInt();
        try {
            num(pos);
        } catch (MiExcepcion ex) {
            System.out.println(ex.getMessage());
        }
        while (pos < 0 || pos > del.size()) {
            System.out.println("Que posicion desea eliminar?: ");
            pos = r.nextInt();
            try {
                num(pos);
            } catch (MiExcepcion ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println("Desea eliminar?\n 1.Si\n 2.No:");
        des = r.nextInt();
        try {
            num(des);
        } catch (MiExcepcion ex) {
            System.out.println(ex.getMessage());
        }
        if (des == 1) {
            del.remove(pos);
            System.out.println("Posicion removida con exito");
        } else {
            System.out.println("Elemento no borrado");
        }
    }

    public static void l_delito() {
        String va = "", hur = "", pros = "", terr = "", tra = "", ase = "", vio = "", sec = "";
        System.out.println("Delitos Menores");
        System.out.println("------------------------------------------------");
        System.out.println("Vandalismo");
        for (int j = 0; j < del.size(); j++) {
            
            if (del.get(j) instanceof D_menor ) {
                if(del.get(j) instanceof Vandalismo){
               System.out.println(del.get(j));
           }
                
            }
           
        }
        System.out.println(va + "\n");

        System.out.println("Hurto");
        for (int i = 0; i < del.size(); i++) {
            
            if (del.get(i) instanceof D_menor) {
                if(del.get(i) instanceof Hurto){
               System.out.println(del.get(i));
           }
            }
             
        }
        System.out.println(hur + "\n");

        System.out.println("Prostitucion");
        for (int i = 0; i < del.size(); i++) {
             if(del.get(i) instanceof Prostitucion){
               System.out.println(del.get(i));
           }
        }
        System.out.println(pros + "\n");
        System.out.println("Graves");
        System.out.println("----------------------------------------------------");
        System.out.println("Terroristas");
        for (int i = 0; i < del.size(); i++) {
            if (del.get(i).getClass().getSimpleName().equals("Terrorismo")) {
                terr += del.get(i);
            }
        }
        System.out.println(terr + "\n");

        System.out.println("Trafico de drogas");
        for (int i = 0; i < del.size(); i++) {
            if (del.get(i).getClass().getSimpleName().equals("trafico_drogas")) {
                tra += del.get(i);
            }
        }
        System.out.println(tra + "\n");

        System.out.println("Asesinato");
        for (int i = 0; i < del.size(); i++) {
            if (del.get(i).getClass().getSimpleName().equals("asesinato")) {
                ase += del.get(i);
            }
        }
        System.out.println(ase + "\n");

        System.out.println("Violacion");
        for (int i = 0; i < del.size(); i++) {
            if (del.get(i).getClass().getSimpleName().equals("violacion")) {
                vio += del.get(i);
            }
        }
        System.out.println(vio + "\n");

        System.out.println("Secuetro");
        for (int i = 0; i < del.size(); i++) {
            if (del.get(i).getClass().getSimpleName().equals("secuestro")) {
                sec += del.get(i);
            }
        }
        System.out.println(sec + "\n");
    }

    static void texto(String nombre) throws MiExcepcion {
        if (nombre.matches("([a-z]|[A-Z]|\\s)+") == false) {
            System.out.println("Vuelva a ingresar el TEXTO");
            nombre = r.next();
        }
    }

    public static void num(int numero) throws MiExcepcion {
        if (Integer.toString(numero).matches("^[0-9]+$") == false) {
            System.out.println("Vuelva a ingresar el NUMERO");
            numero = r.nextInt();
        }
    }

    public static void dec(double decimal) throws MiExcepcion {

        if (Double.toString(decimal).matches("^-?[0-9]+([\\.,][0-9]{1," + decimal + "})?$") == false) {
            System.out.println("Vuelva a ingresar el NUMERO");
            decimal = r.nextDouble();
        }
    }
    
    
    
    


    

    
}
