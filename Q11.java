//11. Union of arrays

import java.util.ArrayList;

public class Q11 {
    public static ArrayList<Integer> unionIfSortedArrays(int arr1[], int arr2[]){
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] <= arr2[j]){
                if(ans.size() == 0 || ans.get(ans.size()-1) != arr1[i]){
                    ans.add(arr1[i]);
                }
                i++;
            }
            else{
                if(ans.size() == 0 || ans.get(ans.size()-1) != arr2[j]){
                    ans.add(arr2[j]);
                }
                j++;
            }
        }

        while (i < arr1.length) {
            if(ans.size() == 0 || ans.get(ans.size()-1) != arr1[i]){
                ans.add(arr1[i]);
            }
            i++;
        }
        while (j < arr1.length) {
            if(ans.size() == 0 || ans.get(ans.size()-1) != arr2[j]){
                ans.add(arr2[j]);
            }
            i++;
        }

        return ans;
    }
    public static void main(String[] args) {
        int arr1[] = {2, 2, 3, 4, 5};
        int arr2[] = {1, 1, 2, 3, 4};

        System.out.println(unionIfSortedArrays(arr1, arr2));
    }
}
