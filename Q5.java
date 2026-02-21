//5. Find Missing number
public class Q5 {
    public static int missingNum(int array[]){
        int n = array.length;
        int actualSum = n*(n+1)/2;

        int currSum = 0;

        for(int i=0; i<n; i++){
            currSum += array[i];
        }

        int missingNumber = actualSum - currSum;

        return missingNumber;
    }
    public static void main(String[] args) {
        int array[] = {3,0,1};
        System.out.println(missingNum(array));
        
    }
}
