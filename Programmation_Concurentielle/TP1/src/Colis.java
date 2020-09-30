public class Colis {
    String tracking;
    String ville;
    double poids;


    public Colis(String tracking, String ville, double poids) {
        this.tracking = tracking;
        this.ville = ville;
        this.poids = poids;
    }

    public String getTracking() {
        return tracking;
    }

    public String getVille() {
        return ville;
    }

    public double getPoids() {
        return poids;
    }


}
