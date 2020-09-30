public class Tache {
    private String titre;
    private String noTache;
    private int priorite;
    private int difficulte;
    public Tache(String titre, String noTache, int priorite, int difficulte) {
        this.titre = titre;
        this.noTache = noTache;
        this.priorite = priorite;
        this.difficulte = difficulte;
    }

    public String getTitre() {
        return titre;
    }

    public String getNoTache() {
        return noTache;
    }

    public int getPriorite() {
        return priorite;
    }

    public int getDifficulte() {
        return difficulte;
    }

    @Override
    public String toString() {
        return titre +
                ", " + noTache +
                ", " + priorite +
                ", " + difficulte;
    }
}
