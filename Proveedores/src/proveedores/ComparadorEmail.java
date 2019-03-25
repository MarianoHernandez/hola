package proveedores;

import java.util.Comparator;

public class ComparadorEmail implements Comparator<provedor> {//compara las Listas por el Email

    @Override
    public int compare(provedor o1, provedor o2) {
        return o1.correo.compareToIgnoreCase(o2.correo);
    }

}
