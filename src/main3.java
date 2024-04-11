import java.util.Scanner;
public class main3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введіть імена");
        String a = scanner.next();
        String b = scanner.next();
        if(a.equalsIgnoreCase(b)){
            System.out.println("імена  ідентичні ");
        }else{
            System.out.println("імена не ідентичні ");
        }
    }
}
