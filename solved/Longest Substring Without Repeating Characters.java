class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] c = s.toCharArray();
        Set result = new HashSet();
        int i=0,j=0,max=0;
        while(i<s.length()){
            if(!result.contains(c[i])){
                result.add(c[i]);
                i++;
                max=Math.max(max,result.size());
            }else{
                result.remove(c[j++]);
            }
        }
        return max;
    }
}