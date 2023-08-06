package Binary_Search;
import java.util.*;
public class ReverseSortedArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int ans = helper(n, arr, target);
        System.out.println(ans);
    }

    public static int helper(int n, int[] arr, int target){
        int ans = -1;
        Arrays.sort(arr);
        int l = 0;
        int r = n-1;
        int m = 0;

        while(l <= r){
            m = l + (r - l)/2;

            if(arr[m] == target){
                ans = m;
                break;
            }
            else if(arr[m] < target){
                r = m - 1;
            }
            else{
                l = m + 1;
            }
        }
        return ans;
    }
}
