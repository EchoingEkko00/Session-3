public class Item {
    static class ItemClee {
        String nom;
        String prenom;
        public ItemClee(String nom, String prenom) {
            this.nom = nom;
            this.prenom = prenom;
        }

        @Override
        public int hashCode() {
            return nom.hashCode()+prenom.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            return nom.equals(((ItemClee)obj).nom) && prenom.equals(((ItemClee)obj).prenom);
        }
    }
    ItemClee itemClee;
    String dossier;
    int hauteur;
    int poids;

    public Item(String nom, String prenom, String dossier) {
        itemClee = new ItemClee(nom, prenom);
        this.dossier = dossier;
    }
}
