import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Entrer le symbole");
        String symbole= sc.nextLine();
        //sc.nextLine();
        System.out.println("entrer nombre etoile");
        int nombreEtoile=sc.nextInt();
        pyramid(nombreEtoile,symbole);
        }
    /*public static void pyramid (int hauteur,String symbole)
    {

        if(hauteur>8 && hauteur<35){
            IntStream.range(0,hauteur).map(n->hauteur-n).forEach(i->{

                for (int j=0; j<=i; j++)
                {
                    System.out.print(" ");
                }
                for (int k=0; k<=hauteur-i; k++)
                {
                    System.out.print(symbole+" ");
                }
                System.out.println(" ");
            });
        }
        else System.out.println("Nothoing's happen");*/

    //methode 1
    public static void pyramid (int hauteur,String symbole)
    {
        if(hauteur>8 && hauteur<35){
            for (int i= hauteur; i>=0 ; i--)
            {
                for (int j=0; j<=i; j++)
                {
                    System.out.print(" "); //dessinner  les espace a left side
                }
                for (int k=0; k<=hauteur-i; k++)
                {
                    System.out.print(symbole+" ");//pour les espace entre les etoile
                }
                System.out.println(" ");
            }
        }
        else System.out.println("Nothoing's happen");


    }

}



