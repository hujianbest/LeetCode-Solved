class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character,Integer> map_s = new HashMap<Character,Integer>();
        Map<Character,Integer> map_t = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            if(map_s.containsKey(s.charAt(i)))
                map_s.compute(s.charAt(i),(key,val)->val=val+1);
            else
                map_s.put(s.charAt(i),1);
        }
        for(int i=0;i<t.length();i++){
            if(map_t.containsKey(t.charAt(i)))
                map_t.compute(t.charAt(i),(key,val)->val=val+1);
            else
                map_t.put(t.charAt(i),1);
        }
        return map_s.equals(map_t);
    }
}