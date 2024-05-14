import java.util.Scanner;
public class sfdd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("print the factorisal number:");

        int num = sc.nextInt();
        if(num < 0){
            System.out.println("factorial number is not for less than 0:");
        }
        else{

            long result = findFactorial(num);
            System.out.println("num is:" +num+ "is" +result);

        }
    }
    public static long findFactorial(int num){
        long factorial = 1;
        for(int i=1; i<=num; i++){
            factorial*=i;

        }
        return factorial;

    }
    
}
