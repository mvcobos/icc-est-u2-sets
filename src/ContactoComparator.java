import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import models.Contacto;

public class ContactoComparator {

    public int compare(Contacto c1, Contacto c2){
        //Primero comparamos la longitud
        int comparacionApellido = c1.getApellido().compareToIgnoreCase(c2.getApellido());

        if(comparacionApellido != 0){

            return comparacionApellido;
        } 
        //Si los apellidos son iguales, comparamos nombres
        return c1.getNombre().compareToIgnoreCase(c2.getNombre());
    } 
}
