import java.util.Hashtable;
import java.util.Map;

class Solution {
    public boolean canPermutePalindrome(String s) {
        Hashtable<Character, Integer> h = new Hashtable<>();
        
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(h.containsKey(c)) {
                int count = h.get(c) ;
                count++;
                h.put(c, count);
            } else {
                h.put(c, 1);
            }
        }
        
        int temp = 0; 
        for(Map.Entry<Character, Integer> entry: h.entrySet()) {
            int value = entry.getValue();
            if( value % 2 != 0) {
                temp++;
            }
        }
        if( temp > 1) {
            return false;
        }
        return true;
        
    }
}
