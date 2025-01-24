import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        runHashSet();     
        runLinkedHashSet();      
        runTreeSet();      
        runTreeSetComparado();                                           
    }

    public static void runHashSet() {
        Sets sets = new Sets();
        Set<String> ejemploHashSet = sets.construirHashSet();
        System.out.println("-------- HashSet --------");
        System.out.println("Elementos del HashSet (no se garantiza orden):");
        for( String elemento : ejemploHashSet){
            System.out.println(elemento);
        }
    }

    public static void runLinkedHashSet(){
        Sets sets = new Sets();
        Set<String> ejemploHashSet = sets.construirLinkedHashSet();
        System.out.println("-------- LinkedHashSet --------");
        System.out.println("Elementos del LinkedHashSet (Respeta orden de insercion):");
        for( String elemento : ejemploHashSet){
            System.out.println(elemento);
        }
    }

    public static void runTreeSet() {
        Sets sets = new Sets();
        Set<String> ejemploTreeSet = sets.construirTreeSet();
        System.out.println("-------- TreeSet --------");
        System.out.println("Elementos del TreeSet (Orden alfabetico):");
        for( String elemento : ejemploTreeSet){
            System.out.println(elemento);
        }
    }

    public static void runTreeSetComparado() {
        Sets sets = new Sets();
        Set<String> ejemploTreeSetComparado = sets.construirTreeSetConComparador();
        System.out.println("-------- TreeSet con Comparador --------");
        System.out.println("Elementos del TreeSet (Orden por longitud y luego alfabeticamente (Uso de metodo sobreEscrito)):");
        for( String elemento : ejemploTreeSetComparado){
            System.out.println(elemento);
        }
    }
}
