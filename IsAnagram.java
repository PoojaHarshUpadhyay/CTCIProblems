import java.util.Hashtable;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {
         if(s.length() == 0 || t.length() == 0) {
             return false;
         }
        
        Hashtable<Character, Integer> h1 = new Hashtable<>();
        Hashtable<Character, Integer> h2 = new Hashtable<>();
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(h1.containsKey(c)) {
                int count = h1.get(c);
                count++;
                h1.put(c, count);
            } else {
                h1.put(c, 1);
            }
        }
        
        for(int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if(h2.containsKey(c)) {
                int count = h2.get(c);
                count++;
                h2.put(c, count);
            } else {
                h2.put(c, 1);
            }
        }
        
        for(Map.Entry<Character,Integer> entry: h2.entrySet()) {
            if(h1.containsKey(entry.getKey())) {
                int fnum = h1.get(entry.getKey());
                int snum = entry.getValue();
                if(fnum != snum) {
                    return false;
                }
            } else {
                return false;
            }
        }
        
        for(Map.Entry<Character, Integer> entry : h1.entrySet()) {
            if(h2.containsKey(entry.getKey())) {
                int fnum = h2.get(entry.getKey());
                int snum = entry.getValue();
                
                if(fnum != snum ) {
                    return false;
                } 
            } else {
                    return false;
                }
        }
        
        return true;
        
    }
}
