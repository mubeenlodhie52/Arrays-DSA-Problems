//1. Find largest & smallest element
public class Q1 {
    public static void findMaxMin(int array[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }

        System.out.println("Max: "+max +"\n"+"Min: "+min);
    }
    public static void main(String[] args) {
        int array[] = {3,4,2,7,1,9,2};
        findMaxMin(array);
    }
}
