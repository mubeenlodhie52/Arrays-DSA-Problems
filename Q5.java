public class Q5 {
     public static void printArray(int array[], int n){
        for(int i=0; i<n; i++){
            System.out.print(array[i]+" ");
        }
    }
    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[j]){                
                j++;
                nums[j] = nums[i];                            
            }
        }
        return j+1; // total unique eliments
    }
    public static void main(String[] args) {
        // int array[] = {0,0,1,1,1,2,2,3,3,4};
        int array[] = {1,1,2};
        int newlength = removeDuplicates(array);
        printArray(array,newlength);
        
    }

}
