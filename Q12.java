//12.Move all 0s to end while maintaining the order
public class Q12 {
    public static void printArray(int array[]){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void moveZeros(int array[]){
        int j = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] != 0){
                array[j] = array[i];
                j++;
            }
        }
        while(j<array.length){
            array[j] = 0;
            j++;
        }
    }
    public static void main(String[] args) {
        int array[] = {0,3,1,0,2,0,5,4};
        moveZeros(array);
        printArray(array);
    }
}
