// 14. Majority element
public class Q14 {
    public static int findMajorityElement(int arr[]){
        int frequency = 0;
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            if(frequency == 0){
                ans = arr[i];
                frequency = 1;
            }
            else if ( ans == arr[i]) {
                frequency++;
            }else{
                frequency--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {3,1,6,3,8,3,3};
        System.out.println(findMajorityElement(arr));
    }
}
