package proveedores;



public class provedor  {

    String nombre;
    String razsoc;
    String Rut;
    String Telefono;
    String correo;
    String direccion;

    public provedor(String nombre, String razsoc, String Rut, String Telefono, String correo, String direccion) {

        this.nombre = nombre;
        this.razsoc = razsoc;
        this.Rut = Rut;
        this.Telefono = Telefono;
        this.correo = correo;
        this.direccion = direccion;

    }

    @Override
    public String toString() {
        return nombre + "," + razsoc + "," + Rut + "," + Telefono + "," + correo + "," + direccion;
    }


}
