public class zsaSDS {
    public static void floyed_trigle(int n){
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
    floyed_tringle(5);

}
}
