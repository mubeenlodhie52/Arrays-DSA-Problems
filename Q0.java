
//0. Check if number is present in array
import java.util.Scanner;

public class Q0 {
    public static int[] makeFreqArray(int array[]){
        int frequency[] = new int[(int)Math.pow(10, 5)];
        for(int i=0; i<array.length; i++){
            frequency[array[i]]++;
        }
        return frequency;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = {5,34,100,6000,700,70,5};
        int quries = 3;

        int frequency[] = makeFreqArray(array);

        for(int i=0; i<quries; i++){
            System.out.print("Enter the number: ");
            int num = sc.nextInt();

            if(frequency[num] > 0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }

        sc.close();

    }
}
