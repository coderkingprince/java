import java.util.*;
public class aaas {
    public static void Hollow_Rectangle(int totRows, int totCols, int Extra){

        for(int i=1; i<=totRows; i++){
            for(int j=1; j<=totCols; j++){

                if(i == 1 || i == totRows || j == 1 || j == totCols){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Hollow_Rectangle(4, 5);
    }
    
}
