import java.util.Scanner;
public class Uaserer{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the pen price:");
        float pen = sc.nextFloat();
        System.out.println("Enter thr book price:");
        float book = sc.nextFloat();
        System.out.println("Enter the copy price:");
        float copy = sc.nextFloat();

        float total = (pen+book+copy)%18;
        System.out.println("bill is:" +total);
    }

}