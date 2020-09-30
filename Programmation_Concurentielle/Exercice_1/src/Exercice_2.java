import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.*;

class Exercice_2 {
    static LinkedList<String> ListeChainer = new LinkedList<String>();
    static String getAlphaNumericString(int n) {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }
    void Show_Exerice() {
        Date date = new Date();
        for (int i = 0; i < 1000000; i++) {
            ListeChainer.add(getAlphaNumericString(10));
        }
        Date date2 = new Date();
        long Secondes = (date2.getTime()-date.getTime());
        System.out.println(Secondes + "ms");
        System.out.println("-----------------------");
    }
}
