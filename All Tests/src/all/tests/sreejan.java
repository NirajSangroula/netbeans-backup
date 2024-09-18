package all.tests;
import java.util.Scanner;
public class sreejan {
    public static void main(String[] args) {
        sreejanStupidAmerican();
    }

    private static void sreejanStupidAmerican() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  3 numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(aIsGreatest(a, b, c)){
            System.out.println(a+" is greater then "+b+" and "+c);
        }               
        else if(aIsGreatest(b, a, c))
            System.out.println(b+" is greater than "+a+" and "+c);
        else  
            System.out.println(c+" is greater than "+a+" and "+b);
    }

    private static boolean aIsGreatest(int a, int b, int c) {
        return a>b && a>c;
    }
}
