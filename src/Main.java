import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.println("введіть п'ять слів");
        String word = scanner.next();
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        String word4 = scanner.next();
        String sentence = word.concat(" ").concat(word1).concat(" ").concat(word2).concat(" ").concat(word3).concat(" ").concat(word4);
        System.out.println(" речення: "+ sentence);
            scanner.close();



    }
}