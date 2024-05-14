import java.util.Scanner;
public class sdss {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the factorisl of a numbre:");

        int n = sc.nextInt();

        if(n < 0){
            System.out.println("factorial not for negative numbers:");

        }

        else{

            long result = findFactorial(n);
            System.out.println("factorial is: " +n+ "is" +result);
        }

        public static long findFactorial(int n){
            findfactorial = 1;
            for(int i=1; i<=n; i++){
                factorial *= i;
            }
            return factorial;
        }
    }
    
}
