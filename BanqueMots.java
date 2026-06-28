import java.util.Random;
public class BanqueMots {
    String[] mots = {
        "AUBEN",
        "FASO",
        "HOTEL",
        "HOPITAL",
        "VILLA"
    };
    public String tirerMot() {
        Random r = new Random();
        return mots[r.nextInt(mots.length)]
    }
}