import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    //HashSet es un conjuto de elementos que NO mantiene orden
    public Sets(){
    }

    //LinkedHashet mantiene el orden
    //Clases abstractas: Clases que no pueden ser instanciadas

    public Set<String> construirHashSet(){
        Set<String> miHashSet = new HashSet<>();

        miHashSet.add("Manzana");
        miHashSet.add("Pera");
        miHashSet.add("Pera");
        miHashSet.add("Melocoton");
        miHashSet.add("Melon");
        miHashSet.add("Kiwi");
        miHashSet.add("Fresa");

        return miHashSet;
    }

    public Set<String> construirLinkedHashSet(){
        Set<String> miLinkedHashSet = new LinkedHashSet<>();

        miLinkedHashSet.add("Manzana");
        miLinkedHashSet.add("Pera");
        miLinkedHashSet.add("Pera");
        miLinkedHashSet.add("Melocoton");
        miLinkedHashSet.add("Melon");
        miLinkedHashSet.add("Kiwi");
        miLinkedHashSet.add("Fresa");

        return miLinkedHashSet;
    }

    public Set<String> construirTreeSet(){
        Set<String> miTreeSet = new TreeSet<>();

        miTreeSet.add("Manzana");
        miTreeSet.add("Pera");
        miTreeSet.add("Pera");
        miTreeSet.add("Melocoton");
        miTreeSet.add("Melon");
        miTreeSet.add("Kiwi");
        miTreeSet.add("Fresa");

        return miTreeSet;
    }

    public Set<String> construirTreeSetConComparador(){

        Comparator<String> comparatorPorLongitud = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2){
            //Primero comparamos la longitud
            int resultado = Integer.compare(s1.length(), s2.length());
            //Si tienen la misma longitud, comparamos alfabeticamente
            if(resultado == 0){
                resultado = s1.compareTo(s2);
            }
            return resultado;
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
    }


}
