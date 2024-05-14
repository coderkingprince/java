import java.util.Scanner;
public class multiplicatin {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter a number to print multiplication:");

        int N = sc.nextInt();
        printTable(N);
    }
    public static void printTable(int N){
        for( int i=1; i <= 10; i++){
            System.out.println(N +"x" + i + "=" + (N * i));
        }
    }
    
}
