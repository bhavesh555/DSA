import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int ans = helper(str);
        System.out.println(ans);
    }

    public static int helper(String str){
        int ans=-1;
        int i=0;
        int j=0;
        int n = str.length();
        HashMap<Character, Integer> hm = new HashMap<>();

        while(j<n){
            char ch = str.charAt(j);
            hm.put(ch, hm.getOrDefault(ch, 0)+1);

            if(hm.size() == j-i+1){
                ans = Math.max(ans, j-i+1);
                j++;
            }else if(hm.size() < j-i+1){
                while(hm.size() < j-i+1){
                    char ch1 = str.charAt(i);
                    hm.put(ch1, hm.get(ch1)-1);
                    if(hm.get(ch1) == 0){
                        hm.remove(ch1);
                    }
                    i++;
                }
                j++;
            }
        }
        return ans;
    }
}
