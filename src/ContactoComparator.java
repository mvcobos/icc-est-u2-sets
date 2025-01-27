import java.util.Comparator;

import models.Contacto;

public class ContactoComparator implements Comparator<Contacto>{
    public ContactoComparator(){

    }
    public int compare(Contacto c1, Contacto c2){
        //Primero comparamos la longitud
        int comparacionApellido = c1.getApellido().compareToIgnoreCase(c2.getApellido());
        if(comparacionApellido != 0){

            return comparacionApellido;
        } 
        //Si los apellidos son iguales, comparamos nombres

        int comparacionNombre = c1.getNombre().compareToIgnoreCase(c2.getNombre());
        if(comparacionNombre != 0){

            return comparacionNombre;
        } 
        
        return c1.getTelefono().compareToIgnoreCase(c2.getTelefono());
    } 
}
