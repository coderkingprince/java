public class asddadaed {
    public static void  Floyed_tringle(int n){
        int counter = 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++){
                counter ++;
                System.out.print(counter+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Floyed_tringle(5);
    }
    
}
