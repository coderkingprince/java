import java.util.Scanner;
public class oddsum {
    public static void main(String args[]){
        int number;
        int choice;
        int evensum = 0;
        int oddsum = 0;

        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter number:");
            number  = sc.nextInt();
            if(number % 2==0){
                evensum += number;
            }
            else{
                oddsum += number;
            }
            System.out.println("Enter ur choice number oress 1:");
             choice = sc.nextInt();

        } while(choice == 1);
            System.out.println("Sum of even number:" +evensum);
            System.out.println("sum od oddsum:" +oddsum);
        
        
    }
    

}
