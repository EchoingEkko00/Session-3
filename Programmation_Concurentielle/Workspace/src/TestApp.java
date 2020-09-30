public class TestApp {
    static String texte = "";
    public static void main(String[] args) {
     System.out.println(careerArray(19));
    }
    public static String careerArray(int nbElement) {
        for (int i =0; i < nbElement; i++) {
            for (int f = 0; f<nbElement; f++) {
                texte += ('a' + (Math.random() * 26) + " ");
            }
        }
        return texte;
    }
}
