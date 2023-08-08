package Recursion;

public class Subsets {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] subset = new int[arr.length];
        helper(arr, subset, 0);
    }

    public static void helper(int[] arr, int[] subset, int i){
        if(i == arr.length){
            for(int j=0; j<subset.length; j++){
                if(subset[j] == 1){
                    System.out.print(arr[j] + " ");
                }
            }
            System.out.println();
            return;
        }

        subset[i] = 0;
        helper(arr, subset, i+1);
        subset[i] = 1;
        helper(arr, subset, i+1);
    }
}
