//9. Merge two sorted arrays
public class Q9 {
    public static int[] merge(int arr1[], int arr2[]){
        int mergedArray[] = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i<arr1.length && j < arr2.length) {
            if(arr1[i] < arr2[j]){
                mergedArray[k] = arr1[i];
                i++;
                k++;
            }else{
                mergedArray[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i < arr1.length) {
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }

        return mergedArray;
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3};
        int arr2[] = {4,5,6};

        int megredArray[] = merge(arr1, arr2);

        for(int i=0; i<megredArray.length;i++){
            System.out.print(megredArray[i]+" ");
        }
    }
}
