import java.util.Scanner;
public class AreaofCircle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pen = sc.nextFloat();
        System.out.println("Enter a prn price");
        float pencil = sc.nextFloat();
        System.out.println("Enter a pencil price");
        float book = sc.nextFloat();
        System.out.println("Enter a book price");
        float total = pen+pencil+book;
        System.out.println("bill is total" + total);
    }

}