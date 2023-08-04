import java.util.*;

public class FirstNegativeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n : ");
        int n = sc.nextInt();
        long[] arr = new long[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        System.out.print("k : ");
        int k = sc.nextInt();

        long[] result = printFirstNegativeInteger(arr, n, k);

        System.out.println("ans[] : ");
        for (long num : result) {
            System.out.print(num + " ");
        }
    }

    public static long[] printFirstNegativeInteger(long arr[], int n, int k) {
        long[] ans = new long[n - k + 1];
        Queue<Long> q = new ArrayDeque<>();
        int i = 0, j = 0, ind = 0;
        while (j < n) {
            if (arr[j] < 0) {
                q.offer(arr[j]);
            }
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (q.size() == 0) {
                    ans[ind] = 0;
                } else {
                    ans[ind] = q.peek();
                    if (q.peek() == arr[i]) {
                        q.poll();
                    }
                }
                j++;
                i++;
                ind++;
            }
        }
        return ans;
    }
}
