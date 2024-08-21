import java.util.Scanner;
public class Inverser {

        public static void main(String[] args) {
            String mot;
            Scanner sc = new Scanner(System.in);
            System.out.println( " veillez saisir votre chaine de charactére :");
            mot= sc.nextLine();
            String inverser ="";
            for(int i =mot.length()-1;i>=0;i--)
            {
                inverser+=mot.charAt(i);
            }
            System.out.println( " la chaine "+mot+" inserver est "+inverser);
        }
    }


