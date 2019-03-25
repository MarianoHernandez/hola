/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proveedores;

import java.io.BufferedReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author mariano
 */
public class Proveedores {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        String coma = ",";
        String enter = "\n";
        String empresas[];
        BufferedReader b = null;
        String nombre;
        String razsoc;
        String Rut;
        String Telefono;
        String correo;
        String direccion;
        String linea = "";


        List<provedor> prove = new ArrayList<>();//se crea una lista 
        List<comNombreTree> prove1 = new ArrayList<>();//se crea diferentes listas para elegir el comparador del TresSet
        List<provedor2> prove2 = new ArrayList<>();
        List<comEmailTree> prove3 = new ArrayList<>();
        List argu = new ArrayList();
        Set<comNombreTree> Tree = new TreeSet<>();//Tree Set que compara por Nombre
        Set<provedor2> raz = new TreeSet<>();//Tree Set que compara por Razon Social
        Set<comEmailTree> mail = new TreeSet<>();//Tree Set que compara por Email
        for (int i = 0; i < args.length; i++) {
            argu.add(args[i]);
            if((argu.get(i).equals("-c"))||(argu.get(i).equals("-t"))||(argu.get(i).equals("-l"))||(argu.get(i).equals("-sNom"))||(argu.get(i).equals("-sRaz"))||(argu.get(i).equals("-sEmail"))){
                     
           }else{
               System.err.println("Los parametros ingresados son incorectos, por favor intente con -l,-t,-c,-sNom,-sRaz,-sEmail");
           System.exit(0);
            }
            
      
        }
        try {
            Scanner sc = new Scanner(System.in);//lee archivo
            while (sc.hasNextLine()) {
                linea = sc.nextLine();
                
                empresas = linea.split(coma);
                nombre = empresas[0];//le pone nombre a la informacion que entra en el string
                razsoc = empresas[1];
                Rut = empresas[2];
                Telefono = empresas[4];
                correo = empresas[5];
                direccion = empresas[3];

                provedor u = new provedor(nombre, razsoc, Rut,direccion , Telefono, correo);//llama a los objetos creados en las clases
                provedor2 t = new provedor2(nombre, razsoc, Rut,direccion , Telefono, correo);
                comEmailTree z = new comEmailTree(nombre, razsoc, Rut,direccion , Telefono, correo);
                comNombreTree x = new comNombreTree(nombre, razsoc, Rut,direccion , Telefono, correo);

                prove.add(u);//añade los objetos a las listas
               
                prove2.add(t);//añade los objetos a la lista 
                prove3.add(z);
                prove1.add(x);

                Tree.addAll(prove1);//añade las listas con comparadores alTreeSet
                raz.addAll(prove2);
                mail.addAll(prove3);

            }

            if (argu.contains("-l") && argu.contains("-t")) {//si ingresas los parametros -t y -l se ordena como un TreeSet
                argu.remove("-l");
                System.out.println("Los parámetros elegidos fueron:" + argu);

                if (argu.contains("-sNom")) {//se imprimen los TreeSet

                    System.out.println("Provedores ordenados por Nombre:\n");
                    System.out.println(Tree);
                }
                if (argu.contains("-sRaz")) {

                    System.out.println("Provedores ordenados por Razon Social:\n");
                    System.out.println(raz);
                }
                if (argu.contains("-sEmail")) {

                    System.out.println("Provedores ordenados por Email:\n");
                    System.out.println(mail);
                }
                if (argu.contains("-c")) {
                    System.out.println("Cantidad de provedores:\n");
                    System.out.println(prove.size());
                }

            } else if (argu.contains("-l")) {//si solo contiene el parametro -l se ordena como una lista 

                System.out.println("Los parámetros elegidos fueron:" + argu);

                if (argu.contains("-sNom")) {//se imprimen la Listas
                    Collections.sort(prove, new ComparadorNom());
                    System.out.println("Provedores ordenados por Nombre:\n");
                    prove.forEach((t) -> {
                        System.out.println(t);
                    });
                }
                if (argu.contains("-sRaz")) {
                    Collections.sort(prove, new ComparadorRazonSocial());
                    System.out.println("Provedores ordenados por Razon Social:\n");
                    prove.forEach((r) -> {
                        System.out.println(r);
                    });
                }
                if (argu.contains("-sEmail")) {
                    Collections.sort(prove, new ComparadorEmail());
                    System.out.println("Provedores ordenados por Email:\n");
                    prove.forEach((e) -> {
                        System.out.println(e);
                    });
                }
                if (argu.contains("-c")) {
                    System.out.println("La cantidad de empresas son:");
                    System.out.println(prove.size());
                }

            } else if (argu.contains("-t")) {//Si el Parametro es -t 
                System.out.println("Los parámetros elegidos fueron:" + argu);

                if (argu.contains("-sNom")) {

                    System.out.println("Provedores ordenados por Nombre:\n");
                    System.out.println(Tree);
                }
                if (argu.contains("-sRaz")) {

                    System.out.println("Provedores ordenados por Razon Social:\n");
                    System.out.println(raz);
                }
                if (argu.contains("-sEmail")) {

                    System.out.println("Provedores ordenados por Email:\n");
                    System.out.println(mail);
                }
                if (argu.contains("-c")) {
                    System.out.println("Cantidad de provedores:\n");
                    System.out.println(prove.size());
                }

            } else {//si no esta -l o -t se ordena como lista por defecto

                System.out.println("Los parámetros elegidos fueron:" + argu + "y por defecto se ordeno en una lista ");
                //argu.add("-l");

                if (argu.contains("-sNom")) {//se imprimen la Listas
                    Collections.sort(prove, new ComparadorNom());
                    System.out.println("Provedores ordenados por Nombre:\n");
                    for (provedor t : prove) {
                        System.out.println(t);
                    }
                }
                if (argu.contains("-sRaz")) {
                    Collections.sort(prove, new ComparadorRazonSocial());
                    System.out.println("Provedores ordenados por Razon Social:\n");
                    for (provedor r : prove) {
                        System.out.println(r);
                    }
                }
                if (argu.contains("-sEmail")) {
                    Collections.sort(prove, new ComparadorEmail());
                    System.out.println("Provedores ordenados por Email:\n");
                    for (provedor e : prove) {
                        System.out.println(e);
                    }
                }
                if (argu.contains("-c")) {
                    System.out.println("La cantidad de proveedores son:");
                    System.out.println(prove.size());
                }

            }

        } catch (java.lang.ArrayIndexOutOfBoundsException e) {//posibles errores al ejecutar el programa
            System.err.println("Error,por favor ingrese todos los datos de las empresas");
       
        }
    }
}
