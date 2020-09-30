public class Item {
    String nom;
    Double prix;

    public Item(String nom, Double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    <T, L> boolean estDuMemeType(T i1, L i2) {
        System.out.println("Type instance 1 " +i1.getClass().getName());
        System.out.println("Type instance 2 " +i2.getClass().getSimpleName());

        T ref = i1;

        return (i1.getClass().equals(i2.getClass()));
    }
}
