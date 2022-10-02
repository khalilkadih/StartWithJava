import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class partei2 {
    static int symbole2index=0;
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        String symbole;
        do {
            symbole = "";
            System.out.println("Quel symbole voulez-vous pour les épines du sapin? (un seul caractère)");
            symbole = sc.nextLine();
        } while (symbole.length()!=1 );

        String symbole2 ="";
        do {
            System.out.println("Quelles guirlandes voulez-vous mettre (taille de 3 a 25 caractères et elles\n" +
                    "ne peuvent pas contenir le même caractère que celui utilisé pour les épines)?");
            symbole2 = sc.nextLine();
        }while (symbole2.length()<3|| symbole2.length()>25);

        int nombreEtoile;
        do {
            System.out.println("entrer nombre etoile");
            nombreEtoile = sc.nextInt();
        }while (nombreEtoile<8 || nombreEtoile >35);

        pyramid(nombreEtoile, symbole, symbole2);
    }
    public static void pyramid (int hauteur,String symbole1,String symbole2)
    {

        Stream.iterate(hauteur, i->i>=0 , i->i-1).forEach(i->
            {
                IntStream.range(0,i).forEach(j->
                {
                    System.out.print(" "); //dessinner  les espace a left side
                });
                IntStream.range(0,hauteur-i).forEach(k->
                {
                    if(i%2!=0){

                        System.out.print(symbole2.charAt(symbole2index)+" ");
                        if(symbole2index==symbole2.length()-1){
                            symbole2index=0;
                        }else
                            symbole2index++;
                    }else
                    System.out.print(symbole1+" ");//pour les espace entre les etoile
                });
                System.out.println(" ");
            });

            int rootWIdth=hauteur*2+1;
            int middle=rootWIdth/2;
            int spacesCount=rootWIdth/3;
            int symbolsCount=rootWIdth/3;
            String root="  ";
            for(int i=0;i<spacesCount;i++)
                root+=" ";
            for(int i=0;i<symbolsCount;i++)
                root+="|";
            for(int i=0;i<symbolsCount/2;i++)
                System.out.println(root);




    }




}
