import java.util.Scanner;
public class Pendu {
  public static void main(String[] args) {
    jouerPartie();
  }
  public static void jouerPartie() {
    Scanner sc = ne Scanner(System.in);
    String mot = "AUBEN";
    System.out.print("Entrer votre réponse : ");
    String reponse = sc.nextLine().toUpperCase();
    if(reponse.equals(mot))
      System.out.println("Félicitations");
    else 
    System.out.println("Vous avez perdu");
    so.close();
  }
}