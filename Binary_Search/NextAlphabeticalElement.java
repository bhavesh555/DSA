package binarysearch;

import java.util.*;

public class NextAlphabeticalElement {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char[] arr = new char[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.next().charAt(0);
        }

        char target = sc.next().charAt(0);

        char ans = helper(arr, target);
        System.out.println(ans);
    }

    public static char helper(char[] arr, char target){
        char ans = '#';
        int l = 0;
        int r = arr.length-1;
        int m = 0;

        while(l <= r){
            m = l + (r - l)/2;

            if(arr[m] == target){
                l = m + 1;
            }
            else if(arr[m] < target){
                l = m + 1;
            }
            else{
                ans = arr[m];
                r = m - 1;
            }
        }
        return ans;
    }
}
