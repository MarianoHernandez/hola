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
public class comNombreTree implements Comparable<comNombreTree>{//compara el Tree Set por nombre
 String nombre;
    String razsoc;
    String Rut;
    String Telefono;
    String correo;
    String direccion;

    public comNombreTree(String nombre, String razsoc, String Rut, String Telefono, String correo, String direccion) {

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
    public int compareTo(comNombreTree o) {
    return nombre.compareTo(o.nombre);
    }
    
}
