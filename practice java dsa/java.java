import java.util.Scanner;
public class java{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int pen = sc.nextInt();
        System.out.println("Enter a pen value:");
        int book  = sc.nextInt();
        System.out.println("Enter a book value:");
        int pencil = sc.nextInt();
        System.out.println("Enter a pencil price:");

        int total = pen+book+pencil;
        System.out.println("total vaule of the product:" +total);

    }

}