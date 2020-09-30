import java.util.ArrayList;
import java.util.HashMap;

public class LivraisonRapide {
    ArrayList<Vehicule> vehicules;
    HashMap<String, Route> routes;
    HashMap<String, Colis> colis = new HashMap<String, Colis>();

    public LivraisonRapide() {
        this.vehicules = new ArrayList<Vehicule>();
        this.routes = new HashMap<String, Route>();
    }

    public void ajouterVehicule(Vehicule voiture) {
        vehicules.add(voiture);
    }

    public void enleverVehicule(int id) {
        vehicules.remove(id);
    }

    public void ajouterRoute(Route route) {
        routes.put(route.Nom, route);
    }

    public void ajouterColis(Colis colisAajouter) {
        colis.put(colisAajouter.tracking, colisAajouter);
    }

    public Colis rechercherColisACharger(String tracking) {
        return colis.get(tracking);
    }

    public Vehicule rechercherColisDansVehicule(String tracking) {
        for (Vehicule v : vehicules) {
            if (v.rechercherColis(tracking) == colis.get(tracking)) {
                return v;
            }
        }
        return null;
    }

    public void chargerColis() {
        HashMap<String, Colis> colisAlivrer = new HashMap<String, Colis>();
        int i = 0;
        Vehicule v = vehicules.get(i);
        for (Route r : routes.values()) {
            for (Colis c : colis.values()) {
                if (r.villes.contains(c.ville)) {
                    colisAlivrer.put(c.tracking, c);
                }
            }
            v.charger(colisAlivrer, r);
            colisAlivrer.clear();
            i = i + 1;
            v = vehicules.get(i);
        }
    }
}

