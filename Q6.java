//6. Find Second Largest
public class Q6 {
    public static int secondMax(int array[]){
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for(int i=0; i<array.length; i++){
            if(array[i] > max){
                secMax = max;
                max = array[i];
            }

            else if(array[i] != max && array[i] > secMax){
                secMax = array[i];
            }
        }

        return secMax;
    }
    public static void main(String[] args) {
        int array[] = {2,8,3,5,9};

        System.out.println(secondMax(array));
    }
}
