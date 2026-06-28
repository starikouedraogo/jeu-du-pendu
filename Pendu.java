import java.util.Scanner;
public class Pendu {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String choix = "";
    do {    jouerPartie();  
            System.out.println("Voulez-vous rejouer ? (O/N)");
            choix = sc.nextLine().toUpperCase();
        } while (choix.equals("O"));
        System.out.println("Merci d'avoir joué !");
  }
  public static void jouerPartie() {
    affichageasciiPendu dessin = new affichageasciiPendu();
    dessin.afficher();
    Scanner sc = new Scanner(System.in);
    BanqueMots banque = new BanqueMots();
    String mot = banque.tirerMotAuHasard();
    System.out.print("Entrer votre réponse : ");
    String reponse = sc.nextLine().toUpperCase();
    if(reponse.equals(mot))
      System.out.println("Félicitations");
    else 
    System.out.println("Vous avez perdu");
    score score = new score();
    if (reponse.equals(mot)){
      score.gagner();
      System.out.println ("");
    }else{
      System.out.println ("");
    }
    score.afficher();
    System.out.println("Merci d'avoir joué !");
  }
}