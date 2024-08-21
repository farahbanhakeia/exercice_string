import java.util.Scanner;

public class Conversion {

    public static String convertirCase(String mot) {
        char[] chars = mot.toCharArray(); // Convertir la chaîne en tab de caracteres

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                // Convertir les Maj en minu
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                // Convertir les minus en Maj
                chars[i] = Character.toUpperCase(c);
            }

        }
        // Convertir le tableau de caractères en chaîne
        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir votre chaîne de caractères :");
        String mot = sc.nextLine();
        String resultat = convertirCase(mot);
        System.out.println("Chaîne après conversion : " + resultat);
        sc.close(); // Fermer le scanner
    }
}
