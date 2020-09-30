import java.util.LinkedList;
import java.util.List;

public class ListeGenerique {
    public static void main(String[] args) {
        String text = "Bonjg";
        Integer nb = 45;
        Double nb2 = 4.5;
        Item item = new Item("Navet", 4.50);

        List<Object> maListe = new LinkedList<>();
        maListe.add(text);
        maListe.add(nb);
        maListe.add(nb2);
        maListe.add(item);

        for (Object o : maListe) {
            if (o instanceof String) {
                System.out.println("String: " + (String) o);
            }
            if (o instanceof Integer) {
                System.out.println("Integer: " + (Integer) o);
            }
            if (o instanceof Double) {
                System.out.println("Double: " + (Double) o);
            }
            if (o instanceof Item) {
                System.out.println("Item: " +((Item) o).nom + " " + ((Item) o).prix);
            }
        }

        boolean ans = item.estDuMemeType(item, nb);
        if (ans != true) {
            System.out.println("Failed");
        }
        else {
            System.out.println("Passe");
        }

        System.out.println("________________________________");

        String[] tab = {"Carr","Pore","Poiire","Orange"};
        afficherTab(tab);
        System.out.println("________________________________");
        echange(tab,2,3);
        afficherTab(tab);
        System.out.println("________________________________");

        RandomList<Item> randomList = new RandomArrayList<>();

        randomList.add(new Item("Orange", 5.00));
        randomList.add(new Item("Carrote", 8.00));
        randomList.add(new Item("Tomate", 2.00));
        randomList.add(new Item("Bazooka", 1.5));

        System.out.println(randomList.getRandom().nom);
        System.out.println(randomList.getRandom().nom);
        System.out.println(randomList.getRandom().nom);
        System.out.println(randomList.getRandom().nom);
        System.out.println(randomList.getRandom().nom);
        System.out.println(randomList.getRandom().nom);


        System.out.println("________________________________");

        ParDefaultList<String> liste = new ParDefaultList<>();
        liste.add("2 Lite");
        liste.add("2 Moutons");
        liste.add("2 Biere");
        liste.add("2 Orange");
        System.out.println(liste.get(5, "Element vide"));
    }

    static <T> void echange(T[] tabGen, int pos1, int pos2) {
        T elem = tabGen[pos1];
        tabGen[pos1] = tabGen[pos2];
        tabGen[pos2] = elem;
    }

    static <T> void afficherTab(T[] tabGen) {
        for (T elem : tabGen) {
            System.out.println(elem);
        }
    }
}
