import java.util.Scanner;
public class fact {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the factorial number:");

        int num = sc.nextInt();
        if(num < 0){
            System.out.println("factorial not for negative number:");

        }
        else{
            long result = findFactorial(num);

            System.out.println("factorial is:" + num + "is" +result);
        }
    }

    public static long findfactorial(int num){
        long factorial = 1;
        for(int i=1; i<=num; i++){
            factorial *=i;

        }
        return factorial;
    }
    
}
