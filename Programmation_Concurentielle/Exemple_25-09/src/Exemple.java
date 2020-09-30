import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

public class Exemple {
    static void lireFichier() {
        BufferedReader reader = null;
        Path path = Paths.get("files\\texte.txt");
        try {
            reader = Files.newBufferedReader(path);
            String ligne = reader.readLine();
            while (ligne != null) {
                System.out.println(ligne);
                ligne = reader.readLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void listeFichiers() {
        List<Path> chemins = null;
        try {
            chemins = Files.list(Paths.get("files")).filter(Files::isRegularFile).collect(Collectors.toList());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (chemins != null) {
                for(Path path : chemins) {
                    System.out.println(path.toString().substring(path.toString().indexOf("\\")+1));
                }
            }
        }
    }

    static void ecrireFichier() {
        try {
            Path path = Paths.get("files\\texte.txt");
            BufferedWriter writer = Files.newBufferedWriter(path, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
            writer.write("0213019231");
            writer.flush();
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        lireFichier();
        System.out.println("------------------");
        listeFichiers();
        System.out.println("------------------");
    }
}
