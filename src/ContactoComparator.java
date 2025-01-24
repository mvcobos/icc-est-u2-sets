import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ContactoComparator {
    /*public Set<String> compare(Contacto c1, Contacto c2){
        
        Comparator<Contacto> comparatorPorLongitud = new Comparator<Contacto>() {
            @Override
            public int compare(Contacto c1, Contacto c2){
             //Primero comparamos la longitud
            //boolean comparacionApellido = c1.getNombre().equals(c2.getNombre());
            int comparacionApellido = c1.getApellido().compareTo(c2.getApellido());
            //Si tienen la misma longitud, comparamos alfabeticamente

            if(comparacionApellido == 0){

                comparacionApellido = c1.compareTo(c2);

            } else if (comparacionApellido > 0){

            } else{

            }
            return comparacionApellido;
            }
        };

        Set<String> miTreeSetComparador = new TreeSet<>(comparatorPorLongitud);

        miTreeSetComparador.add("Manzana");
        miTreeSetComparador.add("Pera");
        miTreeSetComparador.add("Pera");
        miTreeSetComparador.add("Melocoton");
        miTreeSetComparador.add("Melon");
        miTreeSetComparador.add("Kiwi");
        miTreeSetComparador.add("Fresa");

        return miTreeSetComparador;
    }*/
    
}
