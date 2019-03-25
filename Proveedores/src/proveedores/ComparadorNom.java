package proveedores;

import java.util.Comparator;

class ComparadorNom implements Comparator<provedor> {//compara los datos por el nombre 

    @Override
    public int compare(provedor o1, provedor o2) {
        return o1.nombre.compareTo(o2.nombre);
    }

}
