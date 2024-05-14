public class asdadsa {
    public static void decToBin(int decNum){
        int pow = 0;
        int binNum = 0;

        while(decNum > 0) {
            int r = decNum % 2;
            binNum = binNum * (r * (int)Math.pow(10, pow));

            pow++;
            decNum = decNum/2;
        }

        System.out.println("Binary of:" +binNum+ "= " +decNum);
    }
    public static void main(String args[]){
        decToBin(7);
    }
    
}
