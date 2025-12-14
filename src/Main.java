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
                    Random rand = new Random();
                    int somme = 0;
                    boolean contientUn = false;

                    // A vous de jouer
                    System.out.print("Contenu du Tableau : ");

                    for (int i = 0; i < tabExo1.length; i++)
                    {
                        // Génération d'un dé entre 1 et 6
                        tabExo1[i] = rand.nextInt(6) + 1;

                        System.out.print(tabExo1[i] + " - ");

                        somme += tabExo1[i];

                        if (tabExo1[i] == 1)
                        {
                            contientUn = true;
                        }
                    }

                    System.out.println();
                    System.out.println("Somme du Tableau : " + somme);

                    if (somme >= 18 && !contientUn)
                    {
                        System.out.println("Partie gagnée");
                    }
                    else
                    {
                        System.out.println("Partie perdue");
                    }

                    break;
                case 2 :
                    // Ne pas effacer cette ligne
                    int[] scoresPossibles = new int[]{0,15,30,40};
                    int pointsA = 0;
                    int pointsB = 0;

                    // Voici des exemples de parties que vous pourrez tester
                     String[] partie = new String[]{"A","B","B","A","A","A"};
                    //String[] partie = new String[]{"A","B","B","A","A","B","A","B","B","A","B","B"};
                    //String[] partie = new String[]{"B","B","B","B"};
                    //String[] partie = new String[]{"B","B","A","A","A","B","A","B","A","A"};

                    // A vous de jouer
                    for (int i = 0; i < partie.length; i++) {

                        if (partie[i].equals("A")) { // pour comparer un strings on utilise toujours equals (si l'indice est egal a "A")
                            pointsA++;
                        } else {
                            pointsB++;
                        }

                        int scoreA = Math.min(pointsA, 3); // pointsA ne peut pas depasser l'index 3 = 40
                        int scoreB = Math.min(pointsB, 3); // pointsB ne peut pas depasser l'index 3 = 40

                        System.out.println(scoresPossibles[scoreA] + " / " + scoresPossibles[scoreB]);

                        if (pointsA >= 4 && pointsA > pointsB) {
                            System.out.println("Le joueur A a gagné");
                            break;
                        }
                        else if (pointsB >= 4 && pointsB > pointsA)
                        {
                            System.out.println("Le joueur B a gagné");
                            break;
                        }
                    }
                case 0 :
                    System.out.println("FIN DU PROGRAMME");
                    break;
            }
        }while(choix!=0);
    }
}
