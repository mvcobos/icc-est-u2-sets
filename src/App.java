import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        runHashSet();     
        runLinkedHashSet();      
        runTreeSet();      
        runTreeSetComparado();      
        runEjercicio();                                     
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

   /*private static void runEjercicioContacto(){
        Sets sets = new Sets();
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparator());

        System.out.println("-------- TreeSet con Comparador --------");
        System.out.println("Elementos del TreeSet (Orden por longitud y luego alfabeticamente (Uso de metodo sobreEscrito)):");
        for( String elemento : ejemploTreeSetComparado){
            System.out.println(elemento);
        }
    }*/

    private static void runEjercicio(){
        //Set<Contacto> agenda = new TreeSet<>(new ContactoComparator());
        System.out.println("-----LISTA CONTACTOS----");
        Contacto c1 = new Contacto("Pedro", "Lopez", "123456789");
        Contacto c2 = new Contacto("Pedro", "Lopez", "123456789");


        System.out.println("Referencia en memoria:");
        boolean comparacionReferencia = c1 == c2;

        System.out.println(comparacionReferencia);
        System.out.println("c1:" + c1 + "== c2:" + c2 + " = " + comparacionReferencia);

        
        System.out.println("Comparacion con equals:");
        System.out.println(c1.equals(c2));
        boolean comparacionEquals = c1.equals(c2);
        System.out.println(comparacionEquals);
        System.out.println("c1:" + c1 + "== c2:" + c2 + " = " + comparacionEquals);

        System.out.println("Comparacion de hashCode:");
        boolean comparacionHashCode = c1.hashCode() == c2.hashCode();
        System.out.println(comparacionHashCode);



    }
}
