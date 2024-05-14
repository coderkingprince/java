import java.util.Scanner;
public class asdsradxasd {
    public static void Floyed_tringel(int n){
        Scanner sc   = new Scanner(System.in);
        int number = sc.nextInt();
        int counter = 1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                counter ++;
                System.out.print(counter+" ");
            }
            System.out.println();

        }
    }

    public static void main(String args[]){
        Floyed_tringel(10);
    }
    
}
