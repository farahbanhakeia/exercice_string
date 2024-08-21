import java.util.Scanner;
public class Occurence_caractere {
    public static int calculOccurence(String mot, char caractere )
    {
        int s=0;

        for(int i=0;i<=mot.length()-1;i++)
        {
          if(mot.charAt(i)==caractere)
          {
              s+=1;
          }
        }
        return s;
    }
    public static void main(String[] args) {
        String mot;
        char caractere;
        Scanner sc = new Scanner(System.in);
        System.out.println( " veillez saisir votre chaine de charactére :");
        mot= sc.nextLine();
        System.out.println( " veillez saisir votre  charactére :");
        caractere = sc.next().charAt(0);
        System.out.println("occurence de "+caractere+" dans "+mot+" est "+calculOccurence(mot,caractere));




    }
}
