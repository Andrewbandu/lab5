import java.util.Scanner;
public class main4 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("введіть слово");
    String a  = scanner.next();
    String b = scanner.next();
    if ( a.length() < b.length()){
        System.out.println("друге слово має більше символів " + b);


    }else if(a.length() > b.length()){
        System.out.println("перше слово має більше символів " + a);
    }else{
        System.out.println("рівні");
    }

    }
}
