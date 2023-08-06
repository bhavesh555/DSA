package Binary_Search;

import java.util.*;



public class OrderNotKnownSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        if(arr[0]<arr[n-1]){
            System.out.println(helper1(n, arr, target));
        }
        else{
            System.out.println(helper2(n, arr, target));
        }
        
    }

    public static int helper1(int n, int[] arr, int target){
        int ans = -1;
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

    public static int helper2(int n, int[] arr, int target){
        int ans = -1;
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
                l = m + 1;
            }
            else{
                r = m - 1;
            }
        }
        return ans;
    }
}
