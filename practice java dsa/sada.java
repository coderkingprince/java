import java.util.Scanner;
public class sada {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the factorial number:");

        int num = sc.nextInt();
        if(num < 0){
            System.out.println("Factorial not for that negative numbersL:");

        }
        else{

            long result = findFactorial(num);
        }
    }
    
}
