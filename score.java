public class score {
    private int points = 0;
    public void gagner() {
        points = points + 10;
    }
    public void afficher() {
        System.out.println("Score : " + points);
    }
}