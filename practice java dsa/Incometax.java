import java.util.Scanner;
public class Incometax{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;
        if(income < 50000){
            tax =0;
            System.out.println("tax is 0:");

        }
        else if(income >= 500000 && income > 1000000){
             tax = (int) (income * 0.2);
             System.out.println("your tax is:");

            
        }else{
            tax = (int) (income * 0.3);
            System.out.println("your home tax:" +tax);
        }
    }

}