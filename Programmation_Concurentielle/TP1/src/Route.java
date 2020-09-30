import java.util.List;

public class Route {
    List<String> villes;
    String Nom;

    public Route(String nom) {
         this.Nom = nom;
    }

    public void ajouterVilles(List<String> villeAAjouter) {
        villes = villeAAjouter;
    }

    public void estSurRoute(String route) {
    }

}
