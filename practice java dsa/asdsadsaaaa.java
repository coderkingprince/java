import java.util.Scanner;
public class asdsadsaaaa {
    public static void pyramid_Rect(int n ){
        for(int i=1; i<=n; i++){

            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
              System.out.println();
        }

      
}

public static void main(String args[]){
    pyramid_Rect(4);
}
    
}
