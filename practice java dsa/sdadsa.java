import java.util.Scanner;
public class sdadsa {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a:");
        int a = sc.nextInt();
        System.out.println("enter b:");
        int b = sc.nextInt();
        System.out.println("enter c:");
        int c = sc.nextInt();

        System.out.println("Average of three number:");

        int average = (a+b+c)/3;
        System.out.println("average:" +average); 
    }
    
}
