package Greedy_Algorithms;
import java.util.*;
public class NMeetingsInARoom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("n : ");
        int n = sc.nextInt();

        System.out.println("start[] : ");
        int[] start = new int[n];
        for(int i=0; i<n; i++){
            start[i] = sc.nextInt();
        }

        System.out.println("end[] : ");
        int[] end = new int[n];
        for(int i=0; i<n; i++){
            end[i] = sc.nextInt();
        }

        int ans = maxMeetings(start, end, n);
        System.out.println("ans : " + ans);
    }

    public static int maxMeetings(int[] start, int[] end, int n){
        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++){
            arr[i][0] = start[i];
            arr[i][1] = end[i];
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 1;
        int end = arr[0][1];
        for(int i=1; i<n; i++){
            if(arr[i][0] > end){
                count++;
                end = arr[i][1];
            }
        }

        return count;
    }
}
