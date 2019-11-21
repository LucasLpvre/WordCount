public class MotChaine extends Mot {
    private MotChaine next;
    public MotChaine(String m, MotChaine n) {
        super(m);
        next = n;
    }

    public MotChaine(String m, int occ, MotChaine n) {
        super(m, occ);
    }

    public MotChaine(String m){
        this(m, null);
    }
}
