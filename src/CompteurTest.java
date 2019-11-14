import java.io.IOException;

public class CompteurTest extends Compteur{
    public CompteurTest(String fichierTexte) throws IOException {
        super(fichierTexte);
    }

    @Override
    public void addOccurrence(String mot) {
        System.out.println(mot);
    }

    public static void main(String[] args) throws IOException {
        if (args.length<1){
            System.err.println("nom de fichier manquant");
        }
        else {
            CompteurTest c = new CompteurTest(args[0]);
        }
    }
}
