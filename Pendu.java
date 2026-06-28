import java.util.Scanner;
public class Pendu {
  public static void main(String[] args) {
    jouerPartie();
  }
  public static void jouerPartie() {
    affichageasciiPendu dessin = new affichageasciiPendu();
    dessin.afficher();
    Scanner sc = new Scanner(System.in);
    BanqueMots banque = new BanqueMots();
    String mot = banque.tirerMotAuHasard();
    mot = "AUBEN";
    System.out.print("Entrer votre réponse : ");
    String reponse = sc.nextLine().toUpperCase();
    if(reponse.equals(mot))
      System.out.println("Félicitations");
    else 
    System.out.println("Vous avez perdu");
    score score = new score();
    if (reponse.equals(mot)){
      score.gagner();
      System.out.println ("Félicitations");
    }else{
      System.out.println ("Vous avez perdu");
    }
    score.afficher();
    String choix;
    while (choix.equals("0")){
      jouerPartie();
      System.out.println("Voulez vous rejouer ?");
      choix = sc.nextLine().toUpperCase();
    } 
    System.out.println("Merci d'avoir joué !");
  }
}