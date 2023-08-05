import java.util.*;

public class LargestSubarrayOfSumK {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }   

        int k = sc.nextInt();

        int ans = helper(n, arr, k);
        System.out.println(ans);
    }

    public static int helper(int n, int[] arr, int k){
        int i=0;
        int j=0;
        int sum=0;
        int ans = Integer.MIN_VALUE;

        while(j<n){
            sum += arr[j];

            if(sum < k){
                j++;
            }else if(sum == k){
                ans = Math.max(ans, j-i+1);
                j++;
            }else if(sum > k){
                while(sum > k){
                    sum -= arr[i];
                    i++;
                }
                j++;
            }
        }
        return ans;
    }
}
