//8. Subarray with given sum

import java.util.HashMap;

public class Q8 {
    public static int[] prefixArray(int array[]){
        int prefix[] = new int[array.length];
        prefix[0] = array[0];

        for(int i=1; i<array.length; i++){
            prefix[i] = prefix[i-1] + array[i];
        }

        return prefix;
    }
    public static int subArrayWithGivenSum(int array[], int k){
        int prefix[] = prefixArray(array);
        int count = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<array.length; i++){
            if(prefix[i] == k){
                count++;
            }
            
            int val = prefix[i] - k;
            if(map.containsKey(val)){
                count+=map.get(val);
            }

            if(!map.containsKey(prefix[i])){
                map.put(prefix[i], 1);
            }else{
                map.put(prefix[i], map.get(prefix[i]) + 1);
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int array[] = {1,2,3};
        System.out.println(subArrayWithGivenSum(array, 2));
    }
}
