import java.util.*;


public class SlidingWindowMaximum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int[] ans = helper(n ,arr, k);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }   
    
    public static int[] helper(int n, int[] arr, int k){
        int[] ans = new int[n-k+1];

        Deque<Integer> dq = new ArrayDeque<>();

        int i=0;
        int j=0;
        int ind=0;

        while(j<n){
            while(dq.size()>0 && dq.peekLast()<arr[j]){
                dq.pollLast();
            }

            dq.offerLast(arr[j]);

            if(j-i+1 < k){
                j++;
            }else if(j-i+1 == k){
                ans[ind] = dq.peekFirst();

                if(dq.peekFirst() == arr[i]){
                    dq.pollFirst();
                }

                i++;
                j++;
                ind++;
            }
        }
        return ans;
    }
}
