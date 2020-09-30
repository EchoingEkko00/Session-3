import java.util.*;
import java.lang.*;

class Exercice_1 {
    static LinkedList<String> Aliment = new LinkedList<String>();
    void Show_exercice() {
        Aliment.add("poire");
        Aliment.add("banane");
        Aliment.add("orange");
        Aliment.add("cerise");
        Aliment.add("pomme");
        Aliment.add("kiwi");
        Aliment.add("navet");
        Aliment.add("citron");
        ShowInfo();
        Aliment.remove("navet");
        addAfter("melon", "cerise");
        ShowInfo();
    }

    static void ShowInfo() {
        for (String element : Aliment ) {
            System.out.println(element);
        }
        System.out.println("-----------------------");
    }

    static void addAfter(String name, String nameAfter) {
        int position = Aliment.indexOf(nameAfter);
        if (position >= 0 ) {
            Aliment.add(position + 1,name);
        }
        else {
        }
    }
}
