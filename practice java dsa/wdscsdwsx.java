public class wdscsdwsx {
    public static void linearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10, 12, 16};
        int key = 10;
        int index = linearSearch(numbers, key);
        if(index == -1){
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println("KEY IS AT INDEX");
        }
    }
    
}
