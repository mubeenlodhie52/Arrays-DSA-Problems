//10. Intersection of arrays

import java.util.HashSet;
import java.util.Set;

public class Q10 {
    public static int[] intersection(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            if(set.contains(arr2[i])){
                result.add(arr2[i]);
            }
        }
        int ans[] = new int[result.size()];

        int i=0;
        for(int element : result){
            ans[i] = element;
            i++;
        }

        return ans;
        
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,2,4,1};
        int arr2[] = {2,2,4};

        int ans[] = intersection(arr1, arr2);

        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }

    }
}
