import java.util.Scanner;
public class adsd {
    public static void main(String srga[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enrter b:");
        int b = sc.nextInt();
        System.out.println("Enter operator:");

        int operator = sc.next().charAt(0);

        switch (operator){
            case '+': System.out.println(a+b);
                  return;
            case '-': System.out.println(a-b);
                  return;
            case '*': System.out.println(a*b);
                  return;
            case '/': System.out.println(a/b);
                  return;
            case '%': System.out.println(a%b);
                  return;
            default : System.out.println("invalid operator and integer dosent support:");
                  
        }
    }
    
}
