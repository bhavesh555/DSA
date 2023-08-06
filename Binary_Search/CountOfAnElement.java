package Binary_Search;

import java.util.*;
public class CountOfAnElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int[] ans = new int[2];
        ans[0]=helperLB(n, arr, target);
        ans[1]=helperUB(n, arr, target);
        int count = ans[1] - ans[0] + 1;
        System.out.println(count);
        
    }

    public static int helperLB(int n, int[] arr, int target){
        int ans = -1;
        int l = 0;
        int r = n-1;
        int m = 0;

        while(l <= r){
            m = l + (r - l)/2;

            if(arr[m] == target){
                ans = m;
                r = m - 1;
            }
            else if(arr[m] < target){
                l = m + 1;
            }
            else{
                r = m - 1;
            }
        }
        return ans;
    }

    public static int helperUB(int n, int[] arr, int target){
        int ans = -1;
        int l = 0;
        int r = n-1;
        int m = 0;

        while(l <= r){
            m = l + (r - l)/2;

            if(arr[m] == target){
                ans = m;
                l = m + 1;
            }
            else if(arr[m] < target){
                l = m + 1;
            }
            else{
                r = m - 1;
            }
        }
        return ans;
    }
}
