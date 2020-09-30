import java.util.HashMap;
import java.util.Map;

public class ExempleHashMapApp {
    public static void main(String[] args) {
        Map<String, Tache> taches = new HashMap<>();
        Map<String, Tache> taches2 = new HashMap<>();

        Tache tache = new Tache("Sortir les poubelles", "1", 5,5);
        taches.put(tache.getTitre(), tache);
        tache = new Tache("Faire la mope", "2", 5,5);
        taches.put(tache.getTitre(), tache);
        tache = new Tache("Faire le lit", "3", 3,2);
        taches.put(tache.getTitre(), tache);
        tache = new Tache("Refaire les escaliers", "4", 2,5);
        taches.put(tache.getTitre(), tache);
        tache = new Tache("Lavez le chien", "5", 1,1);
        taches.put(tache.getTitre(), tache);
        tache = new Tache("Refaire le toit", "6", 8,10);
        taches.put(tache.getTitre(), tache);


        System.out.println(taches.get("Refaire le toit"));
    }
}
