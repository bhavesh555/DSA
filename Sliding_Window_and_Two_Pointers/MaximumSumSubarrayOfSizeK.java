import java.util.*;

public class MaximumSumSubarrayOfSizeK{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int ans= helper(n, arr, k);
        System.out.println(ans);
    }

    public static int helper(int n, int[] arr, int k){
        int i=0;
        int j=0;
        int ans=0;
        int maxi=0;
        while(j<arr.length){
            ans+=arr[j];
            if(j-i+1<k){
                j++;
            }
            
            else if(j-i+1==k){
                maxi=Math.max(maxi,ans);
                ans-=arr[i];
                i++;
                j++;
            }
        }
        return maxi;
    }
}