package HashMap;
import java.util.*;
public class HighestFrequencyCharacter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                int of = map.get(ch);
                int nf = of + 1;
                map.put(ch, nf);
            }
            else{
                map.put(ch, 1);
            }
        }

        char mfc = str.charAt(0);
        for(Character key : map.keySet()){
            if(map.get(key) > map.get(mfc)){
                mfc = key;
            }
        }
        System.out.println(mfc);
    }
}
