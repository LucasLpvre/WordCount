import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public abstract class Compteur {

    private String nomFichier;
    private int nbMots;
    private int nbMots5;
    public abstract void addOccurrence(String mot);

    public Compteur(String fichierTexte) throws IOException {
        Scanner scannerLine= new Scanner(new File(fichierTexte));
        scannerLine.useDelimiter("\n");
        while(scannerLine.hasNextLine()){
            String ligne = scannerLine.nextLine();
            ligne.toLowerCase();
            ligne.split("\\s | \\( | \\) | \" | \\[ | \' | ] | \t | , | \\. | ; | : | / | '\' | < | > | \\? | ! | ... | \n");
            Scanner scannerMot= new Scanner(ligne);
            while(scannerMot.hasNext()){
                String monMot = scannerMot.next();
                nbMots ++;
                monMot = monMot.replaceAll("[\\. \\, \" \\) \\(]","");
                if (monMot.length() >= 5){
                    nbMots5++;
                    addOccurrence(monMot);
                }
            }
            scannerMot.close();

        }
        scannerLine.close();
    };
}