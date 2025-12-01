import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int choix = 0;
        do
        {
            do
            {
                System.out.println("1 : Exercice 1");
                System.out.println("2 : Exercice 2");
                System.out.println("0 : Quitter le programme");
                System.out.print("Votre choix : ");
                choix = input.nextInt();

            }while(choix < 0 || choix > 2);

            switch(choix)
            {
                case 1 :
                    // Ne pas effacer cette ligne
                    int[] tabExo1 = new int[5];
                    int somme = 0;
                    int valeur = 0;
                    int faces = 0;

                    // A vous de jouer
                    System.out.println("Contenue du Tableau : ");
                    for (int i = 0; i < tabExo1.length; i++)
                    {
                        System.out.print(tabExo1[i] + " - ");
                        somme += tabExo1[i];
                        // boucle allant de 1 a 6 ?
                        for(int j = 1; j < 6; j++)
                        {
                            faces = valeur;
                        }
                    }
                    System.out.println();
                    System.out.println("Somme du Tableau : " + somme);
                    // victoire si le resultats des faces est >= 18 sinon perdue
                    if (faces >= 18)
                    {
                        System.out.println("Partie gagnee");
                    }else
                    {
                        System.out.print("Partie perdue");
                    }
                    System.out.println();

                    break;
                case 2 :
                    // Ne pas effacer cette ligne
                    int[] scoresPossibles = new int[]{0,15,30,40};
                    int scoreJoueur = 0;

                    // Voici des exemples de parties que vous pourrez tester
                    String[] partie = new String[]{"A","B","B","A","A","A"};
                    //String[] partie = new String[]{"A","B","B","A","A","B","A","B","B","A","B","B"};
                    //String[] partie = new String[]{"B","B","B","B"};
                    //String[] partie = new String[]{"B","B","A","A","A","B","A","B","A","A"};

                    // A vous de jouer
                        // parcour le tableau des scores
                         for (int i = 0; i < scoresPossibles.length; i++)
                         {
                             // parcour pour savoir si c'est le joueur A ou B
                             for (int j = 0; j < partie.length; j++)
                             {

                             }
                         }
                         //Afficher la chaine de caractere Partie
                         //Comparer le score des joueur pour donner le vainqueur
                    break;
                case 0 :
                    System.out.println("FIN DU PROGRAMME");
                    break;
            }
        }while(choix!=0);
    }
}
