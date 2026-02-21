//2. Reverse array
public class Q2 {
    public static void printArray(int array[]){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void reverse(int array[]){
        int start = 0;
        int end = array.length-1;

        while (start<end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        reverse(array);
        printArray(array);
    }
}
