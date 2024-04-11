import java.util.Scanner;
public class main1 {
    public static void main(String[] args){
        System.out.println("завдання 2");
        Scanner scanner = new Scanner(System.in);

        System.out.println("введфть 5 слів ");


        String word11 = scanner.next();
        String word12 = scanner.next();
        String word13 = scanner.next();
        String word14 = scanner.next();
        String word15 = scanner.next();
        String b1 =word11.substring(0,1);
        String b2 =word12.substring(0,1);
        String b3 =word13.substring(0,1);
        String b4 =word14.substring(0,1);
        String b5 =word15.substring(0,1);

        String sentence2 = b1.concat(" ").concat(b2).concat(" ").concat(b3).concat(" ").concat(b4).concat(" ").concat(b5);
        System.out.println("перші букви " +sentence2);
            scanner.close();
    }
}
