import java.util.*;

public class CountOccurencesOfAnagrams {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("s : ");
        String str = sc.next();

        System.out.print("p : ");
        String pat = sc.next();

        System.out.println("ans : " + countOccurencesOfAnagrams(str, pat));
    }

    public static int countOccurencesOfAnagrams(String str, String pat){
        int i=0;
        int j=0;
        int sum=0;
        char ch;
         Map<Character, Integer> map = new HashMap<>();
        for(int z =0; z<pat.length();z++)
        {
            ch = pat.charAt(z);
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }
        }
        int count=map.size();
        int k = pat.length();
        while(j<str.length())
        {
        
            ch = str.charAt(j);
            if(map.containsKey(ch))
            {
                map.put(ch,(map.get(ch))-1);
               
                if(map.get(ch) == 0)
                {
                    count--;
                }
            }
            if(j-i+1<k) j++;
            else if(j-i+1 == k)
            {
               
                if(count == 0)
                {
                    sum++;
                }
                    
                    
                    ch = str.charAt(i);
                    if(map.containsKey(ch))
                    {
                        map.put(ch,map.get(ch)+1);
                        if(map.get(ch)==1) count++;
                    }
                    
               i++;
               j++;
            }
        }
        return sum;
    }
}
