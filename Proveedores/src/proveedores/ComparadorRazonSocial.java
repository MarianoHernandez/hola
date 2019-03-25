package proveedores;

import java.util.Comparator;

public class ComparadorRazonSocial implements Comparator<provedor> {

    @Override
    public int compare(provedor o1, provedor o2) {
        return o1.razsoc.compareToIgnoreCase(o2.razsoc);
    }

}
