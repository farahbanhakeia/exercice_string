import java.util.Scanner;

public class Delete_space {
    public static void main(String[] args) {
        String mot;
        Scanner sc = new Scanner(System.in);
        System.out.println( " veillez saisir votre chaine de charactére :");
        mot= sc.nextLine();
        mot=mot.replace(" ", "");
        System.out.println("le mot sans espace "+mot);
    }
}
