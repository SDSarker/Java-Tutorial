import java.util.Scanner;

public class hk4 {
    public static void main(String[] args){
        int a;
        double b;
        String s;
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        b= scanner.nextDouble();
        scanner.nextLine();
        s=scanner.nextLine();
        System.out.println("String: " + s);
        System.out.println("Double: " + b);
        System.out.println("Int: " + a);
    }
}
