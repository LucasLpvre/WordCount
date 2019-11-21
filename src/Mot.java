public class Mot {
    private String mot;
    private int cpt;

    public Mot(String m){
        mot = m;
        cpt = 1;
    }

    public Mot(String m, int occ){
        mot = m;
        cpt = occ;
    }

    public void nouvelleOccurrence(){
        cpt ++;
    }
    public int getOccurrence(){
        return cpt;
    }
    public String getMot(){
        return mot;
    }
}
