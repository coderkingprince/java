import java.util.Scanner;
public class adsddsd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("print the factorial od number:");

        int num  = sc.nextInt();

        if(num < 0){
            System.out.println("factorial not for the negative numbers:");
        }
        else{

            long result = findFactorial(num);
            System.out.println("factorial is:" +num+ "is" +result);
            
        }
        public static long findFactorial(int num){
            long factorial = 1;
            for(int i=1; i<=num; i++){

            }
            findFactorial *= i;
        }
        return factorial;
    }
    
}
