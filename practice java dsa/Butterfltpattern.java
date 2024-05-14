public class Butterfltpattern {
    public static void Butterfly_pattern(int n){
        //stars - i
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++)
            System.out.print("*");
        }

        //spaces 2*(n-i)
        for(int j=1; j<=2*(n-1); j++){
            System.out.print(" ");
        }

        //stars n-i;
        for(int i=1; i<=n; i++){
            System.out.print("*");
        }
    }

    for(int i=n; i>=1; i--){

    }
    
}
