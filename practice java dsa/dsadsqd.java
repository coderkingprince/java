import java.util.*;
public class dsadsqd {
    public static void Hollow_Rec(int totRows, int totCols, ){

        for(int i=1; i<=totRows; i++){

            for(int k=1; k<=totExtra; k++){

                for(int j=1; j<=totCols; j++){

                    if(i == 1 || i == totRows || k == 1 || k == totExtra || j == 1 || j == totCols ){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                
            }

            System.out.println();

            
        }


    }

    public static void main(String args[]){
        Hollow_Rec(5, 10);
    }
    
}
