import java.util.Collection;
import java.util.*;

public class TestMap {
    public static void main(String[] args) {

        HashMap hash=new HashMap();

        hash.put("3A39","Java");
        hash.put(15,"test");
        hash.put(3.2,"test1");
        hash.put("3A39","Uml");
        hash.put(15,"test2");

        System.out.println(hash);
        System.out.println(hash.size());

       HashMap<Etudiant,String> hashet=new HashMap<>();
       Etudiant et1=new Etudiant(1,"nom1","prenom1");
       Etudiant et2=new Etudiant(2,"nom2","prenom2");
       Etudiant et3=new Etudiant(3,"nom3","prenom3");
       Etudiant et4=new Etudiant(3,"nom3","prenom3");

       hashet.put(et3,"3A7");
       hashet.put(et4,"3A6");
       hashet.put(et1,"3A4");
       hashet.put(et2,"3A3");
       hashet.put(et2,"3A2");

        System.out.println(hashet);
        System.out.println(hashet.size());

        System.out.println(hashet.containsKey(et4));//hash et equals
        System.out.println(hashet.containsValue("3A6"));//equals

        String val=hashet.get(et2);
        System.out.println("Classe :"+val);
        System.out.println(hashet.remove(et2));

        //Parcours que des valeurs
        Collection<String> coll=hashet.values();

        for (String va:hashet.values())
            System.out.println("classe :"+va);
        //Parcours que des clés
        Set<Etudiant> cles=hashet.keySet();
        for (Etudiant et:hashet.keySet())
            System.out.println("Etudiant :"+et);

        //Parcours des clés /valeurs avec deux méthodes
        for (Etudiant et:hashet.keySet()) {
            System.out.println("Etudiant :" + et);
           String val1=hashet.get(et);
            System.out.println("classe :"+val1);
        }

        for (Map.Entry<Etudiant,String> mp:hashet.entrySet())
        {
            System.out.println("Etudiant :"+mp.getKey());
            System.out.println("Classe :"+mp.getValue());
        }

        TreeMap<Etudiant ,String> tremp=new TreeMap<>();
        tremp.putAll(hashet);


    }
}
