//7. Kadane’s algorithm (max subarray)
public class Q7 {
    public static void main(String[] args) {
        int array[] = {-2,1,-3,4,-1,2,1,-5,4};

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0; i<array.length; i++){
            currSum += array[i];
            maxSum = Math.max(maxSum, currSum);
            if(currSum < 0){
                currSum = 0;
            }
        }

        System.out.println(maxSum);
    }
}
