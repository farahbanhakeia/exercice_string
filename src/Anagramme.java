import java.util.Scanner;

public class Anagramme {
    public static void anagrameTest(String mot1, String mot2)
    {
        if(mot1.compareTo(mot2)==0)
        {
            System.out.println(" ces mots sont égales");
        }
        else if (mot1.compareTo(mot2) >0)
        {
            System.out.println(" sont diffrenets ");

        }
        else if (mot1.compareTo(mot2) <0)
        {
            System.out.println("est anagrame ");
        }
    }
    public static void main(String[] args) {
        String mot;
        Scanner sc = new Scanner(System.in);
        System.out.println( " veillez saisir votre chaine de charactére :");
        mot= sc.nextLine();
        String mot2;
        System.out.println( " veillez saisir votre chaine de charactére :");
        mot2= sc.nextLine();
        anagrameTest(mot,mot2);

    }
}
