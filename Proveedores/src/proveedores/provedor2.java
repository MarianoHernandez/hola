/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proveedores;

/**
 *
 * @author mariano
 */
public class provedor2 implements Comparable<provedor2> {//compara Tree Set por Razon Social

    String nombre;
    String razsoc;
    String Rut;
    String Telefono;
    String correo;
    String direccion;

    public provedor2(String nombre, String razsoc, String Rut, String Telefono, String correo, String direccion) {

        this.nombre = nombre;
        this.razsoc = razsoc;
        this.Rut = Rut;
        this.Telefono = Telefono;
        this.correo = correo;
        this.direccion = direccion;

    }

    @Override
    public String toString() {
        return " ["+nombre + "," + razsoc + "," + Rut + "," + Telefono + "," + correo + "," + direccion+"]";
    }



    @Override
    public int compareTo(provedor2 o) {
        provedor2 t = (provedor2) o;
        return razsoc.compareTo(t.razsoc);    }
    

    
}
