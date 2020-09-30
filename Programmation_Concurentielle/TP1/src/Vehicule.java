import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Vehicule {
    private int id;
    private LinkedList<Colis> colisVehicule;
    public Vehicule(int id) {
        this.id = id;
        this.colisVehicule = new LinkedList<Colis>();
    }


    public  Colis rechercherColis(String tracking) {
        for (Colis c : colisVehicule) {
            if (c.tracking == tracking) {
                return c;
            }
        }
        return null;
    }

    public  int getId() {
        return id;
    }

    public  void charger(HashMap<String,Colis> colisALivre, Route route) {
        List<Colis> listColis = new ArrayList<Colis>(colisALivre.values());
        for (Colis c : listColis) {
            colisVehicule.add(c);
        }
    }
}
