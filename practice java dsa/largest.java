import java.util.Scanner;
public class largest{
    public static void main(String args[]){
      //  Scanner sc  = new Scanner(System.in);
        int A = 1, B = 3, C = 6;
        if((A >= B) && (A >= C)) {
            System.out.println("A");
        }
        else if(B >= C){
            System.out.println("B");
        }
        else{
            System.out.println("C");
        }
    }

}