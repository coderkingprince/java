public class dcsasdsd {
    public static void Butter_fly(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1; i>=n; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

   public static void main (String args[]){
        Butter_fly(5);
    }

    
    
}
