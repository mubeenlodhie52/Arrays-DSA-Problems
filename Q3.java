//3. Rotate array by k positions
public class Q3 {
    public static void printArray(int array[]){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
    public static int[] rotate(int array[],int k){
        int n = array.length;
        k = k % n;
        int ans[] = new int[n];
        int j = 0;

        for(int i = n-k; i<n; i++){
            ans[j] = array[i];
            j++;
        }

        for(int i = 0; i<n-k; i++){
            ans[j] = array[i];
            j++;
        }

        return ans;
    } 


    public static void reverse(int array[], int start, int end){

        while (start<end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }

    public static void rotateWithoutExtraMemory(int array[], int k){
        int n = array.length;
        k = k % n;
        reverse(array, 0, n-k-1);
        reverse(array, n-k, n-1);
        reverse(array, 0, n-1);
    }
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};

        // int rotatedArray[] = rotate(array, 2);
        rotateWithoutExtraMemory(array, 102);
        printArray(array);

    }
}
